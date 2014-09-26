package Date;

public class ClassDate {
	public int day, month, year;
	public ClassDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	boolean isNamNhuan(){
		if(year%4 == 0){
			if(year%100 == 0){
				int temp = year/100;
				if(temp % 4 != 0)	return false;
			}
			return true;
		}
		return false;
	}
	public ClassDate NextDate(){
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10:
				if(1 <= day && day <= 30)
					return new ClassDate(day+1, month, year);
				if(day == 31)	return new ClassDate(1, month+1, year);
				return null;
			case 4: case 6: case 9: case 11:
				if(1 <= day && day <= 29)
					return new ClassDate(day+1, month, year);
				if(day == 30)	return new ClassDate(1, month+1, year);
				return null;
			case 2:
				if(isNamNhuan()){
					if(1 <= day && day <= 28)	return new ClassDate(day+1, month, year);
					if(day == 29)	return new ClassDate(1, month+1, year);
				}
				if(1 <= day && day <= 27)
					return new ClassDate(day+1, month, year);
				if(day == 28)	return new ClassDate(1, month+1, year);
				return null;
				
			case 12:
				if(1 <= day && day <= 30)
					return new ClassDate(day+1, month, year);
				if(day == 31)	return new ClassDate(1, 1, year+1);
				return null;
			default: return null;
		}
	}
	public String toString(){
		String s = day + "/" + month + "/" + year;
		return s;
	}
}

package PTB2;

public class PTB2 {
	private float a,b,c;
	PTB2(){}
	public PTB2(float a,float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int GiaiPTB2(){
		if(a==0){
			if(b == 0){
				if(c != 0)	return -1; //phuong trinh vo nghiem
				else return 0; //phuong trinh vo so nghiem
			}
			else	return 1; //phuong trinh co 1 nghiem duy nhat
		}
		else{
			float del = tinhDel();
			if(del < 0)	return -1; //phuong trinh vo nghiem
			else{
				if(del == 0)	return 1; //phuong trinh co 1 nghiem duy nhat
				else	return 2; //phuong trinh co 2 nghiem phan biet
			}
		}
	}
	float tinhDel(){
		float del;
		del = b*b - 4*a*c;
		return del;
	}
}

package Triangle;

public class Triangle {
	private int a, b, c;
	public Triangle(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int checkTriangle(){
		if(a <= 0 || b <= 0 || c <= 0 || a+b <= c || b+c <= a || c+a <= b)	
			return -1; //ko phai tam giac
		if(a==b && b==c)	
			return 2; //tam giac deu
		else	if(a == b || b==c || a ==c)		
			return 1; // tam giac can
		return 0;
	}
}

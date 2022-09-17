package SelPrac;

public class testeme 
{
	int a;
	public void show()
	{
		a=3;
	}
	public void dis()
	{
		a=55;
		System.out.println(a);
	}
	public static void main(String[] args) {
		testeme obj = new testeme();
		obj.dis();
	}
}

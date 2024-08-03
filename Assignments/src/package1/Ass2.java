package package1;

public class Ass2 {
	public int Div(int a, int b)
	{
		int c= a/b;
		System.out.println("Division result is " +c);
		return c;
	}
	public int multi(int x, int y)
	{
		int z= x*y;
		System.out.println("Multi result is " +z);
		return z;
	}
	public int sub(int a1, int b1)
	{
		int c1= a1-b1;
		System.out.println("Sub result is " +c1);
		return c1;
	}
	public void Sum(int x1, int x2)
	{
		int z1= x1+x2;
		System.out.println("Sum result is " +z1);
	}

	public static void main(String[] args) {
		
		Ass2 cal = new Ass2();
		int divresult = cal.Div(10,2);
		int  subresult = cal.sub(divresult, 2);
		int multiresult  =cal.multi(subresult, 2);
		int  subresult1 = cal.sub(multiresult, 2);
		cal.Sum(subresult1, 2);

}
}

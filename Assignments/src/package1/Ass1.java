package package1;

public class Ass1 {

public int sum(int a, int b)
{
	int c= a+b;
	System.out.println("Sum result is " +c);
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
public void div(int x1, int x2)
{
	int z1= x1/x2;
	System.out.println("Division result is " +z1);
}

public static void main(String[] args) {
	
	Ass1 cal = new Ass1();
	int sumresult = cal.sum(10,2);
	int multiresult  =cal.multi(sumresult, 2);
	int  subresult = cal.sub(multiresult, 2);
	int mresult1 = cal.multi(subresult, 2);
	cal.div(mresult1, 2);
}

}

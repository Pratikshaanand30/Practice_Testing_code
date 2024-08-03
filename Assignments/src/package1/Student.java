package package1;

public class Student {
	
	int rollno, age;
	
	public void display1()
	
	{
		System.out.println("welcome to all of you");
		
	}

    public void display2()
	
	{
		System.out.println("automation is very easy");
		
	}
    
    public static void main(String[] args) {
		
    	Student ob = new Student();
    	ob.display1();
    	ob.display2();
    	ob.rollno =22;
    	ob.age=15;
    	System.out.println("Rollno is " +ob.rollno);
    	System.out.println("age is " +ob.age);
	}
}

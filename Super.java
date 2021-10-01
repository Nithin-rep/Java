package trail;

public class Super 
{
	
	public static void main(String args[])
	{
	 class A
	 {
		 public A()
		 	{System.out.println("statement1");}
		 
		 public A(int i)
		 	{System.out.println("statement2");}
	 }
	 class B extends A
	 {
		 public B()
		 	{super();
		 	{System.out.println("extended_statement1");}}
		 
		 public B(int i)
		 	{super(i);
		 	{System.out.println("extended_statement2");}}
	 }
	 
	 B obj = new B(1);
	 
	}

}

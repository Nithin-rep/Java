package trail;

public class AbstractForArithmaticOperartions 
{
	public static void main(String[] args) 
	{
		abstract class Oper
		{
		public abstract void ArithmaticOperartions();
		
		}
		
		class AddArithmatic extends Oper
		{
			public void ArithmaticOperartions()
			{
				System.out.println(" Perform addition");
			}
		}

		class SubArithmatic extends Oper
		{
			public void ArithmaticOperartions()
			{
				System.out.println(" Perform Subtraction");
			}
		}
		
		class work
		{
			public void out(Oper a)
			{
//				a.Oper();
			}
		}
		
		Oper a = new AddArithmatic();
//		a.Arithmaticoperation();
		Oper b = new SubArithmatic();
//		b.Arithmaticoperation();
		
		work o = new work();
		o.out(a);
		

	}

}

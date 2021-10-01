package trail;

public class LambdaExpressionOnFunctionalInterface 
{

	public static void main(String[] args) 
	{
		interface person
			{
			void name();
			}
		person p = () -> System.out.println("Mech Boys");
		p.name();
	}

}


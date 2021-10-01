package trail;

public class Interface 
{
	public static void main(String[] args) 
	{
		
		interface person
		{
			void name();
		}
		
		class master implements person
		{
			public void name() 
			{
				System.out.println("Mech Boys");
			}
		}
		
		person p = new master();
		p.name();

	}

}

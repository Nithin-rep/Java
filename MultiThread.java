package trail;

public class MultiThread 

{

	public static void main(String[] args) 
	{

		class Names extends Thread
		{
			public void run()
			{
			String people[] = {"Tom", "Dick","Harry"};
			
			for(int i=0;i<=2;i++)
				{
				System.out.println(people[i]);
				try{Thread.sleep(500);} catch(Exception e) {}
				}
			}
		}
		class Branch extends Thread
		{
			public void run()
			{
			String subjects[] = {"Math", "Physics","History"};
			
			for(int i=0;i<=2;i++)
			{
				System.out.println(subjects[i]);
				try{Thread.sleep(450);} catch(Exception e) {}
			}
			}
		}
		
		Names n= new Names();
		Branch b= new Branch();
		
		n.start();
		b.start();
	}
}
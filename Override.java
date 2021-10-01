package trail;

public class Override {
	

	public static void main(String[] args) 
	{
		class Calcv1
		{
			public int add(int i, int j)
			{
				return(i+j);
			}
		}
		
		class Calcv2 extends Calcv1
		{	
			public int add(int i, int j)

			{	
				return(i-j);
			}
		}
		
		
		Calcv2 c1 = new Calcv2();
		int sum= c1.add(4,5);

		
		System.out.println(sum);
	}
}

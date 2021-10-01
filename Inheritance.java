package trail;

public class Inheritance 
{

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
			public int sub(int i, int j)
			{
				return(i-j);
			}
		}
		
		class Calcv3 extends Calcv2
		{
			public int multi(int i, int j)
			{
				return(i*j);
			}
		}
		
		Calcv3 c3 = new Calcv3();
		int sum= c3.add(4,5);
		int sub= c3.sub(4,5);
		int multi= c3.multi(4,5);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		
		
		}

	}

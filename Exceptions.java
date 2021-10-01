package trail;

public class Exceptions 
{

	public static void main(String[] args) 
	
	{
		try 
		{
			int i =10, j=5, add, div,k;
			add=i+j;
			System.out.println("Addition is "+add);
			div= i/j;
			System.out.println("Division is "+div);
			
			int a[] = {1,3,4};
			System.out.println(a[4]);
			System.out.println("Array is Good");
		}
		
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Error in the Entered data");
		}
		
		catch(Exception e)
		{
		System.out.println("Error in the Program");
		}
		
		finally
		{
			System.out.println("Process Finished");
		}

	}
	

	 

}

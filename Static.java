package trail;

public class Static {
	public static void main(String args[])
	{
		class Employee
		{
			int id=1,salary=50000;
			String CEO="nithin";
			
			
		}
		
		Employee nith = new Employee();
		Employee navin = new Employee();
		nith.id=2;
		navin.id=3;
		nith.salary=60000;
		navin.salary=55000;
		System.out.println(navin.salary);
	}
}

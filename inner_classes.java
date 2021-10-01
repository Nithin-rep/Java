package trail;

public class inner_classes {

	public static void main(String[] args) 
	{
		class Course
		{
			String a="mech", b="biology", c="computer science";
			
			public void cour()
			{
				System.out.println(a);}
			
			class Programs
			{
				String mech="Matlab", biology="Microbiology", computers="Java";
				
				public void inner_cour()
				{
					System.out.println(mech);}
			}
		}
		
		Course obj=new Course();
		obj.cour();
		Course.Programs obj1= obj.new Programs();
		obj1.inner_cour();

	}

}

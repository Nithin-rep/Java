package trail;

public class encapsulation 
{
	

	public static void main(String[] args) 
	{
		
		class Encap
		{
			private int number;
			private String branch;
			
			
//			getters
			public int getNumber() 
			{
				return number;
			}
//			setters			
			public void setNumber(int number)
			{
				this.number=number;
			}
			
			public String getBranch()
			{
				return branch;
			}
			
			public void setBranch()
			{
				this.branch=branch;
			}
			
				
		}
		Encap e1 = new Encap();
		e1.number= 1232;
		e1.branch = "Mech";
		System.out.println(e1.number);
		System.out.println(e1.branch);
		

	}

}

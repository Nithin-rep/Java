package trail;

public class Anonymus 
{

	public static void main(String[] args) 
	
	{
class Language
	{
	public void business()
		{
		System.out.println("Deutsch");	
		}

	}

Language l = new Language() {
								public void business()
								{
									System.out.println("English");
								}
							};

l.business();

}

}

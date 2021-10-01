package trail;

public class Obj_class {
	
	public static void main(String args[])
	{
		class Arithmatics{
			int number1,number2,sum,sub,mul,div,mod,sum_output,sub_output,div_output,mul_output,mod_output;
			
			public void sum()
			{
				sum_output= number1+number2;
			}
			
			public void sub()
			{
				sub_output= number1-number2;
			}
			
			
			public void mul()
			{
				mul_output= number1*number2;
			}
			
			
			public void div()
			{
				double div_output= (double)(number1/number2);
			}
			
			
			public void mod()
			{
				mod_output= number1%number2;
			}
			
		}

			Arithmatics obj = new Arithmatics();
			obj.number1=10;
			obj.number2=20;
			obj.sum();
			obj.sub();
			obj.mul();
			obj.div();
			obj.mod();
			System.out.println(obj.sum_output);
			System.out.println(obj.sub_output);
			System.out.println(obj.mul_output);
			System.out.println(obj.div_output);
			System.out.println(obj.mod_output);
		}
		
	}

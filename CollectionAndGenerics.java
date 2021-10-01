package trail;


import java.util.*;

public class CollectionAndGenerics 

{

	public static void main(String[] args) 
	
	{	
		Collection val = new ArrayList();
		val.add(9);
		val.add(4);
		val.add(5);
		System.out.println(val);
		
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(9);
		num.add(4);
		num.add(1,5);
	
		System.out.println(num);
		Collections.sort(num);
		Collections.reverse(num);
		System.out.println("new set of numbers" + num);
	}

}

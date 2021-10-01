package trail;

public class Arrays {

	public static void main(String[] args) 
	{	
		//1 d array
		int num[] = {0,2,3,4,5,6};
		for (int i=0; i<6;i++)
		{
		  System.out.println(num[i]);
		}	

//		int num[] = new int[6];
//		num[0]=0;
//		num[1]=2;
//		num[2]=3;
//		num[3]=4;
//		num[4]=5;
//		num[5]=6;

		//2d  array
		int d[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//jagged  array
		int dim[][] = {{1,2,3},{4},{7,8,9,45,6}};
		
		for(int i=0;i<dim.length;i++)
		{
			for(int j=0;j<dim[i].length;j++) {
				System.out.print(dim[i][j]);}
			System.out.println();}
			
		
		
	}

}



public class ArrayDemo {

	public static void main(String[] args) {
		/*int[] ar= {10,20,30,40,50};
		for(int i=0; i<5; i++) {
			System.out.println(ar[i]);
			
		}
		for(int j=0;j<5;j++) {
			System.out.print(ar[j] +" ");
		}
		for(int i: ar)
			System.out.println(i);
		
		*/
		
		/*int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i < mat.length; i++) 
		{
			for(int j=0 ;j < mat[i].length; j++) 
			{
				System.out.print(mat[i][j] +"\t");
			}
			System.out.println();
		}*/
		
		int[] sr= {30,22,18,15,5};
		int t=0;
		for(int i=0; i < sr.length; i++) 
		{
			for(int j=i+1 ;j < sr.length; j++) 
			{
				if(sr[i]>sr[j]) {
					t=sr[i];
					sr[i]=sr[j];
					sr[j]=t;
				}
				
			}
		
			System.out.print(sr[i]+" ");

	}
}
}
	

//1. first initilize the variable 
//2. after that use for loop like we want 1 to 100 prime number
//3. then inside main for loop use another for loop insted for loop
//4. there use j variable
//5. for be like for(j=1;j<=i;j++)
//6. use the if condition if(i%j==0)
//7.count++;
//8.use if condition like if(count==2) then print the i.
package Logical_program_pract;

public class Prime_No_1to100 {
	public static void main(String[] args) {
		int i,j,count;
		for(i=1;i<=100;i++)
		{
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0)
				
					count++;
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
			
			
			
			
			
		}
	}

}

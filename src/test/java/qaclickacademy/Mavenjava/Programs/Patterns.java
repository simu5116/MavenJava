package qaclickacademy.Mavenjava.Programs;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//==========================
		for(int i=1;i<=5;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		//================================
		for(int i=1;i<=5;i++)
		{
		    for(int j=5;j>=i;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		//====================================
		for(int i=65;i<=69;i++)
		{
		    for(int j=65;j<=i;j++)
		    {
		        System.out.print((char)j);
		    }
		    System.out.println();
		}
		//===========================================
		
		for(int i=1;i<=5;i++)
		{
		    for(int k=5-i;k>=1;k--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		//======================================================
		for(int i=5;i>=1;i--)
		{
		    for(int k=5-i;k>=1;k--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	
	//===================================Diamond===========================
		for(int i=1;i<=5;i++)
		{
		    for(int k=5-i;k>=1;k--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	
	for(int i=5;i>=1;i--)
		{
		    for(int k=5-i;k>=1;k--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	//=========================================
	int nums[] = { 15, 24, 48, 21, 43, 11, 79, 93 };
	int maxOne = 0;
	int maxTwo = 0;
	for (int n : nums) {
		if (maxOne < n) {
			maxTwo = maxOne;
			maxOne = n;
		} else if (maxTwo < n) {
			maxTwo = n;
		}

	}

	System.out.println("Max1 - " + maxOne);
	System.out.println("Max2 - " + maxTwo);

	}

}

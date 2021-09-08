package qaclickacademy.Mavenjava.Programs;

import java.util.ArrayList;

public class DuplicateElemnts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {22,55,77,88,99,66};
		int[] b= {65,66,77,99,23,22};
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			flag=false;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				flag=true;
				if(!list1.contains(a[i]))
				{
					
					list1.add(a[i]);
					
				}
				break;
			}
			
		}
		if(!flag)
		{
			if(!list2.contains(a[i]))
			{
				
				list2.add(a[i]);
				
			}
			
		}
		
		}
		System.out.println(list1);
		System.out.println(list2);

	}

}

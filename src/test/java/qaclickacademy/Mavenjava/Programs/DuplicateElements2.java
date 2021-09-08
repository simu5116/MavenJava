package qaclickacademy.Mavenjava.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {0,1,2,4,5,3,28,9,6,1,3,5};
		Map<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
		for(Integer ch:array1)
		{
			if(hashmap.containsKey(ch))
			{
				hashmap.put(ch,hashmap.get(ch)+1);
			}
			else
				hashmap.put(ch,1);
		}
		
		Set<Integer> keys=hashmap.keySet();
		
		for(Integer ch:keys)
		{
			if(hashmap.get(ch)>1)
			{
				System.out.println(ch + "  is " + hashmap.get(ch) + " times"); 
			}
		}
		
		//============================================second method====================//
		
		
		Integer[] newarray=new Integer[array1.length];
		int i=0;
		for(int a:array1)
		{
			newarray[i++]=Integer.valueOf(a);
		}
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(newarray));
		System.out.println(set1); 
		

	}

}

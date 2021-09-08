package qaclickacademy.Mavenjava.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="India is my country";
		str1=str1.toLowerCase();
		int count;
		
		for(int i=0;i<str1.length();i++)
		{
			count=1;
			char ch=str1.charAt(i);
			for(int j=0;j<str1.length();j++)
			{
				if(i!=j)
				{
					if(ch==str1.charAt(j))
					{
						count++;
					}
				}
				
			}
			System.out.println(ch+" occurs "+count+" times");
			
		}
		
		//============================================second method====================//
		
		
		//map is an interface,hashmap implements map interface
		Map<Character,Integer> hashmap=new HashMap<Character,Integer>();
		char[] chararray=str1.toCharArray();
		for(Character ch:chararray)
		{
			if(hashmap.containsKey(ch))
			{
				hashmap.put(ch,hashmap.get(ch)+1);
			}
			else
				hashmap.put(ch,1);
		}
		
		Set<Character> keys=hashmap.keySet();
		
		for(Character ch:keys)
		{
			if(hashmap.get(ch)>1)
			{
				System.out.println(ch + "  is " + hashmap.get(ch) + " times"); 
			}
		}
		
		
		}

}

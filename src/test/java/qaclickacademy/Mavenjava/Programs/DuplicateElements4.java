package qaclickacademy.Mavenjava.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    
    
        // Finding Union of set1 and set2   
        Set<Integer> union_data = new HashSet<Integer>(set1);    
        union_data.addAll(set2);    
        System.out.print("Union of set1 and set2 is:");    
        System.out.println(union_data);    
    
        // Finding Intersection of set1 and set2    
        Set<Integer> intersection_data = new HashSet<Integer>(set1);    
        intersection_data.retainAll(set2);    
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(intersection_data);    
    
        // Finding Difference of set1 and set2    
        Set<Integer> difference_data = new HashSet<Integer>(set1);    
        difference_data.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(difference_data);
        
        
        //===================List to Array=================
        
        List<String> itemList = new ArrayList<String>();
        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");

        String[] itemsArray = new String[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);

        for(String s : itemsArray)
            System.out.println(s);

	}

}

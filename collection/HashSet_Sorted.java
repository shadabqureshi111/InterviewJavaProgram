package com.csm.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashSet_Sorted 
{
	public static void main(String[] args) 
	 {
       // Initialize the HashMap
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(3, 4);
       map.put(2, 3);
       map.put(1, 2);

       // Step 1: Create a list to hold all keys and values
      // List<Integer> combined = new ArrayList<>();

       TreeMap<Integer,Integer> t = new TreeMap<>();
       // Step 2: Add all keys and values to the list
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           //combined.add(entry.getKey());
         //  combined.add(entry.getValue());
          t.put(entry.getKey(),entry.getValue());
          
       }

       // Step 3: Sort the list
       //Collections.sort(combined);

       System.out.println(t);
//     System.out.println(combined);
//     
//     // Step 4: Print the sorted list in the desired format
//     System.out.print("[");
//     for (int i = 0; i < combined.size(); i++) {
//         System.out.print(combined.get(i));
//         if (i < combined.size() - 1) {
//             System.out.print(", ");
//         }
//     }
//     System.out.print("]");
   }

}

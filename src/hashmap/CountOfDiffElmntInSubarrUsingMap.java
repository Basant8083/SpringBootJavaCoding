package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class CountOfDiffElmntInSubarrUsingMap {
	
	
	public static ArrayList<Integer> countOfElementUsingWindow(ArrayList<Integer> arr, int k )
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
		if(arr.size()<k)
		{
			return null;
		}
		//storing first window in map 
		for(int i=0; i<k;i++)
		{
			if(frequency.containsKey(arr.get(i)))
					{
						frequency.put(arr.get(i), frequency.get(i)+1);	
					}
			else
			{
				frequency.put(arr.get(i), 1);
				
			}
		}
		result.add(frequency.size());
//		System.out.println(frequency);
//		Now will store one element just next to the window and delete the first from the window.
		int start=0;
		int end = k;
		while(end<arr.size())
		{
//			first will add one element in map
//			before adding will check whether element is present or not in the map, so
			if(frequency.containsKey(arr.get(end)))
			{
//				if element is already present then increase its frequency by one
				frequency.put(arr.get(end), frequency.get(end)+1);
				
			}
			else
			{
//				else add simply into map by keeping its frequency one
				frequency.put(arr.get(end), 1);
			}
			
//			Now will remove first element of window
//			before removing i will check whether its frequency is grater than 1 or not, if yes
			if(frequency.get(arr.get(start))==1)
			{
//				remove from map
				frequency.remove(arr.get(start));
				
			}
			else
			{
//				else reduce frequency by one
				frequency.put(arr.get(start), frequency.get(arr.get(start))-1);
			}
			
			start++;
			end++;
			result.add(frequency.size());
		}
//		System.out.println(frequency);
		System.out.println("Total Different elemnt in size "+k+ " subbarray using Hamsmap O(n) time complexity: " + result);
		
		return result;
	}
	

}

package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class IsPairSumEqualOfK {
	
	
	public static boolean pairSum(ArrayList<Integer> arr, int k)
	{
		boolean result= false;
		if(arr.size()<=1)
		{
			return result;
		}
		HashMap<Integer, Integer> frequency = new HashMap<>();
		
		for(int i=0; i<arr.size(); i++)
		{
			int key = arr.get(i);
			if(frequency.containsKey(arr.get(i)))
			{
				frequency.put(key, frequency.get(key)+1);
			}
			else
			{
				frequency.put(key, 1);
			}
			
		}
		
		for(int i=0; i<arr.size(); i++)
		{
			//target ---> arr[j] = k - arr[i];
			int target = k-arr.get(i);
			if(frequency.containsKey(target))
			{
				if(target==arr.get(i) && frequency.get(target)>=2)
				{
					return true;				
				}
				else if(target==arr.get(i) && frequency.get(target)==1)
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
	
		return false;
		
	}
	
}

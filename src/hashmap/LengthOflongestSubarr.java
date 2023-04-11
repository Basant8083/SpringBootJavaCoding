package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LengthOflongestSubarr {
	
	public static int longestSubarrWithZeroSum(ArrayList<Integer> arr )
	{
		int res =-1;
		HashMap<Integer, Integer> indexMp = new HashMap<Integer, Integer>();
		
		ArrayList<Integer> prefix_sum= new ArrayList<Integer>(Arrays.asList(arr.get(0)));
		
		for(int i=1;i<arr.size(); i++)
		{
			prefix_sum.add(prefix_sum.get(i-1)+arr.get(i));
		}
		
		for(int i=0; i<prefix_sum.size(); i++)
		{
			int key = prefix_sum.get(i);
//			if key is zero which means the sum of sub array is zero from o to i, therefore length will be i+1;
			if(key==0)
			{
				res = Math.max(res, i+1);
			}
//			if key is already present which means there is sub array with  sum zero
			else if(indexMp.containsKey(key))
			{
				// subtract the index of repeated element from first for finding the length...
				res = Math.max(res, i-indexMp.get(key));
			}
			else
			{
				indexMp.put(key, i);
			}
		}
		
		return res;
		
	}
}

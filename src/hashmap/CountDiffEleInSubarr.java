package hashmap;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDiffEleInSubarr {
	
	public static ArrayList<Integer> countOfElementInFxdLengthSubArr(ArrayList<Integer> arr, int k )
	{
		
		ArrayList<Integer> result = new ArrayList<>();
		
		
//		edge case
		if(arr.size()<k)
		{
			return null;
		}
		for(int i=0; i<=arr.size()-k; i++)
		{
			HashSet<Integer> hs = new HashSet<>();
			for(int j = i; j<k+i; j++)
			{
				hs.add(arr.get(j));
			}
//			System.out.println(hs);
			result.add(hs.size());
		}
		return result;
		
	}

}

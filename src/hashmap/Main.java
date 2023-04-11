package hashmap;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2,-2,2,4,5,-9,7,8,6,9,-30));
		int k = 3;
		

		System.out.println("original ArrayList : " +arr);
		if(IsPairSumEqualOfK.pairSum(arr, k)==false) {
			System.out.println("No such pair exist...");
		}
		if(IsPairSumEqualOfK.pairSum(arr, k)==true) {
			System.out.println("pair exists for i and j where i!=j whose sum is equal to : "+k);
		}
		
		System.out.println("Total Distinct element in length "+k+ " SubArray using Hashset in O(n^2) time complexity : "+CountDiffEleInSubarr.countOfElementInFxdLengthSubArr(arr, k));
		
		System.out.println(CountOfDiffElmntInSubarrUsingMap.countOfElementUsingWindow(arr, k));
		
		System.out.println(LengthOflongestSubarr.longestSubarrWithZeroSum(arr));
	}
	
	

}

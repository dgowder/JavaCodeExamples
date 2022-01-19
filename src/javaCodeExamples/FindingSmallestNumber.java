package javaCodeExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingSmallestNumber {
	
	Integer numbers[]= {4,5,2,9,8}; 
	
	public void usingArray()
	{
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		
	}
	
	public void usingCollections() {
		 List<Integer> list= Arrays.asList(numbers);
		 Collections.sort(list);
		 int smallNum = list.get(0);
		 System.out.println(smallNum);
		
	}
	
	public void ownSorting()
	{
		int smallNum = Integer.MAX_VALUE;
		for(int i=0; i< numbers.length ; i++)
		{
			if(numbers[i]<smallNum)
			{
				smallNum=numbers[i];
			}
		}
		System.out.println(smallNum);
	}
	
	public void findMaxNumber()
	{
		int maxNum=Integer.MIN_VALUE;
		for (int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>maxNum)
			{
			maxNum=numbers[i];
			}
		}
		System.out.println(maxNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindingSmallestNumber smallNum = new FindingSmallestNumber();
smallNum.usingArray();
smallNum.usingCollections();
smallNum.ownSorting();
smallNum.findMaxNumber();
	}

}

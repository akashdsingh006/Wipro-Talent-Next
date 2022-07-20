package com.wipro.Questions;
import java.util.*;;
public class primeSum {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println(calculate(arr,n));
	}
	public static int calculate(int[] arr,int n)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		int sum=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i]))
			{
				pq.add(arr[i]);
			}
		}
		if(pq.size()==0)
		{
			for(int i=0;i<arr.length-1;i++)
				sum+=arr[i];
		}
		int s=pq.size();
		if(s>1)
		{
			while(pq.size()>1)
				sum+=pq.remove();
		}
		return sum;
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		if(num%2==0)
			return false;
		if(num==2||num==3)
			return true;
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}	
		
		return true;
	}
}

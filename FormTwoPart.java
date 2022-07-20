package com.wipro.Questions;
import java.util.*;
public class FormTwoPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println(password(arr,n));
	}
	public static int password(int[] arr,int n)
	{
		Arrays.sort(arr);
		Map<Integer,Integer> map=new HashMap<>();
		Set<Integer> set=new HashSet<>();
		List<Integer> list=new ArrayList<>();
    
		//To map the number with its subsequent frequency
		for(int i:arr) 
		{
			if(map.containsKey(i))
			{
				int of=map.get(i);
				int nf=of+1;
				map.put(i, nf);
			}
			else
				map.put(i,1);
		}
		//To remove the duplicates numbers of the array
		for(int i:arr)
		{
			set.add(i);
		}
    
		//To add the frequency of elements into arraylist
    Iterator it= set.iterator();
		while(it.hasNext())
		{
			int k=map.get(it.next());
			list.add(k);
		}
		Collections.sort(list);
    
		// To Calculate part1 of the Password which highest frequency number
		int part1=0;
		int max1=list.get(list.size()-1);
		for(int i:arr)
		{
			if(map.get(i)==max1)
			{
				if(i>part1)
					part1=i;
			}
		}
    
		// To Calculate part2 of the Password which Second highest frequency number
		int max2=0;
		for(int i=list.size()-1;i>=0;i--)
		{
			if(list.get(i)<max1)
			{
				max2=list.get(i);
				break;
			}
		}
		int part2=0;
		for(int i:arr)
		{
			if(map.get(i)==max2)
			{
				if(i>part2)
					part2=i;
			}
		}
    
		//To manipulate according to the required output
		String s=part2+""+part1+"";
//		System.out.println(list);
		return Integer.parseInt(s);
	}
}

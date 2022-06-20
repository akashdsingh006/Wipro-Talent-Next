
import java.util.*;

public class MostFrequent{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            while (temp != 0) {
                int d = temp % 10;
                list.add(d);
                temp = temp / 10;
            }
        }
        Collections.sort(list);
        System.out.println(list);
        
        int b[]=new int[10];
        for(int i=0;i<10;i++)
        {
        	b[i]=0;
        }
        for(int i=0;i<list.size();i++)
        {
        	b[list.get(i)]++;
        }
        
        for(int i:b)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        int mf=0,mn=0;
        for(int i=9;i>=0;i--)
        {
        	if(b[i]>mf)
        	{
        		mf=b[i];
        		mn=i;
        	}
        }
        System.out.println(mn);
    }
}


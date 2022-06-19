import java.util.*;

public class StabUnstab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        ArrayList<Integer> sta = new ArrayList<>();
        ArrayList<Integer> unsta = new ArrayList<>();
        int[] b = new int[10];
        int i, j, k, temp = 0, flag, max;
        for (i = 0; i < a.length; i++) {
            temp = a[i];
            for (k = 0; k < 10; k++) {
                b[k] = 0;
            }
            while (a[i] > 0) {
                b[a[i] % 10]++;
                a[i] /= 10;
            }
            flag = 0;
            max = 0;
            for (j = 0; j < 10; j++) {
                if (b[j] > max)
                    max = b[j];
            }
            for (j = 0; j < 10; j++) {
                if (b[j] != max && b[j] != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                unsta.add(temp);
            else
                sta.add(temp);
        }
        System.out.println(sta);
        System.out.println(unsta);
    }
}

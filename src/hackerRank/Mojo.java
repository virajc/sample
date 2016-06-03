package hackerRank;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;


class Mojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        Long max = 0L;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            max = (arr[i]>max)? arr[i]:max;
        }
        radixsort(arr, n);
        Long diff=0L;

        Deque <Long>dq = new ArrayDeque<>();
       // dq.addFirst(max);
int loopCondi = n/2;
       /* if(n%2==1)
        {
            loopCondi++;
        }*/
		int j=0;
        for(i=0;i<n;i++)
        {
			if(i%2==0)
            {
                dq.addLast(arr[j]);
                j++;
                //dq.addLast(arr[i+1]); 
            }
            else
            {
                dq.addLast(arr[n-i]);
                //dq.addLast(arr[n-i-2]);
            }
        }
        
        Object [] temp = dq.toArray();
        
        for(i=0;i<n-1;i++)
        {
            diff+=Math.abs((Long)temp[i]-(Long)temp[i+1]);
        }
        System.out.println(diff);
    }

    static void print(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    static Long getMax(Long arr[], int n)
    {
        Long mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    static void radixsort(Long arr[], int n) {
        Long m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }
     static void countSort(Long arr[], int n, int exp)
    {
        Long output[] = new Long[n]; // output array
        int i;
        Long count[] = new Long[10];
        Arrays.fill(count,0L);
        for (i = 0; i < n; i++)
            count[ (int)(arr[i]/exp)%10 ]++;
 
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; i >= 0; i--)
        {
            output[(int)(count[((int)(arr[i]/exp)%10) ] - 1)] = arr[i];
            count[(int)(arr[i]/exp)%10 ]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
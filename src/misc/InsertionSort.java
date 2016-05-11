package misc;
import java.util.Arrays;


public class InsertionSort {

		static int [] arr = {5,8,4,2,6,9};
		public static void main(String [] args)
		{
			int key;
			int j;
			for (int i = 1; i < arr.length; i++) {
				/*
				key=arr[i];
				j=i-1;
				while(j>=0 && arr[j]>key)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=key;
				*/
				key=arr[i];
				for (j = i-1; j>=0 && arr[j] > key ; j--) {
					/*int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;*/
					
					arr[j+1] = arr[j];
					
				}
				arr[j+1]=key;
			}
			System.out.println(Arrays.toString(arr));
		}
}

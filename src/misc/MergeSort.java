package misc;
public class MergeSort {
	public static void main(String[] args) {
		int arr[]={10,21,4,3,8,54,45,11};
		
		mergeSort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
		
	}

	private static void mergeSort(int[] arr, int l, int r) {

		if(l<r)
		{
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr,l,mid,r);
		}
		
	}

	private static void merge(int[] arr, int l,int m, int r) {
		int i=0;
		int j=0;
		int k=0;
		int L1 =m-l+1; 
		int R1 =r-m;
		int L[] =new int[L1];
		int R[] =new int[R1];
		
		for (i = 0; i < L1; i++) {
			L[i] = arr[l+i];
		}
		for (j = 0; j < R1; j++) {
			R[j] = arr[j+m+1];
		}
		//for (j = 0; j < n2; j++)
		//	R[j] = arr[m + 1 + j];

		k=l;
		i=0;
		j=0;
		while(i<L1 && j<R1)
		{
			if(L[i]>R[j])
			{
				arr[k]=R[j];
				j++;
			}
			else
			{
				arr[k]=L[i];
				i++;
			}
			k++;
		}
		while(i<L1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<R1)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}
}
	
package misc;

public class BinarySearch {
	static int sortedArray []  = {2,4,8,12,23,45,56,78,89};
	public static void main(String...args)
	{
		int len = sortedArray.length;
		System.out.println(binarySearch(sortedArray,0, len,2));
	}
	
	static int binarySearch(int A[], int low, int high, int key)
	{
	    int m;
	 
	    while( low <= high )
	    {
	        m = low + (high-low)/2;
	        System.out.println("low"+low+"mid"+m+"high"+high);
	        if( A[m] == key )
	            return m;
	 
	        if( A[m] < key ) // second comparison
	            low = m + 1;
	        else
	            high = m - 1;
	        
	        
	    }
	 
	    return -1;
	}
}

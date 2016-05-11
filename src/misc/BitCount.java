package misc;

public class BitCount {
	public static void main(String[] args)
	{
		System.out.println(countbits(3));
	}
	public static int countbits(int num){
	    int count=0, n;
	    while(num > 0){
	        n=0;
	        while(num >= 1<<(n+1))
	            n++;
	        num -= 1<<n;
	        count += (num + 1 + (1<<(n-1))*n);
	    }
	    return count;
	}
}

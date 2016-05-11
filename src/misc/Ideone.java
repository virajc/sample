package misc;
class Ideone
{
	public static void main(String []args)
	{
		int []a={6,4,2,3,4,6,1};
//		int co=0;
		int j=1;
		int len = a.length-1;
		for (int i = 0; i <= len; i++) {
			if(a[i]<a[j])
			{
				int temp = a[i];
				a[i]= a[j];
				a[j]=temp;
				
			}
			if(i==len)
			{								
				if(j!=len)
				{
					i=0;
					j++;
					
				}
			}
		}
		for (int i = 0; i <= len; i++) {
			System.out.println(a[i]);
		}
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i]= a[j];
					a[j]=temp;
					
				}
				if(a[i]==a[j])
				{
					co++;
					System.out.println(a[i] +" "+a[j]);
				}
			}
			
		}
		System.out.println("max" + co);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		/*
		int max = a[a.length-1];
		System.out.println("co"+a[a.length-co]);
		int count=0;
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			if(a[i]!=max)
			{
				count++;
				max=a[i];
			}
			if(count==2)
			{
				max = a[i];
				
				break;
			}
			
		}
*///		System.out.println("max:"+max);
	}
}
 



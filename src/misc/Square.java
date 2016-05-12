package misc;

public class Square {
	public static void main(String[] args) {
		System.out.println(distributeCadbury(-1,6, 3, 3));
	}

	public static int distributeCadbury(int input1, int input2, int input3,
			int input4) {
		int totalStudents=0;
		for (int i = 0; i < input2-input1+1; i++) {
			int len = input1+i;
			for (int j = 0; j < input4-input3+1; j++) {
				int bre = input3+j;
				totalStudents+=calculateStudents(len, bre, 0);
				
			}
		}
		return totalStudents;
	}
	
	public static int calculateStudents(int len, int bre, int count)
	{	
		if(len ==0 || bre == 0 )
		{
			return count;
		}
		if(len==1 || bre==1)
		{
			return ((bre>1)? bre : len)+count;
		}
		else if(len<bre)
		{
			count += bre/len;
			return calculateStudents(bre%len,len,count);
		}
		else
		{
			count += len/bre;
			return calculateStudents(len%bre,bre,count);
		}
	}
}

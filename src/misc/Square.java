package misc;

public class Square {
	public static void main(String[] args) {
		System.out.println(distributeCadbury(5,6, 3, 6));
	}

	public static int distributeCadbury(int input1, int input2, int input3,
			int input4) {
		int totalStudents=0;
		for (int i = 0; i < input2-input1+1; i++) {
			int len = input1+i;
			for (int j = 0; j < input4-input3+1; j++) {
				int bre = input3+j;
				totalStudents+=calculateStudents(len, bre);
				
			}
		}
		return totalStudents;
	}
	
	public static int calculateStudents(int len, int bre)
	{	
		if(len ==0 || bre == 0 )
		{
			return 0;
		}
		if(len==1 || bre==1)
		{
			return ((bre>1)? bre : len);
		}
		else if(len<bre)
		{
			
			return (bre/len)+calculateStudents(bre%len,len);
		}
		else
		{
			
			return (len/bre)+calculateStudents(len%bre,bre);
		}
	}
}

package hackerRank;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hydra {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String [][]pass = new String[t][2];
        String phrase;
        int k,l;
        boolean passFlag = true;
        for (int i = 0; i < t; i++) {
        	try{
            phrase = br.readLine();
            pass[i] = phrase.split(" ");
            int sLen = pass[i][0].length();
            int pLen = pass[i][1].length();
            
            if(phrase.length() != (sLen+pLen+1))
            {
            	System.out.println("Impossible");
            }
            else if((sLen*2)==pLen)
            {
            	k=0;
            	l=0;
            	passFlag=true;
            	for(int j=0;j<pLen;j++)
            	{
            		if(k<sLen && pass[i][1].charAt(j)==pass[i][0].charAt(k))
            		{
            			k++;
            		}
            		else if(l<sLen && pass[i][1].charAt(j)==pass[i][0].charAt(l))
            		{
            			l++;
            		}
            		else
            		{
            			passFlag=false;
            			break;
            		}
            	}
            	if(passFlag)
            	{
            		System.out.println("Possible");
            	}
            	else
            	{
            		System.out.println("Impossible");
            	}
            }
            else{
            	System.out.println("Impossible");
            }
        }catch(Exception e)
        {
        	System.out.println("Impossible");
        }
        }
    }
}

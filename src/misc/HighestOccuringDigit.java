package misc;
import java.util.Arrays;

public class HighestOccuringDigit {
    private static int MAX = 1000000;
    private static boolean[] isPrime = generatePrime();
    public static void main(String[] strings){
    	String line = "80 100";
    	String [] argument = line.split(" ");
    	
        int index = getMaxOccuredDigit(Integer.parseInt(argument[0]),Integer.parseInt(argument[1]));
        if (index != 0){
            System.out.println(index);
        }else{
            System.out.println(-1);
        }
    }

    private static int getMaxOccuredDigit(int lower, int higher){
    int[] highestDigitCount = new int[10];
    int max = 0;
    int maxIndex = 0;
    if (lower < 3){
        highestDigitCount[2] = 1;
        lower = 3;
    }
    for (int i = lower; i <= higher; i++){
        //System.out.println(i);
        int index = (i - 3) >> 1;
        //System.out.println(i);
        if (((i & 1) != 0)   && isPrime[index]){
            //System.out.println(i);
            int[] digitsCount = getDigitCount(i);
            for (int j = 0; j < 10; j++){
                highestDigitCount[j] = highestDigitCount[j] + digitsCount[j];
                if (highestDigitCount[j] > max){
                    max = highestDigitCount[j];
                }
            }
        }
    }
    if (max == 0){
        return 0;
    }
    for(int i = 0; i < 10; i++){
        if (highestDigitCount[i] == max){
            maxIndex =  i;
          break;
        }
    }
    return maxIndex;
}

    private static int[] getDigitCount(int prime){
        int[] digitsCount = new int[10];
        Arrays.fill(digitsCount, 0);
        while(prime != 0){
            int lastDigit = prime % 10;
            digitsCount[lastDigit] += 1;
            prime /= 10;
        }

        return digitsCount;
    }

    private static boolean[] generatePrime(){
        int root = (int) Math.sqrt(MAX) + 1;
        root = (root >> 1) - 1;
        int limit = (int) ((MAX - 1) >> 1);
        boolean[] isPrime = new boolean[limit];
        Arrays.fill(isPrime, true);
        for( int i = 0; i< root; i++){
            if(isPrime[i]){
                for(int j = ((i * (i + 3) << 1) + 3), p = (i << 1) + 3; j < limit; j += p){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
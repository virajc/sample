package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class RescuePrincess {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String read = br.readLine();
			int gridSize = Integer.valueOf(read);
			char [][]grid = new char[gridSize][gridSize];
			CharBuffer readchar = CharBuffer.allocate(gridSize*2);
			for (int index = 0; index < gridSize; index++) {
					br.read(readchar);
					grid[index] = readchar.array();
					System.out.println(readchar.array());
					readchar.clear();
			}
			System.out.println(grid[0][0]+""+grid[0][1]+""+grid[1][0]+""+grid[1][1]);
		}
		catch(Exception e)
		{
			System.out.println("Erorr" + e);
		}

	}
}

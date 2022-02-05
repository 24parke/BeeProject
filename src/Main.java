import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws FileNotFoundException {
		File file = new File("beesetup.txt");
		Scanner scanner = new Scanner(file);
		int[][][] arr = new int[scanner.nextInt()][scanner.nextInt()][scanner.nextInt()];

		//NULL is empty space
		//1 is obstacle
		//2 is beehive
		//3 is bees



		scanner.useDelimiter(",");
		for (int i = 0; i < 15; i++) {
			arr[scanner.nextInt()][scanner.nextInt()][scanner.nextInt()] = 2;
		}

		for (int i = 0; i < 15; i++) {
			arr[scanner.nextInt()][scanner.nextInt()][scanner.nextInt()] = 3;
		}
		//assuming scanner io works

    // setup Hive


    // void moveBee() {
			
    // }
    // void check() {

    // }
		


  }
}
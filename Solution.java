import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt();
			int b = fs.nextInt();
			int full = 1_000_000_000;
			int root = (int) Math.sqrt(full);
			int count = 0;
			for (int i = 1; i <= root; i++) {
				int square = i * i;
				if (a <= square && square <= b) {
					count++;
				}
			}
			out.println(count);
		}
		fs.close();
		out.close();
	}
}

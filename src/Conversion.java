

import java.util.Scanner;

public class Conversion {
	static String convert(int n) {
		String bin = "";
		while (n != 0) {
			int r = n % 2;
			bin = r + bin;
			n = n / 2;
		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		int num = sc.nextInt();
		System.out.println(convert(num));

	}

}

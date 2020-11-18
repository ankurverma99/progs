

import java.util.Scanner;

public class TransmetingData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		int data = sc.nextInt();
		int n = data, num = 0, r = 0;
		while (n != 0) {
			r = n % 10;
			num = num * 10 + r;
			n = n / 10;
		}
		System.out.println(num);
		sc.close();
	}

}

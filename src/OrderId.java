

import java.util.Scanner;

public class OrderId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order id");
		String id = sc.next();
		int i = Integer.parseInt(id);
		int n = i, otp = 1;
		while (n != 0) {
			int r = n % 10;
			otp = otp * r;
			n = n / 10;
		}
		System.out.println(otp);
	}

}

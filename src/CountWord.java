

import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a santence");
		String str = sc.nextLine();
		str = str.toLowerCase();
		System.out.println(str);
		int count;
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			count = 1;
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].equalsIgnoreCase(st[j])) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(st[i]);

		}
	}

}

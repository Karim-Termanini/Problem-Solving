import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int max = 0;
		int mid = 0;
		int min = 0;
		if (n1 >= n2 && n1 >= n3) {
			max = n1;
			if (n2 >= n3) {
				mid = n2;
				min = n3;
			} else {
				mid = n3;
				min = n2;
			}
		} else if (n2 >= n1 && n2 >= n3) {
			max = n2;
			if (n1 >= n3) {
				mid = n1;
				min = n3;
			} else {
				mid = n3;
				min = n1;
			}
		} else {
			max = n3;
			if (n1 >= n2) {
				mid = n1;
				min = n2;
			} else {
				mid = n2;
				min = n1;
			}
		}
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}

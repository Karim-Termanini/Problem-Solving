import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long size = in.nextLong();
		while (size != 0) {
			long num1 = in.nextLong();
			long num2 = in.nextLong();
			long max = Math.max(num1, num2), min = Math.min(num1, num2);
			min--;
			long result1 = min * (min + 1) / 2;
			long resutl2 = max * (max + 1) / 2;
			System.out.println(resutl2 - result1);

			size--;
		}
	}

}
/* oder so schneller
 import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int counter = in.nextInt(); counter != 0; --counter) {
			long s1 = in.nextLong(), s2 = in.nextLong(), min = Math.min(s1, s2);
			System.out.println(min + fib(Math.max(s1, s2)) - fib(min));
		}
	}

	public static long fib(long ¢) {
		return ¢ * (¢ + 1) / 2;
	}

} 
 * */
 
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long eyes = in.nextLong(), mouth = in.nextLong(), body = in.nextLong();
		long sum = 0;
		if ((mouth >= eyes && mouth >= body) || (mouth < eyes && mouth >= body) || (mouth >= eyes && mouth < body)) {
			sum = Math.min(eyes, body);
		} else if (mouth < body && mouth < eyes) {
			sum = mouth;
			eyes -= mouth;
			body -= mouth;
			sum += Math.min(eyes / 2, body);
		}
		System.out.println(sum);
	}
 
}
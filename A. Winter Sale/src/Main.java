import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		double discount = in.nextDouble();
		double price = in.nextDouble();
		System.out.println(String.format("%.2f", price + price * discount / 100 - discount));
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int counter = 0;
		int original = num;
		int firstDigit = 0;
		int n = 1;
		while (num != 0) {
			counter++;
			num /= 10;
		}
		for(int i=1;i<counter;i++) {
			n = n*10;
		}
		firstDigit = original /n;
		
		System.out.println(firstDigit);
	}

}

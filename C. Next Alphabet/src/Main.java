import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println(ch == 'z' ? 'a' : (char) (ch + 1));
	}

}
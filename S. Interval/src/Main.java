import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String interval1 = "Interval [0,25]";
		String interval2 = "Interval (25,50]";
		String interval3 = "Interval (50,75]";
		String interval4 = "Interval (75,100]";
		String outOfInterval = "Out of Intervals";

		double num = in.nextDouble();
		if (num >= 0 && num <= 25.0) {
			System.out.println(interval1);
		} else if (num > 25.0 && num <= 50.0) {
			System.out.println(interval2);
		} else if (num > 50.0 && num <= 75.0) {
			System.out.println(interval3);
		} else if (num > 75.0 && num <= 100.0) {
			System.out.println(interval4);
		} else {
			System.out.println(outOfInterval);
		}
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	}

	public double average(int[] salary) {
		Arrays.sort(salary);
		double sum = 0.0;
		int count = 1;
		for (int i = 1; i < salary.length - 1; i++) {
			sum += salary[i];
			count++;
		}
		return sum / count;
	}

}
/* das auch geht: 
 
 public double average(int[] salary) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double sum = 0.0;
		for (int s : salary) {
			max = Math.max(max, s);
			min = Math.min(min, s);
			sum += s;
		}
		return (sum - max - min) / ((salary.length - 2)*1.0);
	}
 */

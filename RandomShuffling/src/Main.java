
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 1; i <= numbers.length; i++) {
			numbers[i - 1] = i;
		}
		System.out.println("Vor");
		for (int i : numbers) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			int index = (int) (Math.random() * numbers.length);

			int temp = numbers[i];
			numbers[i] = numbers[index];
			numbers[index] = temp;
		}
		System.out.println();
		System.out.println("Nach");
		for (int i : numbers) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

}

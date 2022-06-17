/*
# B. Drawing 'X'
## time limit per test1 second
## memory limit per test256 megabytes
## 
## Some day, an artist wanted to draw an X mark on the wall in a fashionable way.
## 
## He wanted to do so by grouping snippets of slashes /, backslashes \, asterisks * and a capital X letter in an N×N square as shown in the sample. Can you help him?
## 
## Input
## Only one line containing one odd number N (3≤N≤49).
## 
## Output
## Print the fashionable drawing.
## 
## Example
## 
## input
## 5
 output
 \***/
 *\*/*
 **X**
 */*\*
 /***\

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				if (i == j && i != (n1 / 2) && j != (n1 / 2)) {
					System.out.print("\\");
				} else if (i == (n1 / 2) && j == (n1 / 2)) {
					System.out.print("X");
				} else if (j != n1 / 2 && i == ((n1 - 1) - j)) {
					System.out.print("/");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

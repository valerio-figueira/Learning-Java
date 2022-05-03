package simpleFibonacciSequency;

public class Fibonacci {
	static int first = 1;
	static int second = 1;
	static int next;

	public static void main(String[] args) {

		System.out.print(first + "." + second + ".");

		while (next < 500) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next + ".");
		}
	}
}

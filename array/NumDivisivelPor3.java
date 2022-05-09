package array;

public class NumDivisivelPor3 {
	static final int DIVISOR = 3;

	public static void main(String[] args) {
		Integer[] numSequency = new Integer[20];

		for (int i = 0; i < numSequency.length; i++) {
			numSequency[i] = i;
		}

		for (Integer num : numSequency) {
			if (num % DIVISOR == 0 && num != 0) {
				System.out.println(num + " é divisível por " + DIVISOR);
			}
		}
	}
}

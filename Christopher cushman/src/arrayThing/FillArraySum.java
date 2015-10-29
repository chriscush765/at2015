package arrayThing;

public class FillArraySum {

	public static void main(String[] args) {
		System.out.println("The sum is " + sumRandomArray(getRandomArray()));
	}

	/**
	 * Makes a random array of numbers about 30% of numbers are "*"
	 * 
	 * @return a random array
	 */
	public static String[][] getRandomArray() {
		String[][] thing = new String[10][10];
		fillArray(thing, 0, 0);
		return thing;
	}

	/**
	 * Sums and prints a random array
	 * 
	 * @param thing
	 *            the array to print
	 * @return the sum of thing
	 */
	public static int sumRandomArray(String[][] thing) {
		int sum = 0;
		for (String[] row : thing) {
			for (String col : row) {
				System.out.print(col);
				if (!col.equals("*")) {
					sum += Integer.parseInt(col);
				}
			}
			System.out.println();
		}
		return sum;
	}

	/**
	 * fill the selected array position with a random number or a * also goes on
	 * to the next slot
	 */
	public static void fillArray(String[][] arr, int x, int y) {
		if (y >= arr.length)
			return;
		if (x >= arr[y].length) {
			fillArray(arr, 0, y + 1);
			return;
		}
		arr[y][x] = ranChar();
		fillArray(arr, x + 1, y);

	}

	/**
	 * Gets a random number, 30% chance to get "*"
	 * 
	 * @return ran num
	 */
	public static String ranChar() {
		double percent = Math.random();
		int random = (int) (Math.random() * 10);

		if (percent <= 0.3)
			return "*";
		return String.valueOf(random);

	}

}

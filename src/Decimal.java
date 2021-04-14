/**
 * @author Arturo Polanco
 *
 */
public final class Decimal {

	/**
	 * Converts a decimal number to binary
	 * 
	 * @param input String representation of a number
	 * @return the decimal value of the number
	 */
	public static String convertToBinary(String input) {
		int dec = Integer.parseInt(input);

		StringBuilder output = new StringBuilder();
		int[] binaryArr = new int[32]; // 32 max
		int i = 0;
		int x = 0;

		while (dec > 0) {
			binaryArr[i++] = dec % 2;
			dec /= 2;
		}

		for (int j = binaryArr.length - 1; j >= 0; j--) {
			if (binaryArr[j] != 0) {
				x = j;
				break;
			}
		}

		for (int j = x; j >= 0; j--) {
			output.append(binaryArr[j]);
		}

		return "" + output;
	}

	/**
	 * Converts a decimal number to hexadecimal
	 * 
	 * @param input String representation of a number
	 * @return the hexadecimal value of the number
	 */
	public static String convertToHexadecimal(String input) {
		int dec = Integer.parseInt(input);

		StringBuilder output = new StringBuilder();
		int[] binaryArr = new int[32]; // 32 max
		int i = 0;
		int x = 0;

		while (dec > 0) {
			binaryArr[i++] = dec % 16;
			dec /= 16;
		}

		for (int j = binaryArr.length - 1; j >= 0; j--) {
			if (binaryArr[j] != 0) {
				x = j;
				break;
			}
		}

		for (int j = x; j >= 0; j--) {
			switch (binaryArr[j]) {
			case 10:
				output.append('A');
				break;
			case 11:
				output.append('B');
				break;
			case 12:
				output.append('C');
				break;
			case 13:
				output.append('D');
				break;
			case 14:
				output.append('E');
				break;
			case 15:
				output.append('F');
				break;
			default:
				output.append(binaryArr[j]);
				break;
			}

		}

		return "" + output;
	}

}

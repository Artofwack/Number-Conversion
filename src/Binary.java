/**
 * 
 */

/**
 * @author Arturo
 *
 */
public final class Binary {

	/**
	 * Converts a binary number to decimal
	 * 
	 * @param input
	 */
	public static String convertToDecimal(String input) {
		int x = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1')
				x = x * 2 + 1;
			else
				x = x * 2 + 0;
		}

		return "" + x;
	}

	/**
	 * Converts a binary number to hexadecimal
	 * 
	 * @param input
	 */
	public static String convertToHexadecimal(String input) {
		// Binary to Decimal
		int x = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1')
				x = x * 2 + 1;
			else
				x = x * 2 + 0;
		}

		// Decimal to Hex
		int dec = Integer.parseInt(input);

		StringBuilder output = new StringBuilder();
		int[] binaryArr = new int[32]; // 32 max
		int i = 0;
		int y = 0;

		while (dec > 0) {
			binaryArr[i++] = dec % 16;
			dec /= 16;
		}

		for (int j = binaryArr.length - 1; j >= 0; j--) {
			if (binaryArr[j] != 0) {
				y = j;
				break;
			}
		}

		for (int j = y; j >= 0; j--) {
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

		// return Decimal.convertToHexadecimal(Binary.convertToDecimal(input)); //
		// cheating?
	}

}

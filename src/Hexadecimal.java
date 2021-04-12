/**
 * 
 */

/**
 * @author Arturo
 *
 */
public final class Hexadecimal {

	/**
	 * 
	 * @param input
	 */
	public static String convertToBinary(String input) {
		StringBuilder output = new StringBuilder(input.toUpperCase());
		String chunk;
		StringBuilder result = new StringBuilder();

		while (output.length() % 4 != 0) {
			output.insert(0, "0");
		}

		for (int i = 0; i < output.length(); i += 4) {
			// break into 4 character string
			chunk = output.substring(i, i + 4);
			System.out.println(chunk);

			// convert each 4 character string to decimal and then binary value
			String dec = Hexadecimal.convertToDecimal(chunk);
			String bin = Decimal.convertToBinary(dec);

			result.append(bin);
		}

		return "" + result;
	}

	/**
	 * 
	 * @param input
	 */
	public static String convertToDecimal(String input) {
		input = input.toUpperCase();
		int x = 0;

		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'A':
				x = x * 16 + 10;
				break;
			case 'B':
				x = x * 16 + 11;
				break;
			case 'C':
				x = x * 16 + 12;
				break;
			case 'D':
				x = x * 16 + 13;
				break;
			case 'E':
				x = x * 16 + 14;
				break;
			case 'F':
				x = x * 16 + 15;
				break;
			default:
				x = x * 16 + (input.charAt(i) - '0');
				break;
			}
		}

		return "" + x;

	}

}

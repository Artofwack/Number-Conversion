/**
 * @author Arturo Polanco
 *
 */
public final class Hexadecimal {

	/**
	 * Converts a hexadecimal number to binary
	 * 
	 * @param input
	 * @return binary representation of number
	 */
	public static String convertToBinary(String input) {
		StringBuilder inputUpper = new StringBuilder(input.toUpperCase());
		String chunk;
		StringBuilder result = new StringBuilder();

		while (inputUpper.length() % 4 != 0) {
			inputUpper.insert(0, "0");
		}

		for (int i = 0; i < inputUpper.length(); i += 4) {
			// break into 4 character string
			chunk = inputUpper.substring(i, i + 4);
			System.out.println(chunk);

			// convert each 4 character string to decimal and then binary value
			String dec = Hexadecimal.convertToDecimal(chunk);
			String bin = Decimal.convertToBinary(dec);

			result.append(bin);
		}

		return "" + result;
	}

	/**
	 * Converts a hexadecimal number to decimal
	 * 
	 * @param input
	 * @return string value of decimal
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

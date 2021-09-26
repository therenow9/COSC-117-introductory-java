import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw8_ec
 * 14 April 2020
 *decryption encryption
 */
public class hw8_ec {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Encode or Decode (E/D): ");
		String enc = kb.nextLine();
		enc = enc.trim();
		enc = enc.toLowerCase();
		char c = enc.charAt(0);
		// get encode/decode clean input
		boolean crypt = false;
		if (c == 'd') {
			crypt = false;
		}
		if (c == 'e') {
			crypt = true;
		}
		// encode/decode stuff
		// get encode decode clean input and all
		if (crypt == true) {
			// encode
			System.out.print("Input the message: ");
			String msg = kb.nextLine();
			msg = msg.trim();
			// get message clean input
			System.out.print("Input the keyword: ");
			String key = kb.nextLine();
			key = key.trim();
			// get key clean input
			char keyArray[] = ProcessMessage(key);

			char charArray[] = ProcessMessage(msg);
			// get char array
			int intArray[] = ConvertCharArrayToIntegerArray(charArray);
			// convert to int array
			int keyintArray[] = ConvertCharArrayToIntegerArray(keyArray);
			keyintArray = RepeatArray(keyintArray, charArray.length);
			// convert key int array
			int intvigArray[] = VigenereEncrypt(intArray, keyintArray);
			// Encrypt
			char charvigArray[] = ConvertIntegerArrayToCharArray(intvigArray);
			// convert back to char arr
			String vigString = ConvertCharArrayToString(charvigArray);
			// convert back to string
			System.out.println("Ciphertext :" + vigString);
			// print encrypted message
		} else {
			// decode
			System.out.print("Input the Cipher Text: ");
			String cipher = kb.nextLine();
			cipher = cipher.trim();
			// get message clean input
			System.out.print("Input the keyword: ");
			String key = kb.nextLine();
			key = key.trim();
			// get key clean input
			char keyArray[] = ProcessMessage(key);
			//get key into an array
			char cipherArray[] = ProcessMessage(cipher);
			// get char array
			int intArray[] = ConvertCharArrayToIntegerArray(cipherArray);
			// convert to int array
			int keyintArray[] = ConvertCharArrayToIntegerArray(keyArray);
			int len = intArray.length;
			keyintArray = RepeatArray(keyintArray, len);
			// convert key int array
			int intvigArray[] = VigenereDecrypt(intArray, keyintArray);
			// Encrypt
			char charvigArray[] = ConvertIntegerArrayToCharArray(intvigArray);
			// convert back to char array
			String vigString = ConvertCharArrayToString(charvigArray);
			// convert back to string
			System.out.println("Plaintext : " + vigString);
			// print encrypted message
		}
	}

	public static char[] ProcessMessage(String message) {
		String proc = message;
		proc = proc.replaceAll("\\s", "");
		// get rid of all white space
		proc = proc.replaceAll("[^a-zA-Z0-9]", "");
		// get rid of all non letters
		// i chose to remove whitespace using this method instead i hope that is ok
		// remove whitespace
		proc.toUpperCase();
		// make upper case
		int len = proc.length();
		// get string length
		char charArray[] = new char[len];
		for (int i = 0; i < len; i++) {
			if (Character.isAlphabetic(proc.charAt(i)) == true) {
				// if it's alphabetic
				charArray[i] = proc.charAt(i);
				// populate the array
			} else {
				break;
				//if its not a character don't do anything
			}
		}
		return charArray;
		// give it back
	}

	public static int[] ConvertCharArrayToIntegerArray(char[] A) {
		char charArray[] = A;
		// char array
		int len = charArray.length;
		// char array length clean
		int[] intArray = new int[len];
		// create new int array with same length
		for (int i = 0; i < len; ++i) {
			intArray[i] = Character.getNumericValue(charArray[i]) - 10;
			// use a cast to convert traight from ascii
		}
		return intArray;
	}

	public static char[] ConvertIntegerArrayToCharArray(int[] A) {
		int[] intArray = A;
		// int array
		int i = 0;
		int len = intArray.length;
		// char array length clean
		char[] charArray = new char[len];
		// create new int array with same length

		for (i = 0; i < len; ++i) {
			charArray[i] = (char) ((intArray[i]) + 'A');
			// add +0 for cast
		}

		return charArray;
	}

	public static String ConvertCharArrayToString(char[] A) {
		char charArray[] = A;
		// char array
		int len = charArray.length;
		// char array length clean
		String msg = "";
		String conc = "";
		for (int i = 0; i < len; ++i) {
			conc = "" + charArray[i];
			msg = msg + conc;
			// add char sto string to;
		}
		msg = msg.toUpperCase();
		// clean string
		return msg;
	}

	public static int[] RepeatArray(int[] A, int newLength) {
		int[] intArray = A;
		int len = intArray.length;
		// char array length clean
		int count = 0;
		int new_len = newLength;
		int[] new_intArray = new int[new_len];
		// create second array
		int new_arr_len = new_intArray.length;
		// set equal
		// do length
		for (int i = 0; i < new_arr_len; ++i) {
			// add char sto string to;
			new_intArray[i] = (int) intArray[count];
			// set value to new one
			count += 1;
			// add to count
			if (count == len) {
				count = 0;
			}
		}
		return new_intArray;
	}

	public static int[] VigenereEncrypt(int[] Message, int[] Key) {
		int[] msgArray = Message;
		int[] keyArray = Key;
		// set arrays
		int[] vigArray = new int[Message.length];
		for (int i = 0; i < Message.length; ++i) {
			vigArray[i] = (((msgArray[i] + keyArray[i]) % 26));
			// do add and modulo
		}
		return vigArray;
	}

	public static int[] VigenereDecrypt(int[] Cipher, int[] Key) {
		int[] CipherArray = Cipher;
		int[] keyArray = Key;
		// set arrays
		int[] vigArray = new int[Cipher.length];
		for (int i = 0; i < Cipher.length; i++) {
			vigArray[i] = ((CipherArray[i] - keyArray[i] + 26) % 26);
			// do add and modulo
		}
		return vigArray;
	}
}

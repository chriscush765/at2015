package nodes;

public class Morse {

	private static final char[] data = { ' ', 'T', 'E', 'M', 'N', 'A', 'I',
			'O', 'G', 'K', 'D', 'W', 'R', 'U', 'S', '_', '.', 'Q', 'Z', 'Y',
			'C', 'X', 'B', 'J', 'P', ' ', 'L', '-', 'F', 'V', 'H', '0', '9',
			' ', '8', ' ', ' ', ' ', '7', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
			'6', '1', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '2', ' ', ' ', ' ',
			'3', ' ', '4', '5' };

	private static final String[] morse = { ".-", "-...", "-.-.", "-..", ".",
			"..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
			"---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
			"-..-", "-.--", "--.." };

	private static String decode(String str, int index) {
		if (str.isEmpty() || index >= data.length)
			return " done";
		String kek = str.substring(0, 1);
		if (kek.equals("_") || kek.equals("-"))
			return decode(str.substring(1), index * 2 + 1);
		else if (kek.equals("."))
			return decode(str.substring(1), (index + 1) * 2);
		else if (kek.equals(" "))
			return data[index] + decode(str.substring(1), 0);
		else if (kek.equals("/"))
			return data[index] + decode(str.substring(1), 0);
		else
			return "";

	}
	
	public static void toMorse(String input){
		 		for(String word : input.split(" ")){
		 			for(char c : word.toCharArray())
		 				System.out.print(morse[c - 65]+" ");
		 			System.out.print("/ ");
		 		}
		 	}

	public static String decode(String str) {
		if (str.trim().endsWith("/"))
			return decode(str.trim(), 0);
		else {
			String arr = str.trim().concat("/");
			return decode(arr, 0);
		}
	}

	public static void main(String[] args) {
		System.out
				.println(decode(".. / .-. . .- .-.. .-.. -.-- / .-.. .. -.- . / -- . -- . ..."));
		System.out
				.println(decode("-- . -- . ... / -.-. .- -. / -... . / --. .-. . .- - / ... --- -- . - .. -- . ..."));
		
		System.out.println("To Morse: \"wow it works\"");
		toMorse("WOW IT WORKS");
	}

}

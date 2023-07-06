package Collection;

import java.util.HashMap;

public class Moolya_Software {
	public static void main(String[] args) {
		// Non repeated Characters
		String str = "deep";
		char[] ch = str.toCharArray();
		HashMap<Character, Character> hm = new HashMap<Character, Character>();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; i < ch.length; j++) {
				if (ch[i] != ch[j]) {

					hm.put(ch[i], ch[j]);
					hm.get(ch[i]);

				}
				System.out.println(hm);
			}

		}

	}

}
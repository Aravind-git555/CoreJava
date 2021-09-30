package CommonPrograms;

import java.util.ArrayList;

public class SplitProgram {

	public static void main(String[] args) {

		String s1 = "I want shuttle", s2 = "I want to play tennis", s3 = "I want to play cricket";
		String split1[] = split(s1, " ");
		String split2[] = split(s2, " ");
		String split3[] = split(s3, " ");

		String compare1[] = compare(split1, split2);
		String compare2[] = compare(split3, compare1);

		System.out.println("The repeated Strings are");
		for (int i = 0; i < compare2.length; i++) {
			System.out.print(compare2[i] + " ");
		}

	}

	public static String[] split(String s1, String s2) {

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		ArrayList<String> al = new ArrayList<>();
		int k = 0;
		String s = "";
		Outer: for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (c1[i] == c2[j]) {
					al.add(k, s);
					k++;
					s = "";
					continue Outer;
				} else {
					s += Character.toString(c1[i]);
					if (i == (s1.length() - 1)) {
						al.add(k, s);
					}
				}
			}
		}

		return al.toArray(new String[al.size()]);
	}

	public static String[] compare(String[] s1, String[] s2) {

		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (equals(s1[i], s2[j])) {
					al.add(s1[i]);
				}

			}
		}

		return al.toArray(new String[al.size()]);
	}

	public static boolean equals(String s1, String s2) {

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		if (c1.length == c2.length) {
			for (int k = 0; k < c2.length; k++) {

				if (c1[k] != c2[k]) {
					return false;
				}
			}
		} else {
			return false;
		}

		return true;
	}

}

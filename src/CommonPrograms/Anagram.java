package CommonPrograms;

public class Anagram {

	public static void main(String[] args) {

		if (isAnagram("anagramm", "marganaa")) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not a anagram");
		}
	}

	public static boolean isAnagram(String A, String B) {

		String a = A.replace(" ", "").toLowerCase();
		String b = B.replace(" ", "").toLowerCase();

		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();

		if (a1.length != b1.length) {
			return false;
		}

		for (int i = 0; i < a1.length; i++) {
			int count = 0;
			for (int j = 0; j < b1.length; j++) {

				if ((a1[i] != b1[j])) {
					count++;
				} else if ((a1[i] == b1[j])) {
					return true;
				} else if (a1[i] == b1[j]) {
					break;
				}

			}
			if (count == b.length())
				return false;
		}

		return true;

	}

	public static boolean isAnagram1(String A, String B) {
		
		

		return false;
	}
}

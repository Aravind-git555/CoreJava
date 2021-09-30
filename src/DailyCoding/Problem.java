package DailyCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

/*Implement the function embolden(s, lst) which takes in a string s and list of substrings lst, 
 
  and wraps all substrings in s with an HTML bold tag <b> and </b>.

If two bold tags overlap or are contiguous, they should be merged.

For example, given s = abcdefg and lst = ["bc", "ef"], return the string a<b>bc</b>d<b>ef</b>g.

Given s = abcdefg and lst = ["bcd", "def"], return the string a<b>bcdef</b>g, since they overlap.*/

public class Problem {

	public static String embolden(String s, List<String> lst) {
		String resultString = "";
		System.out.println("String \n " + s + "\nSubstrings");
		lst.forEach(l -> System.out.println(l));
		for (int i = 0; i < s.length(); i++) { // abcdef
			for (int j = 0; j < lst.size(); j++) { // cd,ef
				int lastIndex = (lst.get(j).length()) - 1;
				if (s.charAt(i) == lst.get(j).charAt(0)) {
					resultString = resultString + "<b>" + s.charAt(i);
				} else if (s.charAt(i) == lst.get(j).charAt(lastIndex)) {
					resultString = resultString + s.charAt(i) + "</b>";
				} else {
					resultString = resultString + s.charAt(i);
				}
			}
		}
		return resultString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lst = new ArrayList<>();
		String s;
		int b = 0;
		System.out.println("Enter a String here");
		s = sc.nextLine();
		System.out.println("Enter a Sub-String list");
		do {
			String s1 = sc.next();
			lst.add(s1);
			System.out.println("Do want add you want to add another substring \n 1.Yes \n 2.Exit");
			b = sc.nextInt();
			if (b == 1)
				System.out.println("Enter sub-string");
		} while (b == 1);
		System.out.println(embolden(s, lst));
	}
}

package Concepts;

public class Date {

	public static int date(String string) {
		String arr2[] = string.split(":");

		int hour, minute, sec;

		hour = Integer.valueOf(arr2[0]) * 3600;
		minute = Integer.valueOf(arr2[1]) * 60;
		sec = Integer.valueOf(arr2[2]);

		int result = hour + minute + sec;
		return result;
	}

	public static void main(String[] args) {
		String date[] = { "07:45:56", "11:26:10", "05:45:31", "14:12:33" };
		int seconds[] = new int[date.length];
		int i = 0, min1 = 0, min2 = 0, sub, temp = Integer.MAX_VALUE; // 6876886868668
		for (String string : date) {
			seconds[i] = date(string);
			i++;
		}

		for (int j = 0; j < seconds.length - 1; j++) {
			for (int j2 = j + 1; j2 < seconds.length; j2++) {

				sub = seconds[j] - seconds[j2];

				if (Math.abs(sub) < Math.abs(temp)) {
					temp = sub;
					min1 = j;
					min2 = j2;
				}

			}
		}

		System.out.println(date[min1] + " " + date[min2]);

	}
}

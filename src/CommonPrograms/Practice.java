package CommonPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {

	int n1;

	public Practice(int n1) {
		this.n1 = n1;
	}

	public static void main(String[] args) {

		List<Practice> list = new ArrayList<>();

		Comparator<Practice> compare = new Comparator<Practice>() {

			@Override
			public int compare(Practice arg0, Practice arg1) {
				if (arg0.n1 == arg1.n1) {
					return 0;
				} else if (arg0.n1 > arg1.n1) {
					return 1;
				} else {
					return -1;
				}
			}

		};

		list.add(new Practice(80));
		list.add(new Practice(99));
		list.add(new Practice(78));

		Collections.sort(list, compare);

		for (Practice practice : list) {
			System.out.println(practice.n1);
		}
	}

}

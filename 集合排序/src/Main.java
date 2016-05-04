import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(1);
		list.add(8);
		list.add(3);
		list.add(5);
		list.add(4);

		System.out.println("排序前:" + list);

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer lhs, Integer rhs) {
				if (lhs < rhs) {
					return 1;
				} else {
					return -1;
				}
			}
		});

		System.out.println("排序后:" + list);
	}
}

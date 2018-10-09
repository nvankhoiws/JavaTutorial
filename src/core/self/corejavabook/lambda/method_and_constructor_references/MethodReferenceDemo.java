package core.self.corejavabook.lambda.method_and_constructor_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		Integer[] integers = {1, -3, 0, 10, -7, 21};

		/**
		 * block code 1
		 */
		Arrays.sort(integers, Integer::compareTo);

		/**
		 * block code 2
		 */
		Arrays.sort(integers, (x, y) -> {
			System.out.println("x\t" + x + "\t\t" + "y\t" + y + "\t" + x.compareTo(y));
			return x.compareTo(y);
		});

		System.out.println(Arrays.toString(integers));
///////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));

		list.removeIf(Objects::isNull);

		list.forEach(System.out::println);
	}

}

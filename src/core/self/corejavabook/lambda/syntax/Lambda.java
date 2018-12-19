package core.self.corejavabook.lambda.syntax;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {
	public static void main(String[] args) {
		String[] arrStr = {"Khoi", "PhuongDung", "CocaCola", "BaNhanh"};
		Comparator<String> comparator = (_1, _2) -> _1.length() - _2.length();
		Arrays.sort(arrStr, comparator);
		for (String str : arrStr) {
			System.out.println(str);
		}
	}
}

package core.self.corejavabook.lambda.syntax;

import java.util.Arrays;

public class Lambda {
	public static void main(String[] args) {
		String[] arrStr = {"Khoi", "PhuongDung"};
		Arrays.sort(arrStr,
				(str1, str2) ->
						- str1.length() + str2.length());
		for (String str : arrStr) {
			System.out.println(str);
		}
	}
}

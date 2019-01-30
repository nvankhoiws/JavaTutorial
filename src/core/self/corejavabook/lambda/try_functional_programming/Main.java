package core.self.corejavabook.lambda.try_functional_programming;


/**
 * Created by KhoiNV6@vttek.vn on 1/30/19
 **/
public class Main {

	public static void main(String[] args) {

		Measurable measurable = () -> System.out.println("Freedom to implement functional interface");

//		First way to use function interface
		publishMeasurable(10, measurable);

//		Second way to use function interface
		publishMeasurable(30, () -> System.out.println("Just another way to use function interface"));

	}

	private static void publishMeasurable(int count, Measurable measurable){
		for (int i = 0; i < count; i++) {
			measurable.measure();
		}
	}


}

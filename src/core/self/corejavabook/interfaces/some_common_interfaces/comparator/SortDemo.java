package core.self.corejavabook.interfaces.some_common_interfaces.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends); // friends is now ["Mary", "Paul", "Peter"]
        System.out.println(Arrays.toString(friends));
        
        friends = new String[] { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));

        Comparator<String> comparator = new LengthComparator();
        if (comparator.compare("Khoi", "Nguyen") < 0)
            System.out.println(true);
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

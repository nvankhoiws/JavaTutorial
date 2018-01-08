package core.com.udemy.timbuchalka.section13_collections.symetric_asymetric_difference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 1/8/201811:47 AM.
 */
public class BulkOperationOnSet {
    public static void main(String[] args) {
        String[] arrOne = "Today is Monday tomorrow is Tuesday".split(" ");
        Set<String> setone = new HashSet<String>(Arrays.asList(arrOne));

        String[] arrTwo = "Today is Tuesday tomorrow is Wednesday".split(" ");
        Set<String> settwo= new HashSet<String>(Arrays.asList(arrTwo));

        printSet(setone);
        printSet(settwo);

        Set<String> intersection = new HashSet<>(setone);
        intersection.retainAll(settwo);
        printSet(intersection);

        // Symmetric difference
        Set<String> symmetricDiff = new HashSet<>(setone);
        symmetricDiff.removeAll(intersection);

        Set<String> symmetricDiff2 = new HashSet<>(settwo);
        symmetricDiff2.removeAll(intersection);

        symmetricDiff.addAll(symmetricDiff2);

        printSet(symmetricDiff);
    }

    private static void printSet(Set<String> set){
        for(String s : set) {
            System.out.print("\t" + s);
        }
        System.out.println();
        System.out.println("============================");
    }

}

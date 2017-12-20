package core.self.arithmetic;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/1/201711:46 AM.
 */
public class IsOdd {

    public static void main(String[] args) {
        System.out.println(String.valueOf(isOdd(-4)));
    }

    public static boolean isOdd (int i ){
        return (i % 2) != 0;
    }

}

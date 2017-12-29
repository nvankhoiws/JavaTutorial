package core.self.com.codefights.core.intro_gate;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/29/20173:48 PM.
 */
public class PhoneCall {
    public static void main(String[] args) {
        System.out.println(phoneCall(3, 1, 2, 20));
        System.out.println(phoneCall(2, 2, 1, 2));
        System.out.println(phoneCall(10, 1, 2, 22));
    }

    private static int phoneCall(int min1, int min2_10, int min11, int s) {
        return (s / min1 > 0) ? 1 + (((s - min1) / min2_10 > 0) ? (((s - min1) / min2_10 < 9) ? ((s - min1) / min2_10) : (9 + (s - min1 - 9 * min2_10) / min11) ) : 0) : 0;
    }

}

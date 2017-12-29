package core.self.com.codefights.core.intro_gate;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/29/20173:37 PM.
 */
public class LateRide {
    public static void main(String[] args) {
        System.out.println(lateRide(808));
    }

    private static int lateRide(int n) {
        int hour = n/60;
        int minute = n%60;
        return (hour/10)+(hour%10) + (minute/10)+(minute%10);
    }


}

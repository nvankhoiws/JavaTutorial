package core.self.org.o7planning.java.basic.enum_tutorial;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 2/12/20184:52 PM.
 */
public class TimeTable {
    private static String getJob(WeekDay weekDay) {
        if (weekDay == WeekDay.SATURDAY || weekDay == WeekDay.SUNDAY) {
            return "Nothing";
        }
        return "Coding";
    }

    public static void main(String[] args) {
        System.out.println(getJob(WeekDay.TUESDAY));
        System.out.println(getJob(WeekDay.FRIDAY));
        System.out.println(getJob(WeekDay.SUNDAY));
    }
}

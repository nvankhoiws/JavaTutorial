package core.self.org.o7planning.java.basic.enum_tutorial;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 2/12/20185:08 PM.
 */
public class Main {
    private static void printAllWeekDay(){
        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay.toString());
            System.out.println("code : " + weekDay.getCode());
            System.out.println("vietnamese version : " + weekDay.getVietnameseVersion());
            System.out.println("number of the day in the week : " + weekDay.getNumberInWeek());
            System.out.println();
        }
    }

    private static boolean isTGIF(WeekDay weekDay) {
        return weekDay.getCode().equalsIgnoreCase(WeekDay.FRIDAY.getCode());
    }

    public static void main(String[] args) {
        printAllWeekDay();

        System.out.println("===================================");

        System.out.println(WeekDay.FRIDAY.getVietnameseVersion() + " is "  + ((isTGIF(WeekDay.FRIDAY)) ? " TGIF day" : " not TGIF day"));
        System.out.println(WeekDay.MONDAY + " is "  + ((isTGIF(WeekDay.MONDAY)) ? " TGIF day" : " not TGIF day"));

        System.out.println("===================================");

        System.out.println(WeekDay.THURSDAY + ((WeekDay.THURSDAY.isWorkingDay()) ? " is a working day" : " is not a working day"));
        System.out.println(WeekDay.SATURDAY + ((WeekDay.SATURDAY.isWorkingDay()) ? " is a working day" : " is not a working day"));

        System.out.println("===================================");

        System.out.println("code : " + WeekDay.SUNDAY.getCode());
        System.out.println("vietnamese version : " + WeekDay.SUNDAY.getVietnameseVersion());
        System.out.println("number of the day in the week : " + WeekDay.SUNDAY.getNumberInWeek());
    }

}

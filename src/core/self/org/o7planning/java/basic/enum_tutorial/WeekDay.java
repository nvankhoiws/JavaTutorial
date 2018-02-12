package core.self.org.o7planning.java.basic.enum_tutorial;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 2/12/20184:51 PM.
 */
public enum WeekDay {
    MONDAY("MON", "Thu Hai", 2),
    TUESDAY("TUES", "Thu Ba", 3),
    WEDNESDAY("WED", "Thu Tu", 4),
    THURSDAY("THUR", "Thu Nam", 5),
    FRIDAY("FRI", "Thu Sau", 6),
    SATURDAY("SAT", "Thu Bay", 7),
    SUNDAY("SUN", "Chu Nhat", 8);

    private String code;
    private String vietnameseVersion;
    private Integer numberInWeek;

    WeekDay(String code, String vietnameseVersion, Integer numberInWeek) {
        this.code = code;
        this.vietnameseVersion = vietnameseVersion;
        this.numberInWeek = numberInWeek;
    }

    public String getCode(){
        return this.code;
    }

    public String getVietnameseVersion() {
        return vietnameseVersion;
    }

    public Integer getNumberInWeek() {
        return numberInWeek;
    }

    public boolean isWorkingDay(){
        return this.getCode().equalsIgnoreCase(MONDAY.getCode())
                || this.getCode().equalsIgnoreCase(TUESDAY.getCode())
                || this.getCode().equalsIgnoreCase(WEDNESDAY.getCode())
                || this.getCode().equalsIgnoreCase(THURSDAY.getCode())
                || this.getCode().equalsIgnoreCase(FRIDAY.getCode());
    }
}

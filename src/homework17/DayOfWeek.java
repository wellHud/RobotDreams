package homework17;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;

    DayOfWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public static String getDayOfWeek(int dayNumber) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.dayNumber == dayNumber) {
                return day.name();
            }
        }
        return "Invalid day number";
    }
}

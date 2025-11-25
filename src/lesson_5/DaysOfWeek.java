package lesson_5;

public enum DaysOfWeek {
    MONDAY(1,"B.E",false),
    TUESDAY(2,"C.HA",false),
    WEDNESDAY(3,"CH",false),
    THURSDAY(4,"C.A",false),
    FRIDAY(5,"CUME",false),
    SATURDAY(6,"SH",true),
    SUNDAY(7,"B",true);
    private final int indexOfDay;
    private final String dayOfWeekInAze;
    private final Boolean isEndOfWeek;

    DaysOfWeek(int indexOfDay, String dayOfWeekInAze, Boolean isEndOfWeek) {
        this.indexOfDay = indexOfDay;
        this.dayOfWeekInAze = dayOfWeekInAze;
        this.isEndOfWeek = isEndOfWeek;

    }

    public int getIndex(){
        return indexOfDay;
    }

    public Boolean getEndOfWeek() {
        return isEndOfWeek;
    }

    public String getDayOfWeekInAze() {
        return dayOfWeekInAze;
    }
}

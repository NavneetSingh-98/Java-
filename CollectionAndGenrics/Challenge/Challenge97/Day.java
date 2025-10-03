package CollectionAndGenrics.Challenge.Challenge97;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    private Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public String getType(){
        return isWeekday ? "Weekday" : "Weekend"; 
    }
}

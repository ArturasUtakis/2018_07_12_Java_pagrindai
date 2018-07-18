package days.fifth;

public enum Week {
    MONDAY(1), TUESDAY(2), WENDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7), DEFAULT(0);
    private int id;
    Week(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public static Week getDayById(int numb){
        Week result = DEFAULT;
        for (Week week : Week.values()){
            if(week.getId() == numb){
                result = week;
                break;
            }
        }
        return result;
    }
}

package ChapterThree;

public class DateClass {
    private int month;
    private int day;
    private int year;

    public  DateClass(int month, int day, int year){
        String value = String.valueOf(year);
        if (month > 12 || day > 31 || value.length() > 4){
           month = day = year = 0;
            System.out.print("Month, Day and or year format is wrong: ");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate(){
        return String.format("%d/%d/%d", month, day,year);
    }

    public static void main(String[] args) {
        DateClass date = new DateClass(3,4,20226);
        System.out.println(date.displayDate());
    }
}

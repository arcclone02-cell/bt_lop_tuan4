public class Date{
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
    public boolean isLeapYear()
    {
        if (this.year % 4 != 0) {
        return false;
    } else if (this.year % 100 != 0) {
        return true;
    } else if (this.year % 400 != 0) {
        return false;
    } else {
        return true;
    }
    }
       public String toString() {
        return "Date[day=" + this.day + ", month=" + this.month + ", year=" + this.year + "]";
    }
}
public static void main(String[] args) {}
public static void main(String[] args) {
    Date date1 = new Date(1,4,2024);
    System.out.println(date1);
    System.ou.println(date1.isLeapYear());
    Date date2 = new Date(25, 12, 2025);
    System.out.println(date2);
    System.out.println(date2.isLeapYear());
}
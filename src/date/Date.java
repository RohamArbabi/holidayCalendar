package date;

public class Date {
    private int d, m, y;

    public Date(int m, int d, int y) {
        this.m = m;
        this.d = d;
        this.y = y;
    }

    public Date(int m, int d) {
        this.m = m;
        this.d = d;
        this.y = y;
    }

    public int getDay() {
        return this.d;
    }

    public int getMonth() {
        return this.m;
    }

    public int getYear() {
        return this.y;
    }
}
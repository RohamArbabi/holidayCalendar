package date;

public class Date {
    private int d, m, y;

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public Date(int d, int m) {
        this.d = d;
        this.m = m;
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
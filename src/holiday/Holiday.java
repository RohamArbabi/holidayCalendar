package holiday;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Holiday {
    public int m;
    public int[] d;
    public String desc;


    public Holiday(int m, int d, String desc) {
        this.m = m;
        this.d = new int[]{d};
        this.desc = desc;
    }

    public Holiday(int m, int[] d, String desc) {
        this.m = m;
        this.d = d;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Month: " + m + ", Day: " + Arrays.toString(d) + "\nDescription:\n" + desc;
    }
}


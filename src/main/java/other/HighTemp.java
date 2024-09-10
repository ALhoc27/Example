package other;

public class HighTemp {
    private int temp;

    HighTemp(int temp) {
        this.temp = temp;
    }

    boolean sameTemp(HighTemp highTemp) {
        return this.temp == highTemp.temp;
    }

    boolean lessThatTemp(HighTemp highTemp) {
        return this.temp < highTemp.temp;
    }
}
class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {
                new HighTemp(9), new HighTemp(8),
                new HighTemp(7), new HighTemp(6),
        };

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(6));
        System.out.println(count);
    }
}

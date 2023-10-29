package ObjetoDate;

import java.util.Calendar;

public class Usando_calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}

package ObjetoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calculo_dia_mes_ano {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("02/10/2023"));
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH,1);
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
    }
}

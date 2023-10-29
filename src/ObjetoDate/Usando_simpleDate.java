package ObjetoDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usando_simpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
        System.out.println(simpleDateFormat.format(date));
    }
}

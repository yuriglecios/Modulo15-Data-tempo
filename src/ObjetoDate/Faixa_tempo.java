package ObjetoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Faixa_tempo {
    public static void main(String[] args) throws ParseException {
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-01-02"), LocalDate.now());
        System.out.println("O boleto está a " + dias + " atrasado");
    }
}

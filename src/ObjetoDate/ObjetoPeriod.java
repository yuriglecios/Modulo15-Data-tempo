package ObjetoDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ObjetoPeriod {
    public static void main(String[] args) {
        LocalDate dataAntiga = LocalDate.of(2022,9,1);
        LocalDate dataNova = LocalDate.of(2023,11,3);

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println(periodo.getDays());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getYears());
    }
}

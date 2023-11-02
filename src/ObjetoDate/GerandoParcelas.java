package ObjetoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {
    public static void main(String[] args) throws ParseException {
        Date dataAtual = new SimpleDateFormat("dd/MM/yyyy").parse("02/11/2023");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataAtual);

        for (int parcela = 1; parcela <= 12; parcela ++){
            calendar.add(Calendar.MONTH,1);
            System.out.println("Parcela " + parcela + " vencimento em " +
                    new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
    }
}

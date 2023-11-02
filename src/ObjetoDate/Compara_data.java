package ObjetoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Compara_data {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyyy");
        Date dataBoleto = simpleDateFormat.parse("10/04/2023");
        Date dataAtual = simpleDateFormat.parse("02/11/2023");

        if (dataBoleto.after(dataAtual)){
            System.out.println("seu boleto esta em dia. PARABENS!");
        } else {
            System.out.println("seu boleto está vencido");
        }
    }
}

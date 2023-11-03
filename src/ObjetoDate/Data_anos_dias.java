package ObjetoDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data_anos_dias {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2023,5,15);
        LocalDate data2 = LocalDate.parse("2023-05-15");
        System.out.println("Adicionando 5 dias do jeito normal " + data.plusDays(5));
        System.out.println("Adiciionando de modo com string " + data2.plusDays(5));

        LocalDate dataAtual = LocalDate.now();
        for (int parcela = 1; parcela < 12; parcela ++){
            dataAtual = dataAtual.plusMonths(1);
            System.out.println("Data de vencimento do boleto: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + parcela);
        }
    }
}

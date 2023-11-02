package ObjetoDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoNovaApi {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataHora = LocalDateTime.now();

        String formatar = horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' uuuu")));
        System.out.println(formatar);
    }
}

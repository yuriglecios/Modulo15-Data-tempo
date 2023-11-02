package ObjetoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class NovaApi_data_hora {
    public static void main(String[] args) throws ParseException {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' uuuu");
        DateTimeFormatter formatar2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatar3 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' uuuu, HH:mm:ss");

        String formataData = formatar.format(dataAtual);
        String formataHora = formatar2.format(horaAtual);
        String formataDataHora = formatar3.format(dataHora);

        System.out.println("Data atual: " + formataData);
        System.out.println("Hora atual: " + formataHora);
        System.out.println("data e hora atual: " + formataDataHora);
    }
}

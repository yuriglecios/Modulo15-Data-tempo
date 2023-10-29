package ObjetoDate;

import java.util.Date;

public class DatasEmJava {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Mês do ano: " + data.getMonth());
        System.out.println("Dia do mês: " + data.getDate());
        System.out.println("Dia da semana: " + data.getDay());
        System.out.println("Hora do dia: " + data.getHours());
        System.out.println("Minuto do dia: " + data.getMinutes());
        //teste
    }
}

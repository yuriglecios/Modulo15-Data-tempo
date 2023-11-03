package ObjetoDate;

import java.time.Duration;
import java.time.Instant;

public class Tempo_processo {
    public static void main(String[] args) throws InterruptedException {
        Instant inicio = Instant.now();
        Thread.sleep(5000);
        Instant finalizou = Instant.now();
        Duration duracao = Duration.between(inicio, finalizou);
        System.out.println(duracao.toSeconds());
    }
}

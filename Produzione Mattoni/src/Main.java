import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        System.out.println("Produzione in fase di avvio, inserire \"AVVIA\" per iniziare a produrre un lotto di mattoni");
        try(Scanner input = new Scanner(System.in))
        {
            if(input.nextLine().equals("AVVIA"))
            {
                String lotto = "L" + Math.random()*1000;
                Produzione produzione = new Produzione(lotto);
                Thread prodThread = new Thread(produzione);
                prodThread.start();
            }

        }
    }
}
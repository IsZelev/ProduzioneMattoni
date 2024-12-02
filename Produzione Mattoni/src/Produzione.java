import java.util.ArrayList;

public class Produzione implements Runnable
{
    private int mescolatriciTot = 8;
    private int numMattoni = 1600;
    private ArrayList<String> lotti;
    private ArrayList<Mescolatrice> mescolatrici;

    public Produzione(String l)
    {
        lotti = new ArrayList<String>();
        mescolatrici = new ArrayList<Mescolatrice>();
        lotti.add(l);
    }
    
    @Override
    public void run()
    {
        System.out.println("Avvio produzione...");
        //genera tutte le mescolatrici e le avvia
        for(int  i = 0; i < mescolatriciTot; i++)
        {
            Mescolatrice mescolatrice = new Mescolatrice(i);
            mescolatrici.add(mescolatrice);
            mescolatrice.run();
        }

        int maltaProdotta = 0;

        for (Mescolatrice m : mescolatrici)
        {
            maltaProdotta += m.getMalta();
        }

        RulloStampante rullo = new RulloStampante(maltaProdotta);
        Forno forno = new Forno(lotti);
        Imballatore imballatore = new Imballatore(forno.getMatt());


        
    }
}

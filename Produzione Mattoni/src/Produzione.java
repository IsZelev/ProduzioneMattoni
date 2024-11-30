import java.util.ArrayList;

public class Produzione implements Runnable
{
    private int mescolatriciTot = 8;
    private int numMattoni = 1600;
    private ArrayList<String> lotti;

    public Produzione(String l)
    {
        lotti.add(l);
    }
    
    @Override
    public void run()
    {
        //genera tutte le mescolatrici e le avvia
        for(int  i = 0; i < mescolatriciTot; i++)
        {
            Mescolatrice mescolatrice = new Mescolatrice(i);
            mescolatrice.run();
        }
    }
}

public class Mescolatrice implements Runnable
{
    private int capienza = 200;
    private int id;

    public Mescolatrice(int i)
    {
        id = i;
    }

    public void run()
    {
        System.out.println("Mescolatrice " + id + " avviata");
        for(int i = 0; i < capienza; i+=20)
        {
            System.out.println("Mattoni prodotti: " + i);
        }
    }
}

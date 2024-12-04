public class Mescolatrice implements Runnable
{
    private int capienza = 200;
    private int id;
    private int malta;

    public Mescolatrice(int i)
    {
        id = i;
    }

    public int getMalta()
    {
        return malta;
    }

@Override
    public void run()
    {
        System.out.println("Mescolatrice " + id + " avviata");
        for(int i = 0; i <= capienza; i+=40)
        {
            System.out.println("Malta impastata dalla mescolatrice " + id + ": " + i);
            malta += i;
        }
    }
}

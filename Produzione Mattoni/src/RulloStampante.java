public class RulloStampante
{
    private int idRullo;
    private int mattoni;
    private int mattoniStampati = 0;
    private Forno forno;

    public RulloStampante(int m)
    {
        mattoni = m;
        idRullo = (int) Math.random();
    }

    public int stampa() throws InterruptedException
    {
        while(mattoniStampati < mattoni)
        {
            mattoniStampati+=200;
            forno.inforna(mattoniStampati);
            System.out.println("Il rullo "+idRullo+" ha inviato 200 mattoni a cuocere. \n");
        }
        System.out.println("Il rullo "+idRullo+" ha stampato "+mattoniStampati+" mattoni.\n");
        return mattoniStampati;
    }

    
}

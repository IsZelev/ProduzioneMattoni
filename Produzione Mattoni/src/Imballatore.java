import java.util.ArrayList;

public class Imballatore
{
    private ArrayList<Mattone> mattoni;
    public Imballatore(ArrayList<Mattone> m)
    {
        mattoni = m;
    }

    public String imballa()
    {
        int tot = mattoni.size();
        String msg = "L'imballatore ha imballato "+tot+" mattoni del lotto: "+mattoni.getLast().getLotto();
        return msg;
    }

}

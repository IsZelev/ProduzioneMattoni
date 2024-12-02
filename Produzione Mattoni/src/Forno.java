import java.util.ArrayList;

public class Forno
{

    private int matCrudi;
    private int numMat = 400;
    private ArrayList<Mattone> matProdotti;
    private boolean inCottura;
    private ArrayList<String> lotti;

    public Forno(ArrayList<String> l)
    {
        lotti = l;
        inCottura = false;
    }

    public ArrayList<Mattone> getMatt()
    {
        return matProdotti;
    }
    
    //thread con 400 mattoni

    public synchronized String inforna(int mc) throws InterruptedException
    {
        matCrudi += mc;
        String msg = "Il forno ha infornato "+numMat+" mattoni";
        while(inCottura)
        {
            wait();
        }

        if(matCrudi == numMat)
        {
            System.out.println(msg);
            return msg+"\n"+cuoci();
        }else
        {
            return "il forno è occupato";
        }

    }
    public synchronized String cuoci()
    {
        inCottura = true;
        matCrudi-=numMat;
        String msg = "Il forno sta cuocendo "+numMat+" mattoni";
        System.out.println(msg);

        long id = (long) Math.random()*1000;
        for (int i = 0; i < numMat; i++)
        {
            id+=i;
            int lotto = lotti.size();
            Mattone m = new Mattone(id, 500, lotti.get(lotto));
            matProdotti.add(m);
        }
        inCottura = false;
        notifyAll();
        return msg;
    }
}
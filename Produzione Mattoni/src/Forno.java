public class Forno implements Runnable
{
    private int matCrudi;
    private int numMat = 400;
    private int matProdotti;
    private boolean inCottura;

    public Forno(int mc)
    {
        matCrudi = mc;
        inCottura = false;
    }
    
    //thread con 400 mattoni

    public void run()
    {
        if(inCottura == false)
        {
            matCrudi-=numMat;
            matProdotti += numMat;
        }

    }
}
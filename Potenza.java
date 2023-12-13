public class Potenza
{
    private int base;
    private int risultato;

    public Potenza(int inBase)
    {
        base = inBase;
    }

    public int getBase(){
        return base;
    }
    public void setBase(int y)
    {
        base = y;
    }
    
    public int getRisultato(){
        return risultato;
    }
    
    public void pow(){
        risultato = base * base;
    }
}

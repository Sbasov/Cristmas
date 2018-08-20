package Sweets;

public class Chokolate extends Sweets {

    private int  unicIdentifiChokolate; //поля класса


    //конструктор
    public Chokolate (String Name, int Wes, int Price, int unicIdentifiChokolate)
    {
        super(Name,Wes,Price);
        this.unicIdentifiChokolate=unicIdentifiChokolate;
    }

    public void setUnicIdentifiChokolate(int unicIdentifiChokolate)
    {
        this.unicIdentifiChokolate=unicIdentifiChokolate;
    }
    public int getUnicIdentifiChokolate()
    {
        return unicIdentifiChokolate;
    }
    @Override
    public String toString()
    {
        return "Шоколад [ " +super.toString()+"; Уникальный номер = "+unicIdentifiChokolate+" ] ";

    }

}
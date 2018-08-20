package Sweets;

/**
 * Created by User on 20.08.2018.
 */
public class Candy extends Sweets {

    private int  unicIdentifiCandy; //поля класса

    //конструктор
    public Candy (String Name, int Wes, int Price, int unicIdentifiCandy)
    {
        super(Name,Wes,Price);
        this.unicIdentifiCandy=unicIdentifiCandy;
    }

    public void setUnicIdentifiCandy(int unicIdentifiCandy)
    {
        this.unicIdentifiCandy=unicIdentifiCandy;
    }
    public int getUnicIdentifiCandy()
    {
        return unicIdentifiCandy;
    }
    @Override
    public String toString()
    {
        return "Кексы  [ " +super.toString()+"; Уникальный номер = "+unicIdentifiCandy+" ] ";

    }

}
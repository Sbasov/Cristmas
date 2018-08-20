package Sweets;

/**
 * Created by User on 20.08.2018.
 */
public class Cake extends Sweets {

    private int  unicIdentifiCake; //поля класса

    //конструктор
    public Cake (String Name, int Wes, int Price, int unicIdentifiCake)
    {
        super(Name,Wes,Price);
        this.unicIdentifiCake=unicIdentifiCake;
    }

    public void setUnicIdentifiCake(int unicIdentifiCake)
    {
        this.unicIdentifiCake=unicIdentifiCake;
    }
    public int getUnicIdentifiCake()
    {
        return unicIdentifiCake;
    }
@Override
public String toString()
{
    return "Кексы  [ " +super.toString()+"; Уникальный номер = "+unicIdentifiCake+" ] ";

}

        }


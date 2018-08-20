package Sweets;

/**
 * Created by User on 20.08.2018.
 */

public class Sweets {
 private String Name; //поля класса
 private  int Wes;    //Поля класса
 private int Price;   //Поля класса

 public Sweets( String Name, int Wes, int Price)
 {
 this.Name=Name;
 this.Wes=Wes;
 this.Price=Price;
 }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName(){
     return Name;
    }

    public void setWes(int Wes){
        this.Wes=Wes;
    }
    public int getWes(){
        return Wes;
    }
    public void setPrice(int Price){
        this.Price=Price;
    }
    public int getPrice(){
        return Price;
    }
@Override
    public String toString() {
    return "Наименование = " + Name + "; Вес = " + Wes + "; Цена = " + Price;
                            }
}
/**
 * Разработано 20.08.2018
 * Новогодний подарок
 * @author Basov Stepan
 * @version 1.6
 */

package CristmasGift;

import Sweets.Sweets;
import Sweets.Cake;
import Sweets.Candy;
import Sweets.Chokolate;

public class CristmasGift {
    public static void main(String[] args) {

        Cake cake = new Cake("Кекс",50,200,1);
        Candy candy=new Candy("Аленка",20,150,2);
        Chokolate chokolate=new Chokolate("Милка",25,400,3);
        Sweets[] box = {cake,candy,chokolate};
        for (Sweets somePar : box) {
            System.out.println(somePar.toString());
        }
        //сумма подарка
        int cena = cake.getPrice()+candy.getPrice()+chokolate.getPrice();
        System.out.println(" Цена подарка = " + cena);

        //Вес подарка
        int ves=cake.getWes()+candy.getWes()+chokolate.getWes();
        System.out.println(" Вес подарка = "+ves);
    }
}
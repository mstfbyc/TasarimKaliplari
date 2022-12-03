package org.example.creational.abstractfactory;

public class CellPhoneAgent {

    public static void main(String[] args) {
        Iphone11Factory iphone11Factory = new Iphone11Factory();
        Iphone12MaxFactory iphone12MaxFactory = new Iphone12MaxFactory();
        CellPhone cellPhone = iphone11Factory.getCellPhone("Iphone11","64MP",8,10);
        CellPhone cellPhone2 = iphone12MaxFactory.getCellPhone("Iphone12Max","128MP",8,12);
        System.out.println(cellPhone);
        System.out.println(cellPhone2);

    }
}

package org.example.creational.factory;

public class CellPhoneAgent {

    public static void main(String[] args) {
        CellPhone iphone11 = CellPhoneFactory.getCellPhone("Iphone11","64MP",8,10);
        CellPhone iphone12Max = CellPhoneFactory.getCellPhone("iphone12Max","128MP",8,12);
        System.out.println(iphone11);
        System.out.println(iphone12Max);

    }
}

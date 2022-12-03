package org.example.creational.factory;

public class CellPhoneFactory {
    public static CellPhone getCellPhone(String model, String camera, int weigth, int heigth){
        CellPhone cellPhone;
        if ("Iphone11".equalsIgnoreCase(model)){
            cellPhone = new Iphone11(model,camera,heigth,weigth);
        } else if ("Iphone12Max".equalsIgnoreCase(model)) {

            cellPhone = new Iphone12Max(model,camera,heigth,weigth);
        }else {
            throw new IllegalArgumentException("Bulmayan bir telefon modeli");
        }
        return cellPhone;
    }
}

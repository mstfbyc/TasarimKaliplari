package org.example.creational.abstractfactory;


public class Iphone11Factory implements CellPhoneFactory {
    @Override
    public CellPhone getCellPhone(String model, String camera, int weigth, int heigth) {
        return new Iphone11(model,camera,heigth,weigth);
    }
}

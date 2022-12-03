package org.example.creational.abstractfactory;

public class Iphone12MaxFactory implements CellPhoneFactory{
    @Override
    public CellPhone getCellPhone(String model, String camera, int weigth, int heigth) {
        return new Iphone12Max(model,camera,heigth,weigth);
    }
}

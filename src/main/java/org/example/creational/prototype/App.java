package org.example.creational.prototype;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        GeneralEntityService entityService = new GeneralEntityService();
        Long id = 1L;
        Date startDate = new Date();
        Document document1 = entityService.findDocumentById(id);
        printDocumentCreateCost(startDate,document1);

        Date startDate2 = new Date();
        Document cloneDocument = null;
        try {
            cloneDocument = document1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        printDocumentCreateCost(startDate2,cloneDocument);

        System.out.println(document1.getCategory());
        System.out.println(cloneDocument.getCategory());
        System.out.println("***********************************");
        document1.getCategory().setName("İŞ");
        System.out.println(document1.getCategory());
        System.out.println(cloneDocument.getCategory());
    }

    public static void printDocumentCreateCost(Date startDate, Document document){
        Date endDate = new Date();
        Long cost = getDateDif(startDate,endDate);
        System.out.println(document);
        System.out.println(cost);

    }

    private static Long getDateDif(Date startDate, Date endDate) {
        long sc = 1000;
        return (endDate.getTime()/sc)-(startDate.getTime()/sc);
    }
}

package org.example.creational.prototype;

public class GeneralEntityService {

    public DocumentType findDocumentTypeById(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DocumentType documentType = new DocumentType();
        String name;
        if(id.compareTo(1L)==0){
            name="kişisel";
        } else if (id.compareTo(2L)==0) {
            name="Kurumsal";

        }else {
            name="Genel";
        }
        documentType.setName(name);
        documentType.setId(id);
        return documentType;
    }
    public Category findCategory(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Category category = new Category();
        String name;
        if(id.compareTo(1L)==0){
            name="Özel";
        } else if (id.compareTo(2L)==0) {
            name="İş";

        }else {
            name="Genel";
        }
        category.setName(name);
        category.setId(id);
        return category;
    }

    public Document findDocumentById(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategory(id));

        String name;
        String value;
        if(id.compareTo(1L)==0){
            name="Mektup";
            value= "Sevgili Dsotum Mehmet";
        } else if (id.compareTo(2L)==0) {
            name="Rapor";
            value= "Bu rapor genel müdürlük için hazırlanmıştır.";

        }else {
            name="Trafik Kuralları";
            value= "Yayalara yol ver.";
        }
        document.setName(name);
        document.setValue(value);
        return document;

    }
}

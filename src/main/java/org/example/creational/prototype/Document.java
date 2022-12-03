package org.example.creational.prototype;

public class Document implements Cloneable {
    private Long id;
    private String name;
    private DocumentType documentType;
    private Category category;
    private String value;

    public Document() {
    }

    public Document(Long id, String name, DocumentType documentType, Category category, String value) {
        this.id = id;
        this.name = name;
        this.documentType = documentType;
        this.category = category;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    protected Document clone() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        document.setCategory(category.clone());
        document.setDocumentType(documentType.clone());
        return document;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", documentType=" + documentType +
                ", category=" + category +
                ", value='" + value + '\'' +
                '}';
    }
}

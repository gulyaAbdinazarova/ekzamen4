package productStore.product;

import java.time.LocalDate;

public abstract class Product {
    private int id;
    private String name;
    private String CompanyName;
    private LocalDate date;

    public Product(int id, String name, String companyName, LocalDate date) {
        this.id = id;
        this.name = name;
        CompanyName = companyName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", date=" + date +
                '}';
    }
}

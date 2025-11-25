package lesson_8.HomeWork_8;

import java.util.Objects;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String licanseNumber;

    public Customer(int idCustomer, String nameCustomer, String  licanseNumber) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.licanseNumber = licanseNumber;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String  getLicanseNumber() {
        return licanseNumber;
    }

    public void setLicanseNumber(String licanseNumber) {
        this.licanseNumber = licanseNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", licanseNumber=" + licanseNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return idCustomer == customer.idCustomer;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCustomer);
    }
}

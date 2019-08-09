package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="suppliers")
public class Supplier {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer supplierId;
    private Integer supplierNumber;
    private String name;
    private  String contactPhoneNumber;

    public Supplier() {
    }

    public Supplier(Integer supplierNumber, String name, String contactPhoneNumber) {
        this.supplierNumber = supplierNumber;
        this.name = name;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(Integer supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList.addAll(productList);
    }

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<Product> productList = new ArrayList<Product>();
}

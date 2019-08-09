package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "products")
public class Product {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private Long productNumber;
    private String name;
    private Double unitPrice;
    private Integer quantityInStock;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateSupplied;

    public Product() {
    }

    public Product(Long productId, Long productNumber, String name, Double unitPrice,
                   Integer quantityInStock, LocalDate dateSupplied) {
        this.productId = productId;
        this.productNumber = productNumber;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateSupplied = dateSupplied;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}

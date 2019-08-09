package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.service;

import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Product;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Supplier;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public Page<Product> getProductsList(int pageNo);
    public List<Supplier>  getSupplierList();

    public  Product saveProduct(Product product);
}

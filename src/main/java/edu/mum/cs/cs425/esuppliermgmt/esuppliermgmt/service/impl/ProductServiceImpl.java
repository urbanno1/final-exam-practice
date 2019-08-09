package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.service.impl;

import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Product;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Supplier;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.repository.ProductRepository;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.repository.SupplierRepository;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Autowired
    private SupplierRepository supplierRepository;


    @Override
    public Page<Product> getProductsList(int pageNo) {
        return repository.findAll(PageRequest.of(pageNo, 3, Sort.by("name")));
    }

    @Override
    public List<Supplier> getSupplierList() {
        return (List<Supplier>)supplierRepository.findAll(Sort.by("name"));
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
}

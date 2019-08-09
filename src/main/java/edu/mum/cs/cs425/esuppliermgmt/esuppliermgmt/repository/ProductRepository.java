package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.repository;

import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}

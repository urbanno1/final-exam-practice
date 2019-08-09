package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.repository;

import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Supplier;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Integer> {

        }

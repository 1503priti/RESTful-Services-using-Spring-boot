package co.priti.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import co.priti.entity.Customer;

@Repository
public interface CustomerRespository extends PagingAndSortingRepository<Customer, Integer> {

}

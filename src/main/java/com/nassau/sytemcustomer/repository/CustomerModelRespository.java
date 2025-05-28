package com.nassau.sytemcustomer.repository;

import com.nassau.sytemcustomer.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerModelRespository extends JpaRepository<CustomerModel, Long> {
}

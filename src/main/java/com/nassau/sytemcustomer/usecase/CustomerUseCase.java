package com.nassau.sytemcustomer.usecase;



import com.nassau.sytemcustomer.entrypoint.controller.dto.*;

import java.util.List;

public interface CustomerUseCase {
    CustomerResponseDto create(CreateCustomerRequestDto requestDto);
    CustomerResponseDto findById(Long id);
    List<CustomerResponseDto> findAll();
    CustomerResponseDto update(Long id, UpdateCustomerRequestDto requestDto);
    void delete(Long id);
}
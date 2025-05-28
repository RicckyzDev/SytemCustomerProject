package com.nassau.sytemcustomer.entrypoint.controller;


import com.nassau.sytemcustomer.entrypoint.controller.dto.*;
import com.nassau.sytemcustomer.usecase.CustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class customersController {

    private final CustomerUseCase customerUseCase;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> create(@RequestBody CreateCustomerRequestDto dto) {
        CustomerResponseDto response = customerUseCase.create(dto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponseDto> findById(@PathVariable Long id) {
        CustomerResponseDto response = customerUseCase.findById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponseDto>> findAll() {
        List<CustomerResponseDto> response = customerUseCase.findAll();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerResponseDto> update(
            @PathVariable Long id,
            @RequestBody UpdateCustomerRequestDto dto
    ) {
        CustomerResponseDto response = customerUseCase.update(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        customerUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
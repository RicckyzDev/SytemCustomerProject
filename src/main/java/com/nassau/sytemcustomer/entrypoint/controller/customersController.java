package com.nassau.sytemcustomer.entrypoint.controller;

import com.nassau.sytemcustomer.entrypoint.controller.dto.CreateCustomerRequestDto;
import com.nassau.sytemcustomer.entrypoint.controller.dto.UpdateCustomerRequestDto;
import com.nassau.sytemcustomer.entrypoint.controller.dto.CustomerResponseDto;
import com.nassau.sytemcustomer.usecase.CustomerUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomersController {

    private final CustomerUseCase customerUseCase;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> create(@RequestBody @Valid CreateCustomerRequestDto dto) {
        CustomerResponseDto response = customerUseCase.create(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
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
            @RequestBody @Valid UpdateCustomerRequestDto dto
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
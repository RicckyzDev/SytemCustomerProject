package com.nassau.sytemcustomer.usecase.impl;


import com.nassau.sytemcustomer.entrypoint.controller.dto.*;
import com.nassau.sytemcustomer.exception.NotFoundException;
import com.nassau.sytemcustomer.model.CustomerModel;
import com.nassau.sytemcustomer.repository.CustomerModelRespository;
import com.nassau.sytemcustomer.usecase.CustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerUseCaseImpl implements CustomerUseCase {

    @Autowired
    private CustomerModelRespository repository;

    @Override
    public CustomerResponseDto create(CreateCustomerRequestDto requestDto) {
        CustomerModel entity = CustomerModel.builder()
                .name(requestDto.getName())
                .email(requestDto.getEmail())
                .phone(requestDto.getPhone())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        CustomerModel saved = repository.save(entity);
        return mapToResponseDto(saved);
    }

    @Override
    public CustomerResponseDto findById(Long id) {
        CustomerModel entity = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente não encontrado com o id: " + id));
        return mapToResponseDto(entity);
    }

    @Override
    public List<CustomerResponseDto> findAll() {
        return repository.findAll().stream()
                .map(this::mapToResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerResponseDto update(Long id, UpdateCustomerRequestDto requestDto) {
        CustomerModel entity = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente não encontrado com o id: " + id));

        entity.setName(requestDto.getName());
        entity.setEmail(requestDto.getEmail());
        entity.setPhone(requestDto.getPhone());
        entity.setUpdatedAt(LocalDateTime.now());

        CustomerModel updated = repository.save(entity);
        return mapToResponseDto(updated);
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Cliente não encontrado com o id: " + id);
        }
        repository.deleteById(id);
    }

    private CustomerResponseDto mapToResponseDto(CustomerModel model) {
        return CustomerResponseDto.builder()
                .id(model.getId())
                .name(model.getName())
                .email(model.getEmail())
                .phone(model.getPhone())
                .createdAt(model.getCreatedAt())
                .updatedAt(model.getUpdatedAt())
                .build();
    }

}

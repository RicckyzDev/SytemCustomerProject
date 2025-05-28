package com.nassau.sytemcustomer.entrypoint.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateCustomerRequestDto {
    private String name;
    private String email;
    private String phone;
}
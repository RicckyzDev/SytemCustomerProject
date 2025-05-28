package com.nassau.sytemcustomer.entrypoint.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkOrderResponseDto {

    private Long id;

    private String title;

    private String description;

    private String status;

    private Long requesterId;

    private Long responsibleId;

    private Long categoryId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
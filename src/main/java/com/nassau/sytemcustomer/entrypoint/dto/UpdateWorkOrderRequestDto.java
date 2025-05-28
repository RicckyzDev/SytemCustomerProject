package com.nassau.sytemcustomer.entrypoint.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateWorkOrderRequestDto {

    @NotBlank(message = "O título é obrigatório")
    private String title;

    private String description;

    @NotNull(message = "O Id de requisição é obrigatório")
    private Long requesterId;

    private Long responsibleId;

    private Long categoryId;

    @NotBlank(message = "O status é obrigatório")
    private String status;
}

package com.hungpham.identityservice.dto.request;

import com.hungpham.identityservice.validator.DobConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PasswordCreationRequest {
    @NotBlank
    @Size(min = 8, message = "PASSWORD_INVALID")
    String password;
}

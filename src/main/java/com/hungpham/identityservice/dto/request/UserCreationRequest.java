package com.hungpham.identityservice.dto.request;

import com.hungpham.identityservice.validator.DobConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {

    // @Blank @NotNull ...
    @NotBlank
    @Size(min = 4, message = "USERNAME_INVALID")
    String username;

    @NotBlank
    @Size(min = 8, message = "PASSWORD_INVALID")
    String password;

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    LocalDate dob;
}

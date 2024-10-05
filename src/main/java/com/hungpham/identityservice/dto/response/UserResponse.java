package com.hungpham.identityservice.dto.response;

import com.hungpham.identityservice.entity.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String username;
    Boolean noPassword;
    String firstName;
    String lastName;
    LocalDate dob;
    Set<RoleResponse> roles;
}

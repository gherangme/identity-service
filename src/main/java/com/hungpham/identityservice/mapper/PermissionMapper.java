package com.hungpham.identityservice.mapper;

import com.hungpham.identityservice.dto.request.PermissionRequest;
import com.hungpham.identityservice.dto.request.UserCreationRequest;
import com.hungpham.identityservice.dto.request.UserUpdateRequest;
import com.hungpham.identityservice.dto.response.PermissionResponse;
import com.hungpham.identityservice.dto.response.UserResponse;
import com.hungpham.identityservice.entity.Permission;
import com.hungpham.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}

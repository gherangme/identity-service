package com.hungpham.identityservice.mapper;

import com.hungpham.identityservice.dto.request.RoleRequest;
import com.hungpham.identityservice.dto.response.RoleResponse;
import com.hungpham.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}

package com.hungpham.identityservice.mapper;

import com.hungpham.identityservice.dto.request.UserCreationRequest;
import com.hungpham.identityservice.dto.request.UserUpdateRequest;
import com.hungpham.identityservice.dto.response.UserResponse;
import com.hungpham.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    @Mapping(source = "firstName", target = "lastName")
//    @Mapping(target = "firstName", ignore = true)
    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

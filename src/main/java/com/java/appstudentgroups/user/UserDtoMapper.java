package com.java.appstudentgroups.user;

import com.java.appstudentgroups.common.service.GenericDtoMapper;
import com.java.appstudentgroups.user.dto.UserCreateDto;
import com.java.appstudentgroups.user.dto.UserResponseDto;
import com.java.appstudentgroups.user.dto.UserUpdateDto;
import com.java.appstudentgroups.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDtoMapper extends GenericDtoMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> {

    private final ModelMapper mapper;
    @Override
    public User toEntity(UserCreateDto userCreateDto) {
        User mapped = mapper.map(userCreateDto, User.class);
        System.out.println("mapped = " + mapped);
        return mapped;
    }

    @Override
    public UserResponseDto toResponseDto(User user) {
        UserResponseDto mapped = mapper.map(user, UserResponseDto.class);
        System.out.println("mapped = " + mapped);
        return mapped;
    }

    @Override
    public void update(UserUpdateDto userUpdateDto, User user) {
         mapper.map(userUpdateDto,user);
    }
}

package com.java.appstudentgroups.user;

import com.java.appstudentgroups.user.UserService;
import com.java.appstudentgroups.user.dto.UserCreateDto;
import com.java.appstudentgroups.user.dto.UserResponseDto;
import com.java.appstudentgroups.user.dto.UserSignInDto;
import com.java.appstudentgroups.user.dto.UserSignInResponseDto;
import com.java.appstudentgroups.user.entity.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final ModelMapper mapper;

    @PostMapping( "/login" )
    public ResponseEntity<UserSignInResponseDto> signIn(@RequestBody @Valid UserSignInDto signInDto )
    {
        UserSignInResponseDto userResponseDto = userService.signIn( signInDto );
        return ResponseEntity
                .ok( userResponseDto );
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody @Valid UserCreateDto userCreateDto )
    {
/*
        User saved = userService.save(userCreateDto);
        UserResponseDto mapped = mapper.map(saved, UserResponseDto.class);

*/
        UserResponseDto userResponseDto = userService.create(userCreateDto);
        System.out.println("userResponseDto = " + userResponseDto);
        return ResponseEntity
                .status( HttpStatus.CREATED )
                .body( userResponseDto );
    }

}

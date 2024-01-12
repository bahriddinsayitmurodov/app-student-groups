package com.java.appstudentgroups.user.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.java.appstudentgroups.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponseDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private LocalDate birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String extraMessage;

    private List<Role> roles;

}

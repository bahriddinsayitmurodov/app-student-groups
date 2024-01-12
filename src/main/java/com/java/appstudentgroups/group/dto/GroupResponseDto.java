package com.java.appstudentgroups.group.dto;

import com.java.appstudentgroups.user.entity.User;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupResponseDto {

    private Integer id;

    private String name;

    private List<User>users;
}

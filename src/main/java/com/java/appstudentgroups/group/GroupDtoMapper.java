package com.java.appstudentgroups.group;

import com.java.appstudentgroups.common.service.GenericDtoMapper;
import com.java.appstudentgroups.group.dto.GroupCreateDto;
import com.java.appstudentgroups.group.dto.GroupResponseDto;
import com.java.appstudentgroups.group.dto.GroupUpdateDto;
import com.java.appstudentgroups.group.entity.Group;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GroupDtoMapper extends GenericDtoMapper<Group, GroupCreateDto, GroupUpdateDto, GroupResponseDto> {

    private final ModelMapper mapper;
    @Override
    public Group toEntity(GroupCreateDto groupCreateDto) {
        return mapper.map(groupCreateDto, Group.class);
    }

    @Override
    public GroupResponseDto toResponseDto(Group group) {
        return mapper.map(group, GroupResponseDto.class);
    }

    @Override
    public void update(GroupUpdateDto groupUpdateDto, Group group) {
         mapper.map(groupUpdateDto,group);
    }
}

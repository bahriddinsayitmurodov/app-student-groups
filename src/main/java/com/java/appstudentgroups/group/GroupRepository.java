package com.java.appstudentgroups.group;

import com.java.appstudentgroups.common.repository.GenericSpecificationRepository;
import com.java.appstudentgroups.group.entity.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends GenericSpecificationRepository<Group,Integer> {

}

package com.java.appstudentgroups.user;

import com.java.appstudentgroups.common.repository.GenericSpecificationRepository;
import com.java.appstudentgroups.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends GenericSpecificationRepository<User,Integer> {
    Boolean existsByPhoneNumber(String phone);
    Optional<User> findUserByPhoneNumber(String phone);
}

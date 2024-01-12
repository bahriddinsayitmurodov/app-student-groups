package com.java.appstudentgroups.sms;


import com.java.appstudentgroups.sms.entity.SmsCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsCodeRepository extends CrudRepository<SmsCode, String>
{
}

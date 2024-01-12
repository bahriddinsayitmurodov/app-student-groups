package com.java.appstudentgroups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootApplication
public class AppStudentGroupsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppStudentGroupsApplication.class, args);
    }


    @Bean
    JedisConnectionFactory jedisConnectionFactory()
    {
        RedisStandaloneConfiguration localhost = new RedisStandaloneConfiguration( "localhost", 6379 );
        return new JedisConnectionFactory( localhost );
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate()
    {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory( jedisConnectionFactory() );
        return template;
    }

}

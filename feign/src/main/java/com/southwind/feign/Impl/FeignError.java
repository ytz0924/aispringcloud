package com.southwind.feign.Impl;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "您好！服务器正在维护中。。。。。。";
    }
}

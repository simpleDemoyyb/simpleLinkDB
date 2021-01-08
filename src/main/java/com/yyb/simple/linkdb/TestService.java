package com.yyb.simple.linkdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public String test() {
        return testDao.test();
    }
}

package com.youcai.wikitest.service;

import com.youcai.wikitest.domain.Test;
import com.youcai.wikitest.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanchongsheng
 * @since 2021-03-26
 */
@Service
public class TestService {

    // 此处可以用 @Resource （jdk 自带的）注解或者 @Autowired （spring 自带的）注解
    @Autowired
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}

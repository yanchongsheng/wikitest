package com.youcai.wikitest.mapper;

import com.youcai.wikitest.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yanchongsheng
 * @since 2021-03-26
 */
@Repository
public interface TestMapper {

    List<Test> list();
}

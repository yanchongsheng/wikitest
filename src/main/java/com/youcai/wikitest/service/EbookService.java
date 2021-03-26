package com.youcai.wikitest.service;

import com.youcai.wikitest.domain.Ebook;
import com.youcai.wikitest.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanchongsheng
 * @since 2021-03-26
 */
@Service
public class EbookService {

    /**
     * 此处可以用 @Resource （jdk 自带的）注解或者 @Autowired （spring 自带的）注解，
     * 值得注意的是，在使用 @Resource 的时候，mapper 上可以不加 @Repository 的注解，
     * 但是在使用 @Autowired 的时候，如果不加，则会报错提示
     */
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null); // 表示查询所有
    }
}

package com.youcai.wikitest.service;

import com.youcai.wikitest.domain.Ebook;
import com.youcai.wikitest.domain.EbookExample;
import com.youcai.wikitest.mapper.EbookMapper;
import com.youcai.wikitest.request.EbookRequest;
import com.youcai.wikitest.response.EbookResponse;
import com.youcai.wikitest.util.CopyUtil;
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

    public List<EbookResponse> list(EbookRequest request) {
        // 这两句是固定写法
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria(); // criteria 条件的意识

        criteria.andNameLike("%" + request.getName() + "%");

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        /*List<EbookResponse> ebookResponseList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResponse ebookResponse = new EbookResponse();
            BeanUtils.copyProperties(ebook, ebookResponse); // 这个是 spring 提供的一个属性拷贝的工具类
            ebookResponseList.add(ebookResponse);
        }*/

        // 利用制作的工具类完成——列表复制
        List<EbookResponse> ebookResponseList = CopyUtil.copyList(ebookList, EbookResponse.class);

        return ebookResponseList;
    }
}

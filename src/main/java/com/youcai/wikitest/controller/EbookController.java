package com.youcai.wikitest.controller;

import com.youcai.wikitest.domain.Ebook;
import com.youcai.wikitest.request.EbookRequest;
import com.youcai.wikitest.response.CommonResponse;
import com.youcai.wikitest.response.EbookResponse;
import com.youcai.wikitest.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResponse list(EbookRequest request) {
        List<EbookResponse> list = ebookService.list(request);

        CommonResponse<List<EbookResponse>> response = new CommonResponse<>();
        response.setContent(list);
        return response;
    }
}

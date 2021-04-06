package com.youcai.wikitest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yanchongsheng
 * @since 2021-03-29
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 映射的请求地址，表示针对所有的请求地址
                .allowedOriginPatterns("*") // 允许来源
                .allowedHeaders(CorsConfiguration.ALL)
                .allowedMethods(CorsConfiguration.ALL)
                /**
                 * 凭证，比如：允许前端带上它的凭证，如 cookie 信息，比如有些项目登陆的时候会针对 sessionId
                 * 进行校验，如果你不允许的话，多次请求送上来的 sessionId 是会变的，这样后端就无法校验它是否登陆过了
                 */
                .allowCredentials(true)
                /**
                 * 1 小时内不需要再预警（预警其实就是发一个 OPTIONS 请求）
                 *
                 * 前端在调用后端接口前，它自己会偷偷的发一个 OPTIONS 请求，这个请求不会去处理业务逻辑
                 * 它会去检查一下这个接口是否存在，是否正常，只有检查成功了，前端才会正式的发送涉及业务逻辑的请求
                 * 它的作用是一个预警功能
                 */
                .maxAge(3600);

    }
}

1、默认支持的配置文件
    
    spring 不止能识别 resources/application.properties 文件，还能识别 resources/config/application.properties 文件，还能识别 resources/application.yml 文件，同时也支持 resources/config/application.yml，即 spring 至少能自动识别 4 个文件
    
    SpringBoot 还能自动识别另外一组文件 bootstrap.properties 同理有 4 种形式。注意：当个 SpringBoot 不会读 bootstrap 配置，在 SpringCloud 架构下的 SpringBoot 应用才会读。
    
    bootstrap 这组配置文件一般是用于「动态配置」，线上可以实时修改，实时生效的配置，一般可配合上 nacos 使用
    
    优先级顺序：
    config/application.yml > config/application.properties > application.yml > application.properties
    
2、SpringBoot 既支持 properties 又支持 yml，它们之间的格式转换可以利用如下的网站完成：

    https://toyaml.com/index.html
   
3、自定义配置项

    @Value("${test.hello:Test}")
    优先读取配置项 test.hello 的值，如果配置项没有值，则使用默认值 Test

1、@Controller 注解用来返回页面，@RestController 用来返回字符串。

查看 @RestController 源码，会发现它是由 @Controller 和 @ResponseBody（用来返回字符串或 JSON 对象的） 组成的

2、http 请求有 8 种方式，常用的有 post、delete、put、get，分别对应增删改查，@RequestMapping 表示接受所有类型的请求方式

    写法举例：
        @GetMapping("/test") 等价于下面的写法
        @RequestMapping(value = "/test", method = RequestMethod.GET)

3、http 状态码 405 表示：表示当前访问的这个地址，不支持我们当前使用的这个请求方式即 method（get、post 等）

4、SpringBoot 包扫描机制：查看 @SpringBootApplication 注解的源码会发现，它上面有一个 @ComponentScan 的注解，它的作用是 spring 用来扫描包的，@ComponentScan 
它只会扫描这个类（即启动类）所在的包下面的子包以及代码。

可以手动在启动类上加 @ComponentScan 注解来修改需要扫描的包有哪些；例如：@ComponentScan("com.youcai.wikitest")，注意，里面的基包不要写的太通用了，如果「com」这样，会扫描到第三方 
jar，出错非常难排查。

5、对于非正常单词的警告信息，可以通过 alt + enter，选择 Save '...' to project-level dictionary 将这个单词保存到项目字典中，就不会有波浪线警告了
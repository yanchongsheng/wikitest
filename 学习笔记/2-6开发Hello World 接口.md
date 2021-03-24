1、@Controller 注解用来返回页面，@RestController 用来返回字符串

2、http 请求有 8 种方式，常用的有 post、delete、put、get，分别对应增删改查，@RequestMapping 表示接受所有类型的请求

    写法举例：
        @GetMapping("/test") 等价于下面的写法
        @RequestMapping(value = "/test", method = RequestMethod.GET)

3、http 状态码 405 表示：表示当前访问的这个地址，不支持我们当前使用的这个请求方式即 method（get、post 等）
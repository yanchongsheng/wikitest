1、idea 自带的接口测试插件 HTTP Client，在 Tools 下找到——HTTP Client，这个就是 idea 自带的工具，但实际上我们不填需要使用这个菜单，可以在项目下新建一个文件夹，专门用来放 http 
测试的脚本，里面新建的文件名的后缀必须是 .http。

2、在 *.http 文件中，输入 gtr 回车，gtr 的作用相当于 psvm 这种，是一种 Live Templates，可以在 settings 中搜 Live Templates，然后自定义自己的 Live Templates
 模板。一个 http 文件中是可以写多个测试脚本的。且所有的测试都是有记录的，记录在 .idea\httpRequests 目录下。
 
 gtr 对应 get 请求，不带参数
 gtrp 对应 get 请求，带参数
 ptrp 对应 post 请求，带参数
 
 3、HTTP Client 还有一个强大的功能就是：结果验证。详细见代码。
 
 4、idea 自动去除没有任何引用的包：settings——搜 auto import——勾选optimize imports on the fly (for current project)
 
 5、在提交代码的时候，右侧也有一些勾选，可以考虑使用，如：optimize imports，它的作用跟上面是一样的


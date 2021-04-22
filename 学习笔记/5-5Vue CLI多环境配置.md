1、在 web 根目录下，增加「.env.xxx」开头的文件，里面首先要配置「NODE_ENV」指定当前环境是什么，下面就可以添加自定义的参数了，自定义参数写法是：

    VUE_APP_XXX
    
2、在 package.json 中，配置多环境命令的时候，注意 --mode 后面的参数值，要跟文件 .env. 后面的内容对应起来。

3、使用 process.env.环境变量名 来读取环境变量

4、在 package.json 中，通过给启动命令后面增加 --port 8081 来修改端口号
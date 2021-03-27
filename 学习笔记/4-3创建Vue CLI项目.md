1、安装 Vue CLI
    
    修改 npm 为淘宝镜像
    
    npm get registry 显示当前的镜像网址
    
    npm config set registry http://registry.npm.taobao.org 使用淘宝的镜像网址
    
    vue --verison 查看安装的 vue cli 版本
    
    npm install -g @vue/cli@4.5.9 安装制定版本的 vue cli
    
2、创建 Web 应用
    
    vue create [web] 创建名为 web 的项目 —— 选择 Manually select features —— TypeScript+Router（页面路由）—— Vuex（用于保存全局变量）—— Linter / Formatter （代码校验用的）—— 选 3.x —— 

3、启动 Web 应用
    
    在 web 路径下，运行 npm run serve（注意这个是 serve 不是 server 少了一个字母 r）
    
    vue 的启动是有一个编译的过程的，就跟 Java 一样，是需要先编译然后再启动
    
    可以使用 idea 提供的 npm 窗口中的命令来启动 web 项目，操作方法如下：
    
    找到 web 项目下的 package.json 文件 —— 右击 —— 点击 show npm scripts —— 双击运行指定的命令即可
    
    注意：在 package.json 文件中，可以查看到当前 web 项目如何启动的命令
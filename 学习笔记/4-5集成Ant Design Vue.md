1、什么是 Ant Design Vue？

    Ant Design Vue 官网：https://2x.antdv.com/docs/vue/introduce-cn

2、集成 Ant Design Vue

    安装包的使用 @next 表示安装最新的未正式发布版本

    本次学习采用：初始导入全部组件库，而不是用到什么才导入什么
    
    注意：如果发现自己安装错版本了，最简单的办法就是 revert —— package.json 和 package-lock.json 这两个文件，然后重新安装

3、我们之前创建的 Vue CLI 项目，其实它就是一堆的组件，这一堆组件有些是看的到的即页面上能够展示出来的（如 views 目录下的就是看的到的），有些是看不到的（如 route、store、.eslintrc.js 等这是是看不到的）。有些组件是只有逻辑没有界面，有些组件是既有页面又有逻辑。

4、Vue CLI 它的 UI 界面怎么做呢？
    
    方法一：基于原生 html css js
    
    方法二：基于第三方 css 库，如 bootstrap
    
    方法三：基于 Vue 的 UI 组件，如 ElementUI
    
5、各种 Vue UI 组件的用法是相通的，学会一个就都会了

    组件使用套路为：先 install 它的库 —— 然后引入组件 —— 最后用哪个组件就把哪个组件的代码拷贝下来就可以了


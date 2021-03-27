1、懒加载，是前端重要的概念。因为以后 vue 项目是会打包的，如果不用懒加载，所有的代码它会全部一次性打包，别人要访问这个页面的时候，一次性会把所有的代码全部都下载下来；而懒加载则表示，这个组件就不打到整体的包里面了，而是当你访问这个页面的时候才去加载这个组件。如果页面很多，就可以使用懒加载，来减少初始的包的大小。

在路由配置文件中，如下的方式就是懒加载的写法：

    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
    
2、Vue CLI 的逻辑就是，初始执行 main.ts —— 将页面内容 App.vue 渲染到 index.html，完成页面显示

3、在 package.json 文件中，「^」表示，以后如果有新的小版本，就下载最新的小版本，注意，只是小版本，大版本不行

4、前端项目开发主要集中在 src 目录中，日常流程大概为：写个 views 页面 —— 写个 components 组件 —— 加个 route 路由 —— 加个 store 全局变量 —— 如果有静态资源在加到 assets 中

5、public 下静态资源 和 assets 下静态资源的区别？

    assets 中的静态资源，用相对路径的写法
    
    public 中的静态资源，必须用绝对路径的写法，因为这里面的文件不经过webpack处理


project
└───node_modules   // 存放整个项目依赖的 js 模块
└───src
│   │   App.vue    // 主页面，是 vue 初始的页面
│   │   main.ts    // 主入口，是 vue 初始的启动（配置）文件
|   |   shims-vue.d.ts // 是一个定义文件，不用管它
│   │
│   |____assets    // css、image、svg等静态资源
|   |
|   |____components    // 组件
|   |
|   |____route   // 路由
|   |   | index.ts       // 路由配置文件
|   |
|   |____store    // 全局存数据用的
|   |   | index.ts   // 全局存数据文件
|   |                                               
|   |____views     // 页面，这里的页面是跟 route 里面的配置是对应起来的
|        
|     
└───public          // 公用文件，不经过webpack处理
│   │   favicon.ico // 浏览器标签栏中的小图标，它其实是一个静态资源，以后页面要引用静态资源的话，可以参考这个小图标的写法（在index.html页面中找）
│   │   index.html  // 启动首页，注意这个文件里面有个<div id="app"></div>的标签
|   
└───.browserslistrc // 浏览器兼容文件，不需要管他
|   
└───.eslintrc.js    // eslint 配置
|   
└───.gitignore
|   
└───package.json    // npm配置，类似于 pom.xml 文件
|   
└───package-lock.json    // npm配置，用于锁定「小」版本号
|   
└───README.md       // 项目说明，这个文件只在根目录下有用，在子目录下是没有有用的
|    
└───tsconfig.json // 整个项目的配置文件，不需要管它

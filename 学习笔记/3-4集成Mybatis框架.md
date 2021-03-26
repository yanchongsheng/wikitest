1、所谓的持久层就是跟数据库打交道的那一层，同理还有业务层、表现层，常见的持久层框架有：

    mybatis 半自动 即 需要自己写 sql

    hibernate 全自动 即 不需要自己写 sql

2、集成 mybatis 操作步骤：

    （1）添加两个依赖

    （2）配置数据源（一旦添加了这两个依赖，则必须有数据源（数据源对不对无所谓），否则项目无法启动）


3、如果某次本地 commit 提交，提交错了，则在 version control —— log —— 选中要还原到的点 —— 右键选择 reset current branch to here —— 默认选项（Mixed） ——
reset 即可

4、包名为 domain、entity 或 POJO 的，表示的是实体类，就是和数据表一一映射的

5、持久层叫 mapper 层（或 repository 层），即广为人知的 dao 层，因为后续要用官方代码生成器，其生成的代码就是 XXXMapper

6、可以在 IDEA 上安装一个 Free Mybatis plugin 的插件，它是用来在 xml 文件中 sql 与 接口方法 之间进行快速跳转

7、如何让整个项目知道有持久层的存在？

    在启动类上添加注解@MapperScan("com.youcai.wikitest.mapper")，并指明 mapper 接口所在包的位置

8、如何让整个项目知道 xml 就是要执行的 sql 呢？

    需要在项目的 application.properties 的配置中，配置选项 mybatis.mapper-locations=classpath:/mapper/**/*.xml




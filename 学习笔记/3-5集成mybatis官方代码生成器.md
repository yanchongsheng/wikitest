1、集成 Mybatis Generator 步骤

    （1）添加插件
    （2）创建并配置 generator-config.xml
    （3）增加一个启动命令，类型是 maven；command line 输入：mybatis-generator:generate -e ；name 随意；然后 ok 即可
    （4）然后就可以运行了，会看到结果为 build success 表示成功，对应目录下生成了相应的文件
    
注意：generator-config.xml 中，windows 和 mac 或 linux 平台的斜杠是不同的，会导致提示报错，「The specified target project directory 
src\main\resources does not exist」

会发现生成的文件中包含了一个 DemoExample，XXXExample 是它生成的一个特有的类

强烈建议生成的 4 个文件不要动它
    
    

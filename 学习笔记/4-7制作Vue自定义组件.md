1、建议：独一无二的组件命名用 the-xxx；而且自定义组件尽量都加上一个 the-

2、Vue 同时支持驼峰式命名和使用「-」横线连接这种命名方式

    举例：the-header 文件中的 name 属性的值，既可以是 the-header 也可以是 theHeader，Vue 都能识别
    
3、关于自定义组件的引用，可以是注册组件名的几种变体

    举例：
        
        import TheHeader from '@/components/the-header.vue';
        
    这里组件名为 TheHeader，则在使用的时候可以是如下几种方式
    
        TheHeader、theHeader、The-Header、the-header等
        
        即没有「-」的时候，后面单词的首字母必须大写
        有「-」的时候，字母大不大写无所谓，因为 vue 既可以识别驼峰也可以识别「-」
        
4、注意，idea 在提交代码的时候，有个可勾选选项「Amend commit」,表示追加到上一次提交
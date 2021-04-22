<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
        mode="inline"
        v-model:selectedKeys="selectedKeys2"
        v-model:openKeys="openKeys"
        :style="{ height: '100%', borderRight: 0 }"
      >
        <a-sub-menu key="sub1">
          <template #title>
            <span>
              <user-outlined />
              subnav 1
            </span>
          </template>
          <a-menu-item key="1">option1</a-menu-item>
          <a-menu-item key="2">option2</a-menu-item>
          <a-menu-item key="3">option3</a-menu-item>
          <a-menu-item key="4">option4</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
            <span>
              <laptop-outlined />
              subnav 2
            </span>
          </template>
          <a-menu-item key="5">option5</a-menu-item>
          <a-menu-item key="6">option6</a-menu-item>
          <a-menu-item key="7">option7</a-menu-item>
          <a-menu-item key="8">option8</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub3">
          <template #title>
            <span>
              <notification-outlined />
              subnav 3
            </span>
          </template>
          <a-menu-item key="9">option9</a-menu-item>
          <a-menu-item key="10">option10</a-menu-item>
          <a-menu-item key="11">option11</a-menu-item>
          <a-menu-item key="12">option12</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content
      :style="{
        background: '#fff',
        padding: '24px',
        margin: 0,
        minHeight: '280px',
      }"
    >
      <!-- 列表 -->
      <a-list item-layout="vertical" size="large" :grid="{ gutter: 20, column: 3 }" :data-source="ebooks">
      <template #renderItem="{ item }">
      <a-list-item key="item.name">
        <template #actions>
          <span v-for="{ type, text } in actions" :key="type">
            <component v-bind:is="type" style="margin-right: 8px" />
            {{ text }}
          </span>
        </template>
        <a-list-item-meta :description="item.description">
          <template #title>
            <a :href="item.href">{{ item.name }}</a>
          </template>
          <template #avatar><a-avatar :src="item.cover" /></template>
        </a-list-item-meta>
      </a-list-item>
      </template>
      </a-list>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent, onMounted, reactive, ref, toRef } from "vue";
import axios from "axios";

export default defineComponent({
  name: "Home",
  // 通过 axios 调用后端接口
  setup() {
    // Vue3 新增的初始化方法，表示：这个组件加载完之后，初始会执行的一个方法
    console.log("setup");

    // 它是一个响应式数据，所谓的响应式数据就是说我在 js 里面动态修改这里面的值，它需要实时的反映到页面上去，对于这样的数据就需要处理为响应式数据。用 ref 就可以让它变为一个响应式数据。最后，注意在 setup 方法中，将 ref 类型的数据 return 出去。

    // 注意：html 代码要拿到响应式变量，需要在 setup 最后 return
    const ebooks = ref();

    // reactive 里面一般是放一个对象
    const ebooks1 = reactive({books: []});

    // 一般初始化的方法建议都写到生命周期函数里面，因为如果直接写到 setup 方法里面，有时候 setup 执行的时候界面还没有渲染好，这时候如果去操作页面元素就会报错
    onMounted(() => {
      console.log("onMounted");
      axios
        // 注意拼接的时候，不要多加或者少 / 的情况
        .get("/ebook/list")
        .then((response) => {
          const data = response.data;
          // 注意：ref 类型的变量赋值，不能直接赋值，而是要采用 .value 的形式
          ebooks.value = data.content;

          ebooks1.books = data.content;

          console.log(response);
        });
    });

    const pagination = {
      onChange: (page: number) => {
        console.log(page);
      },
      pageSize: 3,
    };

    const actions: Record<string, string>[] = [
      { type: 'StarOutlined', text: '156' },
      { type: 'LikeOutlined', text: '156' },
      { type: 'MessageOutlined', text: '2' },
    ];

    return {
      ebooks,
      ebooks2: toRef(ebooks1, "books"),
      pagination,
      actions
    };
  },
});
</script>

// scoped 表示这里的样式只在当前组件起作用
<style scoped>
  .ant-avatar {
    width: 50px;
    height: 50px;
    line-height: 50px;
    border-radius: 8%;
    margin: 5px 0;
  }
</style>

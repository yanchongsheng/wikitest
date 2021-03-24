1、git gui here——help——show ssh key——generate key——不同填直接点两次 ok——将生成的 ssh 加到 github 上

2、关联远程仓库

    git remote add origin https://github.com/yanchongsheng/wikitest.git # origin 是后面一长串仓库地址的别名
    git branch -M master # 创建远程分支名为 master，可以省略 
    git push -u origin master # 将本地仓库下的当前分支与远程 origin 代表的仓库下 master 分支关联，并同步代码
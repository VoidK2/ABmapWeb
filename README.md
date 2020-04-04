### 启动配置
- deploy文件夹中安装mysql
- 新建数据库abmapweb
- 导入abmapweb.sql
- 启动redis-server
- maven生命周期中先clean 再package成war包
- mvn tomcat7:run 使用maven的架包运行tomcat
- mvn tomcat&:shutdown 停止运行

###数据库描述
> 角色
- 系统管理员拥有所有访问权限
- 普通用户无任何访问权限
- 注册授权（仅作为安卓注册授权使用）（删除会导致安卓端注册失败）
- 运维人员 有日志访问和数据库监控权限
- 账号管理人员  有角色和用户访问权限

> 设计参考
![](https://upload-images.jianshu.io/upload_images/5336514-9afdb6918b86d639.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

> 使用阿里巴巴的druid做数据库监控
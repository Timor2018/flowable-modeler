# flowable-modeler 整合到springboot项目中

+ 1.下载flowable-modeler源码，把flowable-ui-modeler-app\src\main\resources\static下面的代码拷贝至我们自己的工程

+ 2. 添加modeler相关的依赖包

```java
<dependency>
    <groupId>org.flowable</groupId>
    <artifactId>flowable-ui-modeler-rest</artifactId>
    <version>${flowable.version}</version>
</dependency>
<dependency>
    <groupId>org.flowable</groupId>
    <artifactId>flowable-ui-modeler-conf</artifactId>
    <version>${flowable.version}</version>
</dependency>
<dependency>
    <groupId>org.flowable</groupId>
    <artifactId>flowable-ui-modeler-logic</artifactId>
    <version>${flowable.version}</version>
</dependency>

```
+ 3. 重写配置类，加入中文乱码解决conf

+ 4. 启动类导入重写的配置类，并加入排除SpringSecurity认证

+ 5. 实现免登陆（flowable获取用户是调用idm服务，这里前端修改获取用户信息接口自己实现接口）

+ 6. 添加流程时会用到用户id，这里重构SecurityUtils.getCurrentUserObject 获取用户信息

 
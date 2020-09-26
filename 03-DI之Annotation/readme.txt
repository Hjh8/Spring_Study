本模块学习内容：
    注解的实现步骤
        1. 加入依赖（加入spring-context依赖的时候自动加入了spring-aop依赖）
        2. 创建类，在类中加入注解
        3. 创建spring的配置文件
            声明组件扫描器的标签，指明注解在项目中的位置
            <context:component-scan base-package="componentDemo" />
            指定扫描多个包：
        4. 创建容器Application，使用对象

    学习的注解：
        @Component
            语法：@Component(value = "对象名")
            可以省略value，即 @Component("对象名")
            默认名称：@Component ， 默认就是首字母小写的类名

        @Repository
            表示创建dao对象（处于持久层类的上面）

        @Service
            创建service对象（处于业务层类的上面）

        @Controller
            创建控制器对象（处于控制器类的上面），相当于servlet

        以上三个注解是给项目的对象分层的。

        @Value("")
            给简单类型的属性赋值

        @AutoWrited(required = true)
            给引用类型的属性赋值，默认是byType自动注入
            若要使用byName，则需要在加多一个注解@Qualifier(name = "bean的id")
            【注意】该注解属于spring框架

        @Resource
            给引用类型的属性赋值，默认是byName自动注入。如果byName方式赋值失败则使用byType
            若指定使用byName方式，则@Resource(name = "bean的id")
            【注意】该注解属于jdk，spring只是支持该注解

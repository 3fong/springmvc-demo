Spring MVC demo
-------------------
spring mvc:是spring的一个项目,全称是spring-webmvc.本示例是一个java web项目,它基于java配置spring mvc + spring.
#### 核心配置配置包括:
- MyWebAppInitializer:注册DispatcherServlet,配置WebApplicationContext层级关系
- WebMvcConfig:启动spring mvc配置,通过实现WebMvcConfigurer接口进行资源拦截,视图解析,servlet配置,访问流程配置,异常处理等操作

#### DispatcherServlet一次请求的执行流程
-  查找并绑定WebApplicationContext.以便于控制器或者其他元素使用;默认绑定在DispatcherServlet.WEB_Application_CONTEXT_ATTRIBUTE中;
-  绑定区域解析器.以便于请求处理(视图渲染,数据准备等)时解析区域设置.配置可选;
- 绑定主题解析器.以便于元素选择主题.可选;
- 如果指定了多文件解析器,请求将被MultipartHttpServletRequest包装,以便由进程中的其他元素进一步处理;
- 搜索合适的处理器.执行处理器的调用链(preprocessors,postprocessors,controllers),以便于生成模型和渲染;如果时注解控制器,可以返回响应,而不返回视图;
- 如果返回模型,则进行视图渲染;没用返回(可能由于进行preprocessor,postprocessor拦截,或者安全原因),则不进行视图渲染.因为请求处理已经完成;
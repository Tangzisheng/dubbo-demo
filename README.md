###API配置方式

* 通过 @EnableDubbo 指定在com.sihai.dubbo.provider.service.annotation 下扫描所有标注有 @Service 的类
* 通过 @Configuration 将 DubboConfiguration 中所有的 @Bean 通过 Java Config 的方式组装出来并注入给 Dubbo 服务，也就是标注有 @Service 的类。这其中就包括了：
     - ProviderConfig：服务提供方配置
     - ApplicationConfig：应用配置
     - RegistryConfig：注册中心配置
     - ProtocolConfig：协议配置





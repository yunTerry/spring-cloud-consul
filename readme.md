## Spring cloud Consul

使用[Consul](https://www.consul.io/)做服务注册发现，类似Eureka

下载[Consul](https://www.consul.io/)，对其运行`consul agent -dev`，启动开发模式

在项目中添加依赖
```groove
compile('org.springframework.cloud:spring-cloud-starter-consul-discovery')
```
添加consul注册中心配置
```
spring.cloud.consul.host=localhost
spring.cloud.consul.port=8500
```

打开 http://localhost:8500 查看服务注册情况


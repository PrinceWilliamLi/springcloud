# springcloud 
* 本项目spring boot 2.3.* , spring cloud Hoxton.SR8
* 项目目前支持功能 
>  eureka服务治理，以及FeignClient服务通讯

>  jedisCluster集群 这里我本地设置了六个节点已做服务开发使用

>  持久化mybatisPlus 3.2.0 以及代码生成

>  rabbitmq消息队列，rabbitmq 3.7.18 , erland 20.3

>   嵌入了jsp页面，返回后端jsp,html页面  详见com.prince.consumer.jspController.JspController
## eureka
> 服务治理
## eureka-client
> eureka-client 的demo
## prince-consumer
> 消费服务，mq消费 以及调用其他服务demo
## prince-product
> 提供服务，mq生产者以及其他部分功能
## prince-entity
> 实体类，以及公共的config
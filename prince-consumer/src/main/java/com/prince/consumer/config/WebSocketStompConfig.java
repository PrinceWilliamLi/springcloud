package com.prince.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * websocket 配置类
 * @author 81439
 */
@Configuration
public class WebSocketStompConfig {

    /**
     * 这个bean的注册,用于扫描带有@ServerEndpoint的注解成为websocket  ,如果你使用外置的tomcat就不需要该配置文件
     */

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        System.out.println("WebSocketConfig被注入了");
        return new ServerEndpointExporter();
    }

}

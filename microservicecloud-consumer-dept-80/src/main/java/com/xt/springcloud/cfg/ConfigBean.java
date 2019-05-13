package com.xt.springcloud.cfg;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/* 配置类 */
@Configuration
public class ConfigBean {

    /**
     * RestTemplate提供了多种便捷访问远程 Http 服务的方法， 
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
     */
    @Bean
    @LoadBalanced  //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule iRule() {
//        return new RoundRobinRule(); // 轮询
//        return new RandomRule(); //达到的目的，用我们重新选择的随机算法替代默认的轮询。
        return new RetryRule(); // 服务正常时 轮询 不正常，几次尝试后不再访问错误服务
    }
}

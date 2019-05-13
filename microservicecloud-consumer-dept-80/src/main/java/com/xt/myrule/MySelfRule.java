package com.xt.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xt
 * @create 2019/5/10 15:48
 * @Desc
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule iRule() {
        //return new RandomRule();// Ribbon默认是轮询，我自定义为随机
//        return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机

        return new RandomRule_ZY();// 我自定义为每台机器5次
    }
}

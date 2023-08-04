package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * irule自定义负载均衡配置类，不能放在@ComponentScan所扫描的包下以及子包下（启动类@SpringBootAplication）
 * @auther zzyy
 * @create 2020-02-19 19:00
 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
}

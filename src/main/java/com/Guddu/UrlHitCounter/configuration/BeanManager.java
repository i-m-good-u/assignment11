package com.Guddu.UrlHitCounter.configuration;

import com.Guddu.UrlHitCounter.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanManager {
    @Bean
    public List<User> getInitializedList()
    {

        List<User> initList = new ArrayList<>();


        return initList;
    }
}

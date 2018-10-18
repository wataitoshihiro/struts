package org.superbiz.struts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

@SpringBootApplication
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean struts2FilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new org.apache.struts2.dispatcher.FilterDispatcher());
        Map<String, String> params = new HashMap<>();
        params.put("actionPackages", "com.lq");
        bean.setInitParameters(params);
        bean.setUrlPatterns(singletonList("/*"));
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean struts_cleanupFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new org.apache.struts2.dispatcher.ActionContextCleanUp());
        bean.setUrlPatterns(singletonList("/*"));
        bean.setOrder(2);
        return bean;
    }

    @Bean
    public  FilterRegistrationBean sitemeshFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new com.opensymphony.module.sitemesh.filter.PageFilter());
        bean.setUrlPatterns(singletonList("/*"));
        bean.setOrder(3);
        return bean;
    }


}
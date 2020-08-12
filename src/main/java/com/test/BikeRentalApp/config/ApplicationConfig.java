/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.config;

import com.test.BikeRentalApp.convertors.stringToEnumConvertor;
import com.test.BikeRentalApp.interceptors.LoggingInterceptor;
import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.format.FormatterRegistry;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ThemeResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.theme.CookieThemeResolver;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@Configuration
@ComponentScan(basePackages = "com.test.BikeRentalApp")
/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
public class ApplicationConfig extends WebMvcConfigurationSupport {

    /**
     *
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("css/**", "images/**")
                .addResourceLocations("classpath:/static/css/", "classpath:/static/images/");
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    protected void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new stringToEnumConvertor());
    }

    @Override
    protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(5000);
        configurer.setTaskExecutor(mvcTaskExecutor());
    }
    
    @Bean
    public AsyncTaskExecutor mvcTaskExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setThreadNamePrefix("bikerentalmanagementsystem-thread-");
        return threadPoolTaskExecutor;

    }
    
    @Bean
    public XmlViewResolver xmlViewResolver(){
        XmlViewResolver viewResolver = new XmlViewResolver();
        viewResolver.setLocation(new ClassPathResource("views.xml"));
        viewResolver.setOrder(1);
        return viewResolver;
    }
    
//    @Bean
//    public ResourceBundleViewResolver resourceBundleViewResolver(){
//        ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
//        viewResolver.setBasename("views");
//        return viewResolver;
//    }
    
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(new ThemeChangeInterceptor());//default query param: theme
        registry.addInterceptor(new LocaleChangeInterceptor());//default query param: locale
    }
    
    @Bean
    public ThemeResolver themeResolver(){
        CookieThemeResolver cookieThemeResolver = new CookieThemeResolver();
        cookieThemeResolver.setCookieName("theme");
        cookieThemeResolver.setDefaultThemeName("client-theme1");
        return cookieThemeResolver;
    }
    
    @Bean
    public LocaleResolver localeResolver(){
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setDefaultLocale(Locale.US);
        cookieLocaleResolver.setCookieName("locale");
        return cookieLocaleResolver;
    }
}

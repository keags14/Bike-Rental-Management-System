/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.config;

import com.test.BikeRentalApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    private static final String ADMIN = "ADMIN";
    private static final String SUPPLIER = "SUPPLIER";
    private static final String USER = "USER";
    
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**").antMatchers("/images/**");
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
      http.authorizeRequests()
              .antMatchers("/**", "/home").permitAll()
        .and()
            .formLogin().loginPage("/goToLogin").permitAll()
        .and()
              .exceptionHandling().accessDeniedPage("/error")
        .and()
              .logout().logoutUrl("/logout");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }
    
    @Bean
    public PasswordEncoder getPasswordEncoder() {
            return new BCryptPasswordEncoder();
    }
}

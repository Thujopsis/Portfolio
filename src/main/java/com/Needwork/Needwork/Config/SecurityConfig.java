package com.Needwork.Needwork.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity web)throws Exception{
        web.authorizeRequests()
                .antMatchers("/","/login-error","/css/**", "/images/**", "/js/**")
                .permitAll()
                .anyRequest()
                .authenticated();

        web.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/join")
                .failureUrl("/login-error")
                .permitAll();
    }
}

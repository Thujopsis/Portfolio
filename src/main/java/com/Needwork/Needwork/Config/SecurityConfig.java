package com.Needwork.Needwork.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity web)throws Exception{
        web.authorizeRequests()
                .antMatchers("/","/login-error","webjars/*","/static/css/**", "/images/**", "/static/js/**","/h2-console","/h2-console/login.do*")
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

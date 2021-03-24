package com.needwork.needwork.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
SpringSecurityの設定を記述するクラス
ログインしていない場合に遷移できる画面等をここで指定する
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity web)throws Exception{
        web.authorizeRequests()
                .antMatchers("/home","/login-error","webjars/*","/css/**", "/images/**", "/js/**","/h2-console","/h2-console/login.do*")
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

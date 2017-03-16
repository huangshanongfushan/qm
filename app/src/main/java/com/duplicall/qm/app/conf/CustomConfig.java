package com.duplicall.qm.app.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/2/17.
 */
@Configuration
public class CustomConfig {

    public class MvcConfig extends WebMvcConfigurerAdapter {

        /*  @Override
          public void addViewControllers(ViewControllerRegistry registry) {
              registry.addViewController("/home").setViewName("home");
              registry.addViewController("/").setViewName("home");
              registry.addViewController("/hello").setViewName("hello");
              registry.addViewController("/login").setViewName("login");
          }
  */
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/static").addResourceLocations("classpath:/static/");
        }
    }

    @EnableWebSecurity
    public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
           /* http
                    .authorizeRequests()
                    .antMatchers("/", "/home").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/")
                    .permitAll()
                    .and()
                    .logout()
                    .permitAll();*/


            http
                    .authorizeRequests()
                    //static resources configuration
                    .antMatchers("/static/**", "/webjars/**").permitAll()
                    //login page and registration end-point
                   /* .antMatchers("/").permitAll()
                    //all other requests
                    .anyRequest().authenticated()*/
                    .and()
                    // login form configuration
                    .formLogin()
                    .loginPage("/")
                    .failureUrl("/?error")
//                    .defaultSuccessUrl("/")
                    .permitAll()
                    .and()
                    //logout configuration
                    .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/login");
        }

        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .inMemoryAuthentication()
                    .withUser("user").password("password").roles("USER");
        }
    }
}

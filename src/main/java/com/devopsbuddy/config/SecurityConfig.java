package com.devopsbuddy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 19-Sep-16.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private Environment environment;

    private static final String[] PUBLIC_MATCHES = {

            "/webjars/**",
            "/css/**",
            "/js/**",
            "/images/**",
            "/",
            "/about/**",
            "/contact/**",
            "/error/**/*"
           /* "/console*//**"*/

    };

    @Override
    protected void configure(HttpSecurity security) throws Exception {

        /*List<String> activeProfiles= Arrays.asList(environment.getActiveProfiles());
        if(activeProfiles.contains("dev")){
            security.csrf().disable();
            security.headers().frameOptions().disable();


        }*/


        security
                .authorizeRequests()
                .antMatchers(PUBLIC_MATCHES).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").defaultSuccessUrl("/payload")
                .failureUrl("/login?error").permitAll()
                .and()
                .logout().permitAll();


    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder autho) throws Exception {

        autho
                .inMemoryAuthentication()
                .withUser("user").password("password")
                .roles("USER");

    }

}

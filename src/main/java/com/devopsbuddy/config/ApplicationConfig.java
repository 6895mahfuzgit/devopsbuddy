package com.devopsbuddy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by MahfuzCSE'11 on 22-Sep-16.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.presistence.repositories") /// for jpa support
@EntityScan(basePackages ="com.devopsbuddy.backend.presistence.domain.backend" )
@EnableTransactionManagement
public class ApplicationConfig {
}

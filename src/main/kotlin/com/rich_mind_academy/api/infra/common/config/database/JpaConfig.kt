package com.rich_mind_academy.api.infra.common.config.database

import com.zaxxer.hikari.HikariDataSource
import jakarta.persistence.EntityManagerFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaTransactionManager
import java.util.*
import javax.sql.DataSource

@Configuration
class JpaConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    fun dataSource(): DataSource {
        return HikariDataSource()
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.jpa")
    fun jpaProperties(): Properties {
        return Properties()
    }

    @Bean
    fun transactionManager(entityManagerFactory: EntityManagerFactory?): JpaTransactionManager {
        return JpaTransactionManager(entityManagerFactory!!)
    }
}
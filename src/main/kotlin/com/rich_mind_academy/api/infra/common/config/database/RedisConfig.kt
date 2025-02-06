import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.cache.RedisCacheConfiguration
import org.springframework.data.redis.cache.RedisCacheManager
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializationContext
import java.time.Duration

@Configuration
@EnableCaching
class RedisCacheConfig {

    @Bean
    fun stringRedisTemplate(redisConnectionFactory: RedisConnectionFactory?): StringRedisTemplate {
        return StringRedisTemplate(redisConnectionFactory!!)
    }

    @Bean
    fun cacheManager(connectionFactory: RedisConnectionFactory): RedisCacheManager {
        val serializer = Jackson2JsonRedisSerializer(Object::class.java)

        val config = RedisCacheConfiguration.defaultCacheConfig().apply {
            entryTtl(Duration.ofMinutes(10))
            disableCachingNullValues()
            serializeValuesWith(
                RedisSerializationContext.SerializationPair.fromSerializer(serializer)
            )
        }

        return RedisCacheManager.builder(connectionFactory)
            .cacheDefaults(config)
            .build()
    }
}

package esperer.userservicekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
@ConfigurationPropertiesScan
class UserservicekotlinApplication

fun main(args: Array<String>) {
    runApplication<UserservicekotlinApplication>(*args)
}

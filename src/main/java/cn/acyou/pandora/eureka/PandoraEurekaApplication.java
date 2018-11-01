package cn.acyou.pandora.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PandoraEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandoraEurekaApplication.class, args);
    }
}

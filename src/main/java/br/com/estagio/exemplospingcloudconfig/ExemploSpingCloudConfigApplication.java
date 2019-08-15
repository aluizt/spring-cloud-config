package br.com.estagio.exemplospingcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ExemploSpingCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemploSpingCloudConfigApplication.class, args);
    }

}

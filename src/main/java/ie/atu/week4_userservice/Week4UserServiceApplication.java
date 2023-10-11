package ie.atu.week4_userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week4UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week4UserServiceApplication.class, args);
    }

}

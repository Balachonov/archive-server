package balachonov.archiveserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ArchiveServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchiveServerApplication.class, args);
    }
}
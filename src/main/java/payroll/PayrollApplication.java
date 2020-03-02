package payroll;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //so spring boot helps out when possible
//meta-annotation to pull component scanning, autoconfig, property support
//(servlet container, serve service)

public class PayrollApplication {
    public static void main(String... args){
        SpringApplication.run(PayrollApplication.class, args);
    }
}

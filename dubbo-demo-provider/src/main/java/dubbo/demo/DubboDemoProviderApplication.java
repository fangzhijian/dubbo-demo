package dubbo.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "dubbo.demo")
public class DubboDemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboDemoProviderApplication.class, args);
	}
}

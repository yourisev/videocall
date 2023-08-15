package com.marcel.test.videocall;

import com.marcel.test.videocall.user.User;
import com.marcel.test.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {SpringApplication.run(VideocallApplication.class, args);}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service){
		return	args ->{
			service.register(User.builder()
						.username("Marcel")
						.email("marcel@amtekMail.com")
						.password("147563AQWdcv")
					.build());

			service.register(User.builder()
					.username("Jo")
					.email("jo@amtekMail.com")
					.password("147563AQWdcv")
					.build());

			service.register(User.builder()
					.username("Mal")
					.email("Mal@amtekMail.com")
					.password("147563AQWdcv")
					.build());
		};
	}

}

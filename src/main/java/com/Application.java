package com;

import java.util.Arrays;
import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Application {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String countries[] = Locale.getISOCountries();
			for (String country : countries) {
				Locale obj = new Locale("", country);

				// System.out.println(obj.getDisplayCountry().replaceAll(" ",
				// "_").replaceAll(",", "").replaceAll("'", "")
				// .replaceAll("-", "") + "(\"" + obj.getCountry() + "\", \"" +
				// obj.getDisplayCountry() + "\"), ");
				
				System.out.println(
						obj.getCountry() + "(\"" + obj.getDisplayCountry()+ "\"),");
			}

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				// System.out.println(beanName);
			}

		};
	}

}
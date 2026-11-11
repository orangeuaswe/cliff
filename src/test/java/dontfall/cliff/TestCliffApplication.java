package dontfall.cliff;

import org.springframework.boot.SpringApplication;

public class TestCliffApplication {

	public static void main(String[] args) {
		SpringApplication.from(CliffApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

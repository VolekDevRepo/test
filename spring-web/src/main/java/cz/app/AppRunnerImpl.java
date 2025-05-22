package cz.app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class AppRunnerImpl implements ApplicationRunner {


	public AppRunnerImpl() {
	}

	public void run(ApplicationArguments args) {
		System.out.println("AppRunnerImpl.run()");
	}

}
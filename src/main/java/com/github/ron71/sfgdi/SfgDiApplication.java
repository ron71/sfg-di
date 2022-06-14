package com.github.ron71.sfgdi;

import com.github.ron71.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		I18nGreetingController i18nGreetingController = (I18nGreetingController) applicationContext.getBean("i18nGreetingController");

		System.out.println(i18nGreetingController.getGreetings());


		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println("______Primary Bean Injected Dependency");
		System.out.println(myController.getGreetings());

		System.out.println("______Property Injected Dependency");
		System.out.println(((PropertyInjectedController)applicationContext.getBean("propertyInjectedController")).getGreetings());


		System.out.println("______Setter Injected Dependency");
		System.out.println(((SetterInjectedController)applicationContext.getBean("setterInjectedController")).getGreetings());

		System.out.println("______Constructor Injected Dependency");
		System.out.println(((ConstructorInjectedController)applicationContext.getBean("constructorInjectedController")).getGreetings());
	}

}

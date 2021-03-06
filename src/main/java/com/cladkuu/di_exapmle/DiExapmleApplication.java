package com.cladkuu.di_exapmle;

import com.cladkuu.di_exapmle.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pets.CatPetService;
import pets.DogPetService;

@ComponentScan(basePackages = {"com.cladkuu.di_exapmle", "pets"})
@SpringBootApplication
public class DiExapmleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiExapmleApplication.class, args);

        System.out.println("--- Primary ---");
        Controller controller = (Controller) ctx.getBean("controller");
        System.out.println(controller.Hey());


        System.out.println("--- I18N ---");
        I18N i18N = (I18N) ctx.getBean("i18N");
        System.out.println(i18N.SayHello());


        System.out.println("--- Property ---");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.say());

        System.out.println("--- Setter ---");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.say());


        System.out.println("--- Constructor ---");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.say());


        System.out.println("--- Component Scan ---");
        DogPetService dogPetService = (DogPetService) ctx.getBean("dogPetService");
        System.out.println(dogPetService.getPetType());
    }

}

package com.cladkuu.di_exapmle;

import com.cladkuu.di_exapmle.Controllers.*;
import com.cladkuu.di_exapmle.Service.PropertyGreetingServiceImpl;
import com.cladkuu.di_exapmle.Service.PrototypeBean;
import com.cladkuu.di_exapmle.Service.SingletoneBean;
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

        System.out.println("--- SSSS ---");
        PropertyGreetingServiceImpl propertyGreetingService = (PropertyGreetingServiceImpl) ctx.getBean("SSSS");
        System.out.println(propertyGreetingService.SayHello());

        System.out.println("--- Setter ---");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.say());


        System.out.println("--- Constructor ---");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.say());


        System.out.println("--- Component Scan ---");
        DogPetService dogPetService = (DogPetService) ctx.getBean("dogPetService");
        System.out.println(dogPetService.getPetType());


        System.out.println("---- Bean Scopes ---------");
        SingletoneBean singletonBean1 = ctx.getBean(SingletoneBean.class);
        System.out.println(singletonBean1.getScope());
        SingletoneBean singletonBean2 = ctx.getBean(SingletoneBean.class);
        System.out.println(singletonBean2.getScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getScope());


    }

}

package to;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import to.service.Service1;

public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Service1 service1 = context.getBean(Service1.class);
        service1.a1();

        context.close();
    }


}

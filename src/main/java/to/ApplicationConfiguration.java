package to;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import to.qualifier.Bean1;
import to.qualifier.Bean2;
import to.service.A;
import to.service.B;
import to.service.impl.AImpl1;
import to.service.impl.AImpl2;
import to.service.impl.BImpl1;
import to.service.impl.BImpl2;

@Configuration
@ComponentScan("to.service")
public class ApplicationConfiguration {

    @Bean
    @Bean1
    public A getA1() {
        return new AImpl1();
    }

    @Bean
    @Bean2
    public A getA2() {
        return new AImpl2();
    }

    @Bean
    @Bean1
    public B getB1() {
        return new BImpl1();
    }

    @Bean
    @Bean2
    public B getB2() {
        return new BImpl2();
    }

}

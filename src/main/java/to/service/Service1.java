package to.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import to.qualifier.Bean1;
import to.qualifier.Bean2;

@Service
public class Service1 {

    @Autowired
    @Bean1
    private A a1;
    @Autowired
    @Bean1
    private B b1;

    @Autowired
    @Bean2
    private A a2;
    @Autowired
    @Bean2
    private B b2;

    public void a1() {
        a1.a();
    }

    public void a2() {
        a2.a();
    }


    public void b1() {
        b1.b();
    }

    public void b2() {
        b2.b();
    }
}

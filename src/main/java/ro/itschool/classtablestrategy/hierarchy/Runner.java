package ro.itschool.classtablestrategy.hierarchy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;


    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer();
        customer.setName("abc");
        customer.setPhone("9999");
        customer.setEmail("eeee");
        customer.setPassword("pass");
        customer.setUsername("ser");\

        userRepo.save(customer);
    }
}

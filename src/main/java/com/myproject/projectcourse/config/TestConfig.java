package com.myproject.projectcourse.config;

import com.myproject.projectcourse.entities.User;
import com.myproject.projectcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Rodrigo Lima Gay", "rodrigoGay@gmail.com", "(11) 9823-5739", "1234234");
        User u2 = new User(null, "Augusto Marangoni Gay Também", "augustinhoGay@gmail.com", "(11) 9567-4577)", "5341232");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

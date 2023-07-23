package net.youssfi.springpostgresdocker;

import net.youssfi.springpostgresdocker.entities.Event;
import net.youssfi.springpostgresdocker.repositories.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPostgresDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostgresDockerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EventRepository eventRepository){
        return args -> {
            if(eventRepository.count()==0){
                eventRepository.save(new Event(null,"Math"));
                eventRepository.save(new Event(null,"Info"));
                eventRepository.save(new Event(null,"Lab"));
            }
        };
    }
}

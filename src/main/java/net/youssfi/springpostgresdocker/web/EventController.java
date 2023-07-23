package net.youssfi.springpostgresdocker.web;

import net.youssfi.springpostgresdocker.entities.Event;
import net.youssfi.springpostgresdocker.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventRepository eventRepository;
    @GetMapping("/events")
    public List<Event> eventList(){
        return eventRepository.findAll();
    }
}

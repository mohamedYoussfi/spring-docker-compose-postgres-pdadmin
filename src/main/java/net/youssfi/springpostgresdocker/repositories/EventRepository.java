package net.youssfi.springpostgresdocker.repositories;

import net.youssfi.springpostgresdocker.entities.Event;
import org.springframework.data.repository.ListCrudRepository;

public interface EventRepository extends ListCrudRepository<Event,Long> {
}

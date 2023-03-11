package ru.team2.lookingforhouse.service;

import org.springframework.data.repository.CrudRepository;
import ru.team2.lookingforhouse.model.Dog;


public interface DogRepository extends CrudRepository<Dog,Long> {
}

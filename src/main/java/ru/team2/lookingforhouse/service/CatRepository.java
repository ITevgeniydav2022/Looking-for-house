package ru.team2.lookingforhouse.service;

import org.springframework.data.repository.CrudRepository;
import ru.team2.lookingforhouse.model.Cat;


public interface CatRepository extends CrudRepository<Cat,Long> {
}

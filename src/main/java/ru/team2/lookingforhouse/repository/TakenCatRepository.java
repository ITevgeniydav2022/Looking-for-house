package ru.team2.lookingforhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.team2.lookingforhouse.model.AdopterCat;

public interface TakenCatRepository extends JpaRepository<AdopterCat,Long> {
}

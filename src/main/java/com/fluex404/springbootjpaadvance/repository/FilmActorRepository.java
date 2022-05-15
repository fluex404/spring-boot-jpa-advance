package com.fluex404.springbootjpaadvance.repository;

import com.fluex404.springbootjpaadvance.entity.FilmActor;
import com.fluex404.springbootjpaadvance.entity.FilmActorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorId>, JpaSpecificationExecutor<FilmActor> {
}
package com.fluex404.springbootjpaadvance.repository;

import com.fluex404.springbootjpaadvance.entity.FilmCategory;
import com.fluex404.springbootjpaadvance.entity.FilmCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryId>, JpaSpecificationExecutor<FilmCategory> {
}
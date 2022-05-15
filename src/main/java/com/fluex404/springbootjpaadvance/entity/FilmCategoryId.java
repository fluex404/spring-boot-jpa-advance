package com.fluex404.springbootjpaadvance.entity;

import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
public class FilmCategoryId implements Serializable {
    private static final long serialVersionUID = -4161332004787248098L;
    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

}
package com.booksale.booksale.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "book")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book implements Serializable {

    @Id
    @SequenceGenerator(name = "book_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
    Integer id;

    @Column(name = "name")
    String name;

}

package com.chapter1extendJPA.item;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{
    String director;
    String actor;
}

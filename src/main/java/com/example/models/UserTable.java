package com.example.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedEntity
@Introspected
public class UserTable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}

package com.example.models;

import io.micronaut.serde.annotation.SerdeImport;
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
@SerdeImport(UserTable.class)
public class UserTable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}

package com.example.repository;
import com.example.models.UserTable;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;


@JdbcRepository(dialect = Dialect.MYSQL)
public interface UserDAO extends PageableRepository<UserTable, Long> {
}

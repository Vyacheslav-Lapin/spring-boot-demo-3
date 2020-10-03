package ru.vlapin.springbootdemo3.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.springbootdemo3.model.Cat;

public interface CatDao extends JpaRepository<Cat, UUID> {
}

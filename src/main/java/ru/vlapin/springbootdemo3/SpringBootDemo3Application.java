package ru.vlapin.springbootdemo3;

import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.vlapin.springbootdemo3.dao.CatDao;
import ru.vlapin.springbootdemo3.model.Cat;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootDemo3Application {

  CatDao catDao;

  public static void main(String[] args) {
    SpringApplication.run(
        SpringBootDemo3Application.class, args);
  }

  @Bean
  InitializingBean initializingBean() {
    return () -> Arrays.stream("Мурка, Барсик, Матроскин, Васька, Петькин".split(", "))
        .map(Cat::new)
        .forEach(catDao::save);
  }
}

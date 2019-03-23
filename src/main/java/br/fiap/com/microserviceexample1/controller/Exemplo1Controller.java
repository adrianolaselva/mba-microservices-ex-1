package br.fiap.com.microserviceexample1.controller;


import br.fiap.com.microserviceexample1.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Exemplo1Controller {

    @GetMapping("/exemplo-1/{firstName}/{secondName}")
    public ResponseEntity getHello(@PathVariable("firstName") String firstName,
                                   @PathVariable("lastName") String lastName){

        System.out.printf("Hello %s %s", firstName, lastName);
        log.info("Hello {} {}", firstName, lastName);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/exemplo-1")
    public ResponseEntity<Person> getHelloPerson(Person person){

        log.info("Hello {} {}", person.getFirstName(), person.getLastName());

        return new ResponseEntity<>(person, HttpStatus.OK);
    }

}

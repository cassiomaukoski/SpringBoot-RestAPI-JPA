package br.com.maukoski.cassio.springbootrestapijpa.controller;

import br.com.maukoski.cassio.springbootrestapijpa.model.Person;
import br.com.maukoski.cassio.springbootrestapijpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable int id){
        return ResponseEntity.ok(personService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        personService.delete(id);
    }

}



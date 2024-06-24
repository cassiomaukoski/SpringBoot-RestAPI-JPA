package br.com.maukoski.cassio.springbootrestapijpa.service;

import br.com.maukoski.cassio.springbootrestapijpa.model.Person;
import br.com.maukoski.cassio.springbootrestapijpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person findById(int id) {
        Optional<Person> person = personRepository.findById(id);
        return person.orElse(null);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void delete(int id) {
        personRepository.deleteById(id);
    }
}








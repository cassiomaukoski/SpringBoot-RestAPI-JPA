package br.com.maukoski.cassio.springbootrestapijpa.repository;

import br.com.maukoski.cassio.springbootrestapijpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

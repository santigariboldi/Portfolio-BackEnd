package com.santiagogariboldi.sng.repository;

import com.santiagogariboldi.sng.entity.Person;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author santi
 */

@Repository
public interface IPersonRepository extends JpaRepository<Person,Integer>{
    public Optional<Person> findByName(String name);
    public boolean existsByName(String name);
    
}

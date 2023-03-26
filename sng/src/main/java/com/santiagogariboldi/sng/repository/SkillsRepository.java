
package com.santiagogariboldi.sng.repository;

import com.santiagogariboldi.sng.entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepository extends JpaRepository<Skills, Integer>{
  
    Optional<Skills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}

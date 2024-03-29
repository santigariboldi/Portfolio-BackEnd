
package com.santiagogariboldi.sng.service;

import com.santiagogariboldi.sng.entity.Skills;
import com.santiagogariboldi.sng.repository.SkillsRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepository;
    
    public List<Skills> list(){
        return skillsRepository.findAll();
    }
    
    public Optional<Skills> getOne(int id){
        return skillsRepository.findById(id);
    } 
    
    public Optional<Skills> getByNombre(String nombre){
        return skillsRepository.findByNombre(nombre);
    }
    
    public void save(Skills skills){
        skillsRepository.save(skills);
    }
    
    public void delete(int id){
        skillsRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return skillsRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return skillsRepository.existsByNombre(nombre);
    }
}

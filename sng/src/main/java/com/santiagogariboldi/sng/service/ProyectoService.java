
package com.santiagogariboldi.sng.service;

import com.santiagogariboldi.sng.entity.Proyecto;
import com.santiagogariboldi.sng.repository.ProyectoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    ProyectoRepository proyectoRepository;
    
    public List<Proyecto> list() {
        return proyectoRepository.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return proyectoRepository.findById(id);
    }

    public Optional<Proyecto> getByNombre(String nombre) {
        return proyectoRepository.findByNombre(nombre);
    }

    public void save(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    public void delete(int id) {
        proyectoRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return proyectoRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return proyectoRepository.existsByNombre(nombre);
    }
}

package com.santiagogariboldi.sng.controller;

import com.santiagogariboldi.sng.Security.Controller.Mensaje;
import com.santiagogariboldi.sng.dto.dtoPerson;
import com.santiagogariboldi.sng.entity.Person;
import com.santiagogariboldi.sng.service.ImpPersonService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "https://frontend-sng.web.app")
public class PersonController {

    @Autowired
    ImpPersonService personService;

    @GetMapping("/lista")
    public ResponseEntity<List<Person>> list() {
        List<Person> list = personService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Person> getById(@PathVariable("id") int id) {
        if (!personService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Person person = personService.getOne(id).get();
        return new ResponseEntity(person, HttpStatus.OK);
    }

    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!personService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        personService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }*/

    /*@PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPerson dtoperson) {
        if (StringUtils.isBlank(dtoperson.getNombreE())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (personService.existsByNombreE(dtoperson.getNombreE())) {
            return new ResponseEntity(new Mensaje("Esa person ya existe"), HttpStatus.BAD_REQUEST);
        }

        Person person = new Person(dtoperson.getNombreE(), dtoperson.getDescripcionE());
        personService.save(person);

        return new ResponseEntity(new Mensaje("La person ha sido agregada correctamente"), HttpStatus.OK);
    }*/

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPerson dtoperson) {
        if (!personService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }

        if (personService.existsByNombre(dtoperson.getName()) && personService.getByNombre(dtoperson.getName()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa person ya existe"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(dtoperson.getName())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Person person = personService.getOne(id).get();
        person.setName(dtoperson.getName());
        person.setLinkedin_url(dtoperson.getLinkedin_url());
        person.setInstagram_url(dtoperson.getInstagram_url());
        person.setGithub_url(dtoperson.getGithub_url());
        person.setWhatsapp_url(dtoperson.getWhatsapp_url());
        person.setBanner_url(dtoperson.getBanner_url());
        person.setProfile_image_url(dtoperson.getProfile_image_url());
        person.setOcupation(dtoperson.getOcupation());
        person.setDescription(dtoperson.getDescription());

        personService.save(person);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
    }
}

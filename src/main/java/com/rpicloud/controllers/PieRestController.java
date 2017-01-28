package com.rpicloud.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rpicloud.dao.ADao;
import com.rpicloud.dao.PieDao;
import com.rpicloud.models.A;
import com.rpicloud.models.Pie;
import com.rpicloud.repositories.ARepository;
import com.rpicloud.repositories.PieRepository;

/**
 * Created by kaspernissen on 11/02/2016.
 */
@RestController
@RequestMapping("/pies")
public class PieRestController {

        @Autowired
        private PieRepository repository;
        
        @Autowired
        private ARepository repo;

        @RequestMapping(method = RequestMethod.GET)
        public ResponseEntity<Collection<Pie>> getAllPies(){
            return new ResponseEntity<>((Collection<Pie>) repository.findAll(), HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod.GET, value = "/{id}")
        public ResponseEntity<Pie> getPieWithId(@PathVariable Long id) {
            return new ResponseEntity<>(repository.findOne(id),HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod.GET, params = {"name"})
        public ResponseEntity<Collection<Pie>> findPieWithName(@RequestParam(value="name") String name) {
            return new ResponseEntity<>(repository.findByName(name), HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod .POST)
        public ResponseEntity<?> addPie(@RequestBody PieDao pieDao) {
        	
        	Pie objPie=new Pie(pieDao.getId(),pieDao.getName(),pieDao.getDescription(),pieDao.getObjA());        	
        	repository.save(objPie);        	
        	System.out.println("Value Of Pie "+objPie);
            return new ResponseEntity<>(objPie, HttpStatus.CREATED);
        }
}

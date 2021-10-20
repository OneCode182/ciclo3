/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cctv.c3r3.controller;

import co.cctv.c3r3.entity.Machine;
import co.cctv.c3r3.service.MachineService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cktv
 */
@RestController
@RequestMapping("/api/Machine")
public class MachineController {
    @Autowired
    private MachineService machineService;
    
    @GetMapping("/all")
    public List<Machine> getMachines(){
        return machineService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Machine> getMachine(@PathVariable("id") int machineId){
        return machineService.getMachine(machineId);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine machine){
        return machineService.save(machine);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine update(@RequestBody Machine machine){
        return machineService.update(machine);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int carId){
        return machineService.deleteMachine(carId);
    }
}

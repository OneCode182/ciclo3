/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cctv.c3r3.repository;

import co.cctv.c3r3.entity.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cktv
 */
@Repository
public class MachineRepository {
    @Autowired
    private MachineCrudRepository machineCrudRepository;
    
    //Get ALl
    public List<Machine> getAll(){
        return (List<Machine>) machineCrudRepository.findAll();
    }
    
    //Get por Id
    public Optional <Machine> getMachine(int id){
        return machineCrudRepository.findById(id);
    }
    
    //SAVE
    public Machine save(Machine machine){
        return machineCrudRepository.save(machine);
    }
    
    //DELETE
    public void delete(Machine machine){
        machineCrudRepository.delete(machine);
    }
    
}

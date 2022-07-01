/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concierto.demo.service;

import concierto.demo.entity.Lugar;
import concierto.demo.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabiola Mora
 */
@Service
public class LugarService implements ILugarService {
    
    @Autowired
    private LugarRepository lugarRepository;

    @Override
    public List<Lugar> listPlace() {
       return (List<Lugar>)lugarRepository.findAll();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concierto.demo.service;

import concierto.demo.entity.Artista;
import concierto.demo.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabiola Mora
 */
@Service
public class ArtistaService implements IArtistaService {
    
    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Artista> getAllArtista() {
       return (List<Artista>)artistaRepository.findAll();
    }

    @Override
    public Artista getArtistaById(long id) {
       return artistaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveArtista(Artista artista) {
        artistaRepository.save(artista);
    }

    @Override
    public void delete(long id) {
        artistaRepository.deleteById(id);
    }
    
}

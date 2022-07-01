/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package concierto.demo.service;

import concierto.demo.entity.Artista;
import java.util.List;

/**
 *
 * @author Fabiola Mora
 */
public interface IArtistaService {
    public List<Artista> getAllArtista();
    public Artista getArtistaById (long id);
    public void saveArtista(Artista artista);
    public void delete (long id);
}

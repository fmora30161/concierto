/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concierto.demo.controller;

import concierto.demo.entity.Artista;
import concierto.demo.entity.Lugar;
import concierto.demo.service.IArtistaService;
import concierto.demo.service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



/**
 *
 * @author Fabiola Mora
 */
@Controller
public class ArtistaController {
    
    @Autowired
    private IArtistaService artistaService;
    
    @Autowired
    private ILugarService lugarService;

    @GetMapping("/artista")
    public String index (Model model){
      List<Artista> listaArtista = artistaService.getAllArtista();
      model.addAttribute("titulo", "Tabla Artista");
      model.addAttribute("artistas", listaArtista);
        return "artistas";
    }
    
    @GetMapping("/artistaN")
    public String crearArtista (Model model){
      List<Lugar> listaLugares = lugarService.listPlace();
      model.addAttribute("artista", new Artista());
      model.addAttribute("lugares", listaLugares);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarArtista (@ModelAttribute Artista artista){
        artistaService.saveArtista(artista);
        return "redirect:/artista";
    }
    
      @GetMapping("/editArtista/{id}")
    public String editarArtista(@PathVariable("id") Long idArtista, Model model){
      Artista artista = artistaService.getArtistaById(idArtista);
      List<Lugar> listaLugares = lugarService.listPlace();
      model.addAttribute("artista", artista);
      model.addAttribute("lugares", listaLugares);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarArtista(@PathVariable("id") Long idArtista){
      artistaService.delete(idArtista);
        return "redirect:/artista";
    }
}

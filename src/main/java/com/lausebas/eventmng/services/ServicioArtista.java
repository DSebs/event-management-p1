/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Artista;
import java.util.ArrayList;

public class ServicioArtista {
    
    private ArrayList<Artista> artistas;   

    public ServicioArtista() {
        artistas = new ArrayList();
    }
    
    public Artista crearArtista(String nombre, String disquera){
        if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede ser null ni estar vacío.");
    }
    if (disquera == null|| disquera.trim().isEmpty() ) {
        throw new IllegalArgumentException("La disquera no puede estar vacial.");
    }
        return new Artista(nombre, disquera);
    }
    
    public void añadirArtista(Artista artista) {
        if (artista == null) {
            throw new IllegalArgumentException("El artista no puede ser null.");
        }

        for (Artista a : artistas) {
            if (a.getNombre().equalsIgnoreCase(artista.getNombre())) {
                throw new IllegalArgumentException("Ya existe un artista con el mismo nombre.");
            }
        }

        artistas.add(artista);
    }
    
    public void actualizarArtista(Artista artista, String disquera){
        if (artista == null) {
            throw new IllegalArgumentException("El artista no puede ser null.");
        }
        if (disquera == null|| disquera.trim().isEmpty() ) {
        throw new IllegalArgumentException("La disquera no puede estar vacial.");
    }
        artista.setDisquera(disquera);
    }
    
    public Artista buscarArtista(String nombre){
         if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del evento no puede estar vacío o ser null.");
        }
        for (Artista artista : artistas) {
            if(artista.getNombre().equalsIgnoreCase(nombre)){
            return artista;
        }
    }
           throw new IllegalArgumentException("No se encontró un evento con el nombre proporcionado");
    }
    
     public void eliminarArtista(Artista artista) {
        if (artista == null) {
            throw new IllegalArgumentException("El artista no puede ser null.");
        }

        if (!artistas.remove(artista)) {
            throw new IllegalArgumentException("El evento no se encuentra en la lista.");
        }
    }
    
    public ArrayList<Artista> listarArtistas() {
        return artistas;
    }
}

package com.bzetab.msk.estiba.service;

import com.bzetab.msk.estiba.model.Estiba;
import com.bzetab.msk.estiba.repository.EstibaRepository;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class EstibaService implements EstibaImp{

    private EstibaRepository estibaRepository;

    @Override
    public Estiba obtenerEstibaPorId(int id) {
        return estibaRepository.findById(id).orElse(null);
    }

    @Override
    public Estiba obtenerEstibaPorNroDocumento(String nrodocumento) {
        return estibaRepository.findByNrodocumento(nrodocumento);
    }

    @Override
    public Estiba obtenerEstibaPorNombre(String nombre) {
        return estibaRepository.findByNombre(nombre);
    }

    @Override
    public List<Estiba> listarEstibas() {
        return estibaRepository.findAll();
    }

    @Override
    public Estiba guardarEstiba(Estiba estiba) {
        return estibaRepository.save(estiba);
    }

    @Override
    public Estiba actualizarEstiba(Estiba estiba) {
        Estiba updateEstiba = this.obtenerEstibaPorId(estiba.getIdestiba());
        updateEstiba.setDocumento(estiba.isDocumento());
        updateEstiba.setNrodocumento(estiba.getNrodocumento());
        updateEstiba.setContrasenia(estiba.getContrasenia());
        updateEstiba.setNombre(estiba.getNombre());
        updateEstiba.setApellido(estiba.getApellido());
        updateEstiba.setEdad(estiba.getEdad());
        updateEstiba.setTelefono(estiba.getTelefono());
        return estibaRepository.save(updateEstiba);
    }

    @Override
    public String eliminarEstiba(int idestiba) {
        if (estibaRepository.existsById(idestiba)) {
            estibaRepository.deleteById(idestiba);
            return "Estiba eliminada";
        }
        return "No se encontró el estiba con el ID -> " + idestiba+".";
    }
}
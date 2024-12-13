package com.bzetab.msk.estiba.service;

import com.bzetab.msk.estiba.model.Estiba;
import java.util.List;
import java.util.Optional;

public interface EstibaImp {
    Estiba obtenerEstibaPorId(int id);
    Estiba obtenerEstibaPorNroDocumento(String nroDocumento);
    Estiba obtenerEstibaPorNombre(String nombre);
    List<Estiba> listarEstibas();
    Estiba guardarEstiba(Estiba estiba);
    Estiba actualizarEstiba(Estiba estiba);
    String eliminarEstiba(int idestiba);
    Optional<Integer>login(String nroDocumento,String password);
}

package com.bzetab.msk.estiba.model.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private boolean success;
    private Integer idestiba;
    private boolean documento;
    private String nrodocumento;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String telefono;
    private String mensaje;
}

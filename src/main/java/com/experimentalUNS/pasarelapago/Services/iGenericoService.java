package com.experimentalUNS.pasarelapago.Services;

import java.util.List;

public interface iGenericoService<Entidad,ID> {
    public Entidad agregar(Entidad entidad);
    public List<Entidad> listarTodos();
    public Entidad buscar(ID id);
    //update and delete soon
}

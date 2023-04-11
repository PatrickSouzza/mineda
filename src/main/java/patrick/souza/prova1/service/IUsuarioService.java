package patrick.souza.prova1.service;

import java.util.List;

import patrick.souza.prova1.entity.Usuario;

public interface IUsuarioService {

    public Usuario buscarPorId( Long Id);

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodos ();
    
    
}

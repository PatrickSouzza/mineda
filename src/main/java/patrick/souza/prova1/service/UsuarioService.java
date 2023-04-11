package patrick.souza.prova1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patrick.souza.prova1.entity.Usuario;
import patrick.souza.prova1.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario buscarPorId(Long Id){
        Optional<Usuario> usuarioOp = usuarioRepo.findById(Id);
        if(usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getSenha() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepo.save(usuario);



    }

    public List<Usuario> buscarTodos() {
        return usuarioRepo.findAll();
    }
    
    
}

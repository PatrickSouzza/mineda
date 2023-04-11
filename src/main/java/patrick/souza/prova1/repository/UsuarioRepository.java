package patrick.souza.prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import patrick.souza.prova1.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario , Long> {
    
}

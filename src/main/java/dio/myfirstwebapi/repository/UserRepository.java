package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Atualizando o usuário na camada de repositório");
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %id para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("João Victor", "marialuiza"));
        usuarios.add(new Usuario("Maria Luiza", "papai"));
        usuarios.add(new Usuario("Lucinayre", "papai"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %id para localizar um usuário."));
        return new Usuario("João Victor", "marialuiza");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário."));
        return new Usuario("Maria Luiza", "papai");
    }
}

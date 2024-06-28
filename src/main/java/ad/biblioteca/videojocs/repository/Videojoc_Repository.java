package ad.biblioteca.videojocs.repository;

import ad.biblioteca.videojocs.entity.Videojoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Videojoc_Repository extends JpaRepository<Videojoc,Integer> {

    List<Videojoc> findByIdConsola(int idConsola);
}

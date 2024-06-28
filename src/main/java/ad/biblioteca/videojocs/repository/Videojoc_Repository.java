package ad.biblioteca.videojocs.repository;

import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Videojoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Videojoc_Repository extends JpaRepository<Videojoc,Integer> {


    @Query("SELECT vid FROM Videojoc vid JOIN FETCH vid.consola con WHERE con.id = :idConsola")
    Videojoc findByConsola(int idConsola);
    //List<Videojoc> findByIdConsola(int idConsola);
}

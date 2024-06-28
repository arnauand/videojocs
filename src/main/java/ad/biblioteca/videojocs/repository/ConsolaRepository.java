package ad.biblioteca.videojocs.repository;

import ad.biblioteca.videojocs.entity.Consola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConsolaRepository extends JpaRepository<Consola,Integer> {
    //Consola findById_empresa();

    @Query("SELECT con FROM Consola con JOIN FETCH con.empresa emp WHERE emp.id = :idEmpresa")
    Consola findByEmpresa(int idEmpresa);
    //List<Consola> findByIdVideojoc(int idVideojoc);

    //@Query("SELECT con FROM Consola con JOIN FETCH con.tipus_consoles tip WHERE con.id = :idConsola")
    //Consola findTipus_Consoles(int idConsola);
}

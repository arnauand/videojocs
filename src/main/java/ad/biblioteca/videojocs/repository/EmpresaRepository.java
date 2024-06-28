package ad.biblioteca.videojocs.repository;

import ad.biblioteca.videojocs.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
    //@Query("SELECT emp FROM Empresa emp JOIN FETCH emp.consoles con WHERE emp.id = :idEmpresa")
    //Empresa findConsoles(int idEmpresa);

    //@Query("SELECT emp FROM Empresa emp JOIN FETCH emp.videojocs vid WHERE emp.id = :idEmpresa")
    //Empresa findVideojocs(int idEmpresa);
}

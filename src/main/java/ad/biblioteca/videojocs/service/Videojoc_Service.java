package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Videojoc;
import ad.biblioteca.videojocs.repository.Videojoc_Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Videojoc_Service {
    @Autowired
    private Videojoc_Repository videojoc_repository;

    public List<Videojoc> getVideojocsByConsola(int idConsola)  {
        return null; //videojoc_repository.findByIdConsola(idConsola);
    }

    public List<Videojoc> getVideojocs() {
        log.info("Inici getVideojocs()");
        return videojoc_repository.findAll();
    }
    public Videojoc getVideojocsConsola(int idConsola) {
        log.info("Inici getVideojocsConsola({})", idConsola);
        return videojoc_repository.findByConsola(idConsola);
    }

    public Videojoc getVideojoc(int idVideojoc) {
        log.info("Inici getVideojoc({})", idVideojoc);
        return videojoc_repository.getReferenceById(idVideojoc);
    }
}

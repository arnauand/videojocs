package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Tipus_Consola;
import ad.biblioteca.videojocs.repository.ConsolaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ConsolaService {
    @Autowired
    private ConsolaRepository consolaRepository;

    public List<Consola> getConsolesByVideojoc(int idVideojoc)  {
        return null;//consola_repository.findByIdVideojoc(idVideojoc);
    }

    public List<Tipus_Consola> getTipus_Consoles(int idConsola) {
        Consola consola = null;//consola_repository.findTipus_Consoles(idConsola);
        if (consola != null) {
            return null; //consola.getTipus_consoles();
        }
        return new ArrayList<Tipus_Consola>();
    }

    public List<Consola> getConsoles() {
        log.info("Inici getConsoles()");
        return consolaRepository.findAll();
    }

    public Consola getConsola(int idEmpresa) {
        log.info("Inici getConsolesEmpresa({})", idEmpresa);
        return consolaRepository.findByEmpresa(idEmpresa);
    }
}

package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.repository.Tipus_Consola_Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Tipus_Consola_Service {
    @Autowired
    private Tipus_Consola_Repository tipus_consola_repository;
}

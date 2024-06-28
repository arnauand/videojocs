package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.repository.Creador_Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Creador_Service {
    @Autowired
    private Creador_Repository creador_repository;
}

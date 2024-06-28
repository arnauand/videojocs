package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.repository.Foto_Logo_Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Foto_Logo_Service {
    @Autowired
    private Foto_Logo_Repository foto_logo_repository;
}

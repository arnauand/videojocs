package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.repository.Historia_Context_Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Historia_Context_Service {
    @Autowired
    private Historia_Context_Repository historia_context_repository;
}

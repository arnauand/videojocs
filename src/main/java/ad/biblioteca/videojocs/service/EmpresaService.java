package ad.biblioteca.videojocs.service;

import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Empresa;
import ad.biblioteca.videojocs.entity.Videojoc;
import ad.biblioteca.videojocs.repository.EmpresaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresa_repository;

    public List<Empresa> getEmpreses() {
        log.info("Inici getEmpreses()");
        return empresa_repository.findAll();
    }

    public Empresa getEmpresa(int idEmpresa) {
        log.info("Inici getEmpresa({})", idEmpresa);
        Empresa empresa = empresa_repository.getReferenceById(idEmpresa);
        return empresa;
    }

    public List<Consola> getConsoles(int idEmpresa) {
        Empresa empresa = null; //empresa_repository.findConsoles(idEmpresa);
        if (empresa != null) {
            return null; //empresa.getConsoles();
        }
        return new ArrayList<Consola>();
    }
    public List<Videojoc> getVideojocs(int idEmpresa) {
        Empresa empresa = null; //empresa_repository.findVideojocs(idEmpresa);
        if (empresa != null) {
            return null; //empresa.getVideojocs();
        }
        return new ArrayList<Videojoc>();
    }
}

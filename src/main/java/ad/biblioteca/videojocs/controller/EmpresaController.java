package ad.biblioteca.videojocs.controller;

import ad.biblioteca.videojocs.dto.EmpresaDTO;
import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Empresa;
import ad.biblioteca.videojocs.service.EmpresaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> testRequest() {
        return ResponseEntity.ok("Controlador empresa disponible");
    }

    @RequestMapping(value = "/getEmpreses", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<EmpresaDTO>> getEmpreses() {
        log.info("Inici getEmpreses()");
        List<Empresa> empreses = empresaService.getEmpreses();
        List<EmpresaDTO> empresaDTOS = new ArrayList<EmpresaDTO>();
        for (Empresa empresa : empreses) {
            empresaDTOS.add(EmpresaDTO.builder().id(empresa.getId()).nom(empresa.getNom()).build());
        }
        return ResponseEntity.ok(empresaDTOS);
    }

    @RequestMapping(value = "/getEmpresa/{idEmpresa}", method = RequestMethod.GET)
    public ResponseEntity<EmpresaDTO> getEmpresa(@PathVariable int idEmpresa) {
        log.info("Inici getEmpresa({})", idEmpresa);
        Empresa empresa = empresaService.getEmpresa(idEmpresa);
        return ResponseEntity.ok(EmpresaDTO.builder().id(empresa.getId()).nom(empresa.getNom()).build());
    }

    @RequestMapping(value = "/getConsoles/{idEmpresa}", method = RequestMethod.GET)
    public ResponseEntity<List<Consola>> getConsoles(@PathVariable int idEmpresa) {
        return null;
    }

}

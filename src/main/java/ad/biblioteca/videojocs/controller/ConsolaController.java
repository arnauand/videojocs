package ad.biblioteca.videojocs.controller;

import ad.biblioteca.videojocs.dto.ConsolaDTO;
import ad.biblioteca.videojocs.dto.EmpresaDTO;
import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Empresa;
import ad.biblioteca.videojocs.service.ConsolaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/consola")
public class ConsolaController {
    @Autowired
    private ConsolaService consolaService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> testRequest() {
        return ResponseEntity.ok("Controlador consola disponible");
    }

    @RequestMapping(value = "/getConsoles", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<ConsolaDTO>> getConsoles() {
        log.info("Inici getConsoles()");
        List<Consola> consoles = consolaService.getConsoles();
        List<ConsolaDTO> consolesDTOS = new ArrayList<ConsolaDTO>();
        for(Consola consola: consoles){
            consolesDTOS.add(ConsolaDTO.builder().id(consola.getId()).nom(consola.getNom()).empresa(EmpresaDTO.builder().id(consola.getEmpresa().getId()).nom(consola.getEmpresa().getNom()).build()).build());
        }
        return ResponseEntity.ok(consolesDTOS);
    }

    @RequestMapping(value = "/getConsoles/{idEmpresa}", method = RequestMethod.GET)
    public ResponseEntity<ConsolaDTO> getConsolesEmpresa(@PathVariable int idEmpresa) {
        log.info("Inici getConsolesEmpresa({})", idEmpresa);
        Consola consola = consolaService.getConsola(idEmpresa);
        return ResponseEntity.ok(ConsolaDTO.builder().id(consola.getId()).nom(consola.getNom()).empresa(EmpresaDTO.builder().id(consola.getEmpresa().getId()).nom(consola.getEmpresa().getNom()).build()).build());
    }

}

package ad.biblioteca.videojocs.controller;

import ad.biblioteca.videojocs.dto.ConsolaDTO;
import ad.biblioteca.videojocs.dto.EmpresaDTO;
import ad.biblioteca.videojocs.dto.VideojocDTO;
import ad.biblioteca.videojocs.entity.Consola;
import ad.biblioteca.videojocs.entity.Empresa;
import ad.biblioteca.videojocs.entity.Videojoc;
import ad.biblioteca.videojocs.service.Videojoc_Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/videojoc")
public class VideojocController {
    @Autowired
    private Videojoc_Service videojocService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> testRequest() {
        return ResponseEntity.ok("Controlador videojoc disponible");
    }

    @RequestMapping(value = "/getVideojocs", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<VideojocDTO>> getVideojocs() {
        log.info("Inici getVideojocs()");
        List<Videojoc> videojocs = videojocService.getVideojocs();
        List<VideojocDTO> videojocsDTOS = new ArrayList<VideojocDTO>();
        for(Videojoc videojoc: videojocs){
            videojocsDTOS.add(VideojocDTO.builder().id(videojoc.getId()).nom(videojoc.getNom()).consola(ConsolaDTO.builder().id(videojoc.getConsola().getId()).nom(videojoc.getConsola().getNom()).build()).build());
        }
        return ResponseEntity.ok(videojocsDTOS);
    }

    @RequestMapping(value = "/getVideojocs/{idConsola}", method = RequestMethod.GET)
    public ResponseEntity<VideojocDTO> getvideojocsConsola(@PathVariable int idConsola) {
        log.info("Inici getVideojocsConsola({})", idConsola);
        Videojoc videojoc = videojocService.getVideojocsConsola(idConsola);
        return ResponseEntity.ok(VideojocDTO.builder().id(videojoc.getId()).nom(videojoc.getNom()).consola(ConsolaDTO.builder().id(videojoc.getConsola().getId()).nom(videojoc.getConsola().getNom()).build()).build());
    }

    @RequestMapping(value = "/getVideojoc/{idVideojoc}", method = RequestMethod.GET)
    public ResponseEntity<VideojocDTO> getVideojoc(@PathVariable int idVideojoc) {
        log.info("Inici getVideojoc({})", idVideojoc);
        Videojoc videojoc = videojocService.getVideojoc(idVideojoc);
        return ResponseEntity.ok(VideojocDTO.builder().id(videojoc.getId()).nom(videojoc.getNom()).build());
    }

}

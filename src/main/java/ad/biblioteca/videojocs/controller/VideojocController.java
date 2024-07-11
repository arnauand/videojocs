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

    @RequestMapping(value = "/getVideojocsConsola/{idConsola}", method = RequestMethod.GET)
    public ResponseEntity<List<VideojocDTO>> getvideojocsConsola(@PathVariable int idConsola) {
        log.info("Inici getVideojocsConsola({})", idConsola);
        List<Videojoc> videojocs = videojocService.getVideojocsConsola(idConsola);
        List<VideojocDTO> videojocsDTO = new ArrayList<VideojocDTO>();
        for (Videojoc item: videojocs) {
            videojocsDTO.add(VideojocDTO.builder()
                                .id(item.getId())
                                .nom(item.getNom())
                                .consola(ConsolaDTO.builder()
                                            .id(item.getConsola().getId())
                                            .nom(item.getConsola().getNom())
                                            .empresa(EmpresaDTO.builder()
                                                    .id(item.getConsola().getEmpresa().getId())
                                                    .nom(item.getConsola().getEmpresa().getNom()).build()).build())
                                .empresa(EmpresaDTO.builder()
                                        .id(item.getEmpresa().getId())
                                        .nom(item.getEmpresa().getNom()).build()).build());
        }
        return ResponseEntity.ok(videojocsDTO);
    }

    @RequestMapping(value = "/getVideojoc/{idVideojoc}", method = RequestMethod.GET)
    public ResponseEntity<VideojocDTO> getVideojoc(@PathVariable int idVideojoc) {
        log.info("Inici getVideojoc({})", idVideojoc);
        Videojoc videojoc = videojocService.getVideojoc(idVideojoc);
        return ResponseEntity.ok(VideojocDTO.builder().id(videojoc.getId()).nom(videojoc.getNom()).build());
    }

    @RequestMapping(value = "/getVideojocsEmpresa/{idEmpresa}", method = RequestMethod.GET)
    public ResponseEntity<List<VideojocDTO>> getvideojocsEmpresa(@PathVariable int idEmpresa) {
        log.info("Inici getVideojocsEmpresa({})", idEmpresa);
        List<Videojoc> videojocs = videojocService.getVideojocsEmpresa(idEmpresa);
        List<VideojocDTO> videojocsDTO = new ArrayList<VideojocDTO>();
        for (Videojoc item: videojocs) {
            videojocsDTO.add(VideojocDTO.builder()
                                .id(item.getId())
                                .nom(item.getNom())
                                .consola(ConsolaDTO.builder()
                                            .id(item.getConsola().getId())
                                            .nom(item.getConsola().getNom())
                                            .empresa(EmpresaDTO.builder()
                                                        .id(item.getConsola().getEmpresa().getId())
                                                        .nom(item.getConsola().getEmpresa().getNom()).build()).build())
                                .empresa(EmpresaDTO.builder()
                                            .id(item.getEmpresa().getId())
                                            .nom(item.getEmpresa().getNom()).build()).build());
        }
        return ResponseEntity.ok(videojocsDTO);
    }
}

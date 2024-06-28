package ad.biblioteca.videojocs.dto;

import ad.biblioteca.videojocs.entity.Empresa;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConsolaDTO {
    private int id;
    private String nom;
    private EmpresaDTO empresa;


}

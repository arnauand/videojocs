package ad.biblioteca.videojocs.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VideojocDTO {

    private int id;
    private String nom;

    private ConsolaDTO consola;
}

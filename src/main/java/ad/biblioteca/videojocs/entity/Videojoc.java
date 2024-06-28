package ad.biblioteca.videojocs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "VIDEOJOC")
public class Videojoc {
    @Id @Column(name = "id") private int id;
    @Column(name = "nom") private String nom;
    //@Column(name = "idHistoria_Context") private int idHistoria_Context;
    //@Column(name = "idFoto_Logo") private int idFoto_Logo;
    //@Column(name = "idCreador") private int idCreador;
    //@Column(name = "idConsola") private int idConsola;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_consola")
    private Consola consola;
}

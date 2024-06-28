package ad.biblioteca.videojocs.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONSOLA")
public class Consola {
    @Id @Column(name = "id") private int id;
    @Column(name = "nom") private String nom;
    //@Column(name = "idTipus_Consola") private int idTipus_Consola;
    //@Column(name = "idHistoria_Context") private int idHistoria_Context;
    //@Column(name = "idCreador") private int idCreador;
    //@Column(name = "idFoto_Logo") private int idFoto_Logo;
    //@Column(name = "idVideojoc") private int idVideojoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    /**
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idTipus_Consola")
    private List<Tipus_Consola> tipus_consoles = new ArrayList<>();
    */

}

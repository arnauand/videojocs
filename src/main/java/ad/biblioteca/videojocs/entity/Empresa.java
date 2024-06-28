package ad.biblioteca.videojocs.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPRESA")
public class Empresa {
    @Id @Column(name = "id") private int id;
    @Column(name = "nom") private String nom;
    //@Column(name = "id_historia_context") private int idHistoria_Context;
    //@Column(name = "id_creador") private int idCreador;
    //@Column(name = "id_foto_logo") private int idFotoLogo;
    //@Column(name = "id_videojoc") private int idVideojoc;
    //@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Consola> consolas;

    //@Column(name = "id_consola") private int idConsola;
    //@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "id_consola")
    //private List<Consola> consoles = new ArrayList<>();

    /**
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_videojoc")
    private List<Videojoc> videojocs = new ArrayList<>();
    */

}

package ad.biblioteca.videojocs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "CREADOR")
public class Creador {
    @Id @Column(name = "id") private int id;
    @Column(name = "nom") private String nom;
    @Column(name = "data_naixement") private String data_naixement;
    @Column(name = "idFoto_Logo") private int idFoto_Logo;
    @Column(name = "idHistoria_Context") private int idHistoria_Context;
}

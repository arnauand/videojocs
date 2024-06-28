package ad.biblioteca.videojocs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FOTO_LOGO")
public class Foto_Logo {
    @Id @Column(name = "id") private int id;
    @Column(name = "descripcio") private String descripcio;
    @Column(name = "imatge") private byte[] imatge;
}

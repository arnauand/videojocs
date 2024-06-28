package ad.biblioteca.videojocs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HISTORIA_CONTEXT")
public class Historia_Context {
    @Id @Column(name = "id") private int id;
    @Column(name = "descripcio") private String descripcio;
}

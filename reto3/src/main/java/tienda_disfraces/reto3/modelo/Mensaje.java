package tienda_disfraces.reto3.modelo;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @autor Gladys Leticia Ramirez Torres
 */
@Entity
@Table(name = "message")
public class Mensaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer costume;
    private String text;

    @ManyToOne
    @JoinColumn(name="disfraz_id")
    @JsonIgnoreProperties({"message","reservation"}) //verificar nombre de las tablas
    private Disfraz disfraz;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    @JsonIgnoreProperties({"message","client"}) //verificar nombre de las tablas
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCostume() {
        return costume;
    }

    public void setCostume(Integer costume) {
        this.costume = costume;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Disfraz getDisfraz() { 
        return disfraz;
    }

    public void setDisfraz(Disfraz disfraz) { 
        this.disfraz = disfraz;
    }

    public Cliente getCliente() { 
        return cliente;
    }

    public void setCliente(Cliente cliente) { 
        this.cliente = cliente;
    }
}

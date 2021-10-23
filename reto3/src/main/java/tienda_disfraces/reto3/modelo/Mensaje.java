package tienda_disfraces.reto3.modelo;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @autor Gladys Leticia Ramirez Torres
 *
 */
@Entity
@Table(name = "message")
public class Mensaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "message_costume")
    @JsonIgnoreProperties({ "message", "costume" })
    private Disfraz costume;

    @ManyToOne
    @JoinColumn(name = "message_client")
    @JsonIgnoreProperties({ "message", "client" })
    private Cliente client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Disfraz getDisfraces() {
        return costume;
    }

    public void setDisfraces(Disfraz costume) {
        this.costume = costume;
    }

    public Cliente getClientes() {
        return client;
    }

    public void setClientes(Cliente client) {
        this.client = client;
    }

}

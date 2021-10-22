package tienda_disfraces.reto3.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tienda_disfraces.reto3.modelo.Mensaje;
import tienda_disfraces.reto3.repositorio.MensajeRepositorio;

/**
 * @autor Gladys Leticia Ramirez Torres
 */
@Service
public class MensajeServicios {
    @Autowired
    private MensajeRepositorio mensajeRepositorio;
    
    public List<Mensaje> getAll(){
        return mensajeRepositorio.getAll();
    }

    /**
     * Obtener mensaje por id
     */
    public Optional<Mensaje> getMensaje(int id){
        return mensajeRepositorio.getMensaje(id);
    }

    /**
     * Creear una mensaje
     */
    public Mensaje save(Mensaje mensaje){
        if(mensaje.getId()==null){
            return mensajeRepositorio.save(mensaje);
        }else{
            Optional<Mensaje> paux=mensajeRepositorio.getMensaje(mensaje.getId());
            if(paux.isEmpty()){
                return mensajeRepositorio.save(mensaje);
            }else{
                return mensaje;
            }
        }
    }

    /**
     * Actualizar una Mensaje
     */
    public Mensaje update(Mensaje mensaje){
        if(mensaje.getId()!=null){
            Optional<Mensaje>g=mensajeRepositorio.getMensaje(mensaje.getId());
            if(!g.isEmpty()){
                if(mensaje.getText()!=null){
                    g.get().setText(mensaje.getText());
                }
                return mensajeRepositorio.save(g.get());
            }
        }
        return mensaje;
    }

    /**
     * Borrar una mensaje
     */
    public boolean deleteMensaje(int id){
        Boolean borrar= getMensaje(id).map(mensaje -> {
            mensajeRepositorio.delete(mensaje);
            return true;
        }).orElse(false);
        return borrar;
    }
    
}

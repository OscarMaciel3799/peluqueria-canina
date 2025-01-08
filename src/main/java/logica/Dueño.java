package logica;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_dueño;
    private String nombre;
    private String celDueño;
    
    @OneToMany (mappedBy = "unDueño")
    private LinkedList<Mascota> listaMascota;
    

    public Dueño() {
    }

    public Dueño(int id_dueño, String nombre, String celDueño) {
        this.id_dueño = id_dueño;
        this.nombre = nombre;
        this.celDueño = celDueño;
    }

    public int getId_dueño() {
        return id_dueño;
    }

    public void setId_dueño(int id_dueño) {
        this.id_dueño = id_dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDueño() {
        return celDueño;
    }

    public void setCelDueño(String celDueño) {
        this.celDueño = celDueño;
    }
    
    
    
}

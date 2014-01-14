/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Cristhian
 */
public class Usuario {
    
    private String nombre="Cris";
    private String pass="125";
    
    /**
     *
     */
    public Usuario(){}

    /**
     *
     * @param nombre
     * @param pass
     */
    public Usuario(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getPass() {
        return pass;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}

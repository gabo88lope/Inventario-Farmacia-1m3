/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.Inventario;

/**
 *
 * @author Montano
 * 
 */
public class Medicina {
    
    String nombre;
    String marca;
    String descrip;
    String tipo;
    String uso;
    String lab;
    String fabri;
    String venci;
    String cod;
    String cant;
    String dosis;

    /**
     *
     */
    public Medicina() {
    }

    /**
     *
     * @param nombre
     * @param marca
     * @param descrip
     * @param tipo
     * @param uso
     * @param lab
     * @param fabri
     * @param venci
     * @param cod
     * @param cant
     * @param dosis
     */
    public Medicina(String nombre, String marca, String descrip, String tipo, String uso, String lab, String fabri, String venci, String cod, String cant, String dosis) {
        this.nombre = nombre;
        this.marca = marca;
        this.descrip = descrip;
        this.tipo = tipo;
        this.uso = uso;
        this.lab = lab;
        this.fabri = fabri;
        this.venci = venci;
        this.cod = cod;
        this.cant = cant;
        this.dosis = dosis;
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
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     *
     * @param descrip
     */
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getUso() {
        return uso;
    }

    /**
     *
     * @param uso
     */
    public void setUso(String uso) {
        this.uso = uso;
    }

    /**
     *
     * @return
     */
    public String getLab() {
        return lab;
    }

    /**
     *
     * @param lab
     */
    public void setLab(String lab) {
        this.lab = lab;
    }

    /**
     *
     * @return
     */
    public String getFabri() {
        return fabri;
    }

    /**
     *
     * @param fabri
     */
    public void setFabri(String fabri) {
        this.fabri = fabri;
    }

    /**
     *
     * @return
     */
    public String getVenci() {
        return venci;
    }

    /**
     *
     * @param venci
     */
    public void setVenci(String venci) {
        this.venci = venci;
    }

    /**
     *
     * @return
     */
    public String getCod() {
        return cod;
    }

    /**
     *
     * @param cod
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     *
     * @return
     */
    public String getCant() {
        return cant;
    }

    /**
     *
     * @param cant
     */
    public void setCant(String cant) {
        this.cant = cant;
    }

    /**
     *
     * @return
     */
    public String getDosis() {
        return dosis;
    }

    /**
     *
     * @param dosis
     */
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    
    
    
    
}

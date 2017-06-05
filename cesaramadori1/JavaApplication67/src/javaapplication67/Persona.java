/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

/**
 *
 * @author alumno
 */
public class Persona implements IPersona{
    private String nombre;
    private String apellido;
    private int edad;
    private Integer dni;
    private String sexo;
    private Ropa calzado;
    private Ropa pantalones;
    private Ropa sombrero;
    private String religion;
    
    public String dameTuNombre(){
        return getNombre();
    }

    @Override
    public String comotellamas() {
        return getNombre();
    }

    @Override
    public int queedadtenes() {
        return getEdad();
    }

    @Override
    public String dequedoloresturopa() {
        return "Calzado color: "+getCalzado().getColor()+". Pantalones color : "+getPantalones().getColor()+". Sombrero color: "+ getSombrero().getColor();
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public Integer getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the calzado
     */
    public Ropa getCalzado() {
        return calzado;
    }

    /**
     * @param calzado the calzado to set
     */
    public void setCalzado(Ropa calzado) {
        this.calzado = calzado;
    }

    /**
     * @return the pantalones
     */
    public Ropa getPantalones() {
        return pantalones;
    }

    /**
     * @param pantalones the pantalones to set
     */
    public void setPantalones(Ropa pantalones) {
        this.pantalones = pantalones;
    }

    /**
     * @return the sombrero
     */
    public Ropa getSombrero() {
        return sombrero;
    }

    /**
     * @param sombrero the sombrero to set
     */
    public void setSombrero(Ropa sombrero) {
        this.sombrero = sombrero;
    }

    /**
     * @return the religion
     */
    public String getReligion() {
        return religion;
    }

    /**
     * @param religion the religion to set
     */
    public void setReligion(String religion) {
        this.religion = religion;
    }
}

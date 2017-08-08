/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

/**
 *
 * @author alumno
 */
public class UserProfile extends Persona {

    protected String email;
    protected String password;

    protected String username;

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public UserProfile(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public UserProfile(String email, String password, String username, String nombre, String apellido) {
        super(nombre, apellido);
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

package poo;

public class Persona implements IPersona {

    private String nombre;
    private String apellido;
    private int edad;
    private Integer dni;
    private String sexo;
    private Ropa calzado;
    private Ropa pantalones;
    private Ropa sombrero;

    protected String religion;

    public Persona() {
        nombre = "Sin nombre";
        apellido = "Sin apellido";
        edad = 0;
        dni = 0;
        sexo = "mmmmmmmm";
        calzado = new Ropa();
        calzado.talle = "40";
        calzado.color = "Negro";
        calzado.tipo = "Deportiva";
        calzado.marca = "Topper";
        pantalones = new Ropa();
        pantalones.talle = "44";
        pantalones.color = "Negro";
        pantalones.tipo = "Jean";
        pantalones.marca = "Rangler";
        sombrero = new Ropa();
        sombrero.talle = "10";
        sombrero.color = "Negro";
        sombrero.tipo = "Boina";
        sombrero.marca = "Alguna";

        
    }

    public void poneTuNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }

    public String dameTuNombre() {
        if (dameTuEdad()>18){
            return "Ni loco te digo, Chauuuuuu";
        }else{
        return nombre;
        }
    }

    public void ponTuApellido(String apellidoNuevo) {
        apellido = apellidoNuevo;
    }

    public String dameTuApellido() {
        return apellido;
    }

    public void ponTuEdad(int edadNueva) {
        edad = edadNueva;
    }

    public int dameTuEdad() {
        return edad;
    }

    public void ponTuDni(int dniNuevo) {
        dni = dniNuevo;
    }

    public int dameTuDni() {
        return dni;
    }

    public void ponTuSexo(String sexoNuevo) {
        sexo = sexoNuevo;
    }

    public String dameTuSexo() {
        return sexo;
    }

    public String dameTuColorRopa() {
        return pantalones.color;
    }

    public String comoTeLlamas() {
        return dameTuNombre();
    }

    public int queEdadTenes() {
        return dameTuEdad();
    }

    public String deQueColorEsTuRopa() {
        return dameTuColorRopa();
    }

}

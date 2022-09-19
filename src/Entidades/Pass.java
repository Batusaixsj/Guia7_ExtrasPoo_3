package Entidades;

/**
 * Crear una clase Pass, donde declaremos los siguientes atributos: ● pass : Del
 * tipo String ● nombre: Del tipo String ● dni: Del tipo int.
 *
 * @author MNXC04
 */
public class Pass {

    private String password;
    private String nombre;
    private int dni;
    private String nivelPass;

    public String getNivelPass() {
        return nivelPass;
    }


    /**
     * Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS
     * FIJOS (no porteclado)
     */
    public Pass() {
        this.password = "HiMotomoto";
        this.nombre = "Neri Cisterna";
        this.dni = 31719852;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean longitud() {

        return this.password.length() == 10;

    }
    
    
     public void setNivelPass(String nivelPass) {
        this.nivelPass = nivelPass;
    }

   
}

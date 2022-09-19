package Servicios;

import Entidades.Pass;
import java.util.Scanner;

public class ServicioPass {

    /**
     * Crear un método para ingresar una contraseña (crearPass). En este método,
     * debemos validar que la longitud sea correcta. (10). En caso de ser
     * correcto, almaceno la contraseña. Si ingreso a esta opción del menú,
     * indefectiblemente deberá dejar su contraseña asignada. *
     */
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Pass crearPass() {
        Pass p1 = new Pass();
        System.out.print("Ingrese una contraseña (10 Caracteres): ");
        do {
            p1.setPassword(input.next());
            if (p1.longitud()) {
                break;
            } else {
                System.out.println("La contraseña no tiene la cantidad de caracteres solicitados........");
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Ingrese nuvamente la contraseña (10 caracteres): ");
            }

        } while (true);

        return p1;
    }

    /**
     * Crear un método para analizar la contraseña(analizarPass). Donde: o SI
     * Existe al menos una letra z : Es nivel MEDIO o Si Existe al menos una
     * letra z y al menos 2 letras a: Es nivel ALTO o Si ninguna condición se
     * cumple es nivel BAJO
     */
    private void analizarPass(Pass p1) {
        int contA = 0;
        int contZ = 0;

        for (int i = 0; i < p1.getPassword().length(); i++) {
            if ("a".equalsIgnoreCase(p1.getPassword().substring(i, i + 1))) {
                contA++;
            } else if ("z".equalsIgnoreCase(p1.getPassword().substring(i, i + 1))) {
                contZ++;
            }
            cargarNivel(p1, contA, contZ);
        }
    }

    public void cargarNivel(Pass p1, int cantA, int cantZ) {
        if (cantA >= 2 && cantZ > 0) {
            p1.setNivelPass("Alto");
        } else if (0 <= cantZ) {
            p1.setNivelPass("Medio");
        } else {
            p1.setNivelPass("Bajo");
        }
    }

}

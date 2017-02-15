/**
 *
 * @author ISC Humberto Pinelo Rivera
 */
package ejemploherencia2;

import java.util.Scanner;

public class Empleado implements iDepartamentos, iOperadoraPension {
    int i;
    
    Scanner Lector = new Scanner(System.in);

    @Override
    public void asignarDepto() {
        int dpto, ext;
        String nombre;
        
        System.out.print("Escriba el Nombre del Empleado: ");
        nombre = Lector.next();
        
        for(i=0; i<dptos.length; i++){
            System.out.println(i+1+" "+dptos[i]);
        }
        System.out.print("Seleccione Departamento: ");
        dpto = Lector.nextInt();
        System.out.println("Departamento Seleccionado: "+dptos[dpto-1]);
        
        for(i=0; i<exts.length; i++){
            System.out.println(i+1+" "+exts[i]);
        }
        System.out.print("Seleccione Extención: ");
        ext = Lector.nextInt();
        System.out.println("Extención Seleccionada: "+exts[ext-1]);
    }

    @Override
    public void asignarOperadora() {
        int opera, tasa;
        
        for(i=0; i<entidades.length; i++){
            System.out.println(i+1+" "+entidades[i]);
        }
        System.out.print("Seleccione la Operadora: ");
        opera = Lector.nextInt();
        System.out.println("Operadora Seleccionada: "+entidades[opera-1]);
        
        for(i=0; i<tasaRendi.length; i++){
            System.out.println(i+1+" "+tasaRendi[i]);
        }
        System.out.print("Seleccione la tasa de Rendimiento: ");
        tasa = Lector.nextInt();
        System.out.println("Tasa de Rendimiento Seleccionada: "+tasaRendi[tasa-1]);

    }
    
}

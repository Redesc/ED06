
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimir_emp();
    }

    private static void imprimir_emp() {
        Empleado empleado1 = new Empleado("1245678M","Manolo");
        
        empleado1.setDireccion("C/del Pez,6");
        empleado1.numHijos=3;
        System.out.println("DNI: "+empleado1.getDni());
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Cargo: "+empleado1.getCargo());
        System.out.println("Número de hijos: "+empleado1.numHijos);
        System.out.println("Sueldo: "+empleado1.calcula_sueldo(1200));
    }
    
}

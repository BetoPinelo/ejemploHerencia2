/**
 *
 * @author ISC Humberto Pinelo Rivera
 */
package ejemploherencia2;

public interface iOperadoraPension {
    public static final String entidades[] = {"Banco de Pensiones", "Pensiones México",
        "Banco Municipal", "Sistema de Pensiones", "Pensiones ACME"};
    
    public static final double tasaRendi[] = {0.12, 0.13, 0.14, 0.11, 0.10};
    
    void asignarOperadora();
}

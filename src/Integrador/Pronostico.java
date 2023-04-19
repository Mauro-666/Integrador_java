
package Integrador;

/**
 *
 * @author elter
 */
public class Pronostico {

    private final Partido partido;
    private final ResultadoEnum resultado;

    public Pronostico(Partido partido, ResultadoEnum resultado) {
        this.partido = partido;
        this.resultado = resultado;
    }
    
    public int calcularPuntajePronostico()
    {
        ResultadoEnum resultadoPartido = this.partido.decidirResultado();
        
        if (resultadoPartido == this.resultado)
        {
            return 1;
        }
        else 
        {
            return 0; 
        }
    }
    
}

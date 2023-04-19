
package Integrador;

/**
 *
 * @author elter
 */
public class Partido {

    private final Equipo equipo1;
    private final Equipo equipo2;
    private final Integer golesEquipo1;
    private final Integer golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2, Integer golesEquipo1, Integer golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public Integer getGolesEquipo1() {
        return golesEquipo1;
    }

    public Integer getGolesEquipo2() {
        return golesEquipo2;
    }
    
    
  public ResultadoEnum decidirResultado()
    {
        if (this.golesEquipo1 > this.golesEquipo2)
        {
        return ResultadoEnum.GANA_EQUIPO_1;
        }
         if (this.golesEquipo1 < this.golesEquipo2)
        {
        return ResultadoEnum.GANA_EQUIPO_2;
        }
        return ResultadoEnum.EMPATE;
    }
    
}

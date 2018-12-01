package complejo.entidad;

import complejo.entidad.CorteTurno;
import complejo.entidad.Crendencial;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-29T01:39:11")
@StaticMetamodel(Visitas.class)
public class Visitas_ { 

    public static volatile SingularAttribute<Visitas, Integer> horaEntrada;
    public static volatile SingularAttribute<Visitas, String> tipoPago;
    public static volatile SingularAttribute<Visitas, Integer> idvisitas;
    public static volatile ListAttribute<Visitas, CorteTurno> corteTurnoList;
    public static volatile SingularAttribute<Visitas, Crendencial> idcredencial;
    public static volatile SingularAttribute<Visitas, Integer> horaSalida;

}
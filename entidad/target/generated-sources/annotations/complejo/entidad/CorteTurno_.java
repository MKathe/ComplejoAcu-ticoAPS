package complejo.entidad;

import complejo.entidad.Administrador;
import complejo.entidad.Visitas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-29T01:39:11")
@StaticMetamodel(CorteTurno.class)
public class CorteTurno_ { 

    public static volatile SingularAttribute<CorteTurno, Date> fecha;
    public static volatile SingularAttribute<CorteTurno, Administrador> idAdministrador;
    public static volatile SingularAttribute<CorteTurno, Visitas> idvisita;
    public static volatile SingularAttribute<CorteTurno, Integer> idcorteTurno;

}
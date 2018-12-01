package complejo.entidad;

import complejo.entidad.CorteTurno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-29T01:39:11")
@StaticMetamodel(Administrador.class)
public class Administrador_ { 

    public static volatile SingularAttribute<Administrador, String> apellidoPaterno;
    public static volatile SingularAttribute<Administrador, String> puesto;
    public static volatile SingularAttribute<Administrador, Integer> idadministrador;
    public static volatile SingularAttribute<Administrador, String> cuenta;
    public static volatile SingularAttribute<Administrador, String> nombre;
    public static volatile ListAttribute<Administrador, CorteTurno> corteTurnoList;
    public static volatile SingularAttribute<Administrador, String> apellidoMaterno;

}
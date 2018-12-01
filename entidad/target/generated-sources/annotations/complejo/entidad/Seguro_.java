package complejo.entidad;

import complejo.entidad.Crendencial;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-29T01:39:11")
@StaticMetamodel(Seguro.class)
public class Seguro_ { 

    public static volatile SingularAttribute<Seguro, String> seguro;
    public static volatile SingularAttribute<Seguro, String> estado;
    public static volatile ListAttribute<Seguro, Crendencial> crendencialList;
    public static volatile SingularAttribute<Seguro, Integer> idseguro;

}
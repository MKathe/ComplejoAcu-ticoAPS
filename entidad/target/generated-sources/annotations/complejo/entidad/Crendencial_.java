package complejo.entidad;

import complejo.entidad.Seguro;
import complejo.entidad.Visitas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-29T01:39:11")
@StaticMetamodel(Crendencial.class)
public class Crendencial_ { 

    public static volatile SingularAttribute<Crendencial, String> numeroEmergencia;
    public static volatile SingularAttribute<Crendencial, String> tipoCredencial;
    public static volatile SingularAttribute<Crendencial, String> apellidoPaterno;
    public static volatile SingularAttribute<Crendencial, Integer> idcrendencial;
    public static volatile SingularAttribute<Crendencial, String> nombreEmergencia;
    public static volatile SingularAttribute<Crendencial, String> correo;
    public static volatile SingularAttribute<Crendencial, String> fechaExpiracion;
    public static volatile SingularAttribute<Crendencial, Integer> horasDisponibles;
    public static volatile SingularAttribute<Crendencial, String> nombreUsuario;
    public static volatile SingularAttribute<Crendencial, String> apellidoMaterno;
    public static volatile ListAttribute<Crendencial, Visitas> visitasList;
    public static volatile SingularAttribute<Crendencial, Seguro> idseguro;

}
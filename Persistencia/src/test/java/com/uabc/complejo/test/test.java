package com.uabc.complejo.test;
import com.uabc.complejo.dao.adminDAO;
import complejo.entidad.Administrador;
import java.util.List;

/**
 *
 * @author revy
 */
public class test {
    public static void main(String args[]){
        adminDAO ad = new adminDAO();
        List<Administrador> lista;
        Administrador administrado = new Administrador();
        Administrador encontrado = new Administrador();
        administrado.setNombre("Pepito");
        administrado.setIdadministrador(2);
        administrado.setApellidoMaterno("Puerko");
        administrado.setApellidoPaterno("Ortiz");
        administrado.setPuesto("nadador");
        administrado.setCuenta("ok");
        
        
        //ad.addAdmin(administrado);
        ad.deleteAdmin(1);
        lista = ad.findAllAdmin();
        for(Administrador admin : lista){
            System.out.println(admin.getNombre());
            System.out.println(admin.getApellidoPaterno());
        }
        
        
     
    }
}

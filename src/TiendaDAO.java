import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TiendaDAO {
    public static void creartiendaBD(Tienda tienda) {
        Conexion db_connect = new Conexion();
        try(Connection conexion =db_connect.get_conConnection()){
            PreparedStatement ps= null;
            try {
                String query ="INSERT INTO `venta_de_laptops`.`tienda` (`nombre`, `direccion`, `telefono`) VALUES(?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,tienda.getNombre());
                ps.setString(2,tienda.getDireccion());
                ps.setString(3, tienda.getTelefono());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerTiendaDB(){
        Conexion db_conexion =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM tienda";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();

            while (rs.next()){
                System.out.println();
                System.out.println("ID:"+rs.getInt("id"));
                System.out.println("Nombre"+rs.getInt("id"));
                System.out.println("Direccion"+rs.getInt("id"));
                System.out.println("Telefono"+rs.getInt("id"));
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void borrartienda(int id){
        Conexion db_conexon = new Conexion();
        try(Connection conexion = db_conexon.get_conConnection()) {
            PreparedStatement ps=null;
            try {
                String query ="DELETE FROM tienda WHERE id=?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("La tienda a sido borrado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println(" No se pudo borrar la tienda ");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void actualizarTiendas(Tienda tienda){
        Conexion db_conexion=new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query ="UPDATE TIENDA SET NOMBRE =?,DIRECCION=?,TELEFONO=? WHERE id=?";
                ps =conexion.prepareStatement(query);
                ps.setString(1,tienda.getNombre());
                ps.setString(2,tienda.getDireccion());
                ps.setString(3,tienda.getTelefono());
                ps.setInt(4,tienda.getId());
                ps.executeUpdate();
                System.out.println("Se Actualizo Correctamente");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
}

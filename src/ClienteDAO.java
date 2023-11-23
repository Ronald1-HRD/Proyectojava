import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    public static void crearClienteBD(Cliente cliente) {
        Conexion db_connect = new Conexion();
        try(Connection conexion =db_connect.get_conConnection()){
            PreparedStatement ps= null;
            try {
                String query ="INSERT INTO `venta_de_laptops`.`cliente` (`nombre`, `papellido`, `sapellido`) VALUES(?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,cliente.getNombre());
                ps.setString(2,cliente.getPapellido());
                ps.setString(3,cliente.getSapellido());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerClienteDB(){
        Conexion db_conexion =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM cliente";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();

            while (rs.next()){
                System.out.println();
                System.out.println("ID:"+rs.getInt("id"));
                System.out.println("Nombre"+rs.getInt("id"));
                System.out.println("Papellido"+rs.getInt("id"));
                System.out.println("Sapellido"+rs.getInt("id"));
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void borrarCliente(int id){
        Conexion db_conexon = new Conexion();
        try(Connection conexion = db_conexon.get_conConnection()) {
            PreparedStatement ps=null;
            try {
                String query ="DELETE FROM cliente WHERE id=?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("El cliente a sido borrado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("El cliente no se pudo borrar ");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void actualizarCliente(Cliente cliente){
        Conexion db_conexion=new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query ="UPDATE CLIENTE SET NOMBRE =?,PApellido=?,SApellido=? WHERE id=?";
                ps =conexion.prepareStatement(query);
                ps.setString(1,cliente.getNombre());
                ps.setString(2,cliente.getPapellido());
                ps.setString(3,cliente.getSapellido());
                ps.setInt(4,cliente.getId());
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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LaptopDAO {
    public static void crearLaptopBD(Laptop laptop) {
        Conexion db_connect = new Conexion();
        try(Connection conexion =db_connect.get_conConnection()){
            PreparedStatement ps= null;
            try {
                String query ="INSERT INTO `venta_de_laptops`.`laptop` (`marca`, `modelo`) VALUES(?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,laptop.getMarca());
                ps.setString(2,laptop.getModelo());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerLaptopDB(){
        Conexion db_conexion =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM laptop";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();

            while (rs.next()){
                System.out.println();
                System.out.println("ID:"+rs.getInt("id"));
                System.out.println("Marca"+rs.getInt("id"));
                System.out.println("Modelo"+rs.getInt("id"));
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void borrarLaptop(int id){
        Conexion db_conexon = new Conexion();
        try(Connection conexion = db_conexon.get_conConnection()) {
            PreparedStatement ps=null;
            try {
                String query ="DELETE FROM laptop WHERE id=?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("La laptop a sido borrado");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println(" No se pudo borrar la laptop ");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void actualizarLaptop(Laptop laptop){
        Conexion db_conexion=new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query ="UPDATE CLIENTE SET MARCA =?,MODELO=? WHERE id=?";
                ps =conexion.prepareStatement(query);
                ps.setString(1,laptop.getMarca());
                ps.setString(2,laptop.getModelo());
                ps.setInt(3,laptop.getId());
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

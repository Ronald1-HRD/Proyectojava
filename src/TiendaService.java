import java.util.Scanner;

public class TiendaService {
    public static void crearTienda(){
        Scanner x=new Scanner(System.in);

        System.out.println("Escribe el nombre de la tienda: ");
        String nombre=x.nextLine();

        System.out.println("Escribe la direccion de la tienda: ");
        String direccion=x.nextLine();

        System.out.println("Escribe el telefono de la tienda");
        String telefono=x.nextLine();

        Tienda tienda=new Tienda();
        tienda.setNombre(nombre);
        tienda.setDireccion(direccion);
        tienda.setTelefono(telefono);
        TiendaDAO.creartiendaBD(tienda);
    }
    public static void listarTienda(){
        TiendaDAO.leerTiendaDB();

    }
    public static void borrarTienda(){
        Scanner Ro =new Scanner(System.in);
        System.out.println("Indica el ID de la tienda a borrar: ");
        int id_tienda =Ro.nextInt();
        TiendaDAO.borrartienda(id_tienda);


    }
    public static void editarTienda(){
        Scanner Ro =new Scanner(System.in);
        System.out.println("Escribe un nuevo nombre: ");
        String nombre =Ro.nextLine();

        System.out.println("Escribe una nueva direccion: ");
        String direccion=Ro.nextLine();

        System.out.println("Escribe un nuevo telefono: ");
        String telefono=Ro.nextLine();


        System.out.println("Indica el ID de laptop a editar: ");
        int id_laptop = Ro.nextInt();

        Tienda tienda = new Tienda();
        tienda.setNombre(nombre);
        tienda.setDireccion(direccion);
        tienda.setTelefono(telefono);
        tienda.setId(id_laptop);

        TiendaDAO.actualizarTiendas(tienda);

    }
}

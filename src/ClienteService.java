import java.util.Scanner;

public class ClienteService {
    public static void crearCliente(){
        Scanner x=new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String nombre=x.nextLine();

        System.out.println("Escribe tu papellido: ");
        String papellido=x.nextLine();

        System.out.println("Escribe tu sapellido: ");
        String sapellido=x.nextLine();


        Cliente cliente=new Cliente();
        cliente.setNombre(nombre);
        cliente.setPapellido(papellido);
        cliente.setSapellido(sapellido);
        ClienteDAO.crearClienteBD(cliente);
    }
    public static void listarClientes(){
        ClienteDAO.leerClienteDB();

    }
    public static void borrarCliente(){
        Scanner Ro =new Scanner(System.in);
        System.out.println("Indica el ID del cliente a borrar: ");
        int id_cliente =Ro.nextInt();
        ClienteDAO.borrarCliente(id_cliente);


    }
    public static void editarCliente(){
        Scanner Ro =new Scanner(System.in);
        System.out.println("Escribe un nuevo nombre: ");
        String nombre =Ro.nextLine();

        System.out.println("Escribe un nuevo PApellido: ");
        String papellido=Ro.nextLine();

        System.out.println("Escribe un nuevo SApellido: ");
        String sapellido=Ro.nextLine();

        System.out.println("Indica el ID del cliente a editar: ");
        int id_cliente = Ro.nextInt();

        Cliente acliente = new Cliente();
        acliente.setNombre(nombre);
        acliente.setPapellido(papellido);
        acliente.setSapellido(sapellido);
        acliente.setId(id_cliente);

        ClienteDAO.actualizarCliente(acliente);

    }
}

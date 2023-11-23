import java.sql.Connection;
import java.util.Scanner;

public class InicioLaptop {
    public static void main(String[] args) {
        Scanner Ro=new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("----------------------");
            System.out.println("Aplicacion de Clientes ");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Listar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Salir");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
  ;
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><>>>");
            System.out.println("Aplicacion de Laptops");
            System.out.println("6. Crear Laptop");
            System.out.println("7. Listar laptops");
            System.out.println("8. Editar laptop");
            System.out.println("9. Eliminar Laptop");
            System.out.println("10. Salir");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><>>>");
            System.out.println("Aplicacion de tiendas");
            System.out.println("11. Crear tienda");
            System.out.println("12. Listar tienda");
            System.out.println("13. Editar tienda");
            System.out.println("14. Eliminar tienda");
            System.out.println("15. Salir");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            opcion=Ro.nextInt();
            switch (opcion){
                case 1:
                    ClienteService.crearCliente();
                    break;
                case 2:
                    ClienteService.listarClientes();
                    break;
                case 3:
                    ClienteService.editarCliente();
                    break;
                case 4:
                    ClienteService.borrarCliente();
                    break;
                case 5:
                    System.out.println("<<<<<Hasta luego>>>>>>>");
                    break;
                case 6:
                    LaptopService.crearLaptop();
                    break;
                case 7:
                    LaptopService.listarLaptops();
                    break;
                case 8:
                    LaptopService.editarLaptop();
                    break;
                case 9:
                    LaptopService.borrarLaptop();
                    break;
                case 10:
                    System.out.println("<<<<<<<<HASTA LUEGO>>>>>>>>>>>>");
                    break;
                case 11:
                    TiendaService.crearTienda();
                    break;
                case 12:
                    TiendaService.listarTienda();
                    break;
                case 13:
                    TiendaService.editarTienda();
                    break;
                case 14:
                    TiendaService.borrarTienda();
                    break;
                default:
                    System.out.println("<<<<<<<<<<<<<HASTA LUEGO>>>>>>>>>>>>>>");
                    break;
            }
        }while (opcion!=15);

    }
}

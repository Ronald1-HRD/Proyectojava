import java.util.Scanner;

public class LaptopService {
    public static void crearLaptop(){
        Scanner x=new Scanner(System.in);

        System.out.println("Escribe tu Marca: ");
        String marca=x.nextLine();

        System.out.println("Escribe tu Modelo: ");
        String modelo=x.nextLine();

        Laptop laptop=new Laptop();
        laptop.setMarca(marca);
        laptop.setModelo(modelo);
        LaptopDAO.crearLaptopBD(laptop);
    }
    public static void listarLaptops(){
        LaptopDAO.leerLaptopDB();

    }
    public static void borrarLaptop(){
        Scanner Ro =new Scanner(System.in);
        System.out.println("Indica el ID de la laptop a borrar: ");
        int id_laptop =Ro.nextInt();
        LaptopDAO.borrarLaptop(id_laptop);


    }
    public static void editarLaptop(){
        Scanner Ro =new Scanner(System.in);
        System.out.println("Escribe un nueva MARCA: ");
        String marca =Ro.nextLine();

        System.out.println("Escribe un nuevo MODELO: ");
        String modelo=Ro.nextLine();


        System.out.println("Indica el ID de laptop a editar: ");
        int id_laptop = Ro.nextInt();

        Laptop laptop = new Laptop();
        laptop.setMarca(marca);
        laptop.setModelo(modelo);
        laptop.setId(id_laptop);

        LaptopDAO.actualizarLaptop(laptop);

    }
}

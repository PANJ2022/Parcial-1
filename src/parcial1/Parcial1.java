//Autor: Paula Alejandra Navarro Jaimes
package parcial1;
import java.util.*;
public class Parcial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m= new Menu();
        int opc;
        
        System.out.println("--MENU--");
        System.out.println("1. Comida Rapida \n2. Bebidas \n3. Postres");
        opc = sc.nextInt();
        m.Home(opc);
        System.out.println(m.Home(opc));
        
        /*System.out.println("Seleccione una opcion: 0.Ninguno 1.Hamburguesa 2.Pizza 3.Perro caliente");
        opc = sc.nextInt();
        m.Principal(opc);
        System.out.println(m.Principal(opc));
        
        System.out.println("--MENU--");
        System.out.println("1. Coca-Cola \n2. Limonada \n3. Cerveza");
        opc = sc.nextInt();
        m.Bebida(opc);
        System.out.println(m.Bebida(opc));*/
    }
    
}

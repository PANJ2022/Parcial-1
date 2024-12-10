//
package parcial1;

public class Menu {
    Home h = new Home();
    Platillo p = new Platillo();
    Bebida b = new Bebida();
    Postre d = new Postre();
    String opcion="";
    public String Home(int n){
        
        
        
        switch(n){
            case 1:
                opcion = h.p;
            case 2:
                opcion = h.b;
            case 3:
                opcion = h.d;
        }
        return opcion;
    }
    
    
    public String Principal(int n){
        
        String plato = "";
        
        switch(n){
            case 1:
                plato = p.h;
            case 2:
                plato = p.p;
            case 3:
                plato = p.hd;
        }
        return plato;
    }
    
    public String Bebida(int n){
        
        String bebida = "";
        
        switch(n){
            case 1:
                bebida = b.cc;
            case 2:
                bebida = b.l;
            case 3:
                bebida = b.c;
        }
        return bebida;
    }
}
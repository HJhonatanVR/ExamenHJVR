package pe.edu.upeu.hjvr;

import pe.edu.upeu.hjvr.examen.ResolucionExamen;
import pe.edu.upeu.hjvr.utils.LeerTeclado;

public class App 
{
    public static void main( String[] args ){
        System.out.println("****MENU DE OPCIONES****");    
        try {
            LeerTeclado teclado=new LeerTeclado();            
            char opcion='S'; 
            int num=0;
            do{            
                num=teclado.hjvr(0,
                "Digite el N°  de ejercicio que desea probar:\n"+
                "1: Ejercicio 02\n"+
                "2: Ejercicio 03\n"+
                "3: Ejercicio 04\n"+
                "4: Ejercicio 05\n");
                
                ResolucionExamen hjvr=new ResolucionExamen();
                
                switch(num){
                    case 1: hjvr.ImpuestoAuto(); break;  
                    case 2: hjvr.TablaMulti(); break;
                    case 3: hjvr.NumPerfect(); break;
                    case 4: hjvr.Recursividad(); break;                 
                    default: System.out.println("La opcion no existe"); break;
                }
        
                opcion=teclado.hjvr(' ', "Desea seguir ejecutando mas ejercicios S/N?");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }

    }

}

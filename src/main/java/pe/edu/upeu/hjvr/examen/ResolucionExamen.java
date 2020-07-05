package pe.edu.upeu.hjvr.examen;
import pe.edu.upeu.hjvr.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado leer=new LeerTeclado();


    public void ImpuestoAuto(){

        int i;
        double cat1, cat2, cat3, impuesto, TotalPagoVehiculos;
    
        cat1 = 0;
        cat2 = 0;
        cat3 = 0;
        TotalPagoVehiculos = 0;
        
        int num=leer.hjvr(1, "Ingrese el N° de vehiculos que posee:");

            for (i=1; i<=num; i++) {
                System.out.println("Vehiculo N°" +i);

                double categoria=leer.hjvr(0, "Digite la categoria a la que pertecence:");

                double precio=leer.hjvr(0,"Digite su precio:");
            
                impuesto=0;
                if(categoria==1)
                {
                    impuesto=precio*0.1;
                    cat1=cat1+impuesto;
                }
                else if(categoria==2)
                {
                    impuesto=precio*0.07;
                    cat2=cat2+impuesto;
                }
                else if(categoria==3)
                {
                    impuesto=precio*0.05;
                    cat3=cat3+impuesto;
                }else{
                    System.out.println("Ingrese la categoria correcta!");
                  }

                TotalPagoVehiculos=TotalPagoVehiculos+impuesto;
                System.out.println("El impuesto a pagar es: " + impuesto);
                System.out.println();
            }
                System.out.println("Total a pagar por la cat1 es: " + cat1);
                System.out.println("total a pagar por la cat2: " + cat2);
                System.out.println("Total a pagar por la cat3: " + cat3);
                System.out.println("Total a pagar por sus vehiculos es: " + TotalPagoVehiculos);

    }

    public void TablaMulti(){
        System.out.println("TABLA DE MULTIPLICAR DEL 1 AL 20");

        for(int multiplicador=1; multiplicador<=20; multiplicador++){
            System.out.println();
            System.out.println("        Tabla del "+multiplicador);
        for(int multiplicando=1; multiplicando<=10; multiplicando++){
            System.out.println("\t"+multiplicando+" x "+multiplicador+" = "+multiplicando*multiplicador);
        }
        }
    }

    public void NumPerfect(){
        int i=1, c=0, d;
        int num=leer.hjvr(0, "Cuantos numeros perfectos desea ver?");
        System.out.println();
        
		do {
			d=0;
            i=i+1;
            
			for (int n=1; n<=i-1; n++) {
				if ((i%n)==0) {
					d=d+n;
				}
            }
            
			if (d==i) {
				c=c+1;
				System.out.println(i);
			}
		} while (c!=num);
    }

    public void Recursividad(){
       int x=leer.hjvr(0,"Ingrese el numero base que desea calcular:");
       int n=leer.hjvr(0,"Ingrese el exponente del numero base:");

       System.out.println("Resultado:"+potencia(x,n));

    }
    public static int potencia(int x, int n){
        if(n==0) return 1;
        return x * potencia(x,n-1);
    }
}
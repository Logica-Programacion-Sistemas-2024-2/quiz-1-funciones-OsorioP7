package quiz1sistemas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese tipo de boleta: \n1: V \n2: G");
        String TipoDeboleta = sc.nextLine();
        
        
        System.out.println("cuantas boletas desea comprar: ");
        int CantidadBoletas = sc.nextInt();
        
        System.out.println("ingrese el numero del combo \n1: 1 \n2: 2 \n3: 3 ");
        int numeroCombo = sc.nextInt();

        System.out.println("cuantos combos compro: ");
        int cantidadCombos = sc.nextInt();

    }


/*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */


    public static int calcularValorBoleta(String TipoDeboleta, int CantidadBoletas){

        try {
int valorBoleta = 0;
            
            if (CantidadBoletas > 0) { 
                
                switch (TipoDeboleta) {
                   
                    case "V":

                        valorBoleta = 15000;

                       break; 

                    case "G": 

                        valorBoleta = 10000;
                        
            
                        break;
                
                    default:
                        System.out.println("no eligio boleta");

                        break;

                        
            
                }
                
                

            }
            else {
                System.out.println("no es valido");

            }
            int valortotalboletas = CantidadBoletas * valorBoleta;

                return valortotalboletas;
           
        } catch (Exception e) {

            return -1;
        }
        
    }


    
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    
        public static int calcularValorNetoCombo(int numeroCombo, int cantidadCombos){

            int valorcombo = 0;
            try {
                if (cantidadCombos > 0 ) {

                    switch (numeroCombo) {
                        case 1: valorcombo = 40000; 
                            
                            break;
                        case 2: valorcombo = 30000;

                            break; 

                        case 3: valorcombo = 42000;

                        break;


                        default:

                            System.out.println("ERROR");
                            break;
                    }
                    
                }

                else{

                    System.out.println("error");
                }
                
                int valorNetoCombo = valorcombo * cantidadCombos;
            
                return valorNetoCombo;

            } catch (Exception e) {
                
                return -1;

            }


        }







    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            -un entero que representa el tipo de combo 
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    
        public static int calcularDescuento (String TipoDeboleta, int tipoCombo, int valorNetoCombo ){
            

            int descuento = 0;
      try {
        
        switch (tipoCombo) {
            case 1: 
            
            descuento = (int)(valorNetoCombo * 0.05);
                
                break;
        
            default:
                break;
        }


        return 0;

      } catch (Exception e) {
        
        return -1;  
      }









    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}

}

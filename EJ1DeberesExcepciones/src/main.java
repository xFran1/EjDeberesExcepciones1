/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String respuesta = " ";

                                        try{

Scanner s = new Scanner(System.in);
        boolean salir = false;
        int operador1 =0;
        int operador2 =0;
        
        do{

            System.out.println("----------------------------------");
                       System.out.println("1.Introduce operadores\n2.Suma\n3.Resta\n4.Multiplicación\n5.División\n6.Salir");
                       int option = s.nextInt();
                    int num;

                       switch (option) {
                case 1:

                    
                   
                    System.out.println("Introduce número 1:");
                    operador1=s.nextInt();
                    System.out.println("Introduce número 2:");
                    operador2=s.nextInt();
                   
                    break;
                case 2:
                    int suma = operador1+operador2;
                    respuesta= String.valueOf(suma);
                    suma(operador1,operador2);
                                        System.out.println("Resultado: "+respuesta);

                   
                    break;
                case 3:
                         int resta= operador1-operador2;
                    resta(operador1,operador2);
                    respuesta=String.valueOf(resta);
                     System.out.println("Resultado: "+respuesta);

                    
                    
                    
                    break;
                case 4:

                    int multiplicacion = operador1*operador2;
                    respuesta=String.valueOf(multiplicacion);
                        multiplicacion(operador2);
                                            System.out.println("Respuesta: "+respuesta);

                    
                    break;
                case 5:
                  
                         int division = operador1/operador2;
                         respuesta=String.valueOf(division);
                                                                     System.out.println("Respuesta: "+respuesta);


        
                         division(operador2);

               
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while(!salir);
             }catch(ArithmeticException e){
                        System.out.println("No se puede dividir entre cero");
                    }catch(ExceptionDivision ex){
                        respuesta=ex.getMessage();
                                                                        System.out.println("Error: "+respuesta);

                    }catch(ExcepcionMultiplicacion ex){
                        respuesta=ex.getMessage();
                                                System.out.println("Error: "+respuesta);

                    }catch(ExcepcionResta ex){
                        respuesta=ex.getMessage();
                        System.out.println("Error: "+respuesta);

                    }catch(ExcepcionSuma ex){
                        respuesta=ex.getMessage();
                                            System.out.println("Error: "+respuesta);

                     }catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
    }
 
    static void resta(int num1, int num2) throws ExcepcionResta{
 if(num2>num1){
 throw new ExcepcionResta("Operación no posible: "+num2+" mayor que "+num1);
 }
 } 
    
    static void suma(int num1, int num2) throws ExcepcionSuma{
 int suma = num1+num2;
        if(suma>1000){
 throw new ExcepcionSuma("Suma demasiado grande");
 }
 } 
    
    static void multiplicacion( int num2) throws ExcepcionMultiplicacion{
 
        if(num2==30){
 throw new ExcepcionMultiplicacion("No puede multiplicarse por el valor 30");
 }
 } 
    
    static void division( int num2) throws ExceptionDivision{
 
        if(num2==38){
 throw new ExceptionDivision("El segundo operador no puede ser 38");
 }
 } 
    
    
}



  



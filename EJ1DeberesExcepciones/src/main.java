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
Scanner s = new Scanner(System.in);
        boolean salir = false;
        int operador1 =0;
        int operador2 =0;
        String respuesta = "";
        
        do{
            System.out.println("----------------------------------");
                       System.out.println("1.Introduce operadores\n2.Suma\n3.Resta\n4.Multiplicación\n5.División\n6.Salir");
                       int option = s.nextInt();
                    int num;

                       switch (option) {
                case 1:

                    
                    try{
                   
                    System.out.println("Introduce número 1:");
                    operador1=s.nextInt();
                    System.out.println("Introduce número 2:");
                    operador2=s.nextInt();
                    }catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
                    break;
                case 2:
                    try{
                    int suma = operador1+operador2;
                    respuesta= String.valueOf(suma);
                    suma(operador1,operador2);
                    }catch(ExcepcionSuma ex){
                        respuesta=ex.getMessage();
                    }
                    System.out.println("Resultado: "+respuesta);
                    break;
                case 3:
                    try{
                         int resta= operador1-operador2;
                    resta(operador1,operador2);
                    respuesta=String.valueOf(resta);
                    
                    }catch(ExcepcionResta ex){
                        respuesta=ex.getMessage();
                    }
                    System.out.println("Resultado: "+respuesta);
                    
                    break;
                case 4:

                    try{
                    int multiplicacion = operador1*operador2;
                    respuesta=String.valueOf(multiplicacion);
                        multiplicacion(operador2);
                    }catch(ExcepcionMultiplicacion ex){
                        respuesta=ex.getMessage();
                    }
                    System.out.println("Respuesta: "+respuesta);
                    break;
                case 5:
                    try{
                         int division = operador1/operador2;
                         respuesta=String.valueOf(division);

        
                         division(operador2);

                    }catch(ArithmeticException e){
                        System.out.println("No se puede dividir entre cero");
                    }catch(ExceptionDivision ex){
                        respuesta=ex.getMessage();
                    }
                  System.out.println(respuesta);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while(!salir);
        
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



  



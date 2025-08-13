/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */




/**
 *
 * @author ESTUDIANTES
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la nota1: ");
        double nota1 = lector.nextDouble();
        System.out.println("ingrese la nota2: ");
        double nota2 = lector.nextDouble();
        System.out.println("ingrese la nota3: ");
        double nota3 = lector.nextDouble();
         
        double p1 = nota1*0.30;
        double p2 = nota2*0.30;
        double p3 = nota3*0.40;
         
        double nf = p1+p2+p3;
         
        if (nf >= 1 && nf <= 1.9 ) {
             System.out.println(" la calificacion es deficiente");
        }
        else if (nf >= 2 && nf <= 2.9) {
            System.out.println("la calificacion es insuficiente");
             
        }
        else if (nf >= 3 && nf <= 4) {
        System.out.println("la calificacion es aprovada");
             }
         
        else{
         System.out.println("la calificacion es descatada");
         }
            
             
         
                 
         
         
        
        
        
         
         
         
    }
    
}

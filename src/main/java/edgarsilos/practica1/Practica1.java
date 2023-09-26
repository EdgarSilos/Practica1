package edgarsilos.practica1;
import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float num01,num02,res;
        System.out.print("ingresa el primer numero; ");
        num01=leer.nextFloat();
        System.out.print("ingresa el segundo numero; ");
        num02=leer.nextFloat();
        res=num01+num02;
        System.out.print("la suma es: "+res);
         }
}

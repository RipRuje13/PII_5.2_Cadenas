/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasdos;

import java.util.Scanner;

/**
 *
 * @author Noriega
 */
public class CadenasDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i,j;
        String cad,invertida="";
        System.out.println("Ingresa la palabra a invertir");
        cad=sc.nextLine();
        //cad=cad.toLowerCase(); al ultimo
        String array[]=cad.split(" ");
        for(i=0;i<array.length;i++){
            char a[]=array[i].toCharArray();
            for(j=a.length-1;j>=0;j--){
                invertida+=a[j];
            }
            invertida+=" ";
        }
        System.out.println(invertida);
    }
    
}

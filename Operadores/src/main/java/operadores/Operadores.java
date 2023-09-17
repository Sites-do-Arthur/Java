/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadores;

/**
 *
 * @author Win10
 */
public class Operadores {

    public static void main(String[] args) {
        /*int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?0:1;
        System.out.println(r);*/
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio1;

import java.util.Random;

/**
 *
 * @author evilnaps1s
 */
public class Aleatorio1 {

    /**
     * @param args the command line arguments
     */
    public static int getr(int min, int max){
        Random r = new Random();
        int random = min + (int)( Math.random()* (max - min) +1 );
        return random;
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(random);
        new Aleator10().setVisible(true);
    }
}

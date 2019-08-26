/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author monic
 */
public class HolaMundo {

    
    
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        //Pido una cadena y me exporta la libreria de JOptionPane
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        //Transformo todo a un entero para poder guardar un entero en un string
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        //Con el (0) guardo un caracter
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal"));
        
        //Input es para ingresar o entrar datos
                
        JOptionPane.showMessageDialog(null,"La cadena es "+cadena);
        JOptionPane.showMessageDialog(null,"El numero entero es "+entero);
        JOptionPane.showMessageDialog(null,"El caracter es "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es "+decimal);
        //A diferencia de consola, los decimales los tengo que ingresar con punto
        
        
    }
    
    }
    
}

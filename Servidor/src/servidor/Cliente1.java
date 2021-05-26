/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Cliente1 {
   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       try{
           var miRegistro = LocateRegistry.getRegistry("localhost", 1099);
           Calculadora c = (Calculadora)Naming.lookup("Calculadora");
           
           while (true) {
               String menu = JOptionPane.showInputDialog("Calculadora"
                       + "Suma... (1)\n"
                       + "Resta... (2)\n"
                       + "Multiplicacion... (3)\n"
                       + "Division... (4)\n"
                       + "Cancelar para salir");
                  switch(menu){
                      case "1":{
                          int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          JOptionPane.showMessageDialog(null,"la suma es:" +c.add(x,y));
                          break;
                      }  
                      case "2":{
                          int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          JOptionPane.showMessageDialog(null,"la resta es:" +c.sub(x,y));
                          break;
                      }
                      case "3":{
                          int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          JOptionPane.showMessageDialog(null,"la multiplicacion es:" +c.mul(x,y));
                          break;
                      }
                      case "4":{
                          int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                          JOptionPane.showMessageDialog(null,"la division es:" +c.div(x,y));
                          break;
                      }
                  }     
                       
           }
       }catch(Exception e){
           System.out.println("Servidor no conectado" + e);
       }
   }   
}


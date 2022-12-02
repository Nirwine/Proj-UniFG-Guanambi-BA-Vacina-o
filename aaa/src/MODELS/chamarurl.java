/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELS;

/**
 *
 * @author jvfs2
 */

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;


public class chamarurl {
          public String URI(){
    try{
            URI link = new URI("www.google.com");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            JOptionPane.showInputDialog("Site inexistente");
        }
              return null;
    }
}



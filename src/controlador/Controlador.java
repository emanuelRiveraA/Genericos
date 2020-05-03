/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Circulo;
import modelo.FiguraCirculo;
import vista.Vista;

/**
 *
 * @author Idalia
 */
public class Controlador implements ActionListener{

    //vamos a asociar las clases como se nos venga en gana
    private Vista vista;
    private Circulo c;
    private FiguraCirculo fc;
    
    public Controlador(Vista v){
        //Asociacion con la vista
        this.vista=v;
    }
    
    public void iniciar(String titulo){
        
        //pa darle titulo a la vista
        vista.setTitle(titulo);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        asignarControl();
    }
    
    //Tomar control de los elementod de la vista
    private void asignarControl(){
        
        //
        vista.getBtn_calcular().addActionListener(this);
        vista.getBtn_salir().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.getBtn_calcular()) calcular();        
        else System.exit(0);
        
    }
    
    private void calcular(){
        double radio = Double.parseDouble(vista.getTxt_Radio().getText());
        
        c = new Circulo("circulo",radio);
        
        fc = new FiguraCirculo();
        
        vista.getLbl_Area().setText("Area= "+ fc.calcularArea(c));
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Idalia
 */
public class FiguraCirculo implements Figura<Circulo>{

    @Override
    public double calcularPerimetro(Circulo obj) {
        return Math.PI * obj.getRadio();
    }

    @Override
    public double calcularArea(Circulo obj) {
        return Math.PI * Math.pow(obj.getRadio(), 2);
    }

    @Override
    public List<Circulo> ListarFiguras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

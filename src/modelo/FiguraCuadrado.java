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
public class FiguraCuadrado implements Figura<Cuadrado>{

    @Override
    public double calcularPerimetro(Cuadrado obj) {
        return obj.getLado() * 4;
    }

    @Override
    public double calcularArea(Cuadrado obj) {
        return obj.getLado() * obj.getLado();
    }

    @Override
    public List<Cuadrado> ListarFiguras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

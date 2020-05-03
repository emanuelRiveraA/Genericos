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
public interface Figura <T> {
    
    
    double calcularPerimetro(T obj);
    double calcularArea(T obj);
    List<T>ListarFiguras();
    
    
}

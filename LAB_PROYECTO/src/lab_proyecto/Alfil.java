/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_proyecto;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Alfil extends Pieza{

    public Alfil(int posx, int posy, Color color, String nombre, boolean activa) {
        super(posx, posy, color, nombre, activa);
    }

    

    @Override
    boolean moverse(int x1, int y1, int x2, int y2,Object[][]mat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean comer(int x1, int y1, int x2, int y2,Object[][]mat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_proyecto;

/**
 *
 * @author User
 */
public class Rey extends Pieza{

    public Rey(int posx, int posy, String color, String nombre, boolean activa) {
        super(posx, posy, color, nombre, activa);
    }

    @Override
    boolean moverse(int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean comer(int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

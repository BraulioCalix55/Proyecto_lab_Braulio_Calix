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
public class Peon extends Pieza {

    private int cont  = 0;

    public Peon(int posx, int posy, String color, String nombre, boolean activa) {
        super(posx, posy, color, nombre, activa);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    

    @Override
    boolean moverse(int x1, int y1, int x2, int y2) {
        return true;
    }

    @Override
    boolean comer(int x1, int y1, int x2, int y2) {
        return true;
    }

}

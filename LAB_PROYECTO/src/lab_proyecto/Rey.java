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
public class Rey extends Pieza {

    public Rey(int posx, int posy, Color color, String nombre, boolean activa) {
        super(posx, posy, color, nombre, activa);
    }

    @Override
    boolean moverse(int x1, int y1, int x2, int y2, Object[][] mat) {
        boolean mover = false;
        int x = 0;
        int y = 0;
        if (mat[x2][y2].equals("") || !((Pieza) mat[x2][y2]).getColor().equals(((Pieza) mat[x1][y1]).getColor())) {
            if ((x = x1 - 1) == x2 && (y = y1 - 1) == y2) {
                mover = true;
            }
            if ((x = x1 + 1) == x2 && ((y = y1 + 1) == y2)) {
                mover = true;
            }
            if (((x = x1) == x2 && ((y = y1 - 1) == y2))) {
                mover = true;
            }
            if ((x = x1 + 1) == x2 && ((y = y1) == y2)) {
                mover = true;
            }
            if ((x = x1) == x2 && ((y = y1 + 1) == y2)) {
                mover = true;
            }
            if ((x = x1 - 1) == x2 && ((y = y1) == y2)) {
                mover = true;
            }
            if ((x = x1 - 1) == x2 && ((y = y1 + 1) == y2)) {
                mover = true;
            }
            if ((x = x1 - 1) == x2 && ((x = x1 + 1) == x2)) {
                mover = true;
            }
        } else if (((Pieza) mat[x2][y2]).getColor().equals(((Pieza) mat[x1][y1]).getColor())) {

        }
        return mover;

    }

    @Override
    boolean comer(int x1, int y1, int x2, int y2, Object[][] mat) {
        boolean comer = moverse(x1, y1, x2, y2, mat);
        return comer;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}

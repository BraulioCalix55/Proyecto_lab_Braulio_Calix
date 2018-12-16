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
public class Peon extends Pieza {

    private int cont = 0;

    public Peon(int posx, int posy, Color color, String nombre, boolean activa) {
        super(posx, posy, color, nombre, activa);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    boolean moverse(int x1, int y1, int x2, int y2, Object[][] mat) {
        boolean mover = false;
        int x = 0;
        int y = 0;
        if (((Pieza) mat[x1][y1]).getColor().equals(Color.black)) {
            System.out.println(mover);
            if (((Peon) mat[x1][y1]).getCont() == 0) {
                if ((y = y1) == y2 && ((x = x1 + 2) == x2)) {
                    mover = true;
                    System.out.println(mover);
                    ((Peon) mat[x1][y2]).setCont(1);
                }if ((y = y1) == y2 && ((y = y1 + 1) == y2)) {
                    mover = true;
                    System.out.println(mover + "" + mover);
                }
            } else if (((Peon) mat[x1][y1]).getCont() == 1) {
                System.out.println("entra al 1");
                System.out.println(mover);
                
            }
        } else if (((Pieza) mat[x1][y1]).getColor().equals(Color.white)) {
            System.out.println("blanco");
            if (((Peon) mat[x1][y1]).getCont() == 0) {
                
                if ((y = y1) == y2 && (x = x1 - 2) == x2) {
                    mover = true;
                    ((Peon) mat[x1][y2]).setCont(1);
                    
                }if ((y = y1) == y2 && (x = x1 - 1) == x2) {
                    mover = true;
                }
            } else if (((Peon) mat[x1][y1]).getCont() == 1) {
                System.out.println("entra al 1");
                
                if ((y = y1) == y2 && (x = x1 - 1) == x2) {
                    mover = true;
                }
            }
        }
        return mover;
    }

    @Override
    boolean comer(int x1, int y1, int x2, int y2, Object[][] mat) {
        boolean come = false;
        int x = 0;
        int y = 0;
        if (((Pieza) mat[x1][y1]).getColor().equals(Color.black)) {
            if ((x = x1 - 1) == x2 && ((y = y1 + 1) == y2)) {
                come = true;
            }
            if ((x = x1 + 1) == x2 && ((y = y1 + 1) == y2)) {
                come = true;
            }
        } else if (((Pieza) mat[x1][y1]).getColor().equals(Color.white)) {
            if ((x = x1 - 1) == x2 && ((y = y1 - 1) == y2)) {
                come = true;
            }
            if ((x = x + 1) == x2 && ((y = y1 - 1) == y2)) {
                come = true;
            }
        }
        return come;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}

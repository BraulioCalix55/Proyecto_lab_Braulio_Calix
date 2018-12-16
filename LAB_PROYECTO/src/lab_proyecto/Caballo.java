package lab_proyecto;

import java.awt.Color;

public class Caballo extends Pieza {

    public Caballo(int posx, int posy, Color color, String nombre, boolean activa) {
        super(posx, posy, color, nombre, activa);
    }

    @Override
    boolean moverse(int x1, int y1, int x2, int y2, Object[][] mat) {
        boolean gen = false;
        boolean igual = false;
        int x;
        int y;
        if (mat[x2][y2].equals("") || !((Pieza) mat[x2][y2]).getColor().equals(((Pieza) mat[x1][y1]).getColor())) {
            System.out.println("x1+ "+x1);
            System.out.println("y1 "+y1);
            System.out.println("x2 "+x2);
            System.out.println("y2 "+y2);
            if ((x = x1 - 1) == x2 && ((y = y1 - 2) == y2)) {
                igual = true;
            }
            if ((x = x1 - 2) == x2 && ((y = y1 - 1) == y2)) {
                igual = true;
            }
            if ((x = x1 - 2) == x2 && ((y = y1 + 1) == y2)) {
                igual = true;
            }
            if ((x = x1 + 1) == x2 && ((y = y1 + 2) == y2)) {
                igual = true;
            }
            if ((x = x1 + 1) == x2 && ((y = y1 - 2) == y2)) {
                igual = true;
            }
            if ((x = x1 + 2) == x2 && ((y = y1 - 1) == y2)) {
                igual = true;
            }
            if ((x = x1 + 2) == x2 && ((y = y1 + 1) == y2)) {
                igual = true;
            }
            if ((x = x1 + 1) == x2 && ((y = y1 + 2) == y2)) {
                igual = true;
            }
        } else if (((Pieza) mat[x2][y2]).getColor().equals(((Pieza) mat[x1][y1]).getColor())) {

        }

        return igual;
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

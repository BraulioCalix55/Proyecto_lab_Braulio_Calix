/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public abstract class Pieza {

    private int posx;
    private int posy;
    private Color color;
    private String nombre;
    private boolean activa;
    

    public Pieza(int posx, int posy,Color color, String nombre, boolean activa) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.nombre = nombre;
        this.activa = activa;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    abstract boolean moverse(int x1, int y1, int x2, int y2,Object[][]mat);

    abstract boolean comer(int x1, int y1, int x2, int y2,Object[][]mat);

}

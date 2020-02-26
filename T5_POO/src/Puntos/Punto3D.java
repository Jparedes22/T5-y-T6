package Puntos;

import java.awt.*;

public class Punto3D extends Point {

    protected int z;

    public Punto3D(int z) {
        this.z = z;
    }

    public Punto3D(Point p, int z) {
        super(p);
        this.z = z;
    }

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    //METODOS

    public void move(int x, int y, int z) {
        super.move(x,y);
        this.z = z;
    }

    public void translate(int dx, int dy, int dz) {
        super.translate(dx,dy);
        this.z += dz;
    }

    public String toString() {
        return getClass().getName() + "[x=" + x + ",y=" + y + ",z=" + z + "]";
    }
}

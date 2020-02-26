package Puntos;

import java.awt.*;

public class Punto4D extends Punto3D {

    protected int j;

    public Punto4D(int z, int j) {
        super(z);
        this.j = j;
    }

    public Punto4D(Point p, int z, int j) {
        super(p, z);
        this.j = j;
    }

    public Punto4D(int x, int y, int z, int j) {
        super(x, y, z);
        this.j = j;
    }

    //METODOS

    public void move(int x, int y, int z, int j) {
        super.move(x, y, z);
        this.j = j;
    }

    public void translate(int dx, int dy, int dz, int dj) {
        super.translate(dx, dy, dz);
        this.j += dj;
    }

    public String toString() {
        return getClass().getName() + "[x=" + x + ",y=" + y + ",z=" + z + ", j=" + j + "]";
    }
}

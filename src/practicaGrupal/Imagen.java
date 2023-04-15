/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author alemg
 */
class Imagen extends javax.swing.JPanel {
    int x, y;

    public Imagen(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/icono-fondo.png"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    } 
}

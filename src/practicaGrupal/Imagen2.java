package practicaGrupal;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author alemg
 */
class Imagen2 extends javax.swing.JPanel {
    int x, y;

    public Imagen2(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/fondo-main.jpg"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }
}


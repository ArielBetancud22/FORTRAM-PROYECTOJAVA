
package img;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImgFondo extends JPanel {
    public ImgFondo(){
            this.setSize(700,500);
    }
    
     //Metodo
        @Override
        public void paint(Graphics g){
            ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("img//fondo1.jpg"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
               
        }
}

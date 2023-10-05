import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;

public class MP extends JApplet implements MouseMotionListener{

    Image m;
    
    int x, y ;
    float z, k;
    
    public void init(){
        
        setSize(1850,720);
        
        m = getImage(getCodeBase(),"pic.jpg");
        
        this.addMouseMotionListener(this);
        
    }
    public void paint(Graphics g){

        z =  (float) (1.5 * x);
        k =  (float) (1.5 * y);
        
        g.drawImage(m, 0, 0, 1280, 720, this);
        g.drawImage(m, 1350, 200, 1780, 600,(int) z , (int)  k ,   225 +  (int)z, 225 + (int)k, this);
        g.drawOval(x, y, 150, 150);
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getX() <= 1205 && e.getX() >= 75 && e.getY() >= 75 && e.getY() <= 645 ){
        x = e.getX() - 75 ;
        y = e.getY() - 75;
        }
        repaint();
    }

   
    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

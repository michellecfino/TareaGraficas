package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelLienzo extends JPanel {

    public PanelLienzo() {
        setSize(700, 700);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  
        Graphics2D g2d = (Graphics2D) g;

        
//        Yo asumo que la figura es un retrato, entonces el pequeño error que veo es que 
//        la cabeza y el borde del cuadro están en otro lugar así que
//        esa será la correción que haga
        
        Rectangle2D.Double rectangle = new Rectangle2D.Double(200, 50, 400, 400);
        g2d.setColor(Color.GRAY);
        g2d.fill(rectangle);

        
        Ellipse2D.Double elli = new Ellipse2D.Double(350, 60, 100, 70);
        g2d.setColor(Color.black);

        g2d.fill(elli);

        
        Rectangle2D.Double rectangle2 = new Rectangle2D.Double(390, 130, 20, 40);
        g2d.setColor(Color.black);
        g2d.fill(rectangle2);

        
        RoundRectangle2D.Double rectDob = new RoundRectangle2D.Double(320, 170, 25, 180, 20, 20);
        g2d.setColor(Color.black);
        g2d.fill(rectDob);

        
        Rectangle2D.Double rect3 = new Rectangle2D.Double(335, 170, 130, 40);
        g2d.setColor(Color.black);
        g2d.fill(rect3);

        RoundRectangle2D.Double recDob2 = new RoundRectangle2D.Double(345, 200, 15, 40, 20, 20);
        g2d.setColor(Color.gray);
        g2d.fill(recDob2);

        RoundRectangle2D.Double recDob3 = new RoundRectangle2D.Double(440, 200, 15, 40, 20, 20);
        g2d.setColor(Color.gray);
        g2d.fill(recDob3);

        
        Rectangle2D.Double rect4 = new Rectangle2D.Double(360, 170, 80, 180);
        g2d.setColor(Color.black);
        g2d.fill(rect4);

        	
        RoundRectangle2D.Double recDob4 = new RoundRectangle2D.Double(360, 330, 35, 180, 20, 20);
        g2d.setColor(Color.black);
        g2d.fill(recDob4);

        RoundRectangle2D.Double recDob5 = new RoundRectangle2D.Double(405, 330, 35, 180, 20, 20);
        g2d.setColor(Color.black);
        g2d.fill(recDob5);

//        le faltaba un bracito
        RoundRectangle2D.Double recDob6 = new RoundRectangle2D.Double(455, 170, 25, 180, 20, 20);
        g2d.setColor(Color.black);
        g2d.fill(recDob6);
        

//        El poligono que usa arrays
        int x[] = {230, 250, 550, 570};  
        int y[] = {550, 500, 500, 550};  
        Polygon poligono = new Polygon(x, y, 4);  
        g2d.setColor(Color.CYAN);
        g2d.fill(poligono);

        
//        Reto 1
//        Un pez mascota
        g2d.setColor(Color.CYAN); //Pecera
        g2d.fillOval(200, 200, 100, 100);
        g2d.setColor(Color.ORANGE); //Cuerpo del pez
        g2d.fillOval(235, 235, 30, 30);
        int[] xpez = {235, 205, 205};  
        int[] ypez = {250, 240, 260};  
        Polygon cola = new Polygon(xpez, ypez, 3); //Triángulo para la cola del pez
        g2d.setColor(Color.ORANGE);
        g2d.fill(cola);
        g2d.setColor(Color.GREEN);//Mesa para la pecera (buscar color café)
        g2d.fillRect(200, 300, 101, 20);
        g2d.setColor(Color.BLACK); //Patas de la mesa
        g2d.fillRect(200, 320, 20, 180);  
        g2d.fillRect(280, 320, 20, 180);  
  

        
//        RETO 2
//        Para la estrella haré un cuaddrado amarillo con 4 circulos blancos
//        y lo que quede entre la unión de los bordes de los círculos será
//        la forma de la estrella
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(0, 0, 100, 100);  

        g2d.setColor(Color.WHITE);
        g2d.fillOval(0,0, 50, 50);
        g2d.fillOval(50, 50, 50, 50);
        g2d.fillOval(50, 0, 50, 50);
        g2d.fillOval(0, 50, 50, 50);
//        estos rectangulos son para ocultar los otros espacios vacios que dejan los circulos
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 25, 100);
        g2d.fillRect(0, 0, 100, 25);
        g2d.fillRect(75, 0, 25, 100);
        g2d.fillRect(0, 75, 100, 25);



    }
        
}

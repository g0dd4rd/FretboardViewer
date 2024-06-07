import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.image.BufferedImage;

import java.io.IOException;

import java.net.MalformedURLException;

import java.util.Hashtable;

import javax.imageio.ImageIO;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FretboardViewer extends JComponent implements MouseListener {
  private JPanel buttonPanel = new JPanel();

  BufferedImage background;

  Rectangle e0 = new Rectangle(6, 12, 50, 20);
  Rectangle e1 = new Rectangle(70, 12, 42, 20);
  Rectangle e2 = new Rectangle(132, 12, 36, 20);
  Rectangle e3 = new Rectangle(190, 12, 35, 20);
  Rectangle e4 = new Rectangle(246, 12, 32, 20);
  Rectangle e5 = new Rectangle(301, 12, 31, 20);
  Rectangle e6 = new Rectangle(357, 12, 29, 20);
  Rectangle e7 = new Rectangle(410, 12, 27, 20);
  Rectangle e8 = new Rectangle(462, 12, 27, 20);
  Rectangle e9 = new Rectangle(513, 12, 25, 20);
  Rectangle e10 = new Rectangle(564, 12, 23, 20);
  Rectangle e11 = new Rectangle(612, 12, 23, 20);
  Rectangle e12 = new Rectangle(660, 12, 22, 20);
  Rectangle e13 = new Rectangle(708, 12, 22, 20);
  Rectangle e14 = new Rectangle(755, 12, 21, 20);
  Rectangle e15 = new Rectangle(799, 12, 21, 20);
  Rectangle e16 = new Rectangle(843, 12, 21, 20);
  Rectangle e17 = new Rectangle(886, 12, 20, 20);
  Rectangle e18 = new Rectangle(926, 12, 21, 20);
  Rectangle e19 = new Rectangle(967, 12, 21, 20);
  Rectangle e20 = new Rectangle(1007, 12, 20, 20);
  Rectangle e21 = new Rectangle(1045, 12, 20, 20);
  Rectangle e22 = new Rectangle(1082, 12, 20, 20);
  Rectangle e23 = new Rectangle(1119, 12, 20, 20);
  Rectangle e24 = new Rectangle(1154, 12, 20, 20);

  Rectangle b0 = new Rectangle(6, 52, 50, 20);
  Rectangle b1 = new Rectangle(70, 52, 42, 20);
  Rectangle b2 = new Rectangle(132, 52, 36, 20);
  Rectangle b3 = new Rectangle(190, 52, 35, 20);
  Rectangle b4 = new Rectangle(246, 52, 32, 20);
  Rectangle b5 = new Rectangle(301, 52, 31, 20);
  Rectangle b6 = new Rectangle(357, 52, 29, 20);
  Rectangle b7 = new Rectangle(410, 52, 27, 20);
  Rectangle b8 = new Rectangle(462, 52, 27, 20);
  Rectangle b9 = new Rectangle(513, 52, 25, 20);
  Rectangle b10 = new Rectangle(564, 52, 23, 20);
  Rectangle b11 = new Rectangle(612, 52, 23, 20);
  Rectangle b12 = new Rectangle(660, 52, 22, 20);
  Rectangle b13 = new Rectangle(708, 52, 22, 20);
  Rectangle b14 = new Rectangle(755, 52, 21, 20);
  Rectangle b15 = new Rectangle(799, 52, 21, 20);
  Rectangle b16 = new Rectangle(843, 52, 21, 20);
  Rectangle b17 = new Rectangle(886, 52, 20, 20);
  Rectangle b18 = new Rectangle(926, 52, 21, 20);
  Rectangle b19 = new Rectangle(967, 52, 21, 20);
  Rectangle b20 = new Rectangle(1007, 52, 20, 20);
  Rectangle b21 = new Rectangle(1045, 52, 20, 20);
  Rectangle b22 = new Rectangle(1082, 52, 20, 20);
  Rectangle b23 = new Rectangle(1119, 52, 20, 20);
  Rectangle b24 = new Rectangle(1154, 52, 20, 20);

  Rectangle g0 = new Rectangle(6, 90, 50, 20);
  Rectangle g1 = new Rectangle(70, 90, 42, 20);
  Rectangle g2 = new Rectangle(132, 90, 36, 20);
  Rectangle g3 = new Rectangle(190, 90, 35, 20);
  Rectangle g4 = new Rectangle(246, 90, 32, 20);
  Rectangle g5 = new Rectangle(301, 90, 31, 20);
  Rectangle g6 = new Rectangle(357, 90, 29, 20);
  Rectangle g7 = new Rectangle(410, 90, 27, 20);
  Rectangle g8 = new Rectangle(462, 90, 27, 20);
  Rectangle g9 = new Rectangle(513, 90, 25, 20);
  Rectangle g10 = new Rectangle(564, 90, 23, 20);
  Rectangle g11 = new Rectangle(612, 90, 23, 20);
  Rectangle g12 = new Rectangle(660, 90, 22, 20);
  Rectangle g13 = new Rectangle(708, 90, 22, 20);
  Rectangle g14 = new Rectangle(755, 90, 21, 20);
  Rectangle g15 = new Rectangle(799, 90, 21, 20);
  Rectangle g16 = new Rectangle(843, 90, 21, 20);
  Rectangle g17 = new Rectangle(886, 90, 20, 20);
  Rectangle g18 = new Rectangle(926, 90, 21, 20);
  Rectangle g19 = new Rectangle(967, 90, 21, 20);
  Rectangle g20 = new Rectangle(1007, 90, 20, 20);
  Rectangle g21 = new Rectangle(1045, 90, 20, 20);
  Rectangle g22 = new Rectangle(1082, 90, 20, 20);
  Rectangle g23 = new Rectangle(1119, 90, 20, 20);
  Rectangle g24 = new Rectangle(1154, 90, 20, 20);

  Rectangle D0 = new Rectangle(6, 129, 50, 20);
  Rectangle D1 = new Rectangle(70, 129, 42, 20);
  Rectangle D2 = new Rectangle(132, 129, 36, 20);
  Rectangle D3 = new Rectangle(190, 129, 35, 20);
  Rectangle D4 = new Rectangle(246, 129, 32, 20);
  Rectangle D5 = new Rectangle(301, 129, 31, 20);
  Rectangle D6 = new Rectangle(357, 129, 29, 20);
  Rectangle D7 = new Rectangle(410, 129, 27, 20);
  Rectangle D8 = new Rectangle(462, 129, 27, 20);
  Rectangle D9 = new Rectangle(513, 129, 25, 20);
  Rectangle D10 = new Rectangle(564, 129, 23, 20);
  Rectangle D11 = new Rectangle(612, 129, 23, 20);
  Rectangle D12 = new Rectangle(660, 129, 22, 20);
  Rectangle D13 = new Rectangle(708, 129, 22, 20);
  Rectangle D14 = new Rectangle(755, 129, 21, 20);
  Rectangle D15 = new Rectangle(799, 129, 21, 20);
  Rectangle D16 = new Rectangle(843, 129, 21, 20);
  Rectangle D17 = new Rectangle(886, 129, 20, 20);
  Rectangle D18 = new Rectangle(926, 129, 21, 20);
  Rectangle D19 = new Rectangle(967, 129, 21, 20);
  Rectangle D20 = new Rectangle(1007, 129, 20, 20);
  Rectangle D21 = new Rectangle(1045, 129, 20, 20);
  Rectangle D22 = new Rectangle(1082, 129, 20, 20);
  Rectangle D23 = new Rectangle(1119, 129, 20, 20);
  Rectangle D24 = new Rectangle(1154, 129, 20, 20);

  Rectangle A0 = new Rectangle(6, 169, 50, 20);
  Rectangle A1 = new Rectangle(70, 169, 42, 20);
  Rectangle A2 = new Rectangle(132, 169, 36, 20);
  Rectangle A3 = new Rectangle(190, 169, 35, 20);
  Rectangle A4 = new Rectangle(246, 169, 32, 20);
  Rectangle A5 = new Rectangle(301, 169, 31, 20);
  Rectangle A6 = new Rectangle(357, 169, 29, 20);
  Rectangle A7 = new Rectangle(410, 169, 27, 20);
  Rectangle A8 = new Rectangle(462, 169, 27, 20);
  Rectangle A9 = new Rectangle(513, 169, 25, 20);
  Rectangle A10 = new Rectangle(564, 169, 23, 20);
  Rectangle A11 = new Rectangle(612, 169, 23, 20);
  Rectangle A12 = new Rectangle(660, 169, 22, 20);
  Rectangle A13 = new Rectangle(708, 169, 22, 20);
  Rectangle A14 = new Rectangle(755, 169, 21, 20);
  Rectangle A15 = new Rectangle(799, 169, 21, 20);
  Rectangle A16 = new Rectangle(843, 169, 21, 20);
  Rectangle A17 = new Rectangle(886, 169, 20, 20);
  Rectangle A18 = new Rectangle(926, 169, 21, 20);
  Rectangle A19 = new Rectangle(967, 169, 21, 20);
  Rectangle A20 = new Rectangle(1007, 169, 20, 20);
  Rectangle A21 = new Rectangle(1045, 169, 20, 20);
  Rectangle A22 = new Rectangle(1082, 169, 20, 20);
  Rectangle A23 = new Rectangle(1119, 169, 20, 20);
  Rectangle A24 = new Rectangle(1154, 169, 20, 20);

  Rectangle E0 = new Rectangle(6, 208, 50, 20);
  Rectangle E1 = new Rectangle(70, 208, 42, 20);
  Rectangle E2 = new Rectangle(132, 208, 36, 20);
  Rectangle E3 = new Rectangle(190, 208, 35, 20);
  Rectangle E4 = new Rectangle(246, 208, 32, 20);
  Rectangle E5 = new Rectangle(301, 208, 31, 20);
  Rectangle E6 = new Rectangle(357, 208, 29, 20);
  Rectangle E7 = new Rectangle(410, 208, 27, 20);
  Rectangle E8 = new Rectangle(462, 208, 27, 20);
  Rectangle E9 = new Rectangle(513, 208, 25, 20);
  Rectangle E10 = new Rectangle(564, 208, 23, 20);
  Rectangle E11 = new Rectangle(612, 208, 23, 20);
  Rectangle E12 = new Rectangle(660, 208, 22, 20);
  Rectangle E13 = new Rectangle(708, 208, 22, 20);
  Rectangle E14 = new Rectangle(755, 208, 21, 20);
  Rectangle E15 = new Rectangle(799, 208, 21, 20);
  Rectangle E16 = new Rectangle(843, 208, 21, 20);
  Rectangle E17 = new Rectangle(886, 208, 20, 20);
  Rectangle E18 = new Rectangle(926, 208, 21, 20);
  Rectangle E19 = new Rectangle(967, 208, 21, 20);
  Rectangle E20 = new Rectangle(1007, 208, 20, 20);
  Rectangle E21 = new Rectangle(1045, 208, 20, 20);
  Rectangle E22 = new Rectangle(1082, 208, 20, 20);
  Rectangle E23 = new Rectangle(1119, 208, 20, 20);
  Rectangle E24 = new Rectangle(1154, 208, 20, 20);

  Rectangle[] rects = {e0, e1, e2, e3, e4, e5, 
                       e6, e7, e8, e9,e10,e11,
                       e12,e13,e14,e15,e16,e17,
                       e18,e19,e20,e21,e22,e23,e24,
                       
                       b0, b1, b2, b3, b4, b5,
                       b6, b7, b8, b9, b10,b11,
                       b12,b13,b14,b15,b16,b17,
                       b18,b19,b20,b21,b22,b23,b24,

                       g0, g1, g2, g3, g4, g5,
                       g6, g7, g8, g9,g10,g11,
                       g12,g13,g14,g15,g16,g17,
                       g18,g19,g20,g21,g22,g23,g24,

                       D0, D1, D2, D3, D4, D5,
                       D6, D7, D8, D9,D10,D11,
                       D12,D13,D14,D15,D16,D17,
                       D18,D19,D20,D21,D22,D23,D24,

                       A0, A1, A2, A3, A4, A5,
                       A6, A7, A8, A9,A10,A11,
                       A12,A13,A14,A15,A16,A17,
                       A18,A19,A20,A21,A22,A23,A24,

                       E0, E1, E2, E3, E4, E5,
                       E6, E7, E8, E9,E10,E11,
                       E12,E13,E14,E15,E16,E17,
                       E18,E19,E20,E21,E22,E23,E24};

  Hashtable<String, Boolean> hits = new Hashtable<String, Boolean>();

  public FretboardViewer() {
    try {
      background = ImageIO.read(getClass().getResource("fretboard.png"));
    } catch(MalformedURLException e) {
      e.printStackTrace();
    } catch(IOException e) {
      e.printStackTrace();
    }

    for(Rectangle r : rects) {
      hits.put(r.toString(), false);
    }
    
    buttonPanel.setOpaque(false);
    addMouseListener(this);
    add(buttonPanel);
  }

  void onHit(Rectangle r) {
    Graphics g = this.getGraphics();

    if(!hits.get(r.toString())) {
      g.setColor(Color.RED);
      g.fillRoundRect(r.x, r.y, r.width, r.height, 5, 5);
      hits.replace(r.toString(), false, true);
    } else {
      g.drawImage(background.getSubimage(r.x, r.y, r.width, r.height), r.x, r.y, this);
      g.setColor(new Color(0f, 0f, 0f, .5f));
      g.fillRoundRect(r.x, r.y, r.width, r.height, 5, 5);
      hits.replace(r.toString(), true, false);
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawImage(background, 0, 0, this);
    g.setColor(new Color(0f, 0f, 0f, .5f));

    for(int i = 0; i < rects.length; i++) {
      g.fillRoundRect(rects[i].x, rects[i].y, rects[i].width, rects[i].height, 5, 5);
    }
  }

  public void mousePressed(MouseEvent e) {
  }
     
  public void mouseReleased(MouseEvent e) {
    for(int i = 0; i < rects.length; i++) {
      if(rects[i].contains(e.getX(), e.getY())) {
        onHit(rects[i]);
        //System.out.println("Hit on: "+ rects[i].toString());
      }
    }
  }
     
  public void mouseEntered(MouseEvent e) {
  }
     
  public void mouseExited(MouseEvent e) {
  }
     
  public void mouseClicked(MouseEvent e) {
  }

  public static void main(String[] args) {
    FretboardViewer fv = new FretboardViewer();

    JFrame frame = new JFrame("Fretboard Viewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1200, 268);
    frame.setResizable(false);

    Container contentPane = frame.getContentPane();
    contentPane.add(fv);

    frame.setVisible(true);
  }
}


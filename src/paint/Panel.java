/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Panel extends JPanel implements MouseListener{
private int x=-1;
private int y=-1;
 public Panel(){
 addMouseListener(this);
 }

 public void mouseExited(MouseEvent e){
 }
 public void mouseEntered(MouseEvent e){
 }
 public void mousePressed(MouseEvent e){
 }
 public void mouseReleased(MouseEvent e){
 }
public void mouseMoved(MouseEvent e){

 }
 public void mouseClicked(MouseEvent e)
 {
  x=e.getX();
 y=e.getY();
 repaint(); 

//        JOptionPane.showMessageDialog(null,
//        e.getPoint().toString());
 }
 public void paint(Graphics g)
 {
 g.clearRect(0, 0, getSize().width, getSize().height);
 g.setColor(Color.BLACK);
 if(x!=-1 && y!=-1)
 g.drawOval(x-25, y-25, 150, 150);
 }


}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author student
 */
public class Kolo implements Figura{
    private int x=-1;
    private int y=-1;
    public Kolo(int a,int b){
        this.x=a;
        this.y=b;
    }
    
    public void paint(Graphics g)
 {
 g.setColor(Color.RED);
 if(x!=-1 && y!=-1)
 g.drawOval(x-25, y-25, 50, 50);
 }

}

package NouredeenHammadDSProject1;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Nouredeen HAMMAD
 */
public class NouredeenHammadGrid extends javax.swing.JPanel {

    private ArrayList<NouredeenHammadBlock> blockList = new ArrayList<>();

    public NouredeenHammadGrid() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        paintGrid(g2d);
        paintBlocks(g2d);
    }

    void paintBlocks(Graphics2D g2d) {
        //Sets the stroke and font of the Graphics2D object
        g2d.setStroke(new BasicStroke(16.0f));
        g2d.setFont(new Font("Sans Sherif", Font.BOLD, 24));
        
        for (NouredeenHammadBlock block : blockList) {
            
            //Gets the Rectangle.Double object in each block object
            Rectangle2D.Double rect = block.getRectangle();
            
            //Gets the corresponding color and draws it
            g2d.setColor(block.getColor());
            g2d.draw(rect);

            //coef is a variable added to the x value of the text depending on
            //the length of the number, so that it stays at the center of the block
            int coef;
            if (block.getValue() / 100 != 0) {
                coef = 22;
            } else if (block.getValue() / 10 != 0) {
                coef = 28;
            } else {
                coef = 35;
            }

            //Draws the value text in each block
            String str = "" + block.getValue();
            g2d.drawString(str, (int) block.getX() + coef, (int) block.getY() + 48);
        }
    }

    //Paints the lines of the grid
    void paintGrid(Graphics2D g2d) {
        g2d.setColor(java.awt.Color.gray);
        g2d.setStroke(new BasicStroke(1.0f));

        //Vertical Lines
        g2d.draw(new Line2D.Double(100, 0, 100, 700));
        g2d.draw(new Line2D.Double(200, 0, 200, 700));
        g2d.draw(new Line2D.Double(300, 0, 300, 700));
        g2d.draw(new Line2D.Double(400, 0, 400, 700));

        //Horizontal Lines
        g2d.draw(new Line2D.Double(0, 100, 700, 100));
        g2d.draw(new Line2D.Double(0, 200, 700, 200));
        g2d.draw(new Line2D.Double(0, 300, 700, 300));
        g2d.draw(new Line2D.Double(0, 400, 700, 400));
        g2d.draw(new Line2D.Double(0, 500, 700, 500));
        g2d.draw(new Line2D.Double(0, 600, 700, 600));
    }

    public void setBlockList(ArrayList<NouredeenHammadBlock> list) {
        blockList = list;
    }
    
    public ArrayList<NouredeenHammadBlock> getBlockList(){
        return blockList;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(500, 700));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

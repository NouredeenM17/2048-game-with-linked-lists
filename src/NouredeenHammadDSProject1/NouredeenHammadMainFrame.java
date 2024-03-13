
package NouredeenHammadDSProject1;

import java.util.ArrayList;

/**
 *
 * @author Nouredeen HAMMAD
 */
public class NouredeenHammadMainFrame extends javax.swing.JFrame {

    private NouredeenHammadMultiLinkedList<Integer> linkedList = new NouredeenHammadMultiLinkedList<>();
    private int[][] sequence;
    private int iteration = 0;
    
    public NouredeenHammadMainFrame(int[][] sequence) {
        initComponents();
        this.sequence = sequence;
        refreshNextBlockText();
    }
    
    //Refreshes the labels that display the value and column information of the
    //next block to be added
    void refreshNextBlockText(){
        //Checks if the iteration variable exceeded the sequence length
        if(iteration >= sequence.length){
            lblColumnData.setText("     ");
            lblValueData.setText("     ");
        } else {
            lblColumnData.setText(""+sequence[iteration][0]);
            lblValueData.setText(""+sequence[iteration][1]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new NouredeenHammadDSProject1.NouredeenHammadGrid();
        nextBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        lblNext = new javax.swing.JLabel();
        lblColumn = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        lblColumnData = new javax.swing.JLabel();
        lblValueData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NouredeenHammadProject1");
        setMinimumSize(new java.awt.Dimension(600, 900));

        grid.setBackground(new java.awt.Color(255, 255, 255));
        grid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        grid.setMaximumSize(new java.awt.Dimension(500, 700));
        grid.setMinimumSize(new java.awt.Dimension(500, 700));
        grid.setPreferredSize(new java.awt.Dimension(500, 700));

        javax.swing.GroupLayout gridLayout = new javax.swing.GroupLayout(grid);
        grid.setLayout(gridLayout);
        gridLayout.setHorizontalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        gridLayout.setVerticalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );

        nextBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        lblNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNext.setText("Next Block:");

        lblColumn.setText("Column =");

        lblValue.setText("Value =");

        lblColumnData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblColumnData.setText("jLabel1");

        lblValueData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValueData.setText("jLabel2");

        jLabel1.setText("0                                1                                2                                3                                4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblColumn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblColumnData)
                                .addGap(18, 18, 18)
                                .addComponent(lblValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValueData))
                            .addComponent(lblNext)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblNext)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColumn)
                                .addComponent(lblColumnData))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValue)
                                .addComponent(lblValueData)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        if(iteration >= sequence.length) return;
        
        //Adds the next node to the MultiLinkedList and iterates the iteration variable
        linkedList.addNode(sequence[iteration][0], sequence[iteration][1]);
        iteration++;
        
        //Gets the ArrayList of graphics blocks of the MultiLinkedList
        ArrayList<NouredeenHammadBlock> blockList = linkedList.returnGraphicsBlocks();
        
        //Sends the block list to the Grid
        ((NouredeenHammadGrid)grid).setBlockList(blockList);
        
        //Refreshes both labels and graphics
        refreshNextBlockText();
        repaint();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        //Resets iteration variable
        iteration = 0;
        
        //Replaces linkedList with an empty MultiLinkedList
        linkedList = new NouredeenHammadMultiLinkedList<>();
        
        //Gets the ArrayList of graphics blocks of the MultiLinkedList
        ArrayList<NouredeenHammadBlock> blockList = linkedList.returnGraphicsBlocks();
        
        //Sends the block list to the Grid
        ((NouredeenHammadGrid)grid).setBlockList(blockList);
        
        //Refreshes both labels and graphics
        refreshNextBlockText();
        repaint();
    }//GEN-LAST:event_resetBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblColumn;
    private javax.swing.JLabel lblColumnData;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblValue;
    private javax.swing.JLabel lblValueData;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}

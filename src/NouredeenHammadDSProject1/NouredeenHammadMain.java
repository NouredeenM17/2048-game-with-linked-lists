
package NouredeenHammadDSProject1;

/**
 *
 * @author Nouredeen HAMMAD
 */
public class NouredeenHammadMain {

    public static void main(String[] args) {
        //the sequence is a 2D array where the first element is the column (0->4), 
        //and the second element is the value added
        int[][] sequence = {{0,2},{3,2},{1,4},{2,2},{4,4},
                            {1,2},{4,4},{0,8},
                            {0,8},{1,32},
                            {2,2},{2,64},{3,16},
                            {1,64},{2,32},{0,16},
                            {4,16},{2,32},
                            {1,64},{3,8},{3,4},
                            {3,2},{3,2},
                            {1,2},{2,64},{2,32},
                            {2,16},{2,8},{2,8},
                            {1,4},{1,8}};
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NouredeenHammadMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NouredeenHammadMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NouredeenHammadMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NouredeenHammadMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Launches the main frame and passes the sequence as a parameter
                NouredeenHammadMainFrame f = new NouredeenHammadMainFrame(sequence);
                f.setResizable(false);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }
    
}

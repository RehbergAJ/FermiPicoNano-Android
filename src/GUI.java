
//import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import javafx.scene.paint.Color;

/**
 *
 * @author Andrew
 */
public class GUI extends javax.swing.JFrame {
    //-----------------------------------Declare Variables
     public int txta;
     public int txtb;
     public int txtc;
     public String fermi = "Fermi";
     public String pico = "Pico";
     public String nano = "Nano";         
     private final String pikachu[];
     public int numGuesses = 0;
     public int x;
     public int y;
     public int z;
     public Color error = Color.RED;
     
     //----------------------------------End variables list
     
     
     
     
    /**
     * @Creates new form GUI
     */
    public GUI() {
        initComponents();
        Random ran = new Random();        
        int x = ran.nextInt(10);
        int y = ran.nextInt(10);
        int z = ran.nextInt(10);
        
        //populate array
        pikachu = new String[3];        
        
        //---------------------------------------------populate lblHint
        lblHint.setText(Integer.toString(x)+Integer.toString(y)+Integer.toString(z));
        
        
        //populate numero array with random values
        //numero = new int[]{x,y,z};        
        
        //populate pikachu array with values
        //pikachu = new String[]{"fermi", "pico", "nano"};
        
        //populate txt values
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGuess = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        txtInput3 = new javax.swing.JTextField();
        btnGuess = new javax.swing.JButton();
        txtOutput = new javax.swing.JScrollPane();
        txtOut = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        lblGuess.setText("Enter Guesses: (0-9)");

        btnGuess.setText("Guess!");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        txtOut.setEditable(false);
        txtOut.setColumns(20);
        txtOut.setRows(5);
        txtOut.setFocusable(false);
        txtOutput.setViewportView(txtOut);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Fermi Guessing Game! You get three guesses to guess the right order.");

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Fermi means you have one correct and in the right position");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Pico means one number is correct but not in the right position");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Nano means one number is wrong completely");

        lblHint.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        lblHint.setForeground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtInput3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(txtInput2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInput1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuess)
                                .addGap(211, 211, 211)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGuess)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(lblGuess))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnGuess))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
    /*
    @Guess button activation, counter increment
    */  
        txta = Integer.parseInt(txtInput1.getText());
        txtb = Integer.parseInt(txtInput2.getText());
        txtc = Integer.parseInt(txtInput3.getText());
                   
        numGuesses ++;
        txtInput1.requestFocusInWindow();
        
        getNum();
    }//GEN-LAST:event_btnGuessActionPerformed
 
    public void getNum(){              
         //String guessed[] = new String[3];
         Random ran = new Random();        
        int x = ran.nextInt(10);
        int y = ran.nextInt(10);
        int z = ran.nextInt(10);
                 
                  
           if (txta == x){
             pikachu[0] = fermi;
           } else if (txta == y){
             pikachu[0] = pico;
           } else if (txta == z){
             pikachu[0] = pico;
           } else if (txta != (y | z)){
             pikachu[0] = nano;                   
         }
           if (txtb == y){
             pikachu[1] = fermi;
           } else if (txtb == x){
             pikachu[1] = pico;
           } else if (txtb == z){
             pikachu[1] = pico;
           } else if (txtb != (x | z)){
             pikachu[1] = nano; 
           }   
           if (txtc == z){
             pikachu[2] = fermi;
           } else if (txtc == y){
             pikachu[2] = pico;
           } else if (txtc == x){
             pikachu[2] = pico;
           } else if (txtc != (y | z)){
             pikachu[2] = nano; 
           }            
            txtOut.append(txta + " " + txtb + " " + txtc + " : " + 
                   pikachu[0] + " " + pikachu[1] + " " + pikachu[2] + "\n");
            
            txtInput1.setText("");
            txtInput2.setText("");
            txtInput3.setText("");
     }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Random ran = new Random();        
        int x = ran.nextInt(10);
        int y = ran.nextInt(10);
        int z = ran.nextInt(10);
        lblHint.setText(Integer.toString(x)+Integer.toString(y)+Integer.toString(z));
        txtInput1.setText("");
        txtInput2.setText("");
        txtInput3.setText("");
        txtOut.setText("");        
        numGuesses = 0;
        txtInput1.requestFocusInWindow();                
    }//GEN-LAST:event_btnClearActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    
    
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblGuess;
    private javax.swing.JLabel lblHint;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextArea txtOut;
    private javax.swing.JScrollPane txtOutput;
    // End of variables declaration//GEN-END:variables
}
 /*
    @
    Bulbasaur
    Ivysaur
    Venusaur
    Squirtle
    Wartortle
    Blastoise
    Charmander
    Charmeleon
    Charizard
    Caterpee
    Metapod
    Butterfree
    Weedle
    Kakuna
    Beedrill
    Pidgey
    Pidgeotto
    Pidgeot
    Rattata
    Radicate
    Spearow
    Fearow
    Pikachu
    Raichu
    */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteo;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author usuario
 */
public class Sorteo extends javax.swing.JFrame {
     
    /**
     * Creates new form Sorteo
     */
    public Sorteo() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dedoanimado.gif")));
         jLabel12.paintImmediately(0,0, jLabel12.getWidth(), jLabel12.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 150)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("0");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 204, 255)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 235, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 150)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("0");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 204, 255)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 235, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 150)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("0");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 204, 255)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 235, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Wide Latin", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Comenzar.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 180, 170));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1266, 380));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/luces.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 690, 550, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 170, 210));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 170, 210));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/luces.gif"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 560, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/luces.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 690, 560, -1));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 380, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Random generadorNum = new Random();
    int numAleatorio = generadorNum.nextInt(500)+1;
    String numGenerado = String.valueOf(numAleatorio);
    //String num1 = numGenerado.substring(0, 1);
    //String num2 = numGenerado.substring(1, 2);
    //String num3 = numGenerado.substring(2, 3);
    String num1;
    String num2;
    String num3;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel12.paintImmediately(0,0, jLabel12.getWidth(), jLabel12.getHeight());
        jLabel12.setVisible(false);
        
        
        try {
            jButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Comenzado.jpg")));
            jButton1.paintImmediately(0,0, jButton1.getWidth(), jButton1.getHeight());
            int numVueltas;
            int longitudNumGenerado = numGenerado.length();
            if (longitudNumGenerado == 1) {
                num1 = "0";
                num2 = "0";
                num3 = numGenerado.substring(0, 1);
            }
            if (longitudNumGenerado == 2){
                num1 = "0";
                num2 = numGenerado.substring(0, 1);
                num3 = numGenerado.substring(1, 2);
            }
            if (longitudNumGenerado == 3) {
                num1 = numGenerado.substring(0, 1);
                num2 = numGenerado.substring(1, 2);
                num3 = numGenerado.substring(2, 3);
            }
            for (numVueltas = 0; numVueltas < 10; numVueltas++){
                int aleatorioDigito1 = generadorNum.nextInt(9);
                jLabel1.setText(String.valueOf(aleatorioDigito1));
                jLabel1.paintImmediately(0,0, jLabel1.getWidth(), jLabel1.getHeight());
                if (numVueltas == 9){
                    jLabel1.setText(num1);
                    jLabel1.paintImmediately(0,0, jLabel1.getWidth(), jLabel1.getHeight());
                    
                }
                Thread.sleep(150);
            }
            for (numVueltas = numVueltas; numVueltas < 20; numVueltas++){
                int aleatorioDigito2 = generadorNum.nextInt(9);
                jLabel2.setText(String.valueOf(aleatorioDigito2));
                jLabel2.paintImmediately(0,0, jLabel2.getWidth(), jLabel2.getHeight());
                if (numVueltas == 19){
                    jLabel2.setText(num2);
                    jLabel2.paintImmediately(0,0, jLabel2.getWidth(), jLabel2.getHeight());
                    
                    
                }
                Thread.sleep(150);
            }
            for (numVueltas = numVueltas; numVueltas < 30; numVueltas++){
                int aleatorioDigito3 = generadorNum.nextInt(9);
                jLabel3.setText(String.valueOf(aleatorioDigito3));
                jLabel3.paintImmediately(0,0, jLabel3.getWidth(), jLabel3.getHeight());
                if (numVueltas == 29){
                    jLabel3.setText(num3);
                    jLabel3.paintImmediately(0,0, jLabel3.getWidth(), jLabel3.getHeight());                   
                    
                }
                Thread.sleep(150);
            }       
           
        } catch (InterruptedException ex) {
            Logger.getLogger(Sorteo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorteo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

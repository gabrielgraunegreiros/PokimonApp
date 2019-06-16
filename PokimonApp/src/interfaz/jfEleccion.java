/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author alumno
 */
public class jfEleccion extends javax.swing.JFrame {
    public jfBienvenido menu;
    public static String nombre;
    public static String rival;
    
    public jfEleccion() {
        initComponents();
        this.setLocationRelativeTo(this);
        transparenciaButton();
        RestrictedTextField r = new RestrictedTextField(jTextField1);
        r.setLimit(9);
    }

    private void transparenciaButton(){
        Bulbasaur.setOpaque(false);
        Bulbasaur.setContentAreaFilled(false);
        Bulbasaur.setBorderPainted(false);
        Charmander.setOpaque(false);
        Charmander.setContentAreaFilled(false);
        Charmander.setBorderPainted(false);
        Squirtle.setOpaque(false);
        Squirtle.setContentAreaFilled(false);
        Squirtle.setBorderPainted(false);
    }
    public jfEleccion(jfBienvenido menu) {
        initComponents();
        this.menu = menu;        
        jLabel6.setText(menu.nombre); 
        if (jfBienvenido.Masculino.isSelected()){
            jfBienvenido.url = getClass().getResource("/imagenes/Red_(Pokémon).png");
            ImageIcon sex = new ImageIcon(jfBienvenido.url);
            jLabel5.setIcon(sex);
        }
        else if (jfBienvenido.Femenino.isSelected()){
            jfBienvenido.url = getClass().getResource("/imagenes/Liza_NB_(Ilustración).png");
            ImageIcon sex = new ImageIcon(jfBienvenido.url);
            jLabel5.setIcon(sex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pokimon = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Bulbasaur = new javax.swing.JRadioButton();
        Charmander = new javax.swing.JRadioButton();
        Squirtle = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(582, 511));
        setMinimumSize(new java.awt.Dimension(582, 511));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Escoge tu Pokimon");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/charmander.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Squirtle 1.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 260, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red_(Pokémon).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, 210));

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Hola");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("¡Es hora de elegir tu Pokimon!");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        Pokimon.add(Bulbasaur);
        Bulbasaur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bulbasaur.setForeground(new java.awt.Color(0, 0, 204));
        Bulbasaur.setText("Bulbasaur");
        Bulbasaur.setContentAreaFilled(false);
        Bulbasaur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bulbasaur.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bulbasaur.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Bulbasaur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 200));

        Pokimon.add(Charmander);
        Charmander.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Charmander.setForeground(new java.awt.Color(0, 0, 204));
        Charmander.setText("Charmander");
        Charmander.setContentAreaFilled(false);
        Charmander.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Charmander.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Charmander, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 95, 140, 200));

        Pokimon.add(Squirtle);
        Squirtle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Squirtle.setForeground(new java.awt.Color(0, 0, 204));
        Squirtle.setText("Squirtle");
        Squirtle.setContentAreaFilled(false);
        Squirtle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Squirtle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Squirtle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 85, 160, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bulbasaur.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 280, 170));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ingresa el nuevo nombre de tu Pokimon:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 170, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Eleccion.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 550));

        setSize(new java.awt.Dimension(638, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfBatalla marco = new jfBatalla();
        if (!jTextField1.getText().isEmpty()){
            nombre= jTextField1.getText();
            jfBatalla.jLabel9.setText(nombre);
            if (jfEleccion.Bulbasaur.isSelected()){
                rival="Charmander";
                jfBatalla.jLabel10.setText(rival);
            }
            if (jfEleccion.Charmander.isSelected()){
                rival="Squirtle";
                jfBatalla.jLabel10.setText(rival);
            }
            if (jfEleccion.Squirtle.isSelected()){
                rival="Bulbasaur";
                jfBatalla.jLabel10.setText(rival);
            }
        }
        if (jTextField1.getText().isEmpty()){
            if (jfEleccion.Bulbasaur.isSelected()){
                nombre="Bulbasaur";
                rival="Charmander";
                jfBatalla.jLabel9.setText(nombre);
                jfBatalla.jLabel10.setText(rival);
            }
            if (jfEleccion.Charmander.isSelected()){
                nombre="Charmander";
                rival="Squirtle";
                jfBatalla.jLabel9.setText(nombre);
                jfBatalla.jLabel10.setText(rival);
            }
            if (jfEleccion.Squirtle.isSelected()){
                nombre="Squirtle";
                rival="Bulbasaur";
                jfBatalla.jLabel9.setText(nombre);
                jfBatalla.jLabel10.setText(rival);
            }
        }
        marco.setVisible(true);
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
            java.util.logging.Logger.getLogger(jfEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton Bulbasaur;
    public static javax.swing.JRadioButton Charmander;
    public static javax.swing.ButtonGroup Pokimon;
    public static javax.swing.JRadioButton Squirtle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

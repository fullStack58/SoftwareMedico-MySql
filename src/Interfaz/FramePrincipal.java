package Interfaz;
import static Interfaz.PanelUsuarios.Tabla;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;



public class FramePrincipal extends javax.swing.JFrame {

    private Point point;
    
    public FramePrincipal() {

        
        // VENTANA --------------------------------------------------------
        setUndecorated(true); // Quitar los marcos y botones de la ventana 
        initComponents();  
        setLocationRelativeTo(null);
        
        // MOSTRAR PANEL INICIAL ------------------------------------------
        PanelUsuarios pUS = new PanelUsuarios();
        pUS.setSize(920, 580);
        pUS.setLocation(0, 0);

        contenedor2.removeAll();
        contenedor2.add(pUS);
        contenedor2.revalidate();
        contenedor2.repaint();
        
        // RESALTAR ITEM ACTUAL DEL PANEL DE OPCIONES ----------------------
        Btn_BDpri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto2.png"))); 
        Btn_BDpri1.setForeground(new java.awt.Color(255, 230, 56));
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
        contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Minimizarr = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Btn_BDsec = new javax.swing.JLabel();
        Btn_BDpri1 = new javax.swing.JLabel();
        Btn_ordenar = new javax.swing.JLabel();
        contenedor2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        contenedor.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        Minimizarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_.png"))); // NOI18N
        Minimizarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarrMouseClicked(evt);
            }
        });
        jPanel2.add(Minimizarr);

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel2.add(Cerrar);

        contenedor.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(56, 182, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Latha", 0, 20)); // NOI18N
        Logo.setForeground(new java.awt.Color(56, 182, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO.png"))); // NOI18N
        jPanel3.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 200, 100));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(56, 182, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ordenar");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(56, 182, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("tabla");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 60, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(56, 182, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("datos");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 50, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Filtro.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 50, 60));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(56, 182, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Base de");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fItem.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bd.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, 60, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fItem.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Base de datos");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, -1));

        Btn_BDsec.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BDsec.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        Btn_BDsec.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BDsec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_BDsec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
        Btn_BDsec.setText("Secundaria");
        Btn_BDsec.setAlignmentY(0.0F);
        Btn_BDsec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_BDsecMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_BDsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 30));

        Btn_BDpri1.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BDpri1.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        Btn_BDpri1.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BDpri1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_BDpri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
        Btn_BDpri1.setText("Principal");
        Btn_BDpri1.setAlignmentY(0.0F);
        Btn_BDpri1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_BDpri1MouseClicked(evt);
            }
        });
        jPanel3.add(Btn_BDpri1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, 30));

        Btn_ordenar.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ordenar.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        Btn_ordenar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ordenar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
        Btn_ordenar.setText("Ordendar");
        Btn_ordenar.setAlignmentY(0.0F);
        Btn_ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ordenarMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 110, 30));

        contenedor.add(jPanel3, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        contenedor.add(contenedor2, java.awt.BorderLayout.CENTER);

        jPanel1.add(contenedor, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int currentX = this.getLocation().x;
        int currentY = this.getLocation().y;

        int moveX = (currentX + evt.getX()) - (currentX + point.x);
        int moveY = (currentX + evt.getY()) - (currentX + point.y);

        int x = currentX + moveX;
        int y = currentY + moveY;

        this.setLocation(x,y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarrMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarrMouseClicked

    private void Btn_BDpri1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BDpri1MouseClicked
        /*
        ---------------------------------------------------------------------
        CAMBIAR AL PANEL (USUARIOS)
        ---------------------------------------------------------------------
        */
        // Resaltar la opción seleccionada
        Btn_BDpri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto2.png"))); 
        Btn_BDpri1.setForeground(new java.awt.Color(255, 230, 56));
        
        Btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); 
        Btn_ordenar.setForeground(new java.awt.Color(255, 255, 255));
        
        PanelUsuarios pUS = new PanelUsuarios();
        pUS.setSize(920, 580);
        pUS.setLocation(0, 0);

        contenedor2.removeAll();
        contenedor2.add(pUS);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_Btn_BDpri1MouseClicked

    private void Btn_BDsecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BDsecMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BDsecMouseClicked

    private void Btn_ordenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ordenarMouseClicked
        /*
        ---------------------------------------------------------------------
        CAMBIAR AL PANEL (ORDENAMIENTO)
        ---------------------------------------------------------------------
        */
        Btn_BDpri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); 
        Btn_BDpri1.setForeground(new java.awt.Color(255, 255, 255));
        
        // Resaltar la opción seleccionada
        Btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto2.png"))); 
        Btn_ordenar.setForeground(new java.awt.Color(255, 230, 56));
        
        PanelOrdenamiento pOR = new PanelOrdenamiento();
        pOR.setSize(920, 580);
        pOR.setLocation(0, 0);

        contenedor2.removeAll();
        contenedor2.add(pOR);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_Btn_ordenarMouseClicked

    
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_BDpri1;
    private javax.swing.JLabel Btn_BDsec;
    private javax.swing.JLabel Btn_ordenar;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Minimizarr;
    public static javax.swing.JPanel contenedor;
    public static javax.swing.JPanel contenedor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

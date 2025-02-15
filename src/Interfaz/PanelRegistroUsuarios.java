/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static Interfaz.FramePrincipal.contenedor2;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mauro
 */
public class PanelRegistroUsuarios extends javax.swing.JPanel {

    DefaultTableModel modelo;
    public static Statement st;
    public static ResultSet rs;
    public static Conexion conl = new Conexion();
    public static Connection conet;
    
    public static String nomDoctor;
    public static String apeDoctor;
    public static int intHorDoctor;
    public static String horSemDoctor = "";
    public static String actividad = "";
    public static int idd; //id del doctor que se esta editando

    
    public PanelRegistroUsuarios() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Btn_Registro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtInput_NomDoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtInput_ApeDoc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtInput_IntHorDoc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ChkBDom = new javax.swing.JCheckBox();
        ChkBLun = new javax.swing.JCheckBox();
        ChkBMar = new javax.swing.JCheckBox();
        ChkBMie = new javax.swing.JCheckBox();
        ChkBJue = new javax.swing.JCheckBox();
        ChkBVie = new javax.swing.JCheckBox();
        ChkBSab = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TituloPanel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(56, 182, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("semanal");
        jLabel24.setIconTextGap(30);
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 40));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(56, 182, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Horario");
        jLabel21.setIconTextGap(30);
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, 40));

        Btn_Registro.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Registro.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        Btn_Registro.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Normal.png"))); // NOI18N
        Btn_Registro.setText("Registrar");
        Btn_Registro.setBorderPainted(false);
        Btn_Registro.setContentAreaFilled(false);
        Btn_Registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Registro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Activo2.png"))); // NOI18N
        Btn_Registro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Activo.png"))); // NOI18N
        Btn_Registro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btn_Activo.png"))); // NOI18N
        Btn_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistroActionPerformed(evt);
            }
        });
        add(Btn_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/decorativo1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 580));

        TxtInput_NomDoc.setBackground(new java.awt.Color(255, 255, 255));
        TxtInput_NomDoc.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        TxtInput_NomDoc.setForeground(new java.awt.Color(240, 132, 134));
        TxtInput_NomDoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtInput_NomDoc.setToolTipText("");
        TxtInput_NomDoc.setBorder(null);
        add(TxtInput_NomDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 140, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(56, 182, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fCampoTxt.png"))); // NOI18N
        jLabel12.setText("Nombre");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setIconTextGap(-6);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 220, 80));

        TxtInput_ApeDoc.setBackground(new java.awt.Color(255, 255, 255));
        TxtInput_ApeDoc.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        TxtInput_ApeDoc.setForeground(new java.awt.Color(240, 132, 134));
        TxtInput_ApeDoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtInput_ApeDoc.setToolTipText("");
        TxtInput_ApeDoc.setBorder(null);
        add(TxtInput_ApeDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(56, 182, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fCampoTxt.png"))); // NOI18N
        jLabel14.setText("Apellido");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setIconTextGap(-6);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 220, 80));

        TxtInput_IntHorDoc.setBackground(new java.awt.Color(255, 255, 255));
        TxtInput_IntHorDoc.setFont(new java.awt.Font("Latha", 1, 14)); // NOI18N
        TxtInput_IntHorDoc.setForeground(new java.awt.Color(240, 132, 134));
        TxtInput_IntHorDoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtInput_IntHorDoc.setToolTipText("");
        TxtInput_IntHorDoc.setBorder(null);
        add(TxtInput_IntHorDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 140, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Latha", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(56, 182, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fCampoTxt.png"))); // NOI18N
        jLabel17.setText("Intensidad Horaria");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setIconTextGap(-6);
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 220, 80));

        ChkBDom.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBDom.setForeground(new java.awt.Color(255, 255, 255));
        ChkBDom.setText("Dom");
        ChkBDom.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBDom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBDom.setIconTextGap(13);
        ChkBDom.setRequestFocusEnabled(false);
        ChkBDom.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBDom.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBDomActionPerformed(evt);
            }
        });
        add(ChkBDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 80, 30));

        ChkBLun.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBLun.setForeground(new java.awt.Color(255, 255, 255));
        ChkBLun.setText("Lun");
        ChkBLun.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBLun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBLun.setIconTextGap(20);
        ChkBLun.setRequestFocusEnabled(false);
        ChkBLun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBLun.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBLun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBLunActionPerformed(evt);
            }
        });
        add(ChkBLun, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, 30));

        ChkBMar.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBMar.setForeground(new java.awt.Color(255, 255, 255));
        ChkBMar.setText("Mar");
        ChkBMar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBMar.setIconTextGap(20);
        ChkBMar.setRequestFocusEnabled(false);
        ChkBMar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBMar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBMarActionPerformed(evt);
            }
        });
        add(ChkBMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, 30));

        ChkBMie.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBMie.setForeground(new java.awt.Color(255, 255, 255));
        ChkBMie.setText("Mie");
        ChkBMie.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBMie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBMie.setIconTextGap(20);
        ChkBMie.setRequestFocusEnabled(false);
        ChkBMie.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBMie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBMie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBMieActionPerformed(evt);
            }
        });
        add(ChkBMie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 30));

        ChkBJue.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBJue.setForeground(new java.awt.Color(255, 255, 255));
        ChkBJue.setText("Jue");
        ChkBJue.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBJue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBJue.setIconTextGap(20);
        ChkBJue.setRequestFocusEnabled(false);
        ChkBJue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBJue.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBJue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBJueActionPerformed(evt);
            }
        });
        add(ChkBJue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, 30));

        ChkBVie.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBVie.setForeground(new java.awt.Color(255, 255, 255));
        ChkBVie.setText("Vie");
        ChkBVie.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBVie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBVie.setIconTextGap(20);
        ChkBVie.setRequestFocusEnabled(false);
        ChkBVie.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBVie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBVie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBVieActionPerformed(evt);
            }
        });
        add(ChkBVie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 80, 30));

        ChkBSab.setFont(new java.awt.Font("Latha", 1, 18)); // NOI18N
        ChkBSab.setForeground(new java.awt.Color(255, 255, 255));
        ChkBSab.setText("Sab");
        ChkBSab.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ChkBSab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_normal_1.png"))); // NOI18N
        ChkBSab.setIconTextGap(18);
        ChkBSab.setRequestFocusEnabled(false);
        ChkBSab.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_alpasar.png"))); // NOI18N
        ChkBSab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkBox_activo.png"))); // NOI18N
        ChkBSab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBSabActionPerformed(evt);
            }
        });
        add(ChkBSab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 80, 30));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(56, 182, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jLabel16.setIconTextGap(30);
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 100, 100));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(56, 182, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Panel.png"))); // NOI18N
        jLabel13.setIconTextGap(30);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 370));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(56, 182, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/decorativo2.png"))); // NOI18N
        jLabel18.setIconTextGap(30);
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 300, 210));

        TituloPanel.setBackground(new java.awt.Color(0, 0, 0));
        TituloPanel.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        TituloPanel.setForeground(new java.awt.Color(56, 182, 255));
        TituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/decorativo3.png"))); // NOI18N
        TituloPanel.setText("Añadir usuario");
        TituloPanel.setIconTextGap(30);
        add(TituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 270, 100));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(56, 182, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Intensidad");
        jLabel23.setIconTextGap(30);
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistroActionPerformed
       
        if(actividad.equals("Registrar"))
        {
            agregar();
        }
        
        if(actividad.equals("Actualizar"))
        {
            actualizar();
        }

        PanelUsuarios pUS = new PanelUsuarios();
        pUS.setSize(920, 580);
        pUS.setLocation(0, 0);
        
        contenedor2.removeAll();
        contenedor2.add(pUS);
        contenedor2.revalidate();
        contenedor2.repaint();
    }//GEN-LAST:event_Btn_RegistroActionPerformed

    private void ChkBLunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBLunActionPerformed
        if(ChkBLun.isSelected() == true)
        {
            
        }
    }//GEN-LAST:event_ChkBLunActionPerformed

    private void ChkBDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBDomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBDomActionPerformed

    private void ChkBMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBMarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBMarActionPerformed

    private void ChkBMieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBMieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBMieActionPerformed

    private void ChkBJueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBJueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBJueActionPerformed

    private void ChkBVieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBVieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBVieActionPerformed

    private void ChkBSabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBSabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBSabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Btn_Registro;
    private javax.swing.JCheckBox ChkBDom;
    private javax.swing.JCheckBox ChkBJue;
    private javax.swing.JCheckBox ChkBLun;
    private javax.swing.JCheckBox ChkBMar;
    private javax.swing.JCheckBox ChkBMie;
    private javax.swing.JCheckBox ChkBSab;
    private javax.swing.JCheckBox ChkBVie;
    private static javax.swing.JLabel TituloPanel;
    public static javax.swing.JTextField TxtInput_ApeDoc;
    public static javax.swing.JTextField TxtInput_IntHorDoc;
    public static javax.swing.JTextField TxtInput_NomDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    // End of variables declaration//GEN-END:variables
    /*
    ---------------------------------------------------------------------
    REGISTRAR EN LA BD LOS DATOS INGRESADOS DEL PACIENTE
    ---------------------------------------------------------------------
    */   
    void agregar()
    {
        // Almacenamos cada dato ingresado
        String nom = TxtInput_NomDoc.getText();
        String ape = TxtInput_ApeDoc.getText();
        String intHor = TxtInput_IntHorDoc.getText();
        String horSem = getCheckBoxesMarcados();
        
        try {
            // Comprobar si algun campo de texto esta vacío
            if(nom.equals("") || ape.equals("") || intHor.equals("") || horSem.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            } else{
                // Añadir datos a la BD
                String sql = "INSERT INTO `doctores`(`Nombre`, `Apellido`, `Intensidad horaria`, `Horario semanal`) VALUES ('"+nom+"', '"+ape+"', "+intHor+", '"+horSem+"')";
                
                //Creamos las variables de conección que nos permitiran hacer la consulta
                conet = conl.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql); 
                
                JOptionPane.showMessageDialog(null, "Nuevo doctor registrado");
            }
        } catch (Exception e) {
            System.out.println("Error al registrar doctor");
        }
    }
    /*
    ---------------------------------------------------------------------
    ACTUALIZAR EN LA BD LOS DATOS INGRESADOS DEL PACIENTE
    ---------------------------------------------------------------------
    */   
    void actualizar()
    {
        // Almacenamos cada dato ingresado
        String nom = TxtInput_NomDoc.getText(); 
        String ape = TxtInput_ApeDoc.getText();
        String intHor = TxtInput_IntHorDoc.getText();
        String horSem = getCheckBoxesMarcados();
        
        try {
            // Comprobar si algun campo de texto esta vacío
            if(nom.equals("") || ape.equals("") || intHor.equals("") || horSem.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            } else{
                // Añadir datos a la BD
                String sql = "UPDATE `doctores` SET `Id`="+idd+",   `Nombre`='"+nom+"',  `Apellido`='"+ape+"',    `Intensidad horaria`="+intHor+",    `Horario semanal`='"+horSem+"'  WHERE Id="+idd;
                                
                //Creamos las variables de conección que nos permitiran hacer la consulta
                conet = conl.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql); 
                
                JOptionPane.showMessageDialog(null, "Datos del doctor modificados");
            }
        } catch (Exception e) {
            System.out.println("Error al editar doctor");
        }
    }
    /*
    ---------------------------------------------------------------------
    ELIMINAR EN LA BD LOS DATOS SELECCIONADOS DE LA TABLA
    ---------------------------------------------------------------------
    */ 
    public static void eliminar()
    {
        try {         
            String sql = "DELETE FROM `doctores` WHERE Id="+idd;
            
            //Creamos las variables de conección que nos permitiran hacer la consulta
            conet = conl.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql); 

            JOptionPane.showMessageDialog(null, "Doctor eliminado");
        } catch (Exception e) {
            System.out.println("Error al eliminar doctor");
        }
    }
    /*
    ---------------------------------------------------------------------
    RECIBIR LOS DATOS DE UN DOCTOR EN ESPECÍFICO DE LA TABLA
    
    ...
    ---------------------------------------------------------------------
    */  
    public static void capturarDatosDoc(String nom, String ape, int intHor, String horSem)
    {
        nomDoctor = nom;
        apeDoctor = ape;
        intHorDoctor = intHor;
        horSemDoctor = horSem;     
    }
    
    /*
    ---------------------------------------------------------------------
    MARCAR LOS CHECKBOX DE ACUERDO A LOS DÍAS DE LA SEMANA EN QUE LABORA EL DOCTOR
    
    Esto se ejecuta cada vez que el usuario interactua con el botón de 
    editar, para que así las casillas marcadas se igualen con horSemDoctor
    ---------------------------------------------------------------------
    */
    public void marcarCheckBox()
    {
        // Días de la semana que debe buscar
        String díasSem[] = {"lun", "mar", "mie", "jue", "vie", "sab", "dom"};
        int buscarDía;
        
        // Buscar días de la semana 
        //System.out.println("Buscar día----------------------\n\n");
        
        for(int i = 0; i < díasSem.length; i++)
        {   
            buscarDía = horSemDoctor.indexOf(díasSem[i]);
            //System.out.println("día: " + díasSem[i]);
            
             // si (buscarDía) se pasa o es igual a (0) existe en la lista (horSemDoctor)
             
            if((buscarDía >= 0) && (i == 0)) // Lunes 
            {
                ChkBLun.setSelected(true);
            }
            if((buscarDía >= 0) && (i == 1)) // Martes 
            {
                ChkBMar.setSelected(true);
            }
            if((buscarDía >= 0) && (i == 2)) // Miercoles 
            {
                ChkBMie.setSelected(true);
            }
            if((buscarDía >= 0) && (i == 3)) // Jueves 
            {
                ChkBJue.setSelected(true);
            }
            if((buscarDía >= 0) && (i == 4)) // Viernes 
            {
                ChkBVie.setSelected(true);
            }
            if((buscarDía >= 0) && (i == 5)) // Sabado 
            {
                ChkBSab.setSelected(true);
            }
            if((buscarDía >= 0) && (i == 6)) // Domingo 
            {
                ChkBDom.setSelected(true);
            }
        }
    }
    /*
    ---------------------------------------------------------------------
    RETORNAR EN UN STRING ENLISTANDO LAS CASILLAS MARCADAS EN EL REGISTRO
 
    ---------------------------------------------------------------------
    */
    private String getCheckBoxesMarcados()
    {
        String list = " ";
        
        if(ChkBLun.isSelected() == true){  list = list + "lun,";  }
        if(ChkBMar.isSelected() == true){  list = list + "mar,";  }
        if(ChkBMie.isSelected() == true){  list = list + "mie,";  }
        if(ChkBJue.isSelected() == true){  list = list + "jue,";  }
        if(ChkBVie.isSelected() == true){  list = list + "vie,";  }
        if(ChkBSab.isSelected() == true){  list = list + "sab,";  }
        if(ChkBDom.isSelected() == true){  list = list + "dom,";  }
        
        System.out.println("dias de la semana trabajadas son: " + list);
        return list; 
    }
    
    /*
    ---------------------------------------------------------------------
    VALIDAR EL TIPO DE ACTIVIDAD QUE SE DEBE EJECUTAR EN ESTE PANEL
    ---------------------------------------------------------------------
    */
    public static void setActividad(String nomActividad) 
    {
        actividad = nomActividad;
        
        // Cambiar el tipo de actividad de este panel
        if(actividad.equals("Actualizar"))
        {
            // Cambiamos el texto de algunos componentes 
            Btn_Registro.setText("Actualizar");
      
            TituloPanel.setText("Actualizar");
            
            // Establecemos los campos de entrada a los datos seleccionados
            TxtInput_NomDoc.setText(nomDoctor);
            TxtInput_ApeDoc.setText(apeDoctor);
            TxtInput_IntHorDoc.setText("" + intHorDoctor);
        }
        if(actividad.equals("Registrar"))
        {
            // Cambiamos el texto de algunos componentes 
            Btn_Registro.setText("Registrar");
            
            TituloPanel.setText("Añadir usuario");
        }
    }
    
    public static void setIdd(int idDoctor)
    {
        idd = idDoctor;
    }
}

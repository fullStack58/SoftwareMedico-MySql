/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Config.Conexion;
import static Interfaz.FramePrincipal.contenedor;
import static Interfaz.FramePrincipal.contenedor2;
import acc.celdas.EventoTabla;
import acc.celdas.RepCeldaPersonalizada;
import acc.celdas.RepCeldaPersonalizadaEditable;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class PanelUsuarios extends javax.swing.JPanel{

    public DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    Conexion conl = new Conexion();
    Connection conet;
    
    
    public PanelUsuarios() {
        initComponents();  
        
        /*
        ---------------------------------------------------------------------
        ESPECIFICAR EVENTOS DE LA TABLA 
        
        Cada vez que el usuario interactue con un botón de acción, se ejecutara 
        una instrucción
        ---------------------------------------------------------------------
        */
        EventoTabla event = new EventoTabla()
        {
            @Override
            
            // Si presiona el botón (EDITAR FILA) <------------------
            public void onEdit(int row) 
            {
                System.out.println("Editar fila : " + row);
                
                // Fila donde extraera los datos del doctor
                int fila = row;
                
                // Extraer datos de cada columna de la fila 
                String nom = (String) Tabla.getValueAt(fila,1);
                String ape = (String) Tabla.getValueAt(fila,2);
                int intHor = Integer.parseInt((String) Tabla.getValueAt(fila,3).toString());
                String horSem = (String) Tabla.getValueAt(fila,4);
                
                // Almacenar id del doctor que seleccionado
                PanelRegistroUsuarios.setIdd(Integer.parseInt((String)Tabla.getValueAt(fila,0).toString()));
                
                // Capturar los datos desde el panel (PanelRegistroUsuarios)
                PanelRegistroUsuarios.capturarDatosDoc(nom, ape, intHor, horSem);
         
                // Cambiar al panel registro de usuarios
                PanelRegistroUsuarios pRU = new PanelRegistroUsuarios();
                pRU.setSize(920, 580);
                pRU.setLocation(0, 0);
            
                contenedor2.removeAll();
                contenedor2.add(pRU);
                contenedor2.revalidate();
                contenedor2.repaint();
                
                PanelRegistroUsuarios.setActividad("Actualizar");
                pRU.marcarCheckBox();
            }

            @Override
            
            // Si presiona el botón (ELIMINAR FILA) <------------------
            public void onDelete(int row) 
            {
                // Detener la edición de la celda antes de eliminar la fila
                if(Tabla.isEditing())
                {
                    Tabla.getCellEditor().stopCellEditing();
                }
                
                // Ejecutar instrucción
                System.out.println("Eliminar fila : " + row); 
                
                // Fila donde extraera los datos del doctor
                int fila = row;
                
                // Almacenar id del doctor seleccionado
                PanelRegistroUsuarios.setIdd(Integer.parseInt((String)Tabla.getValueAt(fila,0).toString()));
                
                PanelRegistroUsuarios.eliminar();
                
                DefaultTableModel dtm = (DefaultTableModel)Tabla.getModel();
                dtm.removeRow(row);
            }
        };
        
        
        /*
        ---------------------------------------------------------------------
        ESPECIFICAR PARAMETROS QUE MODIFICAN EL DISEÑO DE LA TABLA
        ---------------------------------------------------------------------
        */
        
        // Celdas <------------------
        Tabla.getTableHeader().setFont(new Font("Seoge UI", Font.BOLD, 12));
        Tabla.getTableHeader().setOpaque(false);
        Tabla.getTableHeader().setBackground(new Color(0));
        Tabla.getTableHeader().setForeground(new Color(0));
        /*De la tabla elejimos la columna 3 y usamos (setCellRender) para establecer un
        renderizador personalizado para las celdas de un componente de la interfaz gráfica 
        de usuario (GUI) que muestra datos tabulares, como un JTable o un JList.*/
        Tabla.getColumnModel().getColumn(5).setCellRenderer(new RepCeldaPersonalizada());
        Tabla.getColumnModel().getColumn(5).setCellEditor(new RepCeldaPersonalizadaEditable(event));
        
        // Encabezado <------------------
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(56,182,255));
        headerRenderer.setForeground(new Color(255,255,255));
        for (int i = 0; i < Tabla.getModel().getColumnCount(); i++) {
            Tabla.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        limpiarTabla(); // Cada vez que se llama este panel, se limpia la tabla
        consultar(); // Consultar en la BD los datos de los doctores para llenar la tabla
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        BtnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nuevo");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 70, 30));

        BtnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON_INACTIVO.png"))); // NOI18N
        BtnNuevo.setToolTipText("");
        BtnNuevo.setBorder(null);
        BtnNuevo.setBorderPainted(false);
        BtnNuevo.setContentAreaFilled(false);
        BtnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON_ALPASAR.png"))); // NOI18N
        BtnNuevo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON_CLICK.png"))); // NOI18N
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 110, -1));

        Tabla.setForeground(new java.awt.Color(51, 153, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre del doctor", "Apellido", "Intensidad horaria", "Horario semanal", "Acción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setRowHeight(40);
        Tabla.setSelectionBackground(new java.awt.Color(255, 102, 102));
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(Tabla);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 900, 350));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(56, 182, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Doctores registrados actualmente");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 900, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Latha", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 182, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PILDORAS.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 420, 290, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
       
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNuevoMouseClicked
        /*
        ---------------------------------------------------------------------
        CAMBIAR DE PANEL (REGISTRO DE USUARIOS)
        ---------------------------------------------------------------------
        */
        PanelRegistroUsuarios pRU = new PanelRegistroUsuarios();
        pRU.setSize(920, 580);
        pRU.setLocation(0, 0);
         
        contenedor2.removeAll();
        contenedor2.add(pRU);  
        contenedor2.revalidate();
        contenedor2.repaint();
        
        PanelRegistroUsuarios.setActividad("Registrar");
    }//GEN-LAST:event_BtnNuevoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNuevo;
    public static javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    /*
    ---------------------------------------------------------------------
    CONSULTAR EN LA BD LOS DATOS CORRESPONDIENTES PARA LLENAR LA TABLA
    ---------------------------------------------------------------------
    */
    void consultar()
    {   
        String sql = "select * from doctores";
        try{
            // Creamos las variables de conección que nos permitiran hacer la consulta
            conet = conl.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            
            Object[] doctor = new Object[5];

            modelo = (DefaultTableModel) Tabla.getModel();
          
            while(rs.next())
            {
                // Los datos deben coincidir con los de la BD ("id", "nombre"...)
                doctor [0] = rs.getInt("Id");
                doctor [1] = rs.getString("Nombre");
                doctor [2] = rs.getString("Apellido");
                doctor [3] = rs.getInt("Intensidad horaria");
                doctor [4] = rs.getString("Horario semanal");
                modelo.addRow(doctor);
            }
            Tabla.setModel(modelo); 
        } catch (Exception e){
            System.out.println("Error al cargar los datos de la BD");
        }
    }
    
    
    public void limpiarTabla()
    {
        for(int i = 0; i <= Tabla.getRowCount(); i++)
        {
            if(Tabla.getRowCount() > 0)
            {
                modelo.removeRow(i);
                i--;
            }
        }
    }
}

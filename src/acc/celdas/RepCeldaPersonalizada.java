/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.celdas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * Representación de la celda personalizada de la tabla
 */
public class RepCeldaPersonalizada extends DefaultTableCellRenderer{

    // Obtenemos los componentes de la celda
    
    public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, o, isSelected, bln1, row, column);
        
        // Reservamos en memoria la clase que nos muestra la celda personalizada con las imagenes 
        AccionDelPanel action = new AccionDelPanel();
        
        // Color de las celdas personalizadas al clickear
        if(isSelected == false && row % 2 == 0)
        {
            action.setBackground(Color.WHITE);
        } else{
            action.setBackground(com.getBackground());
        }

        return action;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acc.celdas;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author Mauro
 */

// Personalizamos el editor de celdas de la tabla que extiende esta clase del editor de celdas personalizado
public class RepCeldaPersonalizadaEditable extends DefaultCellEditor{

    private EventoTabla event;
    
    // EVENTO DE INTERFAZ
    public RepCeldaPersonalizadaEditable(EventoTabla event)
    {
        super(new JCheckBox());
        this.event = event;
    }
    
    //...
    public RepCeldaPersonalizadaEditable()
    {
        super(new JCheckBox());
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object o, boolean bln, int row, int column) {
        AccionDelPanel action = new AccionDelPanel();
        // Inicializar evento
        action.initEvent(event, row);
        // Para que la acción del panel pinte el fondo de la celda seleccionada
        action.setBackground(table.getSelectionBackground());
        return action;
    }
}

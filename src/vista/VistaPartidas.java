package vista;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaPartidas extends javax.swing.JFrame {

    JFrame ventana;
    static ArrayList<String> partidas = new ArrayList<>();

    public VistaPartidas(JFrame v) {
        initComponents();
        ventana = v;
        mostrarPartidaActual();
        setTitle("Partidas Guardadas");
        setLocationRelativeTo(this);
        listarArchivosEnCarpeta();
        mostrarDatosTabla(jTable1);
        setVisible(true);

    }

    public String mostrarPartidaActual() {
        File directorio = new File("C:/Users/pablo/Saved Games/Remnant2/Steam/329730419");
        if (directorio.isDirectory()) {
            File[] carpetas = directorio.listFiles(File::isDirectory);
            if (carpetas != null) {
                for (File carpeta : carpetas) {
                    labelPartidaActual.setText(carpeta.getName());
                    return carpeta.getName();
                }
            }
        }
        return null;
    }

    public void listarArchivosEnCarpeta() {

        File carpeta = new File("C:/Users/pablo/Desktop/Remnant2/partidas_guardadas");

        // Verificar si la ruta especificada es una carpeta y existe
        if (carpeta.isDirectory()) {
            File[] carpetas = carpeta.listFiles(File::isDirectory);

            if (carpetas != null) {
                for (File carpetaActual : carpetas) {
                    partidas.add(carpetaActual.getName());
                }
            }
        }
    }

    public static void mostrarDatosTabla(JTable tabla) {

        DefaultTableModel modelo = new DefaultTableModel(); //creamos un modelo de tabla por defecto
        String[] columnNames = {"NOMBRE"}; //Nombre de la cabecera de nuestra tabla
        modelo.setColumnIdentifiers(columnNames);  //asignamos cuantas columnas va tener la tabla      
        Object[] fila = new Object[7];

        for (String f : partidas) {

            fila[0] = f;

            modelo.addRow(fila);
        }

        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_CargarPartida = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Copiar_Partida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelPartidaActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_CargarPartida.setText("CARGAR PARTIDA");
        btn_CargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarPartidaActionPerformed(evt);
            }
        });

        btn_Volver.setText("VOLVER");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("ELIMINAR");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Copiar_Partida.setText("COPIAR PARTIDA");
        btn_Copiar_Partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Copiar_PartidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("PARTIDA ACTUAL:");

        labelPartidaActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPartidaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_CargarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Copiar_Partida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(labelPartidaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_CargarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Copiar_Partida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        vaciarTabla(jTable1);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_VolverActionPerformed

    public void vaciarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        partidas.clear();
    }

    public void actualizar() {
        vaciarTabla(jTable1);
        listarArchivosEnCarpeta();
        mostrarDatosTabla(jTable1);
    }

    public static void eliminarCarpetaConContenido(String carpetaAEliminar) {
        File carpeta = new File(carpetaAEliminar);

        if (carpeta.exists()) {
            if (carpeta.isDirectory()) {
                File[] archivos = carpeta.listFiles();
                if (archivos != null) {
                    for (File archivo : archivos) {
                        eliminarCarpetaConContenido(archivo.getAbsolutePath());
                    }
                }
            }
            if (carpeta.delete()) {

            }
        }

    }

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();//empieza a contar por el cero

        if (filaSeleccionada != -1) {
            String columna1 = jTable1.getValueAt(filaSeleccionada, 0).toString();
            String carpetaAEliminar = "C:/Users/pablo/Desktop/Remnant2/partidas_guardadas/" + columna1; // Cambia esto por la ruta de la carpeta que deseas eliminar
            eliminarCarpetaConContenido(carpetaAEliminar);
        }
        actualizar();

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    public void pasarPartidaPrincipal() {
        try {
            //cogemos la carpeta que hay en el juego y pasamos los save
            File origen = new File("C:/Users/pablo/Saved Games/Remnant2/Steam/329730419");
            String partida = mostrarPartidaActual();
            File destino = new File("C:/Users/pablo/Saved Games/Remnant2/Steam/329730419/" + partida);
            File[] archivos = origen.listFiles();

            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().contains("save")) {
                        try {
                            File nuevoArchivo = new File(destino, archivo.getName());
                            java.nio.file.Files.copy(archivo.toPath(), nuevoArchivo.toPath());
                            //Ahora eliminamos todos los save anteriores
                            if (archivo.isFile() && archivo.getName().contains("save")) {
                                archivo.delete();

                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            //Ahora copiamos la carpeta a nuestra carpeta de respaldo
            File carpetaRespaldo = new File("C:/Users/pablo/Desktop/Remnant2/partidas_guardadas/" + partida);
            copiarCarpeta(destino, carpetaRespaldo);

            //Ahora eliminamos la patida que esta cargada
            String rutaDestino = "C:/Users/pablo/Saved Games/Remnant2/Steam/329730419/" + partida;
            eliminarCarpetaConContenido(rutaDestino);
        } catch (IOException ex) {

        }
    }

    private void btn_CargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarPartidaActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();//empieza a contar por el cero
        if (filaSeleccionada != -1) {
            try {
                //Pasamos la partida guardada a la recamara
                pasarPartidaPrincipal();

                //Pasamos la partida que queremos cargar
                String nombrePartidaSecundaria = jTable1.getValueAt(filaSeleccionada, 0).toString();
                File origen = new File("C:/Users/pablo/Desktop/Remnant2/partidas_guardadas/" + nombrePartidaSecundaria);
                File destino = new File("C:/Users/pablo/Saved Games/Remnant2/Steam/329730419");
                copiarCarpeta(origen, destino);

                //Eliminamos la carpeta en recamara
                String rutaDestino = "C:/Users/pablo/Desktop/Remnant2/partidas_guardadas/" + nombrePartidaSecundaria;
                eliminarCarpetaConContenido(rutaDestino);
                //creamos la carpeta con el nombre
                 File carpeta = new File("C:/Users/pablo/Saved Games/Remnant2/Steam/329730419/" + nombrePartidaSecundaria);
                carpeta.mkdir();
                    
                //Mostramos el nombre de la partida actual y actualizamos la tabla
                mostrarPartidaActual();
                actualizar();
            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_btn_CargarPartidaActionPerformed

    public static void copiarCarpeta(File carpetaOrigen, File carpetaDestino) throws IOException {
        if (carpetaOrigen.isDirectory()) {
            if (!carpetaDestino.exists()) {
                carpetaDestino.mkdir();
            }

            String[] archivos = carpetaOrigen.list();
            for (String archivo : archivos) {
                File archivoOrigen = new File(carpetaOrigen, archivo);
                File archivoDestino = new File(carpetaDestino, archivo);

                copiarCarpeta(archivoOrigen, archivoDestino);
            }
        } else {
            Files.copy(carpetaOrigen.toPath(), carpetaDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private void btn_Copiar_PartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Copiar_PartidaActionPerformed
        /*
        Copias la partida que tengas guardada en recamara
         */

        int filaSeleccionada = jTable1.getSelectedRow();//empieza a contar por el cero
        if (filaSeleccionada != -1) {

            String nombreCarpetaNueva = JOptionPane.showInputDialog("¿Como quieres llamar a la carpeta?");
            if (!nombreCarpetaNueva.isEmpty()) {
                try {
                    String nombreCarpeta = jTable1.getValueAt(filaSeleccionada, 0).toString();
                    File carpetaOrigen = new File("C:/Users/pablo/Desktop/Remnant2/partidas_guardadas/" + nombreCarpeta);
                    File carpetaDestino = new File("C:/Users/pablo/Desktop/Remnant2/partidas_guardadas/" + nombreCarpetaNueva);
                    copiarCarpeta(carpetaOrigen, carpetaDestino);

                } catch (IOException ex) {
                    Logger.getLogger(VistaPartidas.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        actualizar();
    }//GEN-LAST:event_btn_Copiar_PartidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CargarPartida;
    private javax.swing.JButton btn_Copiar_Partida;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelPartidaActual;
    // End of variables declaration//GEN-END:variables
}

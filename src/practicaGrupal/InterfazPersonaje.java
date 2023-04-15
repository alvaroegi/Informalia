/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package practicaGrupal;

import java.util.ArrayList;

/**
 *
 * @author alemg
 */
public class InterfazPersonaje extends javax.swing.JDialog {

    /**
     * Creates new form InterfazPersonaje
     */
    public InterfazPersonaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        for (Personaje pers: registro2.getListaPersonajes()){
            PersonajesCreados.addItem(pers.getNombre() + " " + pers.getID());
            if(pers.getListaRecursos()[2]==null) {
                PersonajesCreados1.addItem(pers.getNombre() + " " + pers.getID());
            }
            PersonajesCreados2.addItem(pers.getNombre() + " " + pers.getID());
            if(pers.getPuedeCombatir()) {
                PersonajesCreados3.addItem(pers.getNombre() + " " + pers.getID());
            }
        }
    }
    InterfazMain i = new InterfazMain();
    RegistroJuego registro2 = i.getRegistroJuego();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CrearPersonaje = new javax.swing.JButton();
        TipoPersonaje = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        NombreTexto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RazaTexto = new javax.swing.JComboBox<>();
        BotonModificar = new javax.swing.JButton();
        PersonajesCreados = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NombreTextoModificado = new javax.swing.JTextField();
        BotonEliminar = new javax.swing.JButton();
        PersonajesCreados2 = new javax.swing.JComboBox<>();
        RecursoCreado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PersonajesCreados1 = new javax.swing.JComboBox<>();
        SeleccionPers = new javax.swing.JButton();
        BotonAsociar = new javax.swing.JButton();
        BotonDevolver = new javax.swing.JButton();
        PersonajesCreados3 = new javax.swing.JComboBox<>();
        SeleccionPers1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        RecursoCreado1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        Volver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personaje");
        setBackground(new java.awt.Color(153, 153, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearPersonaje.setText("Crear");
        CrearPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPersonajeActionPerformed(evt);
            }
        });
        jPanel1.add(CrearPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 75, -1));

        TipoPersonaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mago", "Explorador", "Guerrero" }));
        TipoPersonaje.setSelectedIndex(-1);
        jPanel1.add(TipoPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 108, 23));

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 49, 24));

        NombreTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextoActionPerformed(evt);
            }
        });
        jPanel1.add(NombreTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 104, 24));

        jLabel2.setText("Raza:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 41, -1));

        RazaTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Orco", "Elfo", "Enano" }));
        RazaTexto.setSelectedIndex(-1);
        jPanel1.add(RazaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 104, -1));

        BotonModificar.setText("Modificar");
        BotonModificar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                BotonModificarAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 85, -1));

        jPanel1.add(PersonajesCreados, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 123, -1));

        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
        jPanel1.add(NombreTextoModificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 88, -1));

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 83, -1));

        jPanel1.add(PersonajesCreados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 123, -1));

        jPanel1.add(RecursoCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 313, 272, -1));

        jLabel5.setText("Recurso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 293, 53, -1));

        jLabel4.setText("Personaje:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 273, 68, -1));

        jPanel1.add(PersonajesCreados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 293, 123, -1));

        SeleccionPers.setText("Elegir personaje");
        SeleccionPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionPersActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccionPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 333, 123, -1));

        BotonAsociar.setText("Asociar recurso");
        BotonAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsociarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAsociar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 314, 126, -1));

        BotonDevolver.setText("Devolver recurso");
        BotonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDevolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 424, 123, -1));

        jPanel1.add(PersonajesCreados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 405, 122, -1));

        SeleccionPers1.setText("Elegir personaje");
        SeleccionPers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionPers1ActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccionPers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 443, 122, -1));

        jLabel6.setText("Personaje:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 385, 68, -1));

        jPanel1.add(RecursoCreado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 405, 270, 23));

        jLabel7.setText("Recurso:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 385, 53, -1));

        Area.setEditable(false);
        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 484, 633, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-volver.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 63, 51));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/titulo-personajes.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-personajes.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void BotonModificarAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BotonModificarAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarAncestorMoved

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        if((NombreTextoModificado.getText().trim().equals(""))||(PersonajesCreados.getSelectedIndex()==-1)) {
            Area.setText("Error al modificar personaje. Hay algún campo vacío");
        }
        else {
            Personaje pers = registro2.getListaPersonajes().get(PersonajesCreados.getSelectedIndex());
            pers.setNuevoNombre(NombreTextoModificado.getText());
            PersonajesCreados.removeAllItems();
            PersonajesCreados1.removeAllItems();
            PersonajesCreados2.removeAllItems();
            PersonajesCreados3.removeAllItems();
            for (Personaje pers2: registro2.getListaPersonajes()){
                PersonajesCreados.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getListaRecursos()[2]==null) {
                    PersonajesCreados1.addItem(pers2.getNombre() + " " + pers2.getID());
                }
                PersonajesCreados2.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getPuedeCombatir()) {
                    PersonajesCreados3.addItem(pers2.getNombre() + " " + pers2.getID());
                }
            }
            Area.setText("Personaje modificado con éxito" + "\n" + pers.toString());
            NombreTextoModificado.setText("");
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void NombreTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextoActionPerformed

    private void CrearPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPersonajeActionPerformed
        String raza;
        if((NombreTexto.getText().trim().equals(""))||(TipoPersonaje.getSelectedIndex()==-1)||(RazaTexto.getSelectedIndex()==-1)) {
            Area.setText("Error al crear personaje. Hay algún campo vacío");
        }
        else {
            switch(RazaTexto.getSelectedIndex()) {
                case 0: raza = "Humano"; break;
                case 1: raza = "Orco"; break;
                case 2: raza = "Elfo"; break;
                case 3: raza = "Enano"; break;
                default: raza = ""; break;
            }
            Personaje pers = null;
            switch(TipoPersonaje.getSelectedIndex()) {
                case 0: {
                    pers = new Mago(registro2, NombreTexto.getText(), raza);
                } break;
                case 1: {
                    pers = new Explorador(registro2, NombreTexto.getText(), raza);
                } break;
                case 2: {
                    pers = new Guerrero(registro2, NombreTexto.getText(), raza);
                } break;
            }
            PersonajesCreados.addItem(pers.getNombre() + " " + pers.getID());
            PersonajesCreados1.addItem(pers.getNombre() + " " + pers.getID());
            PersonajesCreados2.addItem(pers.getNombre() + " " + pers.getID());
            Area.setText("Personaje creado con éxito" + "\n" + pers.toString());
            NombreTexto.setText("");
            RazaTexto.setSelectedIndex(-1);
            TipoPersonaje.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_CrearPersonajeActionPerformed

    private void SeleccionPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionPersActionPerformed
        if(PersonajesCreados1.getSelectedIndex()==-1) {
            Area.setText("Error al elegir personaje. Hay algún campo vacío");
        }
        else {
            RecursoCreado.removeAllItems();
            String nomId = (String)PersonajesCreados1.getSelectedItem();
            String id = nomId.substring(nomId.length()-3, nomId.length());
            Personaje pers = registro2.buscarPersonaje(id);
            if (pers instanceof Mago) {
                for (Recurso rec: registro2.getListaRecursos()){
                    if ((rec instanceof Hechizo)&&(!rec.getEnUso())) {
                        RecursoCreado.addItem(rec.toString());
                    }
                }
            }
            if (pers instanceof Guerrero) {
                for (Recurso rec: registro2.getListaRecursos()){
                    if ((rec instanceof Arma)&&(!rec.getEnUso())) {
                        RecursoCreado.addItem(rec.toString());
                    }
                }
            }
            if (pers instanceof Explorador) {
                for (Recurso rec: registro2.getListaRecursos()){
                    if ((rec instanceof Conjuro)&&(!rec.getEnUso())) {
                        RecursoCreado.addItem(rec.toString());
                    }
                    if ((rec instanceof Arma)&&(((Arma)rec).getManejo()==1)&&(!rec.getEnUso())) {
                        RecursoCreado.addItem(rec.toString());
                    }
                }
            }
        }
    }//GEN-LAST:event_SeleccionPersActionPerformed

    private void BotonAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsociarActionPerformed
        if((PersonajesCreados1.getSelectedIndex()==-1)||(RecursoCreado.getSelectedIndex()==-1)) {
            Area.setText("Error al adquirir un recurso. Hay algún campo vacío");
        }
        else {
            String nomId = (String)PersonajesCreados1.getSelectedItem();
            String id = nomId.substring(nomId.length()-3, nomId.length());
            Personaje pers = registro2.buscarPersonaje(id);
            String nomIdR = (String)RecursoCreado.getSelectedItem();
            String recId = nomIdR.substring(nomIdR.length()-35, nomIdR.length()-32);
            Recurso rec = registro2.buscarRecurso(recId);
            int j=0;
            while(pers.getListaRecursos()[j]!=null) {  
                j++;
            }
            pers.getListaRecursos()[j]=rec;
            rec.setEnUso(true);  
            if(pers.getListaRecursos()[0]!=null){ 
                pers.setPuedeCombatir(true);
            }
            PersonajesCreados.removeAllItems();
            PersonajesCreados1.removeAllItems();
            PersonajesCreados2.removeAllItems();
            PersonajesCreados3.removeAllItems();
            for (Personaje pers2: registro2.getListaPersonajes()){
                PersonajesCreados.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getListaRecursos()[2]==null) {
                    PersonajesCreados1.addItem(pers2.getNombre() + " " + pers2.getID());
                }
                PersonajesCreados2.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getPuedeCombatir()) {
                    PersonajesCreados3.addItem(pers2.getNombre() + " " + pers2.getID());
                }
            }
            RecursoCreado.removeAllItems();
            Area.setText("Recurso asignado con éxito");
        }
    }//GEN-LAST:event_BotonAsociarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if(PersonajesCreados2.getSelectedIndex()==-1) {
            Area.setText("Error al eliminar personaje. Hay algún campo vacío");
        }
        else {
            Personaje pers = registro2.getListaPersonajes().get(PersonajesCreados2.getSelectedIndex());
            registro2.EliminarPersonaje(pers);
            PersonajesCreados.removeAllItems();
            PersonajesCreados1.removeAllItems();
            PersonajesCreados2.removeAllItems();
            PersonajesCreados3.removeAllItems();
            for (Personaje pers2: registro2.getListaPersonajes()){
                PersonajesCreados.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getListaRecursos()[2]==null) {
                    PersonajesCreados1.addItem(pers2.getNombre() + " " + pers2.getID());
                }
                PersonajesCreados2.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getPuedeCombatir()) {
                    PersonajesCreados3.addItem(pers2.getNombre() + " " + pers2.getID());
                }
            }
            Area.setText("Personaje eliminado con éxito");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void SeleccionPers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionPers1ActionPerformed
        if(PersonajesCreados3.getSelectedIndex()==-1) {
            Area.setText("Error al elegir personaje. Hay algún campo vacío");
        }
        else {
            RecursoCreado1.removeAllItems();
            String nomId = (String)PersonajesCreados3.getSelectedItem();
            String id = nomId.substring(nomId.length()-3, nomId.length());
            Personaje pers = registro2.buscarPersonaje(id);
            for (int i=0; i<3; i++) {
                if (pers.getListaRecursos()[i]!=null) {
                    RecursoCreado1.addItem(pers.getListaRecursos()[i].toString());
                }
            }
        }
    }//GEN-LAST:event_SeleccionPers1ActionPerformed

    private void BotonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDevolverActionPerformed
        if((PersonajesCreados3.getSelectedIndex()==-1)||(RecursoCreado1.getSelectedIndex()==-1)) {
            Area.setText("Error al devolver un recurso. Hay algún campo vacío");
        }
        else {
            String nomId = (String)PersonajesCreados3.getSelectedItem();
            String id = nomId.substring(nomId.length()-3, nomId.length());
            Personaje pers = registro2.buscarPersonaje(id);
            String nomIdR = (String)RecursoCreado1.getSelectedItem();
            String recId = nomIdR.substring(nomIdR.length()-35, nomIdR.length()-32);
            Recurso rec = registro2.buscarRecurso(recId);
            rec.setEnUso(false);
            switch (RecursoCreado1.getSelectedIndex()) {
                case 0: {
                    pers.getListaRecursos()[0]=pers.getListaRecursos()[1];
                    pers.getListaRecursos()[1]=pers.getListaRecursos()[2];
                    pers.getListaRecursos()[2]=null;
                } break;        
                case 1: {
                    pers.getListaRecursos()[1]=pers.getListaRecursos()[2];
                    pers.getListaRecursos()[2]=null;
                } break;
                case 2: pers.getListaRecursos()[2]=null; break;
            }
            if(pers.getListaRecursos()[0]==null) {
                pers.setPuedeCombatir(false);
            }
            PersonajesCreados.removeAllItems();
            PersonajesCreados1.removeAllItems();
            PersonajesCreados2.removeAllItems();
            PersonajesCreados3.removeAllItems();
            for (Personaje pers2: registro2.getListaPersonajes()){
                PersonajesCreados.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getListaRecursos()[2]==null) {
                    PersonajesCreados1.addItem(pers2.getNombre() + " " + pers2.getID());
                }
                PersonajesCreados2.addItem(pers2.getNombre() + " " + pers2.getID());
                if(pers2.getPuedeCombatir()) {
                    PersonajesCreados3.addItem(pers2.getNombre() + " " + pers2.getID());
                }
            }
            RecursoCreado1.removeAllItems();
            Area.setText("Recurso devuelto con éxito");
        }
    }//GEN-LAST:event_BotonDevolverActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazPersonaje dialog = new InterfazPersonaje(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JButton BotonAsociar;
    private javax.swing.JButton BotonDevolver;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton CrearPersonaje;
    private javax.swing.JTextField NombreTexto;
    private javax.swing.JTextField NombreTextoModificado;
    private javax.swing.JComboBox<String> PersonajesCreados;
    private javax.swing.JComboBox<String> PersonajesCreados1;
    private javax.swing.JComboBox<String> PersonajesCreados2;
    private javax.swing.JComboBox<String> PersonajesCreados3;
    private javax.swing.JComboBox<String> RazaTexto;
    private javax.swing.JComboBox<String> RecursoCreado;
    private javax.swing.JComboBox<String> RecursoCreado1;
    private javax.swing.JButton SeleccionPers;
    private javax.swing.JButton SeleccionPers1;
    private javax.swing.JComboBox<String> TipoPersonaje;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

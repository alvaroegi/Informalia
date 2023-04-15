/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package practicaGrupal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author alemg
 */
public class InterfazCombate extends javax.swing.JDialog {

    /**
     * Creates new form InterfazCombate
     */
    public InterfazCombate(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.repaint();
        this.setSize(this.getToolkit().getScreenSize());
        Recurso rec=jugador1.getListaRecursos()[0];
        AreaP1R1.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
        if(jugador1.getListaRecursos()[1]==null) {
            BotonP1R2.setVisible(false);
            AreaP1R2.setVisible(false);
            BotonP1R3.setVisible(false);
            AreaP1R3.setVisible(false);
        } else if(jugador1.getListaRecursos()[2]==null) {
            BotonP1R3.setVisible(false);
            AreaP1R3.setVisible(false);
            rec=jugador1.getListaRecursos()[1];
            AreaP1R2.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                    + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
        }
        else {
            rec=jugador1.getListaRecursos()[1];
            AreaP1R2.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                    + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
            rec=jugador1.getListaRecursos()[2];
            AreaP1R3.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                    + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
        }
        rec=jugador2.getListaRecursos()[0];
        AreaP2R1.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
        if(jugador2.getListaRecursos()[1]==null) {
            BotonP2R2.setVisible(false);
            AreaP2R2.setVisible(false);
            BotonP2R3.setVisible(false);
            AreaP2R3.setVisible(false);
        } else if(jugador2.getListaRecursos()[2]==null) {
            BotonP2R3.setVisible(false);
            AreaP2R3.setVisible(false);
            rec=jugador2.getListaRecursos()[1];
            AreaP2R2.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                    + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
        }
        else {
            rec=jugador2.getListaRecursos()[1];
            AreaP2R2.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                    + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
            rec=jugador2.getListaRecursos()[2];
            AreaP2R3.setText(rec.getNombre() + "\n Bonus ataque: " + rec.getBonusOfen()
                    + "\n Bonus defensa: " + rec.getBonusDefen() + "\n Bonus astucia: " + rec.getBonusAstu() + "\n");
        }
        VidaJug1.setValue(100);
        VidaJug2.setValue(100);
        if(!CombateJugador) {
            BotonP2R1.setVisible(false);
            BotonP2R2.setVisible(false);
            BotonP2R3.setVisible(false);
            //**************
        }
        if (jugador1 instanceof Mago) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/icono-informalia2.png"));
            ImagenJug1.setIcon(icono);
        }
        if (jugador1 instanceof Guerrero) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/icono-guerrero2.png"));
            ImagenJug1.setIcon(icono);
        }
        if (jugador1 instanceof Explorador) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/icono-explorador2.png"));
            ImagenJug1.setIcon(icono);
        }
        if (jugador2 instanceof Mago) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/icono-informalia.png"));
            ImagenJug2.setIcon(icono);
        }
        if (jugador2 instanceof Guerrero) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/icono-guerrero.png"));
            ImagenJug2.setIcon(icono);
        }
        if (jugador2 instanceof Explorador) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/icono-explorador.png"));
            ImagenJug2.setIcon(icono);
        }
        Imagen im = new Imagen(jPanel3);
        jPanel3.add(im).repaint();
    }
    
    InterfazMain i = new InterfazMain();
    RegistroJuego registro2 = i.getRegistroJuego();
    InterfazInicioCombate c = new InterfazInicioCombate(i,true);
    boolean CombateJugador = c.getCombateJugador();
    Personaje jugador1 = c.getJugador1();
    Personaje jugador2 = c.getJugador2();
    private int iniciativa = 1;
    private int contador = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TextoGanador = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        ImagenJug1 = new javax.swing.JLabel();
        VidaJug1 = new javax.swing.JProgressBar();
        ImagenJug2 = new javax.swing.JLabel();
        VidaJug2 = new javax.swing.JProgressBar();
        AccionJug1 = new javax.swing.JLabel();
        AccionJug2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonP1R1 = new javax.swing.JRadioButton();
        BotonP1R2 = new javax.swing.JRadioButton();
        BotonP1R3 = new javax.swing.JRadioButton();
        BotonP2R1 = new javax.swing.JRadioButton();
        BotonP2R2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaP1R1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaP1R2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaP1R3 = new javax.swing.JTextArea();
        BotonP2R3 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AreaP2R2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        AreaP2R1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        AreaP2R3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        SiguienteRonda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(getToolkit().getScreenSize());
        setUndecorated(true);
        setPreferredSize(getToolkit().getScreenSize());
        setResizable(false);
        setSize(getToolkit().getScreenSize());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        TextoGanador.setEditable(false);
        TextoGanador.setBackground(new java.awt.Color(240, 240, 240));
        TextoGanador.setColumns(20);
        TextoGanador.setLineWrap(true);
        TextoGanador.setRows(5);
        jScrollPane7.setViewportView(TextoGanador);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImagenJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VidaJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 701, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(VidaJug2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(ImagenJug2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(235, 235, 235))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(VidaJug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(ImagenJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(VidaJug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ImagenJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AccionJug1.setText("Ataca");

        AccionJug2.setText("Defiende");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(AccionJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248)
                .addComponent(AccionJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccionJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccionJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        buttonGroup1.add(BotonP1R1);

        buttonGroup1.add(BotonP1R2);

        buttonGroup1.add(BotonP1R3);

        buttonGroup2.add(BotonP2R1);

        buttonGroup2.add(BotonP2R2);

        AreaP1R1.setEditable(false);
        AreaP1R1.setColumns(20);
        AreaP1R1.setLineWrap(true);
        AreaP1R1.setRows(5);
        AreaP1R1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AreaP1R1.setPreferredSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(AreaP1R1);

        AreaP1R2.setEditable(false);
        AreaP1R2.setColumns(20);
        AreaP1R2.setLineWrap(true);
        AreaP1R2.setRows(5);
        jScrollPane2.setViewportView(AreaP1R2);

        AreaP1R3.setEditable(false);
        AreaP1R3.setColumns(20);
        AreaP1R3.setLineWrap(true);
        AreaP1R3.setRows(5);
        jScrollPane3.setViewportView(AreaP1R3);

        buttonGroup2.add(BotonP2R3);

        AreaP2R2.setEditable(false);
        AreaP2R2.setColumns(20);
        AreaP2R2.setLineWrap(true);
        AreaP2R2.setRows(5);
        jScrollPane4.setViewportView(AreaP2R2);

        AreaP2R1.setEditable(false);
        AreaP2R1.setColumns(20);
        AreaP2R1.setLineWrap(true);
        AreaP2R1.setRows(5);
        jScrollPane5.setViewportView(AreaP2R1);

        AreaP2R3.setEditable(false);
        AreaP2R3.setColumns(20);
        AreaP2R3.setLineWrap(true);
        AreaP2R3.setRows(5);
        jScrollPane6.setViewportView(AreaP2R3);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SiguienteRonda.setText("Empezar");
        SiguienteRonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteRondaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 172, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BotonP1R1)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BotonP1R2)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(BotonP1R3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(SiguienteRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(BotonP2R1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BotonP2R2)
                        .addGap(149, 149, 149)
                        .addComponent(BotonP2R3)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(713, 713, 713)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(SiguienteRonda))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotonP2R1)
                                .addComponent(BotonP2R3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(BotonP2R2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotonP1R3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BotonP1R2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(BotonP1R1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteRondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteRondaActionPerformed
        SiguienteRonda.setText("Siguiente ronda");
        Timer timer = new Timer();
        TimerTask tarea1 = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                if(ImagenJug1.isVisible()) {
                    if(i>2) cancel();
                    ImagenJug1.setVisible(false);
                    i++;
                }
                else {
                    if(i>2) cancel();
                    ImagenJug1.setVisible(true);
                    i++;
                }
            }
        };
        TimerTask tarea2 = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                if(ImagenJug2.isVisible()) {
                    if(i>2) cancel();
                    ImagenJug2.setVisible(false);
                    i++;
                }
                else {
                    if(i>2) cancel();
                    ImagenJug2.setVisible(true);
                    i++;
                }
            }
        };
        TimerTask tarea3 = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                if(ImagenJug1.isVisible()) {
                    if(i>2) cancel();
                    ImagenJug1.setVisible(false);
                    i++;
                }
                else {
                    if(i>2) cancel();
                    ImagenJug1.setVisible(true);
                    i++;
                }
            }
        };
        TimerTask tarea4 = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                if(ImagenJug2.isVisible()) {
                    if(i>2) cancel();
                    ImagenJug2.setVisible(false);
                    i++;
                }
                else {
                    if(i>2) cancel();
                    ImagenJug2.setVisible(true);
                    i++;
                }
            }
        };
        if(CombateJugador) {
            int valorAtaque, valorDefensa;
            switch (iniciativa) {
                case 1: this.recursoActivoJug1();
                valorAtaque=jugador1.Atacar();
                this.recursoActivoJug2();
                valorDefensa=jugador2.Defender();
                if(valorAtaque>valorDefensa) {
                    jugador2.setVitalidad(jugador2.getVitalidad()-1);
                    VidaJug2.setValue(VidaJug2.getValue()-10);
                    TextoGanador.setText("Ataque efectivo");
                    timer.schedule(tarea2, 0, 300);
                }
                else {
                    TextoGanador.setText("Ataque defendido");
                }
                contador++;
                break;
                case 2: this.recursoActivoJug2();
                valorAtaque=jugador2.Atacar();
                this.recursoActivoJug1();
                valorDefensa=jugador1.Defender();
                if(valorAtaque>valorDefensa) {
                    jugador1.setVitalidad(jugador1.getVitalidad()-1);
                    VidaJug1.setValue(VidaJug1.getValue()-10);
                    TextoGanador.setText("Ataque efectivo");
                    timer.schedule(tarea1, 0, 300);
                }
                else {
                    TextoGanador.setText("Ataque defendido");
                }
                contador++;
                break;
            }
            if (jugador1.getVitalidad()>0 && jugador2.getVitalidad()>0) {
                int p1 = jugador1.Astucia();
                int p2 = jugador2.Astucia();
                if (p1>=p2) {
                    if (p1>p2) {
                        iniciativa = 1;
                        jugador2.setVitalidad(jugador2.getVitalidad()-1);
                        AccionJug1.setText("Ataca");
                        AccionJug2.setText("Defiende");
                        VidaJug2.setValue(VidaJug2.getValue()-10);
                        TextoGanador.append("\n El jugador 1 gana en astucia");
                        timer.schedule(tarea4, 100, 300);
                    }
                    else {
                        TextoGanador.append("\n Empate en astucia, se mantiene");
                    }
                } else {
                    AccionJug1.setText("Defiende");
                    AccionJug2.setText("Ataca");
                    iniciativa = 2;
                    jugador1.setVitalidad(jugador1.getVitalidad()-1);
                    VidaJug1.setValue(VidaJug1.getValue()-10);
                    TextoGanador.append("\n El jugador 2 gana en astucia");
                    timer.schedule(tarea3, 100, 300);
                }
            }
        }
        else {
            BotonP2R1.setVisible(false);
            BotonP2R2.setVisible(false);
            BotonP2R3.setVisible(false);
            int valorAtaque, valorDefensa;
            int rand;
            switch (iniciativa) {
                case 1: this.recursoActivoJug1();
                valorAtaque=jugador1.Atacar();
                jugador2.RecursoActivoMaquina();
                valorDefensa=jugador2.Defender();
                if(valorAtaque>valorDefensa) {
                    jugador2.setVitalidad(jugador2.getVitalidad()-1);
                    VidaJug2.setValue(VidaJug2.getValue()-10);
                    TextoGanador.setText("Ataque efectivo");
                    timer.schedule(tarea2, 0, 300);
                }
                else {
                    TextoGanador.setText("Ataque defendido");
                }
                contador++;
                break;
                case 2: jugador2.RecursoActivoMaquina();
                valorAtaque=jugador2.Atacar();
                this.recursoActivoJug1();
                valorDefensa=jugador1.Defender();
                if(valorAtaque>valorDefensa) {
                    jugador1.setVitalidad(jugador1.getVitalidad()-1);
                    VidaJug1.setValue(VidaJug1.getValue()-10);
                    TextoGanador.setText("Ataque efectivo");
                    timer.schedule(tarea1, 0, 300);
                }
                else {
                    TextoGanador.setText("Ataque defendido");
                }
                contador++;
                break;
            }
            if (jugador1.getVitalidad()>0 && jugador2.getVitalidad()>0) {
                int p1 = jugador1.Astucia();
                int p2 = jugador2.Astucia();
                if (p1>=p2) {
                    if (p1>p2) {
                        iniciativa = 1;
                        jugador2.setVitalidad(jugador2.getVitalidad()-1);
                        VidaJug2.setValue(VidaJug2.getValue()-10);
                        TextoGanador.append("\n El jugador 1 gana en astucia");
                        timer.schedule(tarea4, 100, 300);
                        AccionJug1.setText("Ataca");
                        AccionJug2.setText("Defiende");
                    }
                    else {
                        TextoGanador.append("\n Empate en astucia, se mantiene");
                    }
                } else {
                    iniciativa = 2;
                    jugador1.setVitalidad(jugador1.getVitalidad()-1);
                    VidaJug1.setValue(VidaJug1.getValue()-10);
                    TextoGanador.append("\n El jugador 2 gana en astucia");
                    timer.schedule(tarea3, 100, 300);
                    AccionJug1.setText("Defiende");
                    AccionJug2.setText("Ataca");
                }
            }
        }
        if (jugador1.getVitalidad()==0) {
            SiguienteRonda.setEnabled(false);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String date = dtf.format(LocalDateTime.now());
            Combate comb = new Combate(jugador1,jugador2,contador,date, registro2);
            jugador1.setVitalidad(10);
            jugador2.setVitalidad(10);
            TextoGanador.setText("GANADOR: " + jugador2.getNombre());
        } else
        if (jugador2.getVitalidad()==0) {
            SiguienteRonda.setEnabled(false);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String date = dtf.format(LocalDateTime.now());
            Combate comb = new Combate(jugador1,jugador2,contador,date, registro2);
            jugador1.setVitalidad(10);
            jugador2.setVitalidad(10);
            TextoGanador.setText("GANADOR: " + jugador1.getNombre());
        }
    }//GEN-LAST:event_SiguienteRondaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jugador1.setVitalidad(10);
        jugador2.setVitalidad(10);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void recursoActivoJug1 () {
        if(BotonP1R1.isSelected()) {
            jugador1.setRecursoActivo(jugador1.getListaRecursos()[0]);
        }
        else if(BotonP1R2.isSelected()) {
            jugador1.setRecursoActivo(jugador1.getListaRecursos()[1]);
        }
        else if(BotonP1R3.isSelected()) {
            jugador1.setRecursoActivo(jugador1.getListaRecursos()[2]);
        }
        else {
            jugador1.setRecursoActivo(jugador1.getListaRecursos()[0]);
        }
    }
    
    public void recursoActivoJug2 () {
        if(BotonP2R1.isSelected()) {
            jugador2.setRecursoActivo(jugador2.getListaRecursos()[0]);
        }
        else if(BotonP2R2.isSelected()) {
            jugador2.setRecursoActivo(jugador2.getListaRecursos()[1]);
        }
        else if(BotonP2R3.isSelected()) {
            jugador2.setRecursoActivo(jugador2.getListaRecursos()[2]);
        }
        else {
            jugador2.setRecursoActivo(jugador2.getListaRecursos()[0]);
        }
    }
    
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
            java.util.logging.Logger.getLogger(InterfazCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazCombate dialog = new InterfazCombate(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel AccionJug1;
    private javax.swing.JLabel AccionJug2;
    private javax.swing.JTextArea AreaP1R1;
    private javax.swing.JTextArea AreaP1R2;
    private javax.swing.JTextArea AreaP1R3;
    private javax.swing.JTextArea AreaP2R1;
    private javax.swing.JTextArea AreaP2R2;
    private javax.swing.JTextArea AreaP2R3;
    private javax.swing.JRadioButton BotonP1R1;
    private javax.swing.JRadioButton BotonP1R2;
    private javax.swing.JRadioButton BotonP1R3;
    private javax.swing.JRadioButton BotonP2R1;
    private javax.swing.JRadioButton BotonP2R2;
    private javax.swing.JRadioButton BotonP2R3;
    private javax.swing.JLabel ImagenJug1;
    private javax.swing.JLabel ImagenJug2;
    private javax.swing.JButton SiguienteRonda;
    private javax.swing.JTextArea TextoGanador;
    private javax.swing.JProgressBar VidaJug1;
    private javax.swing.JProgressBar VidaJug2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}

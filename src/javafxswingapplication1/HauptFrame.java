
package javafxswingapplication1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc
 */
public class HauptFrame extends javax.swing.JFrame {

    String a,b;
    String at,on,in ;
    boolean cont = false ;
    
    Universitaet uni = new Universitaet();
    Student std = new Student(a,b);
    Dozent dzt = new Dozent(at,on,in);
    JFrame jf = new JFrame();
    
    public HauptFrame() {
        initComponents();
        
      table_Studenten.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged (ListSelectionEvent e){
            int i = table_Studenten.getSelectedRow();
            if(i>=0){
              tf_namestd.setText((String)  table_Studenten.getModel().getValueAt(i, 0));
               tf_nachnamestd.setText((String)  table_Studenten.getModel().getValueAt(i, 1));
               tf_matnumstd.setText((String)  table_Studenten.getModel().getValueAt(i, 2));
            }
        }
        });

       table_Dozenten.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged (ListSelectionEvent e){
            int i = table_Dozenten.getSelectedRow();
            if(i>=0){
              tf_namedzt.setText((String)  table_Dozenten.getModel().getValueAt(i, 0));
              tf_nachnamedzt.setText((String)  table_Dozenten.getModel().getValueAt(i, 1));
              tf_tcnumdzt.setText((String)  table_Dozenten.getModel().getValueAt(i, 2));
            }
        }
        });
       
        table_LVAs.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged (ListSelectionEvent e){
            int i = table_LVAs.getSelectedRow();
            if(i>=0){
              tf_codeLVA.setText((String)  table_LVAs.getModel().getValueAt(i, 0));
              tf_nameLVA.setText((String)  table_LVAs.getModel().getValueAt(i, 1)); 
            }
        }
        });
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Homepage = new javax.swing.JPanel();
        yep = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        StudentenVerwaltung = new javax.swing.JPanel();
        lb_namestd = new javax.swing.JLabel();
        lb_nachnamestd = new javax.swing.JLabel();
        tf_nachnamestd = new javax.swing.JTextField();
        lb_matnumstd = new javax.swing.JLabel();
        tf_matnumstd = new javax.swing.JTextField();
        lb_studenttitel = new javax.swing.JLabel();
        tf_namestd = new javax.swing.JTextField();
        bt_studentHinzufügen = new javax.swing.JButton();
        bt_studentSuchen = new javax.swing.JButton();
        bt_studentBearbeiten = new javax.swing.JButton();
        bt_studentLöschen = new javax.swing.JButton();
        bt_studentAnmelden = new javax.swing.JButton();
        bt_studentAbmelden = new javax.swing.JButton();
        bt_studentenLVAs = new javax.swing.JButton();
        Studenten_Table = new javax.swing.JScrollPane();
        table_Studenten = new javax.swing.JTable();
        lb_titelliste = new javax.swing.JLabel();
        lb_alterstd = new javax.swing.JLabel();
        tf_alterstd = new javax.swing.JTextField();
        lb_fachbereichstd = new javax.swing.JLabel();
        tf_fachbereichstd = new javax.swing.JTextField();
        lb_emailstd = new javax.swing.JLabel();
        tf_emailstd = new javax.swing.JTextField();
        lb_semesterstd = new javax.swing.JLabel();
        tf_semesterstd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_LvaStd = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_LVAsStd = new javax.swing.JTable();
        lb_studentzurlva = new javax.swing.JLabel();
        lb_alleLVAsStd = new javax.swing.JLabel();
        lb_tlfnnummerstd = new javax.swing.JLabel();
        tf_telefonnummerstd = new javax.swing.JTextField();
        lb_geschlechtstd = new javax.swing.JLabel();
        lb_bürgerschaftstd = new javax.swing.JLabel();
        tf_bürgerschaftstd = new javax.swing.JTextField();
        tf_geschlechtstd = new javax.swing.JTextField();
        DozentenVerwaltung = new javax.swing.JPanel();
        lb_dozenttitel = new javax.swing.JLabel();
        lb_namedzt = new javax.swing.JLabel();
        tf_namedzt = new javax.swing.JTextField();
        lb_nachnamedzt = new javax.swing.JLabel();
        tf_nachnamedzt = new javax.swing.JTextField();
        lb_tcnumdzt = new javax.swing.JLabel();
        tf_tcnumdzt = new javax.swing.JTextField();
        bt_dozentHinzufügen = new javax.swing.JButton();
        bt_dozentSuchen = new javax.swing.JButton();
        bt_dozentBearbeiten = new javax.swing.JButton();
        bt_dozentLöschen = new javax.swing.JButton();
        bt_dozentZuwiesen = new javax.swing.JButton();
        bt_dozentAbmelden = new javax.swing.JButton();
        bt_dozentenLVAs = new javax.swing.JButton();
        Dozenten_Table = new javax.swing.JScrollPane();
        table_Dozenten = new javax.swing.JTable();
        label1 = new java.awt.Label();
        lb_alterdzt = new javax.swing.JLabel();
        tf_alterdzt = new javax.swing.JTextField();
        lb_fachbereichdzt = new javax.swing.JLabel();
        tf_fachbereichdzt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_emaildzt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_LvasDzt = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_zeigLva = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_telefonnummerdzt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_bürgerschaftdzt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_geschlechtdzt = new javax.swing.JTextField();
        LvaVerwaltung = new javax.swing.JPanel();
        lb_lvatitel = new javax.swing.JLabel();
        lb_codeLVA = new javax.swing.JLabel();
        tf_codeLVA = new javax.swing.JTextField();
        lb_nameLVA = new javax.swing.JLabel();
        tf_nameLVA = new javax.swing.JTextField();
        bt_lvaHinzufügen = new javax.swing.JButton();
        bt_lvaSuchen = new javax.swing.JButton();
        bt_lvaBearbeiten = new javax.swing.JButton();
        bt_lvaLöschen = new javax.swing.JButton();
        bt_angemeldeteStdLvas = new javax.swing.JButton();
        bt_angemeldeteDztLvas = new javax.swing.JButton();
        LVA_Table = new javax.swing.JScrollPane();
        table_LVAs = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_anmldStd = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_anmldDzt = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        Homepage.setBackground(new java.awt.Color(0, 153, 153));

        yep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javafxswingapplication1/taü_alt kısım.PNG"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javafxswingapplication1/taü.PNG"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout HomepageLayout = new javax.swing.GroupLayout(Homepage);
        Homepage.setLayout(HomepageLayout);
        HomepageLayout.setHorizontalGroup(
            HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepageLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomepageLayout.createSequentialGroup()
                .addGap(0, 294, Short.MAX_VALUE)
                .addComponent(yep)
                .addGap(287, 287, 287))
        );
        HomepageLayout.setVerticalGroup(
            HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepageLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(633, 633, 633)
                .addComponent(yep)
                .addContainerGap(991, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Homepage", Homepage);

        StudentenVerwaltung.setBackground(new java.awt.Color(0, 153, 153));

        lb_namestd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_namestd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_namestd.setText("Name : ");

        lb_nachnamestd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_nachnamestd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nachnamestd.setText("Nachname : ");

        lb_matnumstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_matnumstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_matnumstd.setText("MatrikelNummer* : ");

        lb_studenttitel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lb_studenttitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_studenttitel.setText("--- STUDENTEN ---");

        bt_studentHinzufügen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentHinzufügen.setText("Student hinzufügen");
        bt_studentHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentHinzufügenActionPerformed(evt);
            }
        });

        bt_studentSuchen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentSuchen.setText("Student suchen");
        bt_studentSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentSuchenActionPerformed(evt);
            }
        });

        bt_studentBearbeiten.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentBearbeiten.setText("Student bearbeiten");
        bt_studentBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentBearbeitenActionPerformed(evt);
            }
        });

        bt_studentLöschen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentLöschen.setText("Student löschen");
        bt_studentLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentLöschenActionPerformed(evt);
            }
        });

        bt_studentAnmelden.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentAnmelden.setText("Student zur LVA anmelden");
        bt_studentAnmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentAnmeldenActionPerformed(evt);
            }
        });

        bt_studentAbmelden.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentAbmelden.setText("Student von LVA abmelden");
        bt_studentAbmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentAbmeldenActionPerformed(evt);
            }
        });

        bt_studentenLVAs.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_studentenLVAs.setText("Alle LVAs eines Studenten anzeigen");
        bt_studentenLVAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_studentenLVAsActionPerformed(evt);
            }
        });

        table_Studenten.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        table_Studenten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "Matrikelnummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Studenten_Table.setViewportView(table_Studenten);

        lb_titelliste.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lb_titelliste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titelliste.setText("--- List der Studenten ---");
        lb_titelliste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lb_alterstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_alterstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_alterstd.setText("Alter : ");

        lb_fachbereichstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_fachbereichstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_fachbereichstd.setText("Fachbereich : ");

        lb_emailstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_emailstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_emailstd.setText("E-Mail Adresse : ");

        lb_semesterstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_semesterstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_semesterstd.setText("Semester : ");

        table_LvaStd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrikelnummer", "Code der LVA", "Name der LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_LvaStd);

        table_LVAsStd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrikelnummer", "Code der LVA", "Name der LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_LVAsStd);

        lb_studentzurlva.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lb_studentzurlva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_studentzurlva.setText("--- LVAs der Studenten ---");

        lb_alleLVAsStd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lb_alleLVAsStd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_alleLVAsStd.setText("--- Alle LVAs eines Studenten ---");

        lb_tlfnnummerstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_tlfnnummerstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tlfnnummerstd.setText("Telefonnummer : ");

        lb_geschlechtstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_geschlechtstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_geschlechtstd.setText("Geschlecht : ");

        lb_bürgerschaftstd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_bürgerschaftstd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bürgerschaftstd.setText("Bürger von : ");

        javax.swing.GroupLayout StudentenVerwaltungLayout = new javax.swing.GroupLayout(StudentenVerwaltung);
        StudentenVerwaltung.setLayout(StudentenVerwaltungLayout);
        StudentenVerwaltungLayout.setHorizontalGroup(
            StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                .addComponent(lb_studenttitel, javax.swing.GroupLayout.PREFERRED_SIZE, 1948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_namestd, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_nachnamestd, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_fachbereichstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_matnumstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_semesterstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_emailstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_tlfnnummerstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_alterstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_bürgerschaftstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_geschlechtstd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nachnamestd, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(tf_namestd, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(tf_matnumstd, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(tf_fachbereichstd)
                            .addComponent(tf_semesterstd, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(tf_emailstd)
                            .addComponent(tf_bürgerschaftstd)
                            .addComponent(tf_alterstd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_telefonnummerstd)
                            .addComponent(tf_geschlechtstd)))
                    .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_studentenLVAs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                                .addComponent(bt_studentSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                                .addComponent(bt_studentLöschen, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                                .addComponent(bt_studentHinzufügen, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_studentBearbeiten, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_studentAnmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_studentAbmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(379, 379, 379)
                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Studenten_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_titelliste, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_studentzurlva, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_alleLVAsStd, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
        );
        StudentenVerwaltungLayout.setVerticalGroup(
            StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentenVerwaltungLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_studenttitel)
                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentenVerwaltungLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_titelliste)
                        .addGap(11, 11, 11))
                    .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_namestd)
                            .addComponent(tf_namestd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_nachnamestd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tf_nachnamestd, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_matnumstd)
                            .addComponent(tf_matnumstd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_fachbereichstd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fachbereichstd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_semesterstd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_semesterstd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_emailstd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_emailstd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_studentzurlva)
                            .addComponent(lb_tlfnnummerstd, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(tf_telefonnummerstd)))
                    .addComponent(Studenten_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lb_alleLVAsStd)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_alterstd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_alterstd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_bürgerschaftstd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_bürgerschaftstd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_geschlechtstd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_geschlechtstd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_studentLöschen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_studentSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StudentenVerwaltungLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(StudentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_studentHinzufügen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_studentBearbeiten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addComponent(bt_studentAnmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bt_studentAbmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(bt_studentenLVAs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1008, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Studenten der Universitaet verwalten", StudentenVerwaltung);

        DozentenVerwaltung.setBackground(new java.awt.Color(0, 153, 153));

        lb_dozenttitel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lb_dozenttitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_dozenttitel.setText("--- DOZENTEN ---");

        lb_namedzt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_namedzt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_namedzt.setText("Name : ");

        tf_namedzt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        lb_nachnamedzt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_nachnamedzt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nachnamedzt.setText("Nachname : ");

        tf_nachnamedzt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        lb_tcnumdzt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_tcnumdzt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tcnumdzt.setText("TC-Nummer* : ");

        tf_tcnumdzt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        bt_dozentHinzufügen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentHinzufügen.setText("Dozent hinzufügen");
        bt_dozentHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentHinzufügenActionPerformed(evt);
            }
        });

        bt_dozentSuchen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentSuchen.setText("Dozent suchen");
        bt_dozentSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentSuchenActionPerformed(evt);
            }
        });

        bt_dozentBearbeiten.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentBearbeiten.setText("Dozent bearbeiten");
        bt_dozentBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentBearbeitenActionPerformed(evt);
            }
        });

        bt_dozentLöschen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentLöschen.setText("Dozent löschen");
        bt_dozentLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentLöschenActionPerformed(evt);
            }
        });

        bt_dozentZuwiesen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentZuwiesen.setText("Dozent zur LVA zuweisen");
        bt_dozentZuwiesen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentZuwiesenActionPerformed(evt);
            }
        });

        bt_dozentAbmelden.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentAbmelden.setText("Dozent von LVA abmelden");
        bt_dozentAbmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentAbmeldenActionPerformed(evt);
            }
        });

        bt_dozentenLVAs.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_dozentenLVAs.setText("Alle LVAs des Dozenten anzeigen");
        bt_dozentenLVAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dozentenLVAsActionPerformed(evt);
            }
        });

        table_Dozenten.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        table_Dozenten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "TC-Nummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Dozenten_Table.setViewportView(table_Dozenten);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("--- List der Dozenten ---");

        lb_alterdzt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_alterdzt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_alterdzt.setText("Alter :");

        lb_fachbereichdzt.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_fachbereichdzt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_fachbereichdzt.setText("Fachbereich : ");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("E-Mail Adresse : ");

        table_LvasDzt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC-Nummer", "Code der LVA", "Name der LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_LvasDzt);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("--- LVAs der Dozenten ---");

        table_zeigLva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC-Nummer", "Code der LVA", "Name der LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_zeigLva);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("--- Alle LVAs des Dozenten ---");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Telefonnummer : ");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Bürger von :");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Geschlecht : ");

        javax.swing.GroupLayout DozentenVerwaltungLayout = new javax.swing.GroupLayout(DozentenVerwaltung);
        DozentenVerwaltung.setLayout(DozentenVerwaltungLayout);
        DozentenVerwaltungLayout.setHorizontalGroup(
            DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                .addComponent(lb_dozenttitel, javax.swing.GroupLayout.PREFERRED_SIZE, 1949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DozentenVerwaltungLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_fachbereichdzt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(lb_tcnumdzt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(lb_alterdzt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(lb_nachnamedzt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_namedzt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_emaildzt, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(tf_alterdzt)
                            .addComponent(tf_tcnumdzt)
                            .addComponent(tf_fachbereichdzt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_namedzt)
                            .addComponent(tf_nachnamedzt)
                            .addComponent(tf_telefonnummerdzt)
                            .addComponent(tf_bürgerschaftdzt)
                            .addComponent(tf_geschlechtdzt)))
                    .addComponent(bt_dozentZuwiesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_dozentAbmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_dozentenLVAs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_dozentSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_dozentHinzufügen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_dozentLöschen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_dozentBearbeiten, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DozentenVerwaltungLayout.createSequentialGroup()
                            .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Dozenten_Table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(337, 337, 337))
                        .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        DozentenVerwaltungLayout.setVerticalGroup(
            DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lb_dozenttitel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_namedzt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_namedzt))
                        .addGap(18, 18, 18)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nachnamedzt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nachnamedzt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_tcnumdzt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_tcnumdzt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_alterdzt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_alterdzt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_fachbereichdzt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fachbereichdzt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_emaildzt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dozenten_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)))
                .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(tf_telefonnummerdzt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tf_bürgerschaftdzt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                                .addComponent(tf_geschlechtdzt)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_dozentHinzufügen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_dozentBearbeiten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(DozentenVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_dozentSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_dozentLöschen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(bt_dozentZuwiesen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_dozentAbmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(bt_dozentenLVAs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1042, 1042, 1042))
                    .addGroup(DozentenVerwaltungLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Dozenten der Universitaet verwalten", DozentenVerwaltung);

        LvaVerwaltung.setBackground(new java.awt.Color(0, 153, 153));

        lb_lvatitel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lb_lvatitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lvatitel.setText("--- LEHRVERANSTALTUNGEN ---");

        lb_codeLVA.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_codeLVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_codeLVA.setText("Code der Vorlesung : ");

        lb_nameLVA.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lb_nameLVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nameLVA.setText("Name der Vorlesung : ");

        bt_lvaHinzufügen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_lvaHinzufügen.setText("LVA hinzufügen");
        bt_lvaHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lvaHinzufügenActionPerformed(evt);
            }
        });

        bt_lvaSuchen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_lvaSuchen.setText("LVA suchen");
        bt_lvaSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lvaSuchenActionPerformed(evt);
            }
        });

        bt_lvaBearbeiten.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_lvaBearbeiten.setText("LVA bearbeiten");
        bt_lvaBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lvaBearbeitenActionPerformed(evt);
            }
        });

        bt_lvaLöschen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_lvaLöschen.setText("LVA löschen");
        bt_lvaLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lvaLöschenActionPerformed(evt);
            }
        });

        bt_angemeldeteStdLvas.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_angemeldeteStdLvas.setText("Alle angemeldeten Studenten der LVA auflisten");
        bt_angemeldeteStdLvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_angemeldeteStdLvasActionPerformed(evt);
            }
        });

        bt_angemeldeteDztLvas.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bt_angemeldeteDztLvas.setText("Alle angemeldeten Dozenten der LVA auflisten");
        bt_angemeldeteDztLvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_angemeldeteDztLvasActionPerformed(evt);
            }
        });

        table_LVAs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code der LVA", "Name der LVA"
            }
        ));
        LVA_Table.setViewportView(table_LVAs);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("--- List der Lehrveranstaltungen ---");

        table_anmldStd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrikelnummer des angemeldeten Studenten", "Code der LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(table_anmldStd);

        table_anmldDzt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC-Nummer des angemeldeten Dozenten ", "Code der LVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(table_anmldDzt);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("--- Alle angemeldete Studenten der LVA --- ");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("--- Alle angemeldete Dozenten der LVA ---");

        javax.swing.GroupLayout LvaVerwaltungLayout = new javax.swing.GroupLayout(LvaVerwaltung);
        LvaVerwaltung.setLayout(LvaVerwaltungLayout);
        LvaVerwaltungLayout.setHorizontalGroup(
            LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_lvatitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_angemeldeteDztLvas, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LvaVerwaltungLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                                .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_codeLVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_nameLVA, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                    .addComponent(bt_lvaHinzufügen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_lvaSuchen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_codeLVA, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                            .addComponent(tf_nameLVA))
                                        .addComponent(bt_lvaBearbeiten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bt_lvaLöschen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bt_angemeldeteStdLvas, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(370, 370, 370)
                .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5)
                    .addComponent(LVA_Table)
                    .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                                    .addGap(560, 560, 560)
                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(162, 162, 162))
        );
        LvaVerwaltungLayout.setVerticalGroup(
            LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lb_lvatitel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_codeLVA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_codeLVA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nameLVA)
                            .addComponent(tf_nameLVA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_lvaHinzufügen)
                            .addComponent(bt_lvaBearbeiten)))
                    .addGroup(LvaVerwaltungLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(LVA_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LvaVerwaltungLayout.createSequentialGroup()
                        .addGroup(LvaVerwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_lvaSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_lvaLöschen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(bt_angemeldeteStdLvas)
                        .addGap(37, 37, 37)
                        .addComponent(bt_angemeldeteDztLvas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LvaVerwaltungLayout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1150, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lehrveranstaltungen der Universitaet verwalten", LvaVerwaltung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_studentHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentHinzufügenActionPerformed
       // Als erstes muss die Matrikelnummer kontrolliert werden .
     
        if(Student.CheckMatrikelNummer(tf_matnumstd.getText()) == false){
            JOptionPane.showMessageDialog(null,"ERROR : Sie haben falsche Matrikelnummer eingegeben!");
            JOptionPane.showMessageDialog(null,"ERROR : Matrikelnummer muss 7 Ziffern enthalten !");
        }
        //Dann wird ein Student erstellt.
  
        Student newstudent = new Student(tf_namestd.getText(),tf_nachnamestd.getText(),tf_matnumstd.getText());
        
        if(uni.studentlist.contains(newstudent)== true){
                     JOptionPane.showMessageDialog(null,"ERROR : Dieser Student wurde vorher hinzugefügt!! ");
        }
                 
        if(uni.studentlist.contains(newstudent)== false && Student.CheckMatrikelNummer(tf_matnumstd.getText()) == true){
                      uni.studentlist.add(newstudent);
                      JOptionPane.showMessageDialog(null, "Diese Student wurde erfolgreich hinzugefügt ! ");
                      
                      //hier student auflisten :
                      String[] studentFürTable = new String[3];
     
                      studentFürTable[0] = tf_namestd.getText();
                      studentFürTable[1] = tf_nachnamestd.getText().toUpperCase();
                      studentFürTable[2] = tf_matnumstd.getText();
                      DefaultTableModel dtm = (DefaultTableModel) table_Studenten.getModel();
                      dtm.addRow(studentFürTable);
                      
                      
                      tf_namestd.setText("");
                      tf_nachnamestd.setText("");
                      tf_matnumstd.setText("");
                      tf_alterstd.setText("");
                      tf_fachbereichstd.setText("");
                      tf_emailstd.setText("");
                      tf_semesterstd.setText("");
                      tf_telefonnummerstd.setText("");
                      tf_bürgerschaftstd.setText("");
                      tf_geschlechtstd.setText("");
                      
        }
        
     
    }//GEN-LAST:event_bt_studentHinzufügenActionPerformed

    private void bt_dozentHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentHinzufügenActionPerformed
        if(Dozent.CheckTCNummer(tf_tcnumdzt.getText()) == false){
            JOptionPane.showMessageDialog(null,"ERROR : Sie haben falsche TC-Nummer eingegeben!");
            JOptionPane.showMessageDialog(null,"ERROR : TC-Nummer muss  11 Ziffern enthalten!");  
        }
        //Nachdem die TC-Nummer kontrolliert wurde,erstellt der Dozent oder die Dozentin.
        
        Dozent newdozent = new Dozent(tf_namedzt.getText(),tf_nachnamedzt.getText(),tf_tcnumdzt.getText());
        
        if(uni.dozentlist.contains(newdozent)== true){
                      System.out.println("Diese Dozent wurde vorher hinzugefügt!! ");
         }
                 
        if(uni.dozentlist.contains(newdozent)== false && Dozent.CheckTCNummer(tf_tcnumdzt.getText()) == true ){
                      uni.dozentlist.add(newdozent);
                      JOptionPane.showMessageDialog(null, "Diese Dozent wurde erfolgreich hinzugefügt ! ");
                      
                      
                      String[] dozentFürTable = new String[3];
     
                      dozentFürTable[0] = tf_namedzt.getText();
                      dozentFürTable[1] = tf_nachnamedzt.getText();
                      dozentFürTable[2] = tf_tcnumdzt.getText().toUpperCase();
                      DefaultTableModel dtm = (DefaultTableModel) table_Dozenten.getModel();
                      dtm.addRow(dozentFürTable);

                      tf_namedzt.setText("");
                      tf_nachnamedzt.setText("");
                      tf_tcnumdzt.setText("");
                      tf_alterdzt.setText("");
                      tf_fachbereichdzt.setText("");
                      tf_emaildzt.setText("");
                      tf_telefonnummerdzt.setText("");
                      tf_bürgerschaftdzt.setText("");
                      tf_geschlechtdzt.setText("");
                     
        }
        
    
        
        
    }//GEN-LAST:event_bt_dozentHinzufügenActionPerformed

    private void bt_lvaHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lvaHinzufügenActionPerformed
         if(LVA.CheckKuerzung(tf_codeLVA.getText()) == false){
            JOptionPane.showMessageDialog(null,"ERROR : Sie haben falsche Code der Vorlesung eingegeben!");
            JOptionPane.showMessageDialog(null,"ERROR : TC-Nummer muss sein,wie INF102 !");  
         }
        //Nachdem die Code der Vorlesung kontrolliert wurde,erstellt LVA .
        
          LVA newlva = new LVA (tf_codeLVA.getText(),tf_nameLVA.getText());
        
        if(uni.lvalist.contains(newlva)== true){
                      System.out.println("Diese LVA wurde vorher hinzugefügt!! ");
         }
                 
        if(uni.lvalist.contains(newlva)== false && LVA.CheckKuerzung(tf_codeLVA.getText()) == true ){
                      uni.lvalist.add(newlva);
                      JOptionPane.showMessageDialog(null, "Diese LVA wurde erfolgreich hinzugefügt ! ");
                      
                      
                      String[] lvaFürTable = new String[2];
     
                      lvaFürTable[0] = tf_codeLVA.getText();
                      lvaFürTable[1] = tf_nameLVA.getText();
        
                      DefaultTableModel dtm = (DefaultTableModel) table_LVAs.getModel();
                      dtm.addRow(lvaFürTable); 
                      
                      tf_codeLVA.setText("");
                      tf_nameLVA.setText("");
                    
        }
        
    }//GEN-LAST:event_bt_lvaHinzufügenActionPerformed

    private void bt_studentSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentSuchenActionPerformed
            String gesuchtene_Std = JOptionPane.showInputDialog("Bitte geben hier die Matrikelnummer des gesuchtenen Student ein :  ");
                          
           if(Student.CheckMatrikelNummer(gesuchtene_Std)== false){
                JOptionPane.showMessageDialog(null,"Die Matrikelnnumer muss 7 Ziffern enthalten!!"); 
            }
              
           for(int j=0; j < uni.studentlist.size() ; j++){ 
           
           if(uni.studentlist.get(j).getMatNum(uni.studentlist.get(j)).equals(gesuchtene_Std)== true ){
                       cont = true;                          
           }                                                                       
           }
                           
           if(cont== true && Student.CheckMatrikelNummer(gesuchtene_Std)== true){
              for(int j=0; j < uni.studentlist.size() ; j++){
                    if(uni.studentlist.get(j).getMatNum(uni.studentlist.get(j)).equals(gesuchtene_Std)== true ){
                             JOptionPane.showMessageDialog(null,uni.studentlist.get(j).toString());
                        }
                    }
              }
           
           if(cont== false ||Student.CheckMatrikelNummer(gesuchtene_Std)== false ){
                           JOptionPane.showMessageDialog(null,"Student existiert nicht!");
           }
    }//GEN-LAST:event_bt_studentSuchenActionPerformed

    private void bt_dozentSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentSuchenActionPerformed
            String gesuchtene_Dzt = JOptionPane.showInputDialog("Bitte geben hier die TC-Nummer des gesuchtenen Dozent ein :  ");
                    
            if(Dozent.CheckTCNummer(gesuchtene_Dzt)== false){
                        System.out.println("Die TC-Nummer muss  11 Ziffern enthalten !!"); 
            }
                      
            for(int j=0; j < uni.dozentlist.size() ; j++){
                           
             if(uni.dozentlist.get(j).getTcNummer().equals(gesuchtene_Dzt)== true ){
                          cont = true;
            }                                                                       
            }
                           
          if(cont== true && Dozent.CheckTCNummer(gesuchtene_Dzt)== true){
                for(int j=0; j < uni.dozentlist.size() ; j++){
                    if(uni.dozentlist.get(j).getTcNummer().equals(gesuchtene_Dzt)== true ){
                           JOptionPane.showMessageDialog(null,uni.dozentlist.get(j).toString());
                    }
                }
          } 
          if(cont== false){
                          JOptionPane.showMessageDialog(null,"Dozent wurde nicht gefunden!");
           }
                          
    }//GEN-LAST:event_bt_dozentSuchenActionPerformed

    private void bt_lvaSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lvaSuchenActionPerformed
            String gesuchtene_LVA = JOptionPane.showInputDialog("Bitte geben hier die Code der gesuchtenen Lehrveranstaltung ein :  ");
                    
                    if(LVA.CheckKuerzung(gesuchtene_LVA)== false){
                        System.out.println("Die LVA Code muss sein, wie INF102!!"); 
                    }

                    for(int j=0; j < uni.lvalist.size() ; j++){
                           
                            if(uni.lvalist.get(j).getLvaCode().equals(gesuchtene_LVA)== true ){
                                           cont = true;
                            }                                                                       
                       }
                           
                    if(cont== true && LVA.CheckKuerzung(gesuchtene_LVA)== true){
                           for(int j=0; j < uni.lvalist.size() ; j++){
                               if(uni.lvalist.get(j).getLvaCode().equals(gesuchtene_LVA)== true ){
                                    JOptionPane.showMessageDialog(null,uni.lvalist.get(j).toString());
                               }
                           }
                    }
                    if(cont== false){
                                   JOptionPane.showMessageDialog(null,"LVA wurde nicht gefunden!");
                    }
                    
                          
    }//GEN-LAST:event_bt_lvaSuchenActionPerformed

    private void bt_studentLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentLöschenActionPerformed
            String gelöschenematnum_Std = JOptionPane.showInputDialog("Bitte geben hier die Matrikelnummer des Student,den Sie löschen möchten, ein :  ");
            
            while(Student.CheckMatrikelNummer(gelöschenematnum_Std)== false){
                    JOptionPane.showMessageDialog(null,"Die Matrikelnnumer muss nur aus 11 Ziffern entstehen"); 

            }
          
             for(int j=0; j < uni.studentlist.size() ; j++){
                           
                if(uni.studentlist.get(j).getMatNum(uni.studentlist.get(j)).equals(gelöschenematnum_Std)== true ){
                         cont = true;
                 }                                                                       
             }
                           
            if(cont== true){
                for(int j=0; j < uni.studentlist.size() ; j++){
                      if(uni.studentlist.get(j).getMatNum(uni.studentlist.get(j)).equals(gelöschenematnum_Std)== true ){
                                   uni.studentlist.remove(j);
                                   
                                   DefaultTableModel dtm = (DefaultTableModel) table_Studenten.getModel();
                                   dtm.removeRow(j);
                      }
                }
            }
            else{
                           JOptionPane.showMessageDialog(null,"Student wurde nicht gefunden!");
             }
    }//GEN-LAST:event_bt_studentLöschenActionPerformed

    private void bt_dozentLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentLöschenActionPerformed
        String gelöschenetcnum_Dzt = JOptionPane.showInputDialog("Bitte geben hier die TC-Nummer des Dozenten,den Sie löschen möchten, ein :  ");
            
            if(Dozent.CheckTCNummer(gelöschenetcnum_Dzt)== false){
                    JOptionPane.showMessageDialog(null,"Die TC-Nummer muss aus 11 Ziffern entstehen"); 

            }
          
             for(int j=0; j < uni.dozentlist.size() ; j++){
                           
                if(uni.dozentlist.get(j).getTcNummer().equals(gelöschenetcnum_Dzt)== true ){
                         cont = true;
                 }                                                                       
             }
                           
            if(cont== true){
                for(int j=0; j < uni.dozentlist.size() ; j++){
                      if(uni.dozentlist.get(j).getTcNummer().equals(gelöschenetcnum_Dzt)== true ){
                                   uni.dozentlist.remove(j);
                                   
                                   DefaultTableModel dtm = (DefaultTableModel) table_Dozenten.getModel();
                                   dtm.removeRow(j);
                      }
                }
            }
            else{
                           JOptionPane.showMessageDialog(null,"Dozent wurde nicht gefunden!");
             }
    }//GEN-LAST:event_bt_dozentLöschenActionPerformed

    private void bt_lvaLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lvaLöschenActionPerformed
         String gelöschenecode_Lva = JOptionPane.showInputDialog("Bitte geben hier die Code der Lehrveranstaltung,die Sie löschen möchten, ein :  ");
            
            if(LVA.CheckKuerzung(gelöschenecode_Lva)== false){
                    JOptionPane.showMessageDialog(null,"Die Code muss sein,wie INF102"); 
            }
          
             for(int j=0; j < uni.lvalist.size() ; j++){            
                if(uni.lvalist.get(j).getLvaCode().equals(gelöschenecode_Lva)== true ){
                         cont = true;
                 }                                                                       
             }
                           
            if(cont== true){
                for(int j=0; j < uni.lvalist.size() ; j++){
                      if(uni.lvalist.get(j).getLvaCode().equals(gelöschenecode_Lva)== true ){
                                   uni.lvalist.remove(j);
                                   
                                   DefaultTableModel dtm = (DefaultTableModel) table_LVAs.getModel();
                                   dtm.removeRow(j);
                      }
                }
            }
            else{
                           JOptionPane.showMessageDialog(null,"LVA wurde nicht gefunden!");
             }
    }//GEN-LAST:event_bt_lvaLöschenActionPerformed

    private void bt_studentAnmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentAnmeldenActionPerformed
            String studentmatnum_zurLva = JOptionPane.showInputDialog("Bitte geben hier die Matrikelnummer des Studenten,der anmelden möchte, ein :  ");
            String zurlvacode_Std = JOptionPane.showInputDialog("Bitte geben hier die Code der Lehrveranstaltung,die der Student anmelden möchte, ein :  ");      
                    
            if(LVA.CheckKuerzung(zurlvacode_Std)== false){
                  JOptionPane.showMessageDialog(null," Aber Buchstaben laesst sich nur als Grossbuchstabe und nach den Buchstaben 3 Ziffern akzeptieren!!"  ); 
                  JOptionPane.showMessageDialog(null,"wie: INF102");
            }
            
  
            for(int j=0; j < uni.studentlist.size() ; j++){
                if(uni.studentlist.get(j).getMatrikelnummer().equals(studentmatnum_zurLva)== true ){// ES GİBT DİESER STUDENT
                    
                    if(std.studentzulvalist.size()>= 1){
                       for(int g = 0; g < std.studentzulvalist.size() ; g++ ){
                        if(std.studentzulvalist.get(g).matrikelnummer.equals(studentmatnum_zurLva) && std.studentzulvalist.get(g).angemeldeteLVA.equals(zurlvacode_Std)){
                              JOptionPane.showMessageDialog(null,"Dieser Student hat vorher zu dieser Vorlesung angemeldet");
                              cont = false;
                        }
                        else{
                            cont = true;
                        }
                       }
                    }    
                    else{
                            cont =true;
                    }
                    }
                else{
                     // cont ist noch false
                }
             }
             
        
            
            if(cont == true){ //naemlich es gibt dieser student
               
                            Student newstdzulva= new Student(studentmatnum_zurLva,zurlvacode_Std);
                            std.studentzulvalist.add(newstdzulva);
                     
                            String[] lvasStd = new String[3];
                     
                           lvasStd[0] = studentmatnum_zurLva ;
                           lvasStd[1] = zurlvacode_Std;
                      for(int k=0;k<uni.lvalist.size();k++){
                          if(uni.lvalist.get(k).LvaCode.equals(zurlvacode_Std)){
                                lvasStd[2] = uni.lvalist.get(k).ders_ısım;              
                            }
                      }
                      DefaultTableModel dtm = (DefaultTableModel) table_LVAsStd.getModel();
                      dtm.addRow(lvasStd); 
            }
               
            
            else{
                  JOptionPane.showMessageDialog(null,"Sie müssen als erstes Student hinzufügen \n" +  " && "    + "oder " + "  &&  "+ "\n die Code der LVA kontrollieren !");
              }
    }//GEN-LAST:event_bt_studentAnmeldenActionPerformed

    private void bt_studentAbmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentAbmeldenActionPerformed
        String studentLöschmatnum_zurLva = JOptionPane.showInputDialog("Bitte geben hier die Matrikelnummer des Studenten,der abmelden möchte, ein :  ");
        String vonLvaCode_Std = JOptionPane.showInputDialog("Bitte geben hier die Code der Lehrveranstaltung,von der der Student anmelden möchte, ein :  ");
                    
        for(int f=0; f<std.studentzulvalist.size();f++){
              if(studentLöschmatnum_zurLva.equals(std.studentzulvalist.get(f).getMatrikelnummer())== true){
                for(int u=0; u<std.studentzulvalist.size();u++){
                    if(vonLvaCode_Std.equals(std.studentzulvalist.get(u).getAngemeldeteLVA(std.studentzulvalist.get(u)))== true ){
                                          std.studentzulvalist.remove(u);
                                          
                                          
                                          DefaultTableModel dtm2 = (DefaultTableModel) table_LVAsStd.getModel();
                                          dtm2.removeRow(u);  // hier wird es in der Table,LVAsStd, gelöscht
                                           
                                          DefaultTableModel dtm = (DefaultTableModel) table_LvaStd.getModel();
                                          dtm.removeRow(u);    //hier wird es in der anderen Table,LVAStd, gelöscht
                    }  
                }
                }
        }
    }//GEN-LAST:event_bt_studentAbmeldenActionPerformed

    private void bt_studentenLVAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentenLVAsActionPerformed
         String studentmatnum_ZeigLvas = JOptionPane.showInputDialog("Bitte geben hier die Matrikelnummer des Studenten,dessen LVAs angezeigt werden, ein :  ");
     
   
         for(int j=0; j<std.studentzulvalist.size();j++){
           if(studentmatnum_ZeigLvas.equals(std.studentzulvalist.get(j).getMatrikelnummer()) == true){
                      String[] lvadesStudenten = new String[3];
     
                      lvadesStudenten[0] = std.studentzulvalist.get(j).matrikelnummer;
                      lvadesStudenten[1] = std.studentzulvalist.get(j).angemeldeteLVA;
                      for(int k=0;k<uni.lvalist.size();k++){
                          if(uni.lvalist.get(k).LvaCode.equals(std.studentzulvalist.get(j).angemeldeteLVA)){
                                lvadesStudenten[2] = uni.lvalist.get(k).ders_ısım;              
                            }
                      }
                      DefaultTableModel dtm = (DefaultTableModel) table_LvaStd.getModel();
                      dtm.addRow(lvadesStudenten);
            }
         }
         
     
         
        
    }//GEN-LAST:event_bt_studentenLVAsActionPerformed

    private void bt_dozentZuwiesenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentZuwiesenActionPerformed
        String dozenttcnum_zurLva = JOptionPane.showInputDialog("Bitte geben hier die TC-Nummer des Dozenten,der zugewiesen wird, ein :  ");
            String zurlvacode_Dzt = JOptionPane.showInputDialog("Bitte geben hier die Code der Lehrveranstaltung,die der Dozent zuweisen möchte, ein :  ");      
                    
            if(LVA.CheckKuerzung(zurlvacode_Dzt)== false){
                  JOptionPane.showMessageDialog(null," Aber Buchstaben laesst sich nur als Grossbuchstabe und nach den Buchstaben 3 Ziffern akzeptieren!!"  ); 
                  JOptionPane.showMessageDialog(null,"wie: INF102");
            }
            
  
            for(int j=0; j < uni.dozentlist.size() ; j++){
                 for(int k = 0; k < uni.lvalist.size() ; k++){
                    if(uni.dozentlist.get(j).TcNummer.equals(dozenttcnum_zurLva)== true && uni.lvalist.get(k).LvaCode.equals(zurlvacode_Dzt)== true ){// ES GİBT DİESER Dozent
                      if(dzt.dozentzulvalist.size()>= 1){
                           Dozent newdztzulva= new Dozent(dozenttcnum_zurLva,zurlvacode_Dzt);
                       for(int l = 0; l < dzt.dozentzulvalist.size() ; l++ ){
                        if(dzt.dozentzulvalist.contains(newdztzulva)== true){
                              JOptionPane.showMessageDialog(null,"Dieser Dozent hat vorher zu dieser Vorlesung angemeldet");
                              cont = false;
                        }
                        else{
                            cont = true;
                        }
                       }
                    }    
                    else{
                            cont =true;
                    }
                    }
                else{
                     // cont ist noch false
                }
             }
                } 
            
    
            
            if(cont == true){ //naemlich es gibt dieser student
               
                            Dozent newdztzulva= new Dozent(dozenttcnum_zurLva,zurlvacode_Dzt);
                            dzt.dozentzulvalist.add(newdztzulva);
                     
                            String[] lvasDzt = new String[3];
                     
                           lvasDzt[0] = dozenttcnum_zurLva ;
                           lvasDzt[1] = zurlvacode_Dzt;
                      for(int k=0;k<uni.lvalist.size();k++){
                          if(uni.lvalist.get(k).LvaCode.equals(zurlvacode_Dzt)){
                                lvasDzt[2] = uni.lvalist.get(k).ders_ısım;              
                            }
                      }
                      DefaultTableModel dtm = (DefaultTableModel) table_LvasDzt.getModel();
                      dtm.addRow(lvasDzt); 
                      
            }
               
            
            else{
                  JOptionPane.showMessageDialog(null,"Sie müssen als erstes Dozent hinzufügen \n" +  " && "    + "oder " + "  &&  "+ "\n die Code der LVA kontrollieren !");
              }

   
         
    }//GEN-LAST:event_bt_dozentZuwiesenActionPerformed

    private void bt_dozentAbmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentAbmeldenActionPerformed
         String tc_dzt = JOptionPane.showInputDialog("Bitte geben Sie die TC-Nummer ein,die zu dem Dozent oder der Dozentin gehört : ");
         String vonLva_dzt = JOptionPane.showInputDialog("Bitte geben Sie die Code der Lehrveranstaltung ein,von der der Dozent oder der Dozentin abmelden möchte : ");
                    
        for(int f=0; f<dzt.dozentzulvalist.size();f++){
            if(tc_dzt.equals(dzt.dozentzulvalist.get(f).getTcNummer())== true){
                for(int u=0; u<dzt.dozentzulvalist.size();u++){
                    if(vonLva_dzt.equals(dzt.dozentzulvalist.get(u).getZugewieseneLva(dzt.dozentzulvalist.get(u)))== true ){
                            dzt.dozentzulvalist.remove(u);
                            
                            DefaultTableModel dtm2 = (DefaultTableModel) table_LvasDzt.getModel();
                            dtm2.removeRow(u);  // hier wird es in der Table,LVAsStd, gelöscht
                                           
                            DefaultTableModel dtm = (DefaultTableModel) table_zeigLva.getModel();
                            dtm.removeRow(u);    //hier wird es in der anderen Table,LVAStd, gelöscht
                    }  
               }
            }
        }
    }//GEN-LAST:event_bt_dozentAbmeldenActionPerformed

    private void bt_dozentenLVAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentenLVAsActionPerformed
       String Zeig_lvadzt = JOptionPane.showInputDialog("Bitte geben Sie die TC-Nummer ein,die zu dem Dozent oder der Dozentin gehört : ");
         
         for(int j=0; j<dzt.dozentzulvalist.size();j++){
           if(Zeig_lvadzt.equals(dzt.dozentzulvalist.get(j).TcNummer) == true){
                      String[] lvadesDozenten = new String[3];
     
                      lvadesDozenten[0] = dzt.dozentzulvalist.get(j).TcNummer;
                      lvadesDozenten[1] = dzt.dozentzulvalist.get(j).zugewieseneLva;
                      for(int k=0;k<uni.lvalist.size();k++){
                          if(uni.lvalist.get(k).LvaCode.equals(dzt.dozentzulvalist.get(j).zugewieseneLva)){
                                lvadesDozenten[2] = uni.lvalist.get(k).ders_ısım;              
                            }
                      }
                      DefaultTableModel dtm = (DefaultTableModel) table_LvaStd.getModel();
                      dtm.addRow(lvadesDozenten);
            }
         }
         
    }//GEN-LAST:event_bt_dozentenLVAsActionPerformed

    private void bt_angemeldeteStdLvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_angemeldeteStdLvasActionPerformed
       String zeigStudentender_lvas = JOptionPane.showInputDialog("Bitte geben Sie die Code der Lehrveranstaltung ein : ");
                    
                    for(int s=0; s<std.studentzulvalist.size();s++){
                      
                        if(std.studentzulvalist.get(s).getAngemeldeteLVA(std.studentzulvalist.get(s)).equals(zeigStudentender_lvas)== true){
                    
                            for(int xo=0;xo<uni.studentlist.size();xo++){
                                if(std.studentzulvalist.get(s).getMatrikelnummer().equals(uni.studentlist.get(xo).getMatrikelnummer())){
                                    String[] StudentenderLVA = new String[3];
     
                                    StudentenderLVA[0] = std.studentzulvalist.get(s).matrikelnummer;
                                    StudentenderLVA[1] = zeigStudentender_lvas;
                               
                                      for(int k=0;k<uni.lvalist.size();k++){
                                        if(uni.lvalist.get(k).LvaCode.equals(zeigStudentender_lvas)){
                                              StudentenderLVA[2] = uni.lvalist.get(k).ders_ısım;              
                                       }
                                     }
                          
                                      DefaultTableModel dtm = (DefaultTableModel) table_anmldStd.getModel();
                                      dtm.addRow(StudentenderLVA); 
                                }
                            }
                            
                            
                        }
                        
                        else{
                                 
                        }
                    }
    }//GEN-LAST:event_bt_angemeldeteStdLvasActionPerformed

    private void bt_angemeldeteDztLvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_angemeldeteDztLvasActionPerformed
        String zeigDozentender_lvas = JOptionPane.showInputDialog("Bitte geben Sie die Code der Lehrveranstaltung ein : ");
                  
                    
                    for(int s=0; s<dzt.dozentzulvalist.size();s++){
                          
                        if(dzt.dozentzulvalist.get(s).getZugewieseneLva(dzt.dozentzulvalist.get(s)).equals(zeigDozentender_lvas)== true){
                    
                            for(int xo=0;xo<uni.dozentlist.size();xo++){
                                if(dzt.dozentzulvalist.get(s).getTcNummer().equals(uni.dozentlist.get(xo).getTcNummer())){
                                   String[] DozentenderLVA = new String[3];
     
                                    DozentenderLVA[0] = dzt.dozentzulvalist.get(s).TcNummer;
                                    DozentenderLVA[1] = zeigDozentender_lvas;
                               
                                      for(int k=0;k<uni.lvalist.size();k++){
                                        if(uni.lvalist.get(k).LvaCode.equals(zeigDozentender_lvas)){
                                              DozentenderLVA[2] = uni.lvalist.get(k).ders_ısım;              
                                       }
                                     }
                          
                                      DefaultTableModel dtm = (DefaultTableModel) table_anmldDzt.getModel();
                                      dtm.addRow(DozentenderLVA); 
                                }
                            }
                         }
                        
                        else{
                            
                        }
                    }
    }//GEN-LAST:event_bt_angemeldeteDztLvasActionPerformed

    private void bt_studentBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_studentBearbeitenActionPerformed
        JOptionPane.showMessageDialog(null, "Bevor Sie den Student,dessen Informationen Sie aendern möchten, waehlen, sollten Sie  \n Informationen  aendern !!");
        
        int i = table_Studenten.getSelectedRow();
        if(i>=0){
            Student s = uni.studentlist.get(i);
            s.name = tf_namestd.getText();
            s.nachname = tf_nachnamestd.getText();
            s.matrikelnummer = tf_matnumstd.getText();
            
            uni.studentlist.get(i).name = s.name;
            uni.studentlist.get(i).nachname = s.nachname;
            uni.studentlist.get(i).matrikelnummer = s.matrikelnummer;
        
            table_Studenten.getModel().setValueAt(s.name, i, 0);
            table_Studenten.getModel().setValueAt(s.nachname, i, 1);
            table_Studenten.getModel().setValueAt(s.matrikelnummer, i, 2);
        }
    }//GEN-LAST:event_bt_studentBearbeitenActionPerformed

    private void bt_lvaBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lvaBearbeitenActionPerformed
        JOptionPane.showMessageDialog(null, "Bevor Sie die Lehrveranstaltung,deren Informationen Sie aendern möchten, waehlen, sollten Sie  \n Informationen  aendern !!");
        
        int i = table_LVAs.getSelectedRow();
        if(i>=0){
            LVA u = uni.lvalist.get(i);
            u.LvaCode = tf_codeLVA.getText();
            u.ders_ısım = tf_nameLVA.getText();
                                                                            //MATRİKELNUMMERN SİND NİCHT PRİVAT!!
            table_LVAs.getModel().setValueAt(u.LvaCode, i, 0);
            table_LVAs.getModel().setValueAt(u.ders_ısım, i, 1);
            
        }
    }//GEN-LAST:event_bt_lvaBearbeitenActionPerformed

    private void bt_dozentBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dozentBearbeitenActionPerformed
        JOptionPane.showMessageDialog(null, "Bevor Sie den Dozent,dessen Informationen Sie aendern möchten, waehlen, sollten Sie  \n Informationen  aendern !!");
        
        int i = table_Dozenten.getSelectedRow();
        if(i>=0){
            Dozent t = uni.dozentlist.get(i);
            t.name = tf_namedzt.getText();
            t.nachname = tf_nachnamedzt.getText();
            t.TcNummer = tf_tcnumdzt.getText();
                                                                            //MATRİKELNUMMERN SİND NİCHT PRİVAT!!
            table_Dozenten.getModel().setValueAt(t.name, i, 0);
            table_Dozenten.getModel().setValueAt(t.nachname, i, 1);
            table_Dozenten.getModel().setValueAt(t.TcNummer, i, 2);
        }
    }//GEN-LAST:event_bt_dozentBearbeitenActionPerformed

    
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
            java.util.logging.Logger.getLogger(HauptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HauptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HauptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HauptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
       
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HauptFrame().setVisible(true);
                new HauptFrame().setSize(300,300);
                new HauptFrame().setResizable(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DozentenVerwaltung;
    private javax.swing.JScrollPane Dozenten_Table;
    private javax.swing.JPanel Homepage;
    private javax.swing.JScrollPane LVA_Table;
    private javax.swing.JPanel LvaVerwaltung;
    private javax.swing.JPanel StudentenVerwaltung;
    private javax.swing.JScrollPane Studenten_Table;
    private javax.swing.JButton bt_angemeldeteDztLvas;
    private javax.swing.JButton bt_angemeldeteStdLvas;
    private javax.swing.JButton bt_dozentAbmelden;
    private javax.swing.JButton bt_dozentBearbeiten;
    private javax.swing.JButton bt_dozentHinzufügen;
    private javax.swing.JButton bt_dozentLöschen;
    private javax.swing.JButton bt_dozentSuchen;
    private javax.swing.JButton bt_dozentZuwiesen;
    private javax.swing.JButton bt_dozentenLVAs;
    private javax.swing.JButton bt_lvaBearbeiten;
    private javax.swing.JButton bt_lvaHinzufügen;
    private javax.swing.JButton bt_lvaLöschen;
    private javax.swing.JButton bt_lvaSuchen;
    private javax.swing.JButton bt_studentAbmelden;
    private javax.swing.JButton bt_studentAnmelden;
    private javax.swing.JButton bt_studentBearbeiten;
    private javax.swing.JButton bt_studentHinzufügen;
    private javax.swing.JButton bt_studentLöschen;
    private javax.swing.JButton bt_studentSuchen;
    private javax.swing.JButton bt_studentenLVAs;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel lb_alleLVAsStd;
    private javax.swing.JLabel lb_alterdzt;
    private javax.swing.JLabel lb_alterstd;
    private javax.swing.JLabel lb_bürgerschaftstd;
    private javax.swing.JLabel lb_codeLVA;
    private javax.swing.JLabel lb_dozenttitel;
    private javax.swing.JLabel lb_emailstd;
    private javax.swing.JLabel lb_fachbereichdzt;
    private javax.swing.JLabel lb_fachbereichstd;
    private javax.swing.JLabel lb_geschlechtstd;
    private javax.swing.JLabel lb_lvatitel;
    private javax.swing.JLabel lb_matnumstd;
    private javax.swing.JLabel lb_nachnamedzt;
    private javax.swing.JLabel lb_nachnamestd;
    private javax.swing.JLabel lb_nameLVA;
    private javax.swing.JLabel lb_namedzt;
    private javax.swing.JLabel lb_namestd;
    private javax.swing.JLabel lb_semesterstd;
    private javax.swing.JLabel lb_studenttitel;
    private javax.swing.JLabel lb_studentzurlva;
    private javax.swing.JLabel lb_tcnumdzt;
    private javax.swing.JLabel lb_titelliste;
    private javax.swing.JLabel lb_tlfnnummerstd;
    private javax.swing.JTable table_Dozenten;
    private javax.swing.JTable table_LVAs;
    private javax.swing.JTable table_LVAsStd;
    private javax.swing.JTable table_LvaStd;
    private javax.swing.JTable table_LvasDzt;
    private javax.swing.JTable table_Studenten;
    private javax.swing.JTable table_anmldDzt;
    private javax.swing.JTable table_anmldStd;
    private javax.swing.JTable table_zeigLva;
    private javax.swing.JTextField tf_alterdzt;
    private javax.swing.JTextField tf_alterstd;
    private javax.swing.JTextField tf_bürgerschaftdzt;
    private javax.swing.JTextField tf_bürgerschaftstd;
    private javax.swing.JTextField tf_codeLVA;
    private javax.swing.JTextField tf_emaildzt;
    private javax.swing.JTextField tf_emailstd;
    private javax.swing.JTextField tf_fachbereichdzt;
    private javax.swing.JTextField tf_fachbereichstd;
    private javax.swing.JTextField tf_geschlechtdzt;
    private javax.swing.JTextField tf_geschlechtstd;
    private javax.swing.JTextField tf_matnumstd;
    private javax.swing.JTextField tf_nachnamedzt;
    private javax.swing.JTextField tf_nachnamestd;
    private javax.swing.JTextField tf_nameLVA;
    private javax.swing.JTextField tf_namedzt;
    private javax.swing.JTextField tf_namestd;
    private javax.swing.JTextField tf_semesterstd;
    private javax.swing.JTextField tf_tcnumdzt;
    private javax.swing.JTextField tf_telefonnummerdzt;
    private javax.swing.JTextField tf_telefonnummerstd;
    private javax.swing.JLabel yep;
    // End of variables declaration//GEN-END:variables
}

import java.lang.*;

public class FaceP extends javax.swing.JFrame {

    /**
     * Creates new form FaceP
     */
    public FaceP() {
        initComponents();
    }
                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DemoButton = new javax.swing.JButton();
        InstructionsButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        StatisticsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRAZY 8");
        setMaximumSize(new java.awt.Dimension(1400, 780));
        setMinimumSize(new java.awt.Dimension(1400, 780));
        setPreferredSize(new java.awt.Dimension(1920, 1200));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\27728\\Documents\\computer science\\project\\cardpics\\deck1.jpg")); 
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));

        DemoButton.setFont(new java.awt.Font("Agency FB", 1, 18)); 
        DemoButton.setText("View Demo");
        DemoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DemoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoButtonActionPerformed(evt);
            }
        });

        InstructionsButton.setFont(new java.awt.Font("Agency FB", 1, 18)); 
        InstructionsButton.setText("View Instructions");
        InstructionsButton.setToolTipText("");
        InstructionsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InstructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsButtonActionPerformed(evt);
            }
        });

        SettingsButton.setFont(new java.awt.Font("Agency FB", 1, 18)); 
        SettingsButton.setText("Settings");
        SettingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); 
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Do you want to:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 153)));

        ExitButton.setFont(new java.awt.Font("Agency FB", 1, 18)); 
        ExitButton.setText("Exit");
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        Play.setFont(new java.awt.Font("Agency FB", 1, 18)); 
        Play.setText("Play");
        Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        StatisticsButton.setFont(new java.awt.Font("Agency FB", 1, 18)); 
        StatisticsButton.setText("View Statistics");
        StatisticsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(Play)
                .addGap(171, 171, 171)
                .addComponent(DemoButton)
                .addGap(189, 189, 189)
                .addComponent(InstructionsButton)
                .addGap(160, 160, 160)
                .addComponent(StatisticsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 681, Short.MAX_VALUE)
                .addComponent(SettingsButton)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(594, 594, 594)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(659, 659, 659)
                        .addComponent(ExitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DemoButton)
                    .addComponent(SettingsButton)
                    .addComponent(Play)
                    .addComponent(StatisticsButton)
                    .addComponent(InstructionsButton))
                .addGap(49, 49, 49)
                .addComponent(ExitButton)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        pack();
    }                        
    public void Play(){

        Names sal = new Names();
        Names.Caller();
        this.dispose();
    }
    
    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
        Play(); 
                
    }                                    

    public void Demo()
    {
        this.dispose();
    }
    
    private void DemoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Demo();
    }                                          

    public void Instruction()
    {
       Instructions read = new Instructions();
       Instructions.overView();
       this.dispose(); 
    }
    
    private void InstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        Instruction();
    }                                                  

    public void Settings()
    {
        this.dispose();
    }
    
    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        Settings();
    }                                              

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }                                          

    public void Statistics()
    {
        
        this.dispose();
    }
    
    private void StatisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Statistics();
    }                                                

    
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FaceP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FaceP().setVisible(true);
            
        });
    }

                        
    private javax.swing.JButton DemoButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton InstructionsButton;
    private javax.swing.JButton Play;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton StatisticsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
                      
}


public class Cover extends javax.swing.JFrame {

    /**
     * Creates new form Cover
     */
    public Cover() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        MenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MenuButton.setFont(new java.awt.Font("Ravie", 1, 24)); 
        MenuButton.setForeground(new java.awt.Color(204, 0, 0));
        MenuButton.setText("Menu");
        MenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MenuButton);
        MenuButton.setBounds(660, 350, 150, 70);

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 48)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRAZY 8");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 200, 300, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\27728\\Documents\\computer science\\project\\cardpics\\blue-bg.jpg")); 
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1385, 1310));
        jLabel2.setMinimumSize(new java.awt.Dimension(1385, 1310));
        jLabel2.setPreferredSize(new java.awt.Dimension(1385, 1310));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -50, 1380, 1300);

        pack();
    }                        

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       Face go = new Face();
       Face.Call();
       this.dispose();
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
            java.util.logging.Logger.getLogger(Cover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cover().setVisible(true);
            }
        });
    }

                         
    private javax.swing.JButton MenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
                     
}

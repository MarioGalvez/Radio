/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Fernando
 */
public class Pioneer extends javax.swing.JFrame{

    Radio rad = new Radiodecarro();
   
    
    /**
     * Creates new form Pioneer
     */  
    public Pioneer() {
        initComponents();
      if( rad.getEstado()  == false){
           jButton2.setEnabled(false);
           jButton3.setEnabled(false);
           jButton4.setEnabled(false);
           jButton5.setEnabled(false);
           jButton6.setEnabled(false);
           jButton7.setEnabled(false);
           jButton8.setEnabled(false);
           jButton9.setEnabled(false);
           jButton10.setEnabled(false);
           jButton11.setEnabled(false);
           jButton12.setEnabled(false);
           jButton13.setEnabled(false);
           jButton14.setEnabled(false);
           jButton15.setEnabled(false);
           jButton16.setEnabled(false);
           jButton17.setEnabled(false);
           jLabel1.setText("Frequency:" + rad.getEmisora()); // imprime la frecuencia inicial 
           jLabel6.setText("AM");
       }
        if(rad.getEstado() == true){
           jButton2.setEnabled(true);
           jButton3.setEnabled(true);
           jButton4.setEnabled(true);
           jButton5.setEnabled(true);
           jButton6.setEnabled(true);
           jButton7.setEnabled(true);
           jButton8.setEnabled(true);
           jButton9.setEnabled(true);
           jButton10.setEnabled(true);
           jButton11.setEnabled(true);
           jButton12.setEnabled(true);
           jButton13.setEnabled(true);
           jButton14.setEnabled(true);
           jButton15.setEnabled(true);
           jButton16.setEnabled(true);
           jButton17.setEnabled(true);
           
           if(rad.getAMFM() == 0){
                jLabel6.setText("AM"); 
           }
           if(rad.getAMFM() == 1){
                jLabel6.setText("FM");

           }
           jLabel1.setText("Frequency:" + rad.getEmisora());

           
       }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Power-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Next Frequency");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton16.setText("Signal");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton2.setText("Save Frequency");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel4.setText("# to save tune:");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setText("1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("4");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("5");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("6");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("7");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("8");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("9");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("10");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("11");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("12");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setText("prev. frequency");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton16)
                                .addComponent(jButton3)
                                .addComponent(jButton17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // hace que el boton power active o desactive los botones dependiendo de si esta prendido o no el radio.
        boolean est = rad.getEstado();
		if(est == false){
			rad.setEstado(true);
		}
		if(est == true){
			rad.setEstado(false);
		}	   
			   
			   
       if( rad.getEstado()  == false){
           jButton2.setEnabled(false);
           jButton3.setEnabled(false);
           jButton4.setEnabled(false);
           jButton5.setEnabled(false);
           jButton6.setEnabled(false);
           jButton7.setEnabled(false);
           jButton8.setEnabled(false);
           jButton9.setEnabled(false);
           jButton10.setEnabled(false);
           jButton11.setEnabled(false);
           jButton12.setEnabled(false);
           jButton13.setEnabled(false);
           jButton14.setEnabled(false);
           jButton15.setEnabled(false);
           jButton16.setEnabled(false);
           jButton17.setEnabled(false);

       }
        if(rad.getEstado() == true){
           jButton2.setEnabled(true);
           jButton3.setEnabled(true);
           jButton4.setEnabled(true);
           jButton5.setEnabled(true);
           jButton6.setEnabled(true);
           jButton7.setEnabled(true);
           jButton8.setEnabled(true);
           jButton9.setEnabled(true);
           jButton10.setEnabled(true);
           jButton11.setEnabled(true);
           jButton12.setEnabled(true);
           jButton13.setEnabled(true);
           jButton14.setEnabled(true);
           jButton15.setEnabled(true);
           jButton16.setEnabled(true);
           jButton17.setEnabled(true);
           
           
           if(rad.getAMFM() == 0){
                jLabel6.setText("AM");

           }
           if(rad.getAMFM() == 1){
                jLabel6.setText("FM"); 
           }
           jLabel1.setText("Frequency:" + rad.getEmisora());   
       }
       
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // cambia la frecuencia y la imprime.
        rad.sintonizar(true);  
        jLabel1.setText("Frequency:" + rad.getEmisora());    
    }                                        

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // cambia la senal y la imprime.
		if(rad.getAMFM() == 1){
			rad.setAMFM(0);
		}
		else{
			rad.setAMFM(1);
		}
		
		
        if(rad.getAMFM() == 0){
            jLabel6.setText("AM");
            jLabel1.setText("Frequency:" + rad.getEmisora()); 
        }
        if(rad.getAMFM() == 1){
            jLabel6.setText("FM"); 
            jLabel1.setText("Frequency:" + rad.getEmisora()); 
        }
       
    }                                         

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // obtiene donde quiere guardar la senal y la guarda.
        
        int bo = jComboBox1.getSelectedIndex();
        rad.guardar(bo);
        
        
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        rad.memoria(1);
        jLabel1.setText("Memory 2 Frequency:" + rad.getEmisora());
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        rad.memoria(0);
        jLabel1.setText("Memory 1 Frequency:" + rad.getEmisora());
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        rad.memoria(2);
        jLabel1.setText("Memory 3 Frequency:" + rad.getEmisora());
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        rad.memoria(3);
        jLabel1.setText("Memory 4 Frequency:" + rad.getEmisora());
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        rad.memoria(4);
        jLabel1.setText("Memory 5 Frequency:" + rad.getEmisora());
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        rad.memoria(5);
        jLabel1.setText("Memory 6 Frequency:" + rad.getEmisora());
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        rad.memoria(6);
        jLabel1.setText("Memory 7 Frequency:" + rad.getEmisora());
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
         rad.memoria(7);
         jLabel1.setText("Memory 8 Frequency:" + rad.getEmisora());
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        rad.memoria(8);
        jLabel1.setText("Memory 9 Frequency:" + rad.getEmisora());
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        rad.memoria(9);
        jLabel1.setText("Memory 10 Frequency:" + rad.getEmisora());
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        rad.memoria(10);
        jLabel1.setText("Memory 11 Frequency:" + rad.getEmisora());
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        rad.memoria(11);
        jLabel1.setText("Memory 12 Frequency:" + rad.getEmisora());
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        rad.sintonizar(false);  
        jLabel1.setText("Frequency:" + rad.getEmisora());    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch ( ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pioneer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch ( InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pioneer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch ( IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pioneer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch ( javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pioneer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Pioneer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}

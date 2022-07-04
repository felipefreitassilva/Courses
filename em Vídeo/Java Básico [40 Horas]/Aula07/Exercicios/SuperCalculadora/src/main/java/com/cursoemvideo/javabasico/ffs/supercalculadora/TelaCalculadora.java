/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
        pnlAnswers.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinnerNum = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        pnlAnswers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtXCubed = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();
        lblCbrt = new javax.swing.JLabel();
        lblSqrt = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblParidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Super Calculadora");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Informe um valor: ");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Paridade");

        txtXCubed.setText("Valor ao cubo");

        jLabel5.setText("Raiz Quadrada");

        jLabel6.setText("Raiz Cúbica");

        jLabel7.setText("Módulo");

        lblAbs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAbs.setForeground(new java.awt.Color(0, 0, 255));
        lblAbs.setText("0");

        lblCbrt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCbrt.setForeground(new java.awt.Color(0, 0, 255));
        lblCbrt.setText("0");

        lblSqrt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSqrt.setForeground(new java.awt.Color(0, 0, 255));
        lblSqrt.setText("0");

        lblCubo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCubo.setForeground(new java.awt.Color(0, 0, 255));
        lblCubo.setText("0");

        lblParidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblParidade.setForeground(new java.awt.Color(0, 0, 255));
        lblParidade.setText("0");

        javax.swing.GroupLayout pnlAnswersLayout = new javax.swing.GroupLayout(pnlAnswers);
        pnlAnswers.setLayout(pnlAnswersLayout);
        pnlAnswersLayout.setHorizontalGroup(
            pnlAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnswersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXCubed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(pnlAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlAnswersLayout.setVerticalGroup(
            pnlAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnswersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(txtXCubed)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnswersLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(pnlAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAnswersLayout.createSequentialGroup()
                        .addComponent(lblParidade)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnswersLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblCubo)
                        .addGap(46, 46, 46)
                        .addComponent(lblSqrt)
                        .addGap(46, 46, 46)
                        .addComponent(lblCbrt)
                        .addGap(46, 46, 46)
                        .addComponent(lblAbs))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel1)
                            .addGap(57, 57, 57))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(spinnerNum, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(pnlAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCalcularActionPerformed
        pnlAnswers.setVisible(true);
        // txtXCubed.setText(spinnerNum.getValue().toString().concat("³"));
        double num = Double.parseDouble(spinnerNum.getValue().toString());
        int paridade = (int) num % 2;
        String ePar = paridade == 0 ? "Par" : "Impar";
        lblParidade.setText(ePar);
        double cubed = Math.pow(num, 3);
        lblCubo.setText(Double.toString(cubed));
        double sqrt = Math.sqrt(num);
        lblSqrt.setText(String.format("%.2f", sqrt));
        double cbrt = Math.cbrt(num);
        lblCbrt.setText(String.format("%.2f", cbrt));
        int abs = (int) Math.abs(num);
        lblAbs.setText(Integer.toString(abs));
    }// GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCbrt;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblParidade;
    private javax.swing.JLabel lblSqrt;
    private javax.swing.JPanel pnlAnswers;
    private javax.swing.JSpinner spinnerNum;
    private javax.swing.JLabel txtXCubed;
    // End of variables declaration//GEN-END:variables
}

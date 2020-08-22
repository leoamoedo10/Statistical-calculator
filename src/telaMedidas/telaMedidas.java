package telaMedidas;

import java.util.Arrays;
import java.text.DecimalFormat;

public class telaMedidas extends javax.swing.JFrame {

    public telaMedidas() {
        initComponents();
        panResultado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        panResultado = new javax.swing.JPanel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblMe = new javax.swing.JLabel();
        lblMed = new javax.swing.JLabel();
        lblMo = new javax.swing.JLabel();
        lblVa = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        lblCoe = new javax.swing.JLabel();
        panTitulo = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lbl1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl1.setText("Números (separados por vírgula):");

        txtInput.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtInput.setToolTipText("");
        txtInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtInput.setName(""); // NOI18N

        btnCalc.setBackground(new java.awt.Color(0, 0, 255));
        btnCalc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(255, 255, 255));
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblA.setText("Média =");

        lblB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblB.setText("Mediana =");

        lblC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblC.setText("Moda =");

        lblD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblD.setText("Variância =");

        lblE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblE.setText("Desvio-padrão =");

        lblF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblF.setText("Coeficiente de variação =");

        lblMe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMe.setForeground(new java.awt.Color(0, 0, 153));
        lblMe.setText("0");

        lblMed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMed.setForeground(new java.awt.Color(0, 0, 153));
        lblMed.setText("0");

        lblMo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMo.setForeground(new java.awt.Color(0, 0, 153));
        lblMo.setText("0");

        lblVa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVa.setForeground(new java.awt.Color(0, 0, 153));
        lblVa.setText("0");

        lblDes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDes.setForeground(new java.awt.Color(0, 0, 153));
        lblDes.setText("0");

        lblCoe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCoe.setForeground(new java.awt.Color(0, 0, 153));
        lblCoe.setText("0");

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addComponent(lblA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMe))
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addComponent(lblB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMed))
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addComponent(lblC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMo))
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addComponent(lblD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVa))
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addComponent(lblE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDes))
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addComponent(lblF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCoe)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA)
                    .addComponent(lblMe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblB)
                    .addComponent(lblMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblC)
                    .addComponent(lblMo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD)
                    .addComponent(lblVa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblE)
                    .addComponent(lblDes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblF)
                    .addComponent(lblCoe))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panTitulo.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // GET AND CONVERT INPUT VALUES
        String numeros = txtInput.getText();
        String[] valores = numeros.split(",");
        double[] valor = new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            valor[i] = Double.parseDouble(valores[i]);
        }
        //ORDENANDO VALORES
        double[] ordena = new double[valor.length];
        System.arraycopy(valor, 0, ordena, 0, valor.length);
        Arrays.sort(ordena);

        //MÉDIA
        double soma = 0, media;
        for (int i = 0; i < valor.length; i++) {
            soma = soma + valor[i];
        }
        media = soma / valor.length;
        lblMe.setText(String.format("%.2f", media));

        //MEDIANA
        double valueR, valueL, mediana;
        if (ordena.length % 2 == 0) {
            valueR = ordena[ordena.length / 2];
            valueL = ordena[ordena.length / 2 - 1];
            mediana = (valueR + valueL) / 2;
        } else {
            mediana = ordena[ordena.length / 2];
        }
        lblMed.setText(String.format("%.2f", mediana));

        //MODA
        double moda = 0, max = 0;
        for (int i = 0; i < valor.length; i++) {
            int count = 0;
            for (int j = 0; j < valor.length; j++) {
                if (valor[j] == valor[i]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                moda = valor[i];
                lblMo.setText(String.format("%.2f", moda));
            }
            else if (max == 1) {
                lblMo.setText(String.format("Amodal."));
            }
        }

        //VARIÂNCIA
        double var = 0, sum = 0;
        for (int i = 0; i < valor.length; i++) {
            sum += Math.pow(valor[i] - media, 2);
            var = sum / (valor.length - 1);
        }
        lblVa.setText(String.format("%.2f", var));

        //DESVIO PADRÃO
        double dp = Math.sqrt(var);
        lblDes.setText(String.format("%.2f", dp));

        //COEFICIÊNTE DE VARIAÇÃO
        double cv = (dp / media) * 100;
        DecimalFormat fmt = new DecimalFormat("0.00");
        lblCoe.setText(fmt.format(cv)+"%");
        
        panResultado.setVisible(true);
    }//GEN-LAST:event_btnCalcActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMedidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new telaMedidas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCoe;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblMe;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblMo;
    private javax.swing.JLabel lblVa;
    private javax.swing.JPanel panResultado;
    private java.awt.Panel panTitulo;
    public javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}

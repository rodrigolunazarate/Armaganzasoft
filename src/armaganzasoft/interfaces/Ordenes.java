/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaganzasoft.interfaces;

import armaganzasoft.interfaces.Menu;
import armaganzasoft.repositorys.OrderRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ordenes extends javax.swing.JFrame {

    /**
     * Creates new form Ordenes
     */
    public Ordenes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextFieldDirEntrega = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        buttonModificar = new java.awt.Button();
        buttonEliminar = new java.awt.Button();
        buttonPrincipal = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabelRFC = new javax.swing.JLabel();
        jLabelContacto = new javax.swing.JLabel();
        jTextFieldOrden = new javax.swing.JTextField();
        jTextFieldPedido = new javax.swing.JTextField();
        jTextFieldProducto = new javax.swing.JTextField();
        jLabelKGSOrden = new javax.swing.JLabel();
        jLabelKGSPedido = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelCemento = new javax.swing.JLabel();
        jLabelGrava = new javax.swing.JLabel();
        jLabelArena = new javax.swing.JLabel();
        jLabelAgua = new javax.swing.JLabel();
        jLabelAd1 = new javax.swing.JLabel();
        jLabelAd2 = new javax.swing.JLabel();
        jLabelAd3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdenes = new javax.swing.JTable();
        titulo2Soluciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        headerFondo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFormula = new javax.swing.JTable();
        jTextFieldPVSR = new javax.swing.JTextField();
        jTextFieldPedidos = new javax.swing.JTextField();
        jLabelPVSR = new javax.swing.JLabel();
        jLabelPedidos = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelTelefono2 = new javax.swing.JLabel();
        jLabelDirEntrega = new javax.swing.JLabel();
        jTextFieldContacto = new javax.swing.JTextField();
        jTextFieldRFC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTelefono1 = new javax.swing.JTextField();
        jTextFieldDirFiscal = new javax.swing.JTextField();
        jLabelCliente = new javax.swing.JLabel();
        jLabelDirFiscal = new javax.swing.JLabel();
        jLabelTelefono1 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 320, -1));

        jButton1.setText(" Buscar Orden");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, 30));
        getContentPane().add(jTextFieldDirEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 345, 350, -1));

        button1.setLabel("AGREGAR");
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 644, 120, 30));

        buttonModificar.setLabel("MODIFICAR");
        buttonModificar.setMinimumSize(new java.awt.Dimension(74, 23));
        getContentPane().add(buttonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 644, 120, 30));

        buttonEliminar.setLabel("ELIMINAR");
        getContentPane().add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 644, 120, 30));

        buttonPrincipal.setLabel("PRINCIPAL");
        buttonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 644, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ORDEN DE PRODUCCION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 20));

        jLabelRFC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRFC.setText("RFC");
        getContentPane().add(jLabelRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 30, 20));

        jLabelContacto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelContacto.setText("CONTACTO");
        getContentPane().add(jLabelContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 320, 80, 30));
        getContentPane().add(jTextFieldOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 100, -1));

        jTextFieldPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 445, 100, -1));

        jTextFieldProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 100, -1));

        jLabelKGSOrden.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelKGSOrden.setText("KGS/ORDEN");
        getContentPane().add(jLabelKGSOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 430, -1, -1));

        jLabelKGSPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelKGSPedido.setText("KGS PEDIDO");
        getContentPane().add(jLabelKGSPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 455, -1, -1));

        jLabelProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProducto.setText("PRODUCTO");
        getContentPane().add(jLabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("FORMULA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jLabelCemento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCemento.setText("CEMENTO");
        getContentPane().add(jLabelCemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        jLabelGrava.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelGrava.setText("GRAVA");
        getContentPane().add(jLabelGrava, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        jLabelArena.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelArena.setText("ARENA");
        getContentPane().add(jLabelArena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, -1, -1));

        jLabelAgua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAgua.setText("AGUA");
        getContentPane().add(jLabelAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));

        jLabelAd1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAd1.setText("ADITIVO1");
        getContentPane().add(jLabelAd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, -1, -1));

        jLabelAd2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAd2.setText("ADITIVO2");
        getContentPane().add(jLabelAd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, -1, -1));

        jLabelAd3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAd3.setText("ADITIVO3");
        getContentPane().add(jLabelAd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, -1, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("FECHA");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("REMISION");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 80, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jTableOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ORDEN", "CODIGO", "DESCRIPCION", "MATERIAL", "VALOR P1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableOrdenes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 530, -1));

        titulo2Soluciones.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        titulo2Soluciones.setText("SOLUCIONES EN INGENIERIA");
        titulo2Soluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo2Soluciones.setDisplayedMnemonicIndex(1);
        getContentPane().add(titulo2Soluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 40));

        headerFondo.setBackground(new java.awt.Color(114, 159, 207));
        headerFondo.setColumns(20);
        headerFondo.setRows(5);
        jScrollPane2.setViewportView(headerFondo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 120));

        jTableFormula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TIPO", "%", "TEORICO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFormula.setRowHeight(20);
        jScrollPane3.setViewportView(jTableFormula);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 380, 170));
        getContentPane().add(jTextFieldPVSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 100, -1));

        jTextFieldPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 445, 100, -1));

        jLabelPVSR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPVSR.setText("P vs R");
        getContentPane().add(jLabelPVSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        jLabelPedidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPedidos.setText("PEDIDOS");
        getContentPane().add(jLabelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 455, -1, -1));
        getContentPane().add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 195, 350, -1));
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 350, -1));

        jLabelTelefono2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTelefono2.setText("TELEFONO");
        getContentPane().add(jLabelTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 70, 30));

        jLabelDirEntrega.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDirEntrega.setText("DIRECCION ENTREGA");
        getContentPane().add(jLabelDirEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 345, 140, 30));
        getContentPane().add(jTextFieldContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 350, -1));
        getContentPane().add(jTextFieldRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 350, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DETALLE DE ORDENES");
        jLabel2.setDisplayedMnemonicIndex(2);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 90, 550, 90));
        getContentPane().add(jTextFieldTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 245, 350, -1));
        getContentPane().add(jTextFieldDirFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 350, -1));

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCliente.setText("CLIENTE");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 200, 60, 20));

        jLabelDirFiscal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDirFiscal.setText("DIRECCION FISCAL");
        getContentPane().add(jLabelDirFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 20));

        jLabelTelefono1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTelefono1.setText("TELEFONO");
        getContentPane().add(jLabelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 245, 70, 20));

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrincipalActionPerformed
Menu principal=new Menu();
        principal.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPrincipalActionPerformed

    private void jTextFieldProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoActionPerformed

    private void jTextFieldPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPedidoActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPedidosActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

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
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button buttonEliminar;
    private java.awt.Button buttonModificar;
    private java.awt.Button buttonPrincipal;
    private javax.swing.JTextArea headerFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabelAd1;
    private javax.swing.JLabel jLabelAd2;
    private javax.swing.JLabel jLabelAd3;
    private javax.swing.JLabel jLabelAgua;
    private javax.swing.JLabel jLabelArena;
    private javax.swing.JLabel jLabelCemento;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelContacto;
    private javax.swing.JLabel jLabelDirEntrega;
    private javax.swing.JLabel jLabelDirFiscal;
    private javax.swing.JLabel jLabelGrava;
    private javax.swing.JLabel jLabelKGSOrden;
    private javax.swing.JLabel jLabelKGSPedido;
    private javax.swing.JLabel jLabelPVSR;
    private javax.swing.JLabel jLabelPedidos;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JLabel jLabelTelefono1;
    private javax.swing.JLabel jLabelTelefono2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableFormula;
    private javax.swing.JTable jTableOrdenes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldContacto;
    private javax.swing.JTextField jTextFieldDirEntrega;
    private javax.swing.JTextField jTextFieldDirFiscal;
    private javax.swing.JTextField jTextFieldOrden;
    private javax.swing.JTextField jTextFieldPVSR;
    private javax.swing.JTextField jTextFieldPedido;
    private javax.swing.JTextField jTextFieldPedidos;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldRFC;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTelefono1;
    private javax.swing.JLabel titulo2Soluciones;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Principal.Fisica;
import Principal.Juridica;
import Principal.Pessoa;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Tiago
 */
public class cadCli extends javax.swing.JFrame {

    /**
     * Creates new form cadCliJur
     */
    public cadCli() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_cpf_cnpj = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cx_nome = new javax.swing.JTextField();
        cx_estado = new javax.swing.JComboBox<>();
        cx_cpf_cnpj = new javax.swing.JFormattedTextField();
        cx_endereco = new javax.swing.JTextField();
        cx_bairro = new javax.swing.JTextField();
        cx_cidade = new javax.swing.JTextField();
        cx_cep = new javax.swing.JFormattedTextField();
        cx_telefone1 = new javax.swing.JFormattedTextField();
        cx_telefone2 = new javax.swing.JFormattedTextField();
        cx_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_limpar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cx_tipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do Cliente");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(610, 339));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nome: ");

        label_cpf_cnpj.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label_cpf_cnpj.setText("C.N.P.J.:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("C.E.P.:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Telefone 1:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Telefone 2:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("E-mail:");

        cx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_nomeActionPerformed(evt);
            }
        });

        cx_estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cx_estado.setSelectedItem("Paraná - PR");
        cx_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_estadoActionPerformed(evt);
            }
        });

        try {
            cx_cpf_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cx_cpf_cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_cpf_cnpjActionPerformed(evt);
            }
        });

        cx_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_enderecoActionPerformed(evt);
            }
        });

        cx_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_bairroActionPerformed(evt);
            }
        });

        try {
            cx_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cx_telefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cx_telefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cx_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_emailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("ID: ");

        btn_limpar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_limpar.setText("LIMPAR");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel15.setText("Cadastro de Cliente");

        user_id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        user_id.setText(Integer.toString(incrId()));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("Tipo de Pessoa:");

        cx_tipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "Física", "Jurídica" }));
        cx_tipo.setSelectedItem("Paraná - PR");
        cx_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx_tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx_nome))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(label_cpf_cnpj)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cx_cpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel6))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cx_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel7)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cx_cidade)
                                                .addComponent(cx_endereco)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx_telefone2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cx_cep)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(user_id)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_salvar)
                                        .addGap(92, 92, 92)
                                        .addComponent(btn_limpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cancelar))
                                    .addComponent(cx_email, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(user_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cx_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf_cnpj)
                    .addComponent(cx_cpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cx_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cx_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cx_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cx_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cx_telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cx_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_limpar))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cx_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx_emailActionPerformed

    private void cx_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx_bairroActionPerformed

    private void cx_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx_enderecoActionPerformed

    private void cx_cpf_cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_cpf_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx_cpf_cnpjActionPerformed

    private void cx_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx_estadoActionPerformed

    private void cx_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cx_nomeActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
    limpar();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
      MyConnection mc = new MyConnection();
        Connection cn = mc.conexao();
        Juridica ju = new Juridica();
        Fisica pf = new Fisica();
        boolean cond = false;
        int c = 0, tipo = 0;
        String sql = "";
        String sql2 = "";
        
        
        try {
            if (cx_nome.getText().equals("") || cx_tipo.getSelectedItem().toString().equals("------") || cx_endereco.getText().equals("") || cx_bairro.getText().equals("") || cx_cidade.getText().equals("") || cx_cep.getText().equals("") || cx_telefone1.getText().equals("") || cx_telefone2.getText().equals("") || cx_email.getText().equals("") || cx_estado.getSelectedItem().toString().equals("------")) {
                throw new Exception();
            } else if (cx_tipo.getSelectedItem().toString().equals("Jurídica")) {
                ju.setNome(cx_nome.getText());
                ju.setEndereco(cx_endereco.getText());
                ju.setBairro(cx_bairro.getText());
                ju.setCidade(cx_cidade.getText());
                ju.setEstado(cx_estado.getSelectedItem().toString());
                ju.setCep(cx_cep.getText());
                ju.setTelefone1(cx_telefone1.getText());
                ju.setTelefone2(cx_telefone2.getText());
                ju.setEmail(cx_email.getText());
                //ju.setDescricao(cx11.getText());
                ju.setCnpj(cx_cpf_cnpj.getText());
                tipo = 1;
                
                
            } else if(cx_tipo.getSelectedItem().toString().equals("Física")){
                pf.setNome(cx_nome.getText());
                pf.setEndereco(cx_endereco.getText());
                pf.setBairro(cx_bairro.getText());
                pf.setCidade(cx_cidade.getText());
                pf.setEstado(cx_estado.getSelectedItem().toString());
                pf.setCep(cx_cep.getText());
                pf.setTelefone1(cx_telefone1.getText());
                pf.setTelefone2(cx_telefone2.getText());
                pf.setEmail(cx_email.getText());
                //pf.setDescricao(cx11.getText());
                pf.setCpf(cx_cpf_cnpj.getText());
                tipo = 2;
            
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Cadastro de Cliente", JOptionPane.ERROR_MESSAGE);
            c = 2;
        }
        if (c != 2 && tipo==1) {
            sql = "INSERT INTO Pessoa (Tipo, Nome, Endereco, Bairro, Telefone_1, Telefone_2, Cidade, CEP, Estado, Email) VALUES ('C', ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            sql2 = "INSERT INTO Juridica (CNPJ, ID_Pes) VALUES (?, ?);";

            while (cond != true) {
                try {
                    PreparedStatement psd = cn.prepareStatement(sql);
                    psd.setString(1, ju.getNome());
                    psd.setString(2, ju.getEndereco());
                    psd.setString(3, ju.getBairro());
                    psd.setString(4, ju.getTelefone1());
                    psd.setString(5, ju.getTelefone2());
                    psd.setString(6, ju.getCidade());
                    psd.setString(7, ju.getCep());
                    psd.setString(8, ju.getEstado());
                    psd.setString(9, ju.getEmail());

                    int n = psd.executeUpdate();
                    if (n > 0) {

                        try {
                            PreparedStatement psd2 = cn.prepareStatement(sql2);
                            psd2.setString(1, ju.getCnpj());
                            //psd2.setString(2, ju.getDescricao());
                            psd2.setInt(2, getIdB(ju));

                            int n2 = psd2.executeUpdate();

                            if (n2 > 0) {
                                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso", "Cadastro de Cliente Jurídico", JOptionPane.INFORMATION_MESSAGE);
                                int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro cliente agora?", "Cadastro de Cliente Jurídico", JOptionPane.YES_NO_OPTION);
                                if (op == 0) {
                                    cond = true;
                                    dispose();
                                    new cadCli().setVisible(true);

                                } else {
                                    dispose();
                                    cond = true;
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        if (c != 2 && tipo==2) {
            sql = "INSERT INTO Pessoa (Tipo, Nome, Endereco, Bairro, Telefone_1, Telefone_2, Cidade, CEP, Estado, Email) VALUES ('C', ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            sql2 = "INSERT INTO Fisica (CPF, ID_Pes) VALUES (?, ?);";

            while (cond != true) {
                try {
                    PreparedStatement psd = cn.prepareStatement(sql);
                    psd.setString(1, pf.getNome());
                    psd.setString(2, pf.getEndereco());
                    psd.setString(3, pf.getBairro());
                    psd.setString(4, pf.getTelefone1());
                    psd.setString(5, pf.getTelefone2());
                    psd.setString(6, pf.getCidade());
                    psd.setString(7, pf.getCep());
                    psd.setString(8, pf.getEstado());
                    psd.setString(9, pf.getEmail());

                    int n = psd.executeUpdate();
                    if (n > 0) {

                        try {
                            PreparedStatement psd2 = cn.prepareStatement(sql2);
                            psd2.setString(1, pf.getCpf());
                            //psd2.setString(2, pf.getDescricao());
                            psd2.setInt(2, getIdB(pf));

                            int n2 = psd2.executeUpdate();

                            if (n2 > 0) {
                                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso", "Cadastro de Cliente Físico", JOptionPane.INFORMATION_MESSAGE);
                                int op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro cliente agora?", "Cadastro de Cliente Físico", JOptionPane.YES_NO_OPTION);
                                if (op == 0) {
                                    cond = true;
                                    dispose();
                                    new cadCli().setVisible(true);

                                } else {
                                    dispose();
                                    cond = true;
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        

    }//GEN-LAST:event_btn_salvarActionPerformed

    private void cx_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx_tipoActionPerformed
        if(evt.getSource() == cx_tipo){
            JComboBox cb = (JComboBox)evt.getSource();
            String msg =  (String)cb.getSelectedItem();
            switch(msg){
                case "Física": label_cpf_cnpj.setText("CPF");
                    //JFormattedTextField field = new JFormattedTextField();
                    //{
                        try {
                            cx_cpf_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
                        } catch (ParseException ex) {
                            Logger.getLogger(cadCli.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    //}
                    break;
                case "Jurídica": label_cpf_cnpj.setText("C.N.P.J.");
                    //{
                        try {
                            cx_cpf_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
                        } catch (ParseException ex) {
                            Logger.getLogger(cadCli.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    //}
                    break;
            }
        }
    }//GEN-LAST:event_cx_tipoActionPerformed

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
            java.util.logging.Logger.getLogger(cadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadCli().setVisible(true);
            }
        });
    }
    
    public void limpar() {
        cx_nome.setText("");
        cx_cpf_cnpj.setText("");
        cx_endereco.setText("");
        cx_bairro.setText("");
        cx_cidade.setText("");
        cx_cep.setText("");
        cx_telefone1.setText("");
        cx_telefone2.setText("");
        cx_email.setText("");
        //cx11.setText("");
    }

    public static int incrId() {
        int id = 0;
        try {
            MyConnection mc = new MyConnection();
            Connection cn = mc.conexao();
            PreparedStatement psd = cn.prepareStatement("SELECT * FROM Pessoa");
            ResultSet rs = psd.executeQuery();
            while (rs.next()) {
                id = (rs.getInt("ID_Pes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (id == 0) {
            return 1;
        } else {
            return (id + 1);
        }
    }

    public static int getIdB(Pessoa pe) {
        int id = 0;
        try {
            MyConnection mc = new MyConnection();
            Connection cn = mc.conexao();
            PreparedStatement psd = cn.prepareStatement("SELECT ID_Pes FROM Pessoa WHERE Nome = ?;");
            psd.setString(1, pe.getNome());

            ResultSet rs = psd.executeQuery();
            while (rs.next()) {
                id = (rs.getInt("ID_Pes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField cx_bairro;
    private javax.swing.JFormattedTextField cx_cep;
    private javax.swing.JTextField cx_cidade;
    private javax.swing.JFormattedTextField cx_cpf_cnpj;
    private javax.swing.JTextField cx_email;
    private javax.swing.JTextField cx_endereco;
    private javax.swing.JComboBox<String> cx_estado;
    private javax.swing.JTextField cx_nome;
    private javax.swing.JFormattedTextField cx_telefone1;
    private javax.swing.JFormattedTextField cx_telefone2;
    private javax.swing.JComboBox<String> cx_tipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_cpf_cnpj;
    private javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}

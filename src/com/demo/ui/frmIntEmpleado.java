/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import com.demo.controller.controllerEmpleado;
import com.demo.design.JTableDesign;
import com.demo.design.validacion;
import com.demo.dominio.Empleado;
import com.demo.dominio.User;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jona
 */
public class frmIntEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIntEmpleado
     */
    // variable global de validacion 
    private validacion validacion = new validacion();
    // variable para hacer evento de cambio de textfield
    private Character kpress;
    private boolean estado = false;
    // instancia de controlador de empleado y de su entidad
    private controllerEmpleado ctrlempleado;
    private Empleado empleado;
    
    DefaultTableModel modelo;
    String titulos[]={"Id","Nombre","Apellido","Cédula","E-mail","Dirección","Teléfono","Nick","Contraseña","Rol","Estado"};

    public frmIntEmpleado() {
        initComponents();
        setSize(845, 545);
        txtId.setVisible(false);
        
        modelo =new DefaultTableModel(null,titulos);
        desabilitar();
        buscar("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pRegistroEmpleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_nuevoEmp = new javax.swing.JButton();
        btn_guardarEmp = new javax.swing.JButton();
        btn_editarEmp = new javax.swing.JButton();
        btn_eliminarEmp = new javax.swing.JButton();
        txt_nombreEmp = new javax.swing.JTextField();
        txt_correoEmp = new javax.swing.JTextField();
        txt_apellidoEmp = new javax.swing.JTextField();
        txt_telefonoEmp = new javax.swing.JTextField();
        txt_rolEmp = new javax.swing.JTextField();
        txt_identificacionEmp = new javax.swing.JTextField();
        txt_direccionEmp = new javax.swing.JTextField();
        txt_usernameEmp = new javax.swing.JTextField();
        txt_contrasenaEmp = new javax.swing.JTextField();
        comboBox_activoEmp = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Empleado");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pRegistroEmpleado.setBackground(new java.awt.Color(255, 204, 102));
        pRegistroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        pRegistroEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        pRegistroEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");
        pRegistroEmpleado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        pRegistroEmpleado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 44, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Identificación");
        pRegistroEmpleado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, -1, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Correo:");
        pRegistroEmpleado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 76, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Dirección:");
        pRegistroEmpleado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono:");
        pRegistroEmpleado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 165, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Rol:");
        pRegistroEmpleado.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 136, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Username:");
        pRegistroEmpleado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 106, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña:");
        pRegistroEmpleado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Estado:");
        pRegistroEmpleado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 194, -1, -1));

        btn_nuevoEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnnuevo.png"))); // NOI18N
        btn_nuevoEmp.setText("Nuevo");
        btn_nuevoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(btn_nuevoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        btn_guardarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btnguardar.png"))); // NOI18N
        btn_guardarEmp.setText("Guardar");
        btn_guardarEmp.setMaximumSize(new java.awt.Dimension(83, 25));
        btn_guardarEmp.setMinimumSize(new java.awt.Dimension(83, 25));
        btn_guardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(btn_guardarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 170, -1, -1));

        btn_editarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneditar.png"))); // NOI18N
        btn_editarEmp.setText("Actualizar");
        btn_editarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(btn_editarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 170, -1, -1));

        btn_eliminarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/btneliminar.png"))); // NOI18N
        btn_eliminarEmp.setText("Eliminar");
        btn_eliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(btn_eliminarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        txt_nombreEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_nombreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreEmpActionPerformed(evt);
            }
        });
        txt_nombreEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreEmpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreEmpKeyTyped(evt);
            }
        });
        pRegistroEmpleado.add(txt_nombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 230, -1));

        txt_correoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_correoEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_correoEmpKeyPressed(evt);
            }
        });
        pRegistroEmpleado.add(txt_correoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 230, -1));

        txt_apellidoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_apellidoEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoEmpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoEmpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoEmpKeyTyped(evt);
            }
        });
        pRegistroEmpleado.add(txt_apellidoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 230, -1));

        txt_telefonoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_telefonoEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telefonoEmpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoEmpKeyTyped(evt);
            }
        });
        pRegistroEmpleado.add(txt_telefonoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, -1));

        txt_rolEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_rolEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rolEmpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rolEmpKeyTyped(evt);
            }
        });
        pRegistroEmpleado.add(txt_rolEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, -1));

        txt_identificacionEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_identificacionEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_identificacionEmpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_identificacionEmpKeyTyped(evt);
            }
        });
        pRegistroEmpleado.add(txt_identificacionEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

        txt_direccionEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_direccionEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_direccionEmpKeyPressed(evt);
            }
        });
        pRegistroEmpleado.add(txt_direccionEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 230, -1));

        txt_usernameEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_usernameEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameEmpKeyPressed(evt);
            }
        });
        pRegistroEmpleado.add(txt_usernameEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, -1));

        txt_contrasenaEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_contrasenaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaEmpActionPerformed(evt);
            }
        });
        txt_contrasenaEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contrasenaEmpKeyPressed(evt);
            }
        });
        pRegistroEmpleado.add(txt_contrasenaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 230, -1));

        comboBox_activoEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBox_activoEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        comboBox_activoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_activoEmpActionPerformed(evt);
            }
        });
        pRegistroEmpleado.add(comboBox_activoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 230, -1));
        pRegistroEmpleado.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 30, -1));

        getContentPane().add(pRegistroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 230));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 790, 160));

        txtBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 28, 120, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Búsqueda por cédula:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 810, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarEmpActionPerformed
        // TODO add your handling code here:
        empleado = new Empleado();
        empleado.setApellido(txt_apellidoEmp.getText());
        empleado.setCedulaIdentidad(txt_identificacionEmp.getText());
        empleado.setCorreo(txt_correoEmp.getText());
        empleado.setDireccion(txt_direccionEmp.getText());
        empleado.setNombre(txt_nombreEmp.getText());
        empleado.setTelefono(txt_telefonoEmp.getText());
        empleado.setUsuraio(new User(0,txt_usernameEmp.getText(), txt_contrasenaEmp.getText(),
                txt_rolEmp.getText(), estado));
        try {
            ctrlempleado.actualizar(empleado);
            JOptionPane.showConfirmDialog(null, "Datos de " + empleado.getNombre() + " " + empleado.getApellido()
                    + "han sido actualizado satisfactoriamente", "Confirmación", 2);
            limpiar();
            desabilitar();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al actualizar datos de empleado " + e.getMessage(), "Error", 2);
        }
    }//GEN-LAST:event_btn_editarEmpActionPerformed

    private void txt_nombreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreEmpActionPerformed

    private void txt_contrasenaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenaEmpActionPerformed

    private void btn_nuevoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoEmpActionPerformed
        // TODO add your handling code here:
        habilitar();
        txt_nombreEmp.requestFocus();
        btn_editarEmp.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_btn_nuevoEmpActionPerformed

    private void btn_guardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarEmpActionPerformed
        // TODO add your handling code here:
        validarNull();
        int cbo = (comboBox_activoEmp.getSelectedIndex());
        if (cbo == 0) {
            estado = true;
        } else {
            estado = false;
        }
        // agregamos los cammpos a la entidad para luego pasarlas al controlador y
        // hacer el guardao
        empleado = new Empleado();
        empleado.setApellido(txt_apellidoEmp.getText());
        empleado.setCedulaIdentidad(txt_identificacionEmp.getText());
        empleado.setCorreo(txt_correoEmp.getText());
        empleado.setDireccion(txt_direccionEmp.getText());
        empleado.setNombre(txt_nombreEmp.getText());
        empleado.setTelefono(txt_telefonoEmp.getText());
        empleado.setUsuraio(new User(0, txt_usernameEmp.getText(), txt_contrasenaEmp.getText(),
                txt_rolEmp.getText(), estado));
        System.out.println("mira... " + empleado.toString());
        try {
            ctrlempleado.registrar(empleado);
            JOptionPane.showConfirmDialog(null, " " + empleado.getNombre() + " " + empleado.getApellido()
                    + " a sido registrado satisfactoriamente", "Confirmación", 2);
            limpiar();
            desabilitar();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al grabar empleado " + e.getMessage(), "Error", 2);
        }


    }//GEN-LAST:event_btn_guardarEmpActionPerformed

    private void txt_nombreEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreEmpKeyTyped
        // TODO add your handling code here:
        validacion.soloLetras(evt);
    }//GEN-LAST:event_txt_nombreEmpKeyTyped

    private void txt_nombreEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_nombreEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_nombreEmpKeyPressed

    private void txt_apellidoEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoEmpKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoEmpKeyReleased

    private void txt_apellidoEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoEmpKeyTyped
        // TODO add your handling code here:
        validacion.soloLetras(evt);
    }//GEN-LAST:event_txt_apellidoEmpKeyTyped

    private void txt_apellidoEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_apellidoEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_apellidoEmpKeyPressed

    private void txt_correoEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_correoEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_correoEmpKeyPressed

    private void txt_direccionEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_direccionEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_direccionEmpKeyPressed

    private void txt_telefonoEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoEmpKeyTyped
        // TODO add your handling code here:
        if(txt_telefonoEmp.getText().length()>10){
            JOptionPane.showConfirmDialog(null, "Número de teléfono debe tener 10 dígitos ", "Confirmación", 2);
        }
        validacion.soloNumeros(evt);
        
    }//GEN-LAST:event_txt_telefonoEmpKeyTyped

    private void txt_usernameEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_usernameEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_usernameEmpKeyPressed

    private void txt_rolEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rolEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_rolEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_rolEmpKeyPressed

    private void txt_contrasenaEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contrasenaEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_contrasenaEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_contrasenaEmpKeyPressed

    private void txt_telefonoEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoEmpKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            txt_telefonoEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_telefonoEmpKeyPressed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        kpress = evt.getKeyChar();
        if (kpress == KeyEvent.VK_ENTER) {
            buscar(txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        if(txtBuscar.getText().length()>10){
         JOptionPane.showConfirmDialog(null, "Número de teléfono debe tener 10 dígitos ", "Confirmación", 2);
        }else{
        validacion.soloNumeros(evt);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txt_identificacionEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_identificacionEmpKeyPressed
        // TODO add your handling code here:
        if (kpress == KeyEvent.VK_ENTER) {
            txt_identificacionEmp.transferFocus();
        }
    }//GEN-LAST:event_txt_identificacionEmpKeyPressed

    private void txt_identificacionEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_identificacionEmpKeyTyped
        // TODO add your handling code here:
        if(txt_identificacionEmp.getText().length()==10){
            JOptionPane.showConfirmDialog(null, "Identificación debe tener 10 dígitos ", "Confirmación", 2);
            txt_identificacionEmp.requestFocus();
        }
        validacion.soloNumeros(evt);
    }//GEN-LAST:event_txt_identificacionEmpKeyTyped

    private void txt_rolEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rolEmpKeyTyped
        // TODO add your handling code here:
        validacion.soloLetras(evt);
    }//GEN-LAST:event_txt_rolEmpKeyTyped

    private void btn_eliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarEmpActionPerformed
        // TODO add your handling code here:
        empleado = new Empleado();
        empleado.setId_empleado(Integer.parseInt(txtId.getText()));
        empleado.setUsuraio(new User(0,null, null,
                null, estado));
        try {
            ctrlempleado.eliminar(empleado);
            JOptionPane.showConfirmDialog(null, "Empleado " + empleado.getNombre() + " " + empleado.getApellido()
                    + "dado de baja satisfactoriamente", "Confirmación", 2);
            limpiar();
            desabilitar();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al dar de baja a empleado " + e.getMessage(), "Error", 2);
        }
    }//GEN-LAST:event_btn_eliminarEmpActionPerformed


    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        habilitar();
        btn_guardarEmp.setEnabled(false);
        //txtCedula.setEnabled(false);

        int fila = tabla.rowAtPoint(evt.getPoint());
        txtId.setText(tabla.getValueAt(fila, 0).toString());
        txt_nombreEmp.setText(tabla.getValueAt(fila, 1).toString());
        txt_apellidoEmp.setText(tabla.getValueAt(fila, 2).toString());
        txt_identificacionEmp.setText(tabla.getValueAt(fila, 3).toString());
        txt_correoEmp.setText(tabla.getValueAt(fila, 4).toString());
        txt_direccionEmp.setText(tabla.getValueAt(fila, 5).toString());
        txt_telefonoEmp.setText(tabla.getValueAt(fila, 6).toString());
        txt_usernameEmp.setText(tabla.getValueAt(fila,7).toString());
        txt_contrasenaEmp.setText(tabla.getValueAt(fila,8).toString());
        txt_rolEmp.setText(tabla.getValueAt(fila,9).toString());
        comboBox_activoEmp.setSelectedItem(tabla.getValueAt(fila, 10));
    }//GEN-LAST:event_tablaMouseClicked

    private void comboBox_activoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_activoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_activoEmpActionPerformed


    // desabilito los textfield
    void desabilitar() {
        txt_apellidoEmp.enable(false);
        txt_contrasenaEmp.enable(false);
        txt_correoEmp.enable(false);
        txt_direccionEmp.enable(false);
        txt_identificacionEmp.enable(false);
        txt_nombreEmp.enable(false);
        txt_rolEmp.enable(false);
        txt_telefonoEmp.enable(false);
        txt_usernameEmp.enable(false);
        comboBox_activoEmp.enable(false);
    }

    // habilito los textfield y los limpio
    void habilitar() {
        txt_apellidoEmp.enable(true);
        txt_contrasenaEmp.enable(true);
        txt_correoEmp.enable(true);
        txt_direccionEmp.enable(true);
        txt_identificacionEmp.enable(true);
        txt_nombreEmp.enable(true);
        txt_rolEmp.enable(true);
        txt_telefonoEmp.enable(true);
        txt_usernameEmp.enable(true);
        comboBox_activoEmp.enable(true);
    }

    void limpiar() {
        txt_apellidoEmp.setText("");
        txt_contrasenaEmp.setText("");
        txt_correoEmp.setText("");
        txt_direccionEmp.setText("");
        txt_identificacionEmp.setText("");
        txt_nombreEmp.setText("");
        txt_rolEmp.setText("");
        txt_telefonoEmp.setText("");
        txt_usernameEmp.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_editarEmp;
    private javax.swing.JButton btn_eliminarEmp;
    private javax.swing.JButton btn_guardarEmp;
    private javax.swing.JButton btn_nuevoEmp;
    private javax.swing.JComboBox<String> comboBox_activoEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pRegistroEmpleado;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txt_apellidoEmp;
    private javax.swing.JTextField txt_contrasenaEmp;
    private javax.swing.JTextField txt_correoEmp;
    private javax.swing.JTextField txt_direccionEmp;
    private javax.swing.JTextField txt_identificacionEmp;
    private javax.swing.JTextField txt_nombreEmp;
    private javax.swing.JTextField txt_rolEmp;
    private javax.swing.JTextField txt_telefonoEmp;
    private javax.swing.JTextField txt_usernameEmp;
    // End of variables declaration//GEN-END:variables

    // verificamos campos nulos... en espera del cliente
    private void validarNull() {

    }

    void buscar(String cedula) {
        limpiarTabla();
        ctrlempleado = new controllerEmpleado();
        List<Empleado> lista = ctrlempleado.verEmpleados(cedula);
        
        for (Empleado empleado : lista) {
            ///hacer uso de tabla
            Object[] row = new Object[11];
            row[0] = empleado.getId_empleado();
            row[1] = empleado.getNombre();
            row[2] = empleado.getApellido();
            row[3] = empleado.getCedulaIdentidad();
            row[4] = empleado.getCorreo();
            row[5] = empleado.getDireccion();
            row[6] = empleado.getTelefono();
            //row[7] = empleado.getUsuraio().getId_user();
            row[7] = empleado.getUsuraio().getNick();
            row[8] = empleado.getUsuraio().getPassword();
            row[9] = empleado.getUsuraio().getRol();
            row[10] = empleado.getUsuraio().isActivo();
            modelo.addRow(row);
        }
        tabla.setModel(modelo);

    }
    
    void limpiarTabla(){	
	DefaultTableModel model1 = (DefaultTableModel) tabla.getModel();
        model1.setRowCount(0);
	}
    
    public void ocultar_columnas(){
		tabla.getColumnModel().getColumn(0).setMaxWidth(0);
		tabla.getColumnModel().getColumn(0).setMinWidth(0);
		tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
		
		tabla.getColumnModel().getColumn(3).setMaxWidth(0);
		tabla.getColumnModel().getColumn(3).setMinWidth(0);
		tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
		
		tabla.getColumnModel().getColumn(4).setMaxWidth(0);
		tabla.getColumnModel().getColumn(4).setMinWidth(0);
		tabla.getColumnModel().getColumn(4).setPreferredWidth(0);
	}

    private static class DefaultTableModelImpl extends DefaultTableModel {

        public DefaultTableModelImpl(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
}

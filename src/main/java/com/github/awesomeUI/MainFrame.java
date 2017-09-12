package com.github.awesomeUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javafx.scene.control.Alert.AlertType;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.filechooser.FileSystemView;
import java.net.MalformedURLException;

public class MainFrame extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private final ExcelFileObject fileObject;

    public MainFrame() throws MalformedURLException {

        this.fileObject = new ExcelFileObject();
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DropEasy");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                none(evt);
            }

            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 51));

        jLabel6.setBackground(new java.awt.Color(240, 240, 240));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_18px.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(240, 240, 240));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plus_20px.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(240, 240, 240));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Upload_20px.png"))); // NOI18N

        jLabel20.setBackground(new java.awt.Color(240, 240, 240));
        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Services_20px_1.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 40, 560));

        jPanel2.setBackground(new java.awt.Color(32, 48, 90));
        jPanel2.setLayout(new AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(106, 117, 144));
        jPanel3.setBorder(BorderFactory.createDashedBorder(new Color(65, 92, 129), 3, 3, 1, true));
        jPanel3.setName("BarcodeExcel"); // NOI18N

        jLabel14.setBackground(new java.awt.Color(240, 240, 240));
        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Drag barcode .xcel file to upload");

        jLabel17.setBackground(new java.awt.Color(240, 240, 240));
        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Upload_40px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(59, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(27, 27, 27))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(112, 112, 112))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(77, 77, 77))
        );

        jPanel2.add(jPanel3, new AbsoluteConstraints(630, 10, 280, 210));

        jPanel6.setBackground(new java.awt.Color(106, 117, 144));
        jPanel6.setBorder(BorderFactory.createDashedBorder(new Color(65, 92, 129), 3, 3, 1, true));
        jPanel6.setName("SimpleExcel"); // NOI18N
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(240, 240, 240));
        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Drag file to upload");

        jLabel16.setBackground(new java.awt.Color(240, 240, 240));
        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Upload_40px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap(89, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(115, 115, 115))))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addGap(79, 79, 79))
        );

        jPanel2.add(jPanel6, new AbsoluteConstraints(110, 10, 280, 210));

        jPanel7.setBackground(new java.awt.Color(32, 48, 90));
        jPanel7.setBorder(new RoundBorder());
        jPanel7.setForeground(new java.awt.Color(106, 117, 144));
        jPanel7.setToolTipText("");
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });
        jPanel7.setLayout(new AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(106, 117, 144));
        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Execution");
        jPanel7.add(jLabel18, new AbsoluteConstraints(30, 10, 70, -1));

        jPanel2.add(jPanel7, new AbsoluteConstraints(450, 110, 120, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajax-loader (1).gif"))); // NOI18N
        jPanel2.add(jLabel19, new AbsoluteConstraints(960, 130, -1, 100));
        jLabel19.setVisible(false);

        getContentPane().add(jPanel2, new AbsoluteConstraints(30, 320, 1080, 240));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cancel_20px_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(240, 240, 240));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search_25px.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(240, 240, 240));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User");

        jLabel9.setBackground(new java.awt.Color(240, 240, 240));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_25px.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(240, 240, 240));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Minus_20px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(574, 574, 574)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(6, 6, 6))))
        );

        getContentPane().add(jPanel4, new AbsoluteConstraints(30, 0, 1080, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(240, 240, 240));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DragEasyTool V2.1");
        jPanel5.add(jLabel2, new AbsoluteConstraints(60, 50, 380, -1));

        jLabel5.setBackground(new java.awt.Color(240, 240, 240));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Stay Updated On the Latest Products");
        jPanel5.add(jLabel5, new AbsoluteConstraints(70, 130, 210, -1));

        jLabel11.setBackground(new java.awt.Color(240, 240, 240));
        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WLS9600-View45b-500px.jpg"))); // NOI18N
        jPanel5.add(jLabel11, new AbsoluteConstraints(530, 10, 490, 270));

        jLabel12.setBackground(new java.awt.Color(240, 240, 240));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Barcode Scanner_96px.png"))); // NOI18N
        jPanel5.add(jLabel12, new AbsoluteConstraints(330, 120, 100, -1));

        jLabel15.setBackground(new java.awt.Color(240, 240, 240));
        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Online Support_20px.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });
        jPanel5.add(jLabel15, new AbsoluteConstraints(280, 130, -1, -1));

        getContentPane().add(jPanel5, new AbsoluteConstraints(30, 34, 1080, 290));

        pack();

        DragFileHandle(jPanel6);
        DragFileHandle(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.HierarchyEvent evt) {
        // TODO add your handling code here:
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(1);
    }

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        setState(Frame.ICONIFIED);
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {

    }

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {
        // openWebpage.open(Properties.UrlLicenceBuy);
    }

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {
        if (fileObject.ValidPanelMenu()) {
            new JFxBuilder(new DialogObject(AlertType.CONFIRMATION, "Information", "Message Success!",
                    "The uploaded fIles are valid files you are ready to continue")).Invoke();
            //put Your BackEndCode Here
        } else {
            new JFxBuilder(new DialogObject(AlertType.ERROR, "Error Dialog", "Ooops, there was an error!",
                    "Error at process execution. Probably not valid ,excel files. Please try again later")).Invoke();
        }
        jLabel19.setVisible(false);
    }

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel20.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel15.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {
        jPanel7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void DragFileHandle(final JPanel myPanel) {
        new FileDrop(myPanel, new FileDrop.Listener() {
            public void filesDropped(java.io.File[] files) {
                for (int i = 0; i < files.length; i++) {
                    Icon ico = FileSystemView.getFileSystemView().getSystemIcon(files[i]);
                    FindFiles(myPanel.getName(), files[i]);
                    Image image = ((ImageIcon) ico).getImage();
                    ImageIcon icon = new ImageIcon(getScaledImage(image, 45, 45));

                    myPanel.removeAll();
                    myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));

                    JLabel label = new JLabel();
                    label.setIcon(icon);
                    label.setAlignmentX(CENTER_ALIGNMENT);

                    myPanel.add(Box.createRigidArea(new Dimension(0, 60)));
                    myPanel.add(label, BorderLayout.CENTER);

                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    JLabel labe2 = new JLabel(files[i].getName(), SwingConstants.CENTER);
                    labe2.setBackground(new Color(240, 240, 240));
                    labe2.setForeground(new Color(0, 0, 0));
                    labe2.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
                    labe2.setAlignmentX(CENTER_ALIGNMENT);

                    myPanel.add(labe2, BorderLayout.LINE_START);
                }
            }
        });
    }

    private void FindFiles(String PanelName, File file) {
        if (fileObject.ValidExtension(file.getPath())) {
            fileObject.setValidPanelMenuValue(PanelName, true);
            new JFxBuilder(new DialogObject(AlertType.INFORMATION, "Barcode Information Dialog", "File "
                    + file.getName() + " is valid and Uploaded Successfully")).Invoke();
        } else {
            fileObject.setValidPanelMenuValue(PanelName, false);
            new JFxBuilder(new DialogObject(AlertType.ERROR, "Barcode Error Dialog", "This verison of this file is not compatible")).Invoke();
        }
    }

    private class RoundBorder extends AbstractBorder {

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Dimension arcs = new Dimension(40, 40);
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            graphics.setColor(new Color(106, 117, 144));
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);//paint background

            graphics.setClip(null);
            graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);//paint border
        }
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    new MainFrame().setVisible(true);
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
}

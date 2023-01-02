package by.bsuir.oop.shytsikau.graphic.ui;

import by.bsuir.oop.shytsikau.graphic.ScriptLanguageParser;
import by.bsuir.oop.shytsikau.graphic.figures.Figure;
import by.bsuir.oop.shytsikau.graphic.figures.RectangleBounds;
import by.bsuir.oop.shytsikau.graphic.figures.basic.LineSegment;
import by.bsuir.oop.shytsikau.graphic.figures.basic.Point;
import by.bsuir.oop.shytsikau.graphic.figures.collections.PointArray;
import by.bsuir.oop.shytsikau.graphic.figures.composite.FigureSet;
import by.bsuir.oop.shytsikau.graphic.figures.composite.Parallelogram;
import by.bsuir.oop.shytsikau.graphic.figures.composite.Rectangle;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class EditorFrame extends JFrame {

    // selected figure name for working with
    private String selectedFigureName;
    // enabling moving of figure
    private boolean mouseMoveCoordinates;
    // creating user figure
    private FigureSet figureSet = new FigureSet();


    public EditorFrame(GraphicEditorComponent graphicEditorComponent) {
        this.paintPanel = graphicEditorComponent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        scriptDialog = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        scriptTextPane = new javax.swing.JTextPane();
        createScriptFigureButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        nameCustomScriptTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        createDialog = new javax.swing.JDialog();
        createFigureButton = new javax.swing.JButton();
        nameCustomDialogTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        figuresDialogList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        point1Edit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        point2Edit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        angleEdit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        widthEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        heightEdit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        startPointEdit = new javax.swing.JTextField();
        addFigureButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        addedFiguresList = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        editorPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        figureList = new javax.swing.JList<>();
        addByScriptButton = new javax.swing.JButton();
        addByDialogButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        moveButton = new javax.swing.JButton();

        scriptDialog.setSize(new java.awt.Dimension(500, 450));

        jScrollPane2.setViewportView(scriptTextPane);

        createScriptFigureButton.setText("Create");
        createScriptFigureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createScriptFigureButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("isosceles width(400) height(100) startpoint(300,300);\nrectangle width(400) height(100) startpoint(200,200);");
        jScrollPane3.setViewportView(jTextArea1);

        jLabel1.setText("Example of script:");

        jLabel2.setText("Name of custom figure:");

        javax.swing.GroupLayout scriptDialogLayout = new javax.swing.GroupLayout(scriptDialog.getContentPane());
        scriptDialog.getContentPane().setLayout(scriptDialogLayout);
        scriptDialogLayout.setHorizontalGroup(
                scriptDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scriptDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(scriptDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addGroup(scriptDialogLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(createScriptFigureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(scriptDialogLayout.createSequentialGroup()
                                                .addGroup(scriptDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(nameCustomScriptTextField)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        scriptDialogLayout.setVerticalGroup(
                scriptDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scriptDialogLayout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameCustomScriptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createScriptFigureButton)
                                .addContainerGap())
        );

        createDialog.setSize(new java.awt.Dimension(500, 450));

        createFigureButton.setText("Create");
        createFigureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFigureButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Name of custom figure:");

        figuresDialogList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return paintPanel.getFigures().size(); }
            public String getElementAt(int i) { return paintPanel.getFigures().get(i).name(); }
        });
        figuresDialogList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                figuresDialogListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(figuresDialogList);

        jLabel5.setText("Figure to add");

        jLabel6.setText("Point 1");

        point1Edit.setText("25,25");
        point1Edit.setEnabled(false);

        jLabel3.setText("Point 2");

        point2Edit.setText("25,70");
        point2Edit.setEnabled(false);

        jLabel7.setText("Angle");

        angleEdit.setText("45");
        angleEdit.setEnabled(false);

        jLabel8.setText("Width");

        widthEdit.setText("300");
        widthEdit.setEnabled(false);

        jLabel9.setText("Height");

        heightEdit.setText("100");
        heightEdit.setEnabled(false);

        jLabel10.setText("Start Point");

        startPointEdit.setText("250,300");

        addFigureButton.setText("Add figure");
        addFigureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFigureButtonActionPerformed(evt);
            }
        });

        addedFiguresList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return figureSet.getFigures().size(); }
            public String getElementAt(int i) { return figureSet.getFigures().get(i).name(); }
        });
        jScrollPane4.setViewportView(addedFiguresList);

        jLabel11.setText("Added figures");

        javax.swing.GroupLayout createDialogLayout = new javax.swing.GroupLayout(createDialog.getContentPane());
        createDialog.getContentPane().setLayout(createDialogLayout);
        createDialogLayout.setHorizontalGroup(
                createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameCustomDialogTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createDialogLayout.createSequentialGroup()
                                                .addGap(0, 84, Short.MAX_VALUE)
                                                .addComponent(addFigureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(createFigureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(createDialogLayout.createSequentialGroup()
                                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(point2Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(angleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(widthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(heightEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(startPointEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(point1Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(createDialogLayout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jScrollPane4))))
                                .addContainerGap())
        );
        createDialogLayout.setVerticalGroup(
                createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createDialogLayout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameCustomDialogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(point1Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createDialogLayout.createSequentialGroup()
                                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(createFigureButton)
                                                        .addComponent(addFigureButton)))
                                        .addGroup(createDialogLayout.createSequentialGroup()
                                                .addComponent(point2Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(angleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(widthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(heightEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(startPointEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paintPanel.setBackground(new java.awt.Color(255, 255, 255));
        paintPanel.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
                paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1024, Short.MAX_VALUE)
        );
        paintPanelLayout.setVerticalGroup(
                paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 768, Short.MAX_VALUE)
        );

        paintPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (!mouseMoveCoordinates)
                    return;
                paintPanel.getFigures().getFigure(selectedFigureName).setStartPoint(new Point(evt.getX(), evt.getY()));
                paintPanel.repaint();
                mouseMoveCoordinates = false;
            }
        });

        editorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        figureList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return paintPanel.getFigures().size(); }
            public String getElementAt(int i) { return paintPanel.getFigures().get(i).name(); }
        });
        figureList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                figureListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(figureList);

        addByScriptButton.setText("Add by Script");
        addByScriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addByScriptButtonActionPerformed(evt);
            }
        });

        addByDialogButton.setText("Add by Dialog");
        addByDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addByDialogButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Select figure");

        moveButton.setText("Move (click where)");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(editorPanel);
        editorPanel.setLayout(editorPanelLayout);
        editorPanelLayout.setHorizontalGroup(
                editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editorPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(addByScriptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addByDialogButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(editorPanelLayout.createSequentialGroup()
                                                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(moveButton))
                                                .addGap(0, 42, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        editorPanelLayout.setVerticalGroup(
                editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editorPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(moveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addByDialogButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addByScriptButton)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(paintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(editorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void addByScriptButtonActionPerformed(java.awt.event.ActionEvent evt) {
        scriptDialog.setVisible(true);
    }

    private void createScriptFigureButtonActionPerformed(java.awt.event.ActionEvent evt) {
        paintPanel.getFigures().add(ScriptLanguageParser.createFigure(paintPanel.getFigures(), nameCustomScriptTextField.getText(), scriptTextPane.getText()));
        paintPanel.repaint();
        figureList.updateUI();
        scriptDialog.setVisible(false);
    }

    private void createFigureButtonActionPerformed(java.awt.event.ActionEvent evt) {
        figureSet.setName(nameCustomDialogTextField.getText());
        paintPanel.getFigures().add(figureSet);
        figureList.updateUI();
        paintPanel.repaint();
        figureSet = new FigureSet();
        createDialog.setVisible(false);
    }

    private void addFigureButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Figure selected = paintPanel.getFigures().getFigure(figuresDialogList.getSelectedValue());
        selected = selected.clone();
        if (point1Edit.isEnabled()) {
            String[] point1str = point1Edit.getText().split(",");
            String[] point2str = point2Edit.getText().split(",");
            selected.setPoints(new PointArray(Arrays.asList(new Point(Integer.parseInt(point1str[0]), Integer.parseInt(point1str[1])), new Point(Integer.parseInt(point2str[0]), Integer.parseInt(point2str[1])))));
        }
        if (heightEdit.isEnabled()) {
            selected.setHeight(Integer.parseInt(heightEdit.getText()));
        }
        if (widthEdit.isEnabled()) {
            selected.setWidth(Integer.parseInt(widthEdit.getText()));
        }
        if (angleEdit.isEnabled()) {
            selected.setAngle(Double.parseDouble(angleEdit.getText()));
        }
        if (startPointEdit.isEnabled()) {
            String[] startPointStr = startPointEdit.getText().split(",");
            selected.setStartPoint(new Point(Integer.parseInt(startPointStr[0]), Integer.parseInt(startPointStr[1])));
        }
        figureSet.addFigure(selected);
        addedFiguresList.updateUI();
    }

    private void addByDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {
        createDialog.setVisible(true);
        figuresDialogList.updateUI();
        figureSet = new FigureSet();
    }

    private void figuresDialogListValueChanged(javax.swing.event.ListSelectionEvent evt) {
        point1Edit.setEnabled(false);
        point2Edit.setEnabled(false);
        angleEdit.setEnabled(false);
        widthEdit.setEnabled(false);
        heightEdit.setEnabled(false);
        startPointEdit.setEnabled(true);
        Figure selected = paintPanel.getFigures().getFigure(figuresDialogList.getSelectedValue());
        if (selected instanceof LineSegment) {
            point1Edit.setEnabled(true);
            point2Edit.setEnabled(true);
            startPointEdit.setEnabled(false);
        }
        if (selected instanceof RectangleBounds) {
            widthEdit.setEnabled(true);
            heightEdit.setEnabled(true);
        }
        if (selected instanceof Parallelogram) {
            angleEdit.setEnabled(true);
        }
        if (selected instanceof Rectangle) {
            angleEdit.setEnabled(false);
        }
    }

    private void figureListValueChanged(javax.swing.event.ListSelectionEvent evt) {
        this.selectedFigureName = figureList.getSelectedValue();
    }

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        mouseMoveCoordinates = true;
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addByDialogButton;
    private javax.swing.JButton addByScriptButton;
    private javax.swing.JButton addFigureButton;
    private javax.swing.JList<String> addedFiguresList;
    private javax.swing.JTextField angleEdit;
    private javax.swing.JDialog createDialog;
    private javax.swing.JButton createFigureButton;
    private javax.swing.JButton createScriptFigureButton;
    private javax.swing.JPanel editorPanel;
    private javax.swing.JList<String> figureList;
    private javax.swing.JList<String> figuresDialogList;
    private javax.swing.JTextField heightEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton moveButton;
    private javax.swing.JTextField nameCustomDialogTextField;
    private javax.swing.JTextField nameCustomScriptTextField;
    private GraphicEditorComponent paintPanel;
    private javax.swing.JTextField point1Edit;
    private javax.swing.JTextField point2Edit;
    private javax.swing.JDialog scriptDialog;
    private javax.swing.JTextPane scriptTextPane;
    private javax.swing.JTextField startPointEdit;
    private javax.swing.JTextField widthEdit;
}
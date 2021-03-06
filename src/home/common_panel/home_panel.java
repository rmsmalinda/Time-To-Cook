/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.common_panel;

import database.databaseConnect;
import home.my_recipes.myRecipe_panel;
import zzz.test.test_frame1;
import home.standard_recipes.standardRecipe_panel;
import home.my_recipes.myRecipesAdd_dForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Supun
 */
public class home_panel extends javax.swing.JPanel {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSet rs_2=null;
    
    public static String rIDSendingVariable;
    
    /**
     * Creates new form home_panel
     */
    
    
    public home_panel() {
        initComponents();
        myRecipesChange_button.setVisible(false);
        myRecipesRemove_button.setVisible(false);
        //rID_label.setVisible(false);
        // connect to DB
        con = databaseConnect.connect();
        
        //load myRecipeList Table
        myRecipeList_tableload();
        
    }

    public void myRecipeList_tableload(){
    
       //myRecipeList_table objTable1 = new myRecipeList_table();
        
        try {
            String addMyRecipes = "SELECT rName FROM myrecipes";
            pst = con.prepareStatement(addMyRecipes);
            rs = pst.executeQuery();
            
            myRecipeList_table.setModel(DbUtils.resultSetToTableModel (rs));
        } catch (Exception e) {
            System.out.println("Error :"+e);
        }
        
    }
    
    public String getMyRecipeID(){
        String x=rIDSendingVariable;
        //JOptionPane.showMessageDialog(null,"get rIDSendingVariable : "+rIDSendingVariable+" and return x : "+x);
        return x;
    }
    
    private void setMyRecipeID(String x){
        rIDSendingVariable=x;  
        //JOptionPane.showMessageDialog(null,"set parameter x : "+x+" and converted rIDSendingVariable : "+rIDSendingVariable);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTextBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        homePageTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        standardRecipeSelectingList_jTree = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        myRecipeList_table = new javax.swing.JTable();
        myRecipesAdd_button = new javax.swing.JButton();
        myRecipesChange_button = new javax.swing.JButton();
        myRecipesRemove_button = new javax.swing.JButton();
        myRecipesRefresh_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 153));

        searchTextBox.setText("Fine recipe");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        homePageTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/half tree.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food banner1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        homePageTabbedPane.addTab("Start Page", jScrollPane3);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Standard Recipes");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Standard Recipes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Main Food");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Nuddles");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rotee");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Those");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Hoppers");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("String Hoppers");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Plain Hoppers");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Eggs Hoppers");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rice");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Red Rice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("White Rice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Yellow Rice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Vegitable Rice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Samba Rice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Chicken Frid Rice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Egg Frid Rice");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Curry");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Beans Curry");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Dhal Curry");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Photato Curry");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Tomato Curry");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Mushrooms Curry");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sambol");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Coconut sambol");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Karavila Sambal");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Kunisso Sambal");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Cucumber Sambal");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Carrot Sambal");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Brinjol Sambal");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salada Leave");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fry");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fry Potato");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fry Papadam");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fry Cutlate");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fry Beans");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fry Meals");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fry Mushrooms");
        javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Halmasso");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Chicken");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Dry Fish");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Meals");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Chicken Meals");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Sea Fish Meals");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Seasoning");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Soya meat");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Raigam");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("istoo");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Jack Themparadu");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Baby Jack");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("BreadFriut (Del)");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Leaves");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Mannokka Leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Kura Leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Niwithi Leavce");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Murunga Leavce");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Kathuru Murunga leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gotukola Leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Mugunuwanna Leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Beatroot Leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Thamberi Leaves");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Ala kola");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Others");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Eggs");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Gam Biththara");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Sudu Biththara");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Rathu Biththara");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fast Food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Patis");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Samosa");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rolls");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Vegitable Roti");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cultlat");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Hot Dogs");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Salad");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Gotukota");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cucumbo");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salada salad");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pineapple salad");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Desert");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ice Cream");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Vanila Ice Cream");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Chocolate Ice Cream");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fruit salade");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mee kiri");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Yogurt");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Watalappan");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pudin");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Jelly Pudin");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Karamal pudin");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Jelly");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Drinks");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Juice");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gutukota Kada");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Sawu kada");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bath kada");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Orange Juice");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Fruit Juice");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Codial");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("MD Codial");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Kist Codial");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Religion base Food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sinhala");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Kiribath");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Mun Kawum");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Konda Kawum");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Askme");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Hindu/Muslime");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Wade");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Parippu wade");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Sambal wade");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Isso Wade");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Uludu Wade");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Parata");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Those");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Laddu");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Itily");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Dulajjaam");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Puri");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Chapathi");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Nan roti");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Gee Riti");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Christine");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Chrismas cake");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Country base Food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Italy");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Chineise");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Indian");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Korian");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("France");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("German");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        standardRecipeSelectingList_jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        standardRecipeSelectingList_jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                standardRecipeSelectingList_jTreeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(standardRecipeSelectingList_jTree);

        myRecipeList_table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myRecipeList_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "My Recipes List"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myRecipeList_table.setAutoscrolls(false);
        myRecipeList_table.setColumnSelectionAllowed(true);
        myRecipeList_table.setMaximumSize(new java.awt.Dimension(2147483647, 308));
        myRecipeList_table.setMinimumSize(new java.awt.Dimension(300, 300));
        myRecipeList_table.setName(""); // NOI18N
        myRecipeList_table.setOpaque(false);
        myRecipeList_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myRecipeList_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myRecipeList_table);
        myRecipeList_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (myRecipeList_table.getColumnModel().getColumnCount() > 0) {
            myRecipeList_table.getColumnModel().getColumn(0).setResizable(false);
        }

        myRecipesAdd_button.setText("Add");
        myRecipesAdd_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRecipesAdd_buttonActionPerformed(evt);
            }
        });

        myRecipesChange_button.setText("Change");
        myRecipesChange_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRecipesChange_buttonActionPerformed(evt);
            }
        });

        myRecipesRemove_button.setText("Remove");
        myRecipesRemove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRecipesRemove_buttonActionPerformed(evt);
            }
        });

        myRecipesRefresh_button.setText("Refresh");
        myRecipesRefresh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRecipesRefresh_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(myRecipesRefresh_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myRecipesAdd_button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myRecipesChange_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myRecipesRemove_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myRecipesAdd_button)
                    .addComponent(myRecipesChange_button)
                    .addComponent(myRecipesRemove_button)
                    .addComponent(myRecipesRefresh_button))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(homePageTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(searchButton))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(891, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homePageTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String searchText = searchTextBox.getText();
        homePageTabbedPane.add(" \""+searchText+"\" Search Result",new JScrollPane()); // display tab

        // show last tab
        int selectedIndex = homePageTabbedPane.getSelectedIndex();
        int nextIndex = selectedIndex==homePageTabbedPane.getTabCount()-1?0: selectedIndex+1;
        homePageTabbedPane.setSelectedIndex(nextIndex);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void myRecipesAdd_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myRecipesAdd_buttonActionPerformed

        myRecipesAdd_dForm asd = new myRecipesAdd_dForm(new javax.swing.JFrame(), true);
        asd.setVisible(true);

    }//GEN-LAST:event_myRecipesAdd_buttonActionPerformed

    private void myRecipesChange_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myRecipesChange_buttonActionPerformed
        test_frame1 frame1 = new test_frame1();
        frame1.setVisible(true);
    }//GEN-LAST:event_myRecipesChange_buttonActionPerformed

    private void standardRecipeSelectingList_jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_standardRecipeSelectingList_jTreeValueChanged
        standardRecipe_panel home = new standardRecipe_panel(); //add panel to tabbedpane in mainpage
      
        
        String word=evt.getPath().toString();
        //word="How be position on like that possion in possssssss sdf";

        int p1=word.lastIndexOf(","); p1=p1+2;
        int p2=word.length(); p2=p2-1;
        
        String nword=word.substring(p1, p2);
        homePageTabbedPane.add(" "+nword+" Food Recipe",new JScrollPane(home, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
        
     
       // (mainPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
       // standardRecipe_panel home = new standardRecipe_panel();
        //JScrollPane x = new JScrollPane();
        //x.add(home);
        
        //mainPage_jScrollPane.setViewportView(home);
        
        // show last tab
        int selectedIndex = homePageTabbedPane.getSelectedIndex();
        int nextIndex = selectedIndex==homePageTabbedPane.getTabCount()-1?0: selectedIndex+1;
        homePageTabbedPane.setSelectedIndex(nextIndex);

        /*
        if (evt.isAddedPath()) {
            TreePath path = evt.getPath();
            Object treeNode = path.getLastPathComponent();
            if (treeNode == null) {
                // handle the case of no selection
                homePageTabbedPane.add(" "+nword+" Food Recipe",new JScrollPane());

            }
        }
        */

        // homePageTabbedPane.add(" "+nword+" Food Recipe",new JScrollPane());
    }//GEN-LAST:event_standardRecipeSelectingList_jTreeValueChanged

    private void myRecipesRemove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myRecipesRemove_buttonActionPerformed
        int x = JOptionPane.showConfirmDialog(null,"Do you want to delete this");
        int seletedRowNo = myRecipeList_table.getSelectedRow();
        int selectedColumnNo = myRecipeList_table.getSelectedColumn();
        
        if(x==0){
            try {
                
                Object object1 = myRecipeList_table.getModel().getValueAt(seletedRowNo, selectedColumnNo);
                String tableText = object1 +"";
                
                
                String fine_rID = "SELECT rID FROM myrecipes WHERE rName = '"+tableText+"'";
                pst = con.prepareStatement(fine_rID);
                rs_2 = pst.executeQuery();
                
                //System.out.println("select quary executed"); 
                int rID_2=0;

                while (rs_2.next()){
                    String n =rs_2.getString("rID");
                    System.out.println("rID : "+n);
                    rID_2 = Integer.parseInt(n);
                
                }
                
                String myRecipeDelectingSelect = "DELETE FROM myrecipes WHERE rID='"+rID_2+"' ";
                pst = con.prepareStatement(myRecipeDelectingSelect);
                pst.execute();
                
            } catch (SQLException | NumberFormatException e) {
                System.out.println("Erroe : "+ e);
            }
            
            myRecipeList_tableload();
        }
    }//GEN-LAST:event_myRecipesRemove_buttonActionPerformed

    private void myRecipesRefresh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myRecipesRefresh_buttonActionPerformed
        myRecipeList_tableload();
    }//GEN-LAST:event_myRecipesRefresh_buttonActionPerformed

    private void myRecipeList_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRecipeList_tableMouseClicked
        

        // identify the table index
        int seletedRowNo = myRecipeList_table.getSelectedRow();
        int selectedColumnNo = myRecipeList_table.getSelectedColumn();
        Object object1 = myRecipeList_table.getModel().getValueAt(seletedRowNo, selectedColumnNo);
        String selectedTableRowText = object1 +"";
        String tabTitle=selectedTableRowText+" Food Recipe";
        
         // send rID for tab to variable
        try {
                String tableText = object1 +"";
                
                
                String fine_rID = "SELECT rID FROM myrecipes WHERE rName = '"+tableText+"'";
                pst = con.prepareStatement(fine_rID);
                rs_2 = pst.executeQuery();
                
                
                int rID_2=0;
                String rID_str="";
                while (rs_2.next()){
                    rID_str =rs_2.getString("rID");
                
                }
                
                
        //send rID to other classes
        //JOptionPane.showMessageDialog(null,"sending "+rID_str+" to setMyRecipe methord ");
        setMyRecipeID(rID_str);
        
        
        
        
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        
        //add panel to tabbedpane in mainpage
        myRecipe_panel home = new myRecipe_panel(); 
        
        // search similar tab before add
        int tabsAmount = homePageTabbedPane.getTabCount();
        if(tabsAmount==1){
            //add tab
            homePageTabbedPane.add(tabTitle,new JScrollPane(home, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

            // show last tab
            int selectedIndex = homePageTabbedPane.getSelectedIndex();
            int nextIndex = selectedIndex==homePageTabbedPane.getTabCount()-1?0: selectedIndex+1;
            homePageTabbedPane.setSelectedIndex(nextIndex);
        }
        //search similar tabs and hide
        if(tabsAmount>=2){
            boolean tabAddingConfirmation=true;
            for(int x =1; x<tabsAmount;x++){
                String y =homePageTabbedPane.getTitleAt(x);
                
                if (tabTitle == null ? y == null : tabTitle.equals(y)){
                    
                    tabAddingConfirmation=false;
                    homePageTabbedPane.setSelectedIndex(x);
                }
                
            }
            //show not similar tabs
            if(tabAddingConfirmation==true){
                
                //add tab
                homePageTabbedPane.add(tabTitle,new JScrollPane(home, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

                // show last tab
                int tabsAmount_2 = homePageTabbedPane.getTabCount();
                homePageTabbedPane.setSelectedIndex(--tabsAmount_2);
                
                
                
                
            }
      
        }
        
        
        // show the add n remove buttons
        myRecipesChange_button.setVisible(true);
        myRecipesRemove_button.setVisible(true);
        
       
                
        
        
    }//GEN-LAST:event_myRecipeList_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTabbedPane homePageTabbedPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable myRecipeList_table;
    private javax.swing.JButton myRecipesAdd_button;
    private javax.swing.JButton myRecipesChange_button;
    private javax.swing.JButton myRecipesRefresh_button;
    private javax.swing.JButton myRecipesRemove_button;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextBox;
    private javax.swing.JTree standardRecipeSelectingList_jTree;
    // End of variables declaration//GEN-END:variables

    
}

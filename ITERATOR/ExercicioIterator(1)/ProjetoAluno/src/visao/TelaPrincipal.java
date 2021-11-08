/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Aluno;
import persistencias.AlunoDaoHashSet;
import persistencias.AlunoDaoQueue;
import persistencias.AlunoDaoLinkedList;
import persistencias.AlunoDaoLinkedHashSet;
/**
 *
 * @author guilherme
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        JLabelDadosDosAlunos = new javax.swing.JLabel();
        jButtonListarDadosQueue = new javax.swing.JButton();
        jButtonListarDadosLinkedHashSet = new javax.swing.JButton();
        jButtonListarDadosLinkedList = new javax.swing.JButton();
        jButtonListarDadosHashSet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDadosAlunos = new javax.swing.JTable();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projetos Dados dos Alunos");

        JLabelDadosDosAlunos.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        JLabelDadosDosAlunos.setText("Dados dos Alunos");

        jButtonListarDadosQueue.setText("LISTAR DADOS COM QUEUE");
        jButtonListarDadosQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarDadosQueueActionPerformed(evt);
            }
        });

        jButtonListarDadosLinkedHashSet.setText("LISTAR DADOS COM LINKED HASH SET");
        jButtonListarDadosLinkedHashSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarDadosLinkedHashSetActionPerformed(evt);
            }
        });

        jButtonListarDadosLinkedList.setText("LISTAR DADOS COM LINKED LIST");
        jButtonListarDadosLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarDadosLinkedListActionPerformed(evt);
            }
        });

        jButtonListarDadosHashSet.setText("LISTAR DADOS COM HASH SET");
        jButtonListarDadosHashSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarDadosHashSetActionPerformed(evt);
            }
        });

        jTableDadosAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Curso", "Situação", "Enfâse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDadosAlunos);

        jButtonApagar.setText("APAGAR");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonListarDadosQueue)
                            .addComponent(jButtonListarDadosLinkedList))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonListarDadosHashSet)
                            .addComponent(jButtonListarDadosLinkedHashSet)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelDadosDosAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jButtonApagar)
                        .addGap(10, 10, 10)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelDadosDosAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarDadosQueue)
                    .addComponent(jButtonListarDadosLinkedHashSet))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarDadosLinkedList)
                    .addComponent(jButtonListarDadosHashSet))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarDadosLinkedHashSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarDadosLinkedHashSetActionPerformed
        try {
            
            String arquivo;
            arquivo = "./src/arquivodados/RelatorioDasEnfases.csv";
            AlunoDaoLinkedHashSet dadosAlunosDao = new AlunoDaoLinkedHashSet();
            Iterator dadosDosAlunos = dadosAlunosDao.obterListagemDeAlunos(arquivo);
            //Trabalhando a Grid
            DefaultTableModel model =  (DefaultTableModel) jTableDadosAlunos.getModel();
            
            int limit = model.getRowCount();
            for(int i=0;i<limit;i++){
                model.removeRow(0);
            }
            
            while(dadosDosAlunos.hasNext()){
                Aluno objetoAluno = (Aluno)dadosDosAlunos.next();
                String[] linha = new String[4];
                linha[0]= objetoAluno.getNome();
                linha[1]= objetoAluno.getCurso();
                linha[2]= objetoAluno.getSituacao();
                linha[3]= objetoAluno.getEnfase();
                model.addRow(linha);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
                    
        }
    }//GEN-LAST:event_jButtonListarDadosLinkedHashSetActionPerformed

    private void jButtonListarDadosLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarDadosLinkedListActionPerformed
        try {
            String arquivo;
            arquivo = "./src/arquivodados/RelatorioDasEnfases.csv";
            AlunoDaoLinkedList dadosAlunosDao = new AlunoDaoLinkedList();
            Iterator dadosDosAlunos = dadosAlunosDao.obterListagemDeAlunos(arquivo);
            //Trabalhando a Grid
            DefaultTableModel model =  (DefaultTableModel) jTableDadosAlunos.getModel();
            
            int limit = model.getRowCount();
            for(int i=0;i<limit;i++){
                model.removeRow(0);
            }
            
            while(dadosDosAlunos.hasNext()){
                Aluno objetoAluno = (Aluno)dadosDosAlunos.next();
                String[] linha = new String[4];
                linha[0]= objetoAluno.getNome();
                linha[1]= objetoAluno.getCurso();
                linha[2]= objetoAluno.getSituacao();
                linha[3]= objetoAluno.getEnfase();
                model.addRow(linha);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
                    
        }
    }//GEN-LAST:event_jButtonListarDadosLinkedListActionPerformed

    private void jButtonListarDadosQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarDadosQueueActionPerformed
        try {
            String arquivo;
            arquivo = "./src/arquivodados/RelatorioDasEnfases.csv";
            AlunoDaoQueue dadosAlunosDao = new AlunoDaoQueue();
            Iterator dadosDosAlunos = dadosAlunosDao.obterListagemDeAlunos(arquivo);
            //Trabalhando a Grid
            DefaultTableModel model =  (DefaultTableModel) jTableDadosAlunos.getModel();
            
            int limit = model.getRowCount();
            for(int i=0;i<limit;i++){
                model.removeRow(0);
            }
            
            while(dadosDosAlunos.hasNext()){
                Aluno objetoAluno = (Aluno)dadosDosAlunos.next();
                String[] linha = new String[4];
                linha[0]= objetoAluno.getNome();
                linha[1]= objetoAluno.getCurso();
                linha[2]= objetoAluno.getSituacao();
                linha[3]= objetoAluno.getEnfase();
                model.addRow(linha);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
                    
        }
    }//GEN-LAST:event_jButtonListarDadosQueueActionPerformed

    private void jButtonListarDadosHashSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarDadosHashSetActionPerformed
        try {
            String arquivo;
            arquivo = "./src/arquivodados/RelatorioDasEnfases.csv";
            AlunoDaoHashSet dadosAlunosDao = new AlunoDaoHashSet();
            Iterator dadosDosAlunos = dadosAlunosDao.obterListagemDeAlunos(arquivo);
            //Trabalhando a Grid
            DefaultTableModel model =  (DefaultTableModel) jTableDadosAlunos.getModel();
            
            int limit = model.getRowCount();
            for(int i=0;i<limit;i++){
                model.removeRow(0);
            }
            
            while(dadosDosAlunos.hasNext()){
                Aluno objetoAluno = (Aluno)dadosDosAlunos.next();
                String[] linha = new String[4];
                linha[0]= objetoAluno.getNome();
                linha[1]= objetoAluno.getCurso();
                linha[2]= objetoAluno.getSituacao();
                linha[3]= objetoAluno.getEnfase();
                model.addRow(linha);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
                    
        }
    }//GEN-LAST:event_jButtonListarDadosHashSetActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
            DefaultTableModel model =  (DefaultTableModel) jTableDadosAlunos.getModel();
            
            int limit = model.getRowCount();
            for(int i=0;i<limit;i++){
                model.removeRow(0);
            }
    }//GEN-LAST:event_jButtonApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelDadosDosAlunos;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonListarDadosHashSet;
    private javax.swing.JButton jButtonListarDadosLinkedHashSet;
    private javax.swing.JButton jButtonListarDadosLinkedList;
    private javax.swing.JButton jButtonListarDadosQueue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDadosAlunos;
    // End of variables declaration//GEN-END:variables

}
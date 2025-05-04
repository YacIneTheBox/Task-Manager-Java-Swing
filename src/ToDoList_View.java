package To_DO;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoList_View{

    public ToDoList_View(TaskList taskList){
        JFrame frame = new JFrame();
        frame.setSize(450,600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPan = new JPanel();
        mainPan.setLayout(new BorderLayout());
        mainPan.setBackground(Color.GRAY);

        /// /////////////////////////////////
        JPanel TitlePan = new JPanel();

        TitlePan.add(new JLabel("Task Manager"));
        TitlePan.setBackground(Color.GRAY);
        mainPan.add(TitlePan,BorderLayout.NORTH);

        /// ////////////////////////////////
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","tagefe",2);
        taskList.creationTask("bite","dcecde",2);

        JPanel taskDisplayPan = new JPanel();
        taskDisplayPan.setLayout(new BoxLayout(taskDisplayPan,BoxLayout.Y_AXIS));

        refrechAffichage(taskDisplayPan,taskList);


        JScrollPane scrollPane = new JScrollPane(taskDisplayPan);
        mainPan.add(scrollPane,BorderLayout.CENTER);

        /// ///////////////////////////////////////


        JPanel controlBtn = new JPanel();
        JButton create = new JButton("Create");
        JButton removeAll = new JButton("Remove All");

        controlBtn.add(create);
        controlBtn.add(removeAll);

        mainPan.add(controlBtn,BorderLayout.SOUTH);




        frame.add(mainPan);
        frame.setVisible(true);
    }

    public void refrechAffichage(JPanel taskDisplayPan,TaskList taskList){
        // Pour vider complètement le panel
        taskDisplayPan.removeAll();

// IMPORTANT : Toujours recalculer le layout après
        taskDisplayPan.revalidate();
        taskDisplayPan.repaint();

        for (int i = 0 ; i < taskList.nbrTask() ; i++){
            JPanel itemPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            itemPanel.setBackground(Color.GRAY);

            itemPanel.add(new JLabel("Title : "));
            itemPanel.add(new JLabel(taskList.getTask(i).getTitle()));

            itemPanel.add(new JLabel("Description : "));
            itemPanel.add(new JLabel(taskList.getTask(i).getDescription()));
            final int[] jour_restant = {1};
            itemPanel.add(new JLabel("Days left : "));
            itemPanel.add(new JLabel(""+ jour_restant[0]));


            JButton addBtn = new JButton("+");
            addBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
            });
            itemPanel.add(addBtn);

            JButton deleteBtn = new JButton("Delete");
            int finalI = i;
            deleteBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    taskList.removeTask(taskList.getTask(finalI));
                    System.out.println("nigezfez");
                    refrechAffichage(taskDisplayPan,taskList);
                }
            });
            itemPanel.add(deleteBtn);



            taskDisplayPan.add(itemPanel);

        }
    }
}

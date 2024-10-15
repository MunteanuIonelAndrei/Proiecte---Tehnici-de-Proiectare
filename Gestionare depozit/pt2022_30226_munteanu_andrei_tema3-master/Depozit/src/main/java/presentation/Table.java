package presentation;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Table<T> extends JFrame {
    //JTable tableDone;
    public Table(List<T> list){
        if(list.size()==0)
            return;
        Class type=list.get(0).getClass();
        ArrayList<String> columns=new ArrayList<>();
        String[][] data=new String[list.size()][type.getDeclaredFields().length];
        for(Field field:type.getDeclaredFields()){
            columns.add(field.getName());
        }
        int i=0,j;
        for(T t:list){
            j=0;
            for(Field field:type.getDeclaredFields()){
                field.setAccessible(true);
                try {
                    data[i][j]=field.get(t).toString();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                j++;
            }
            i++;
        }


        JTable table=new JTable(data,columns.toArray());
        table.setBounds(0,0,1000,500);
        JScrollPane scrollPane=new JScrollPane(table);

        this.add(scrollPane);
        this.setSize(1000,500);
        this.setVisible(true);

      // tableDone=getTable(data,columns.toArray());
    }

 /*   private JTable getTable(String[][] data, Object[] columns) {
        JTable table=new JTable(data,columns);
        table.setBounds(0,0,1000,500);
        JScrollPane scrollPane=new JScrollPane(table);
        table.add(scrollPane);
        return table;
    }*/

}

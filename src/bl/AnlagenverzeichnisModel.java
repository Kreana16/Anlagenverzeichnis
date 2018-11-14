/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import static bl.AnlagenverzeichnisEnum.*;
import bl.AnlagenverzeichnisCSV;
import java.io.File;
import java.util.List;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sasch
 */
public class AnlagenverzeichnisModel extends AbstractTableModel{
    List<Entry> l=new LinkedList();
    List<Entry> all= new LinkedList();
    @Override
    public int getRowCount() {
        return l.size();
    }

    @Override
    public int getColumnCount() {
        return AnlagenverzeichnisEnum.values().length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Entry e=l.get(i);
        switch(AnlagenverzeichnisEnum.values()[i1]){
            case NAME:return e.getName();
            case AK:return e.getAk();
            case INBET:return e.getInbet();
            case ND:return e.getNd();
            case BISHND:e.getBishnd();
            case AFA:e.getAfa();
            case NOAFA:e.getNoAfa();
            case AFADJ:e.getAfaDJ();
            case BW:e.getBw();
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        switch(AnlagenverzeichnisEnum.values()[i]){
            case NAME:return NAME.getName();
            case AK:return AK.getName();
            case INBET:return INBET.getName();
            case ND:return ND.getName();
            case BISHND:return BISHND.getName();
            case AFA:return AFA.getName();
            case NOAFA:return NOAFA.getName();
            case AFADJ:return AFADJ.getName();
            case BW:return BW.getName();
        }
        return null;
    }
    public void load(File file){
        AnlagenverzeichnisCSV csv = new AnlagenverzeichnisCSV();
        this.all=csv.read(file);
        l=all;
        this.fireTableDataChanged();
        System.out.println("Successfully Loaded Data from "+file.getAbsolutePath());
    }
    
    public void filter(float year){
        l = new LinkedList();
        for(Entry cur : all){
            if(cur.getInbet()==year){
                l.add(cur);
            }
        }
        this.fireTableDataChanged();
        System.out.println("Successfully filtered Year="+year);
    }
    
}

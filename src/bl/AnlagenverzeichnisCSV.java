/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.List;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sasch
 */
public class AnlagenverzeichnisCSV {
    public List<Entry> read(File file){
        List<Entry> entries = new LinkedList();
        Scanner sc=null;
        try {
            sc = new Scanner(file);
            sc.nextLine();
            while(sc.hasNext()){
                String input = sc.nextLine();
                String[] tokens = input.split(";");
                String name = tokens[0];
                double ak = Double.parseDouble(tokens[1].replace(",", "."));
                float inbet = Float.parseFloat(tokens[2].replace(",", "."));
                float nd = Float.parseFloat(tokens[3].replace(",", "."));

                entries.add(new Entry(name, ak, inbet, nd));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler aufgetreten","FEHLER!",JOptionPane.ERROR_MESSAGE);
        } finally{
            sc.close();
        }
        return entries;
    }
}

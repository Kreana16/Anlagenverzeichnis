/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author sasch
 */
public enum AnlagenverzeichnisEnum {
    NAME("Bezeichnung"),
    AK("Arbeiter Kammer"),
    INBET("Inbetriebnahme"),
    ND("ND"),
    BISHND("Bis h ND"),
    AFA("AFA"),
    NOAFA("No AFA"),
    AFADJ("AFA Dj"),
    BW("BW");
    String name;
    AnlagenverzeichnisEnum(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

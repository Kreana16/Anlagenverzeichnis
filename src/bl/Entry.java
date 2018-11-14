/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
=======
 * @author Andreas
 */
public class Entry {
    String name; 
    double ak,afa,noAfa,afaDJ,bw;
    float inbet,nd,bishnd;
    
    public Entry(String name,double ak,float inbet,float nd,float bishnd,double afa,double noAfa, double afaDJ,double bw){
        this.name=name;
        this.ak=ak;
        this.inbet=inbet;
        this.nd=nd;
        this.bishnd=nd;
        this.afa=afa;
        this.noAfa=afa;
        this.afaDJ=afaDJ;
        this.bw=bw;
    }

    public String getName() {
        return name;
    }

    public double getAk() {
        return ak;
    }

    public double getAfa() {
        return afa;
    }

    public double getNoAfa() {
        return noAfa;
    }

    public double getAfaDJ() {
        return afaDJ;
    }

    public double getBw() {
        return bw;
    }

    public float getInbet() {
        return inbet;
    }

    public float getNd() {
        return nd;
    }

    public float getBishnd() {
        return bishnd;
    }
    
}

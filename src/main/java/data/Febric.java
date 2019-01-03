/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Chandni
 */
public class Febric {
     int fid;
    String fsize,fdetail;
     public Febric(int fid,String fsize,String fdetail)
    {
     this.fid=fid;
     this.fsize=fsize;
     this.fdetail=fdetail;
    }
    public Febric()
    {
    
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFsize() {
        return fsize;
    }

    public void setFsize(String fsize) {
        this.fsize = fsize;
    }

    public String getFdetail() {
        return fdetail;
    }

    public void setFdetail(String fdetail) {
        this.fdetail = fdetail;
    }
    
}

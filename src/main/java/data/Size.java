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
public class Size {
    int uid;
    String usize,udetail;
    public Size(int uid,String usize,String udetail)
    {
     this.uid=uid;
     this.usize=usize;
     this.udetail=udetail;
    }
    public Size()
    {
    
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsize() {
        return usize;
    }

    public void setUsize(String usize) {
        this.usize = usize;
    }

    public String getUdetail() {
        return udetail;
    }

    public void setUdetail(String udetail) {
        this.udetail = udetail;
    }
    
    
    
}

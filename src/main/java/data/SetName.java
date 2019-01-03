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
public class SetName {
     int snid;
    String snname;

    public SetName()
    {
        
    }
    public SetName(int snid,String snname){
        this.snid=snid;
        this.snname=snname;
        
    }
    public int getSnid() {
        return snid;
    }

    public void setSnid(int snid) {
        this.snid = snid;
    }

    public String getSnname() {
        return snname;
    }

    public void setSnname(String snname) {
        this.snname = snname;
    }
    
    
}

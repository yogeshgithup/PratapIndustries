
package data;

/**
 *
 * @author Chandni
 */
public class MainCategory {
    int mid;
    String mname;
    public MainCategory()
    {
        
    }
    public MainCategory(int mid,String mname)
    {
        this.mid=mid;
        this.mname=mname;
        
    }

    public int getMid() {
        return mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    
    
}

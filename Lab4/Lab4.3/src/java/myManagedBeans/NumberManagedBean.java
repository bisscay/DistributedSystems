/*
 */
package myManagedBeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 * Using SessionScoped Beans Across Multiple Pages
 * @author bAe
 */
@Named(value = "numberManagedBean")
@ManagedBean
@SessionScoped
public class NumberManagedBean implements Serializable {
    // attributes
    private int number;

    /**
     * Creates a new instance of NumberManagedBean
     */
    public NumberManagedBean() {
    }
    
    /**
     * Navigate to next page
     * @return current facelet status
     */
    public String nextPage() {
        return "Success";
    }

    /**
     * Getter for number
     * @return current value of number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter for number
     * @param number new value for number
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    
}

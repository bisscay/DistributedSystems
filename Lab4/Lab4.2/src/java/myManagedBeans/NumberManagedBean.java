/*
 */
package myManagedBeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 * Using RequestScoped Beans Across Multiple Pages
 * @author bAe
 */
@Named(value = "numberManagedBean")
@ManagedBean
@RequestScoped
public class NumberManagedBean {
    // attributes
    private int number;

    /**
     * Default Constructor
     * Creates a new instance of NumberManagedBean
     */
    public NumberManagedBean() {
    }
    
    /**
     * Navigate to Next Page
     * @return page validation state
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

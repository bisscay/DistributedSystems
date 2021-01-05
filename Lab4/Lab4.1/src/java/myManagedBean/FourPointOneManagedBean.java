/*
 */
package myManagedBean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author bAe
 */
@Named(value = "fourPointOneManagedBean")
@RequestScoped
public class FourPointOneManagedBean {
    // attributes
    private String name;
    private String city;

    /**
     * Creates a new instance of FourPointOneManagedBean
     */
    public FourPointOneManagedBean() {
    }
    
    public String toNextPage() {
        return "Success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}

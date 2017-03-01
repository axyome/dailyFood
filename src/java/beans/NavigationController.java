/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author samueltheismann
 */
@ManagedBean(name = "navigationController", eager = true)
@ViewScoped
public class NavigationController implements Serializable
{
    private String prefix = "./WEB-INF/";
    private String page = prefix+"accueil";
    
    
    public String getPage()
    {
        return page;
    }
    
    public void setPage(String pge)
    {
        this.page = prefix+pge;
    }
    
    
}

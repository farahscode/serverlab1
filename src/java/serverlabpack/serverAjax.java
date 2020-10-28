package serverlabpack;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class serverAjax {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String sayWelcomeAjax;
    
    
    public String getsayWelcomeAjax(){
        return "Hello ajax" + name;
    }

  public String sayWelcomeAjax() {
        return sayWelcomeAjax;
    }
  
    public serverAjax() {
    }

}

package tn.esprit.spring.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.ReclamationService;
import tn.esprit.spring.service.UserService;



@Scope(value="session")
@SessionScoped
@Controller(value = "UserController")
@ELBeanName(value = "UserController")
@Join(path = "/", to = "/login.jsf")
public class UserController {
	@Autowired
	UserService userservice;
	static Reclamation reclam;
	private String login;
	private String password;
	private User user;
	private Long reported;
	private Boolean loggedIn;
	static User userconnecte;
	static User userreported;
    private long idreclamation;
	private Date dateReclamation;
	private String titleReclamation;
	private String imageReclamation;
	private String textReclamation;
	private String photodereclamation;	
	@Autowired
	ReclamationService reclamationservice;
	private Long ReclamationIdToBeUpdated;
	private List<User> Users;

	private User authenticated;
	private User reporteduser;
	
	private Reclamation reclamation;
	
	private List<Reclamation> reclamations;
	private User authenticatedUser;

	public User getAuthenticatedUser() {
		return authenticatedUser;
	}





	public Long getReported() {
		return reported;
	}





	public void setReported(Long reported) {
		this.reported = reported;
	}





	public User getReporteduser() {
		return reporteduser;
	}





	public void setReporteduser(User reporteduser) {
		this.reporteduser = reporteduser;
	}





	public void setIdreclamation(long idreclamation) {
		this.idreclamation = idreclamation;
	}





	public void setAuthenticatedUser(User authenticatedUser) {
		this.authenticatedUser = authenticatedUser;
	}




	
	public List<Reclamation> getReclamations() {
		reclamations=reclamationservice.GetAllReclamationJPQL();
		return reclamations;
	}
	

	
	
	
	
   public UserService getUserservice() {
		return userservice;
	}





	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}





public String getPhotodereclamation() {
		return photodereclamation;
	}





	public void setPhotodereclamation(String photodereclamation) {
		this.photodereclamation = photodereclamation;
	}





public static User getUserreported() {
		return userreported;
	}





	public static void setUserreported(User userreported) {
		UserController.userreported = userreported;
	}





public String Detail(Reclamation r){
	   reclamation=r;
	   System.out.println("helo");
	   displayReclamation(r);
	   return "/pages/admin/details.xhtml?faces-redirect=true";
   }

     public String Detail2(Reclamation r){
	   reclam=r;
	   System.out.println("helo");
	   displayReclamation(r);
	   return "/pages/user/modifierreclamation.xhtml?faces-redirect=true";
}
    public String excute(User r){
    	userreported=r;
    	UserController.userconnecte=((User) authenticatedUser );
	displayUser(r);
    return "/pages/user/reclamer.xhtml?faces-redirect=true";
}
	
   FacesContext fCtx = FacesContext.getCurrentInstance();
	HttpSession session = (HttpSession) fCtx.getExternalContext().getSession(false);
	String sessionId = session.getId();

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public Reclamation getReclamation() {
		return reclamation;
	}

	public void details(Reclamation reclamation) {
		this.reclamation = reclamation;
		
	}

	public Long getIdreclamation() {
		return idreclamation;
	}

	public void setIdreclamation(Long idreclamation) {
		this.idreclamation = idreclamation;
	}

	public Date getDateReclamation() {
		return dateReclamation;
	}

	public void setDateReclamation(Date dateReclamation) {
		this.dateReclamation = dateReclamation;
	}

	public String getTitleReclamation() {
		return titleReclamation;
	}

	public void setTitleReclamation(String titleReclamation) {
		this.titleReclamation = titleReclamation;
	}




	public List<User> getUsers() {
		Users = userservice.getAllparents();
		return Users;
	}

	public UserService getEmployeService() {
		return userservice;
	}

	public void setEmployeService(UserService userservice) {
		this.userservice = userservice;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setEmploye(User user) {
		this.user = user;
	}

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	

	public String getImageReclamation() {
		return imageReclamation;
	}

	public void setImageReclamation(String imageReclamation) {
		this.imageReclamation = imageReclamation;
	}

	public String getTextReclamation() {
		return textReclamation;
	}

	public void setTextReclamation(String textReclamation) {
		this.textReclamation = textReclamation;
	}

	public Role[] getRoles() {
		return Role.values();
	}
	
	public String Treat(Long id) {
		
		long n=1;
		reclamationservice.TreatReclamation(id);
		System.out.print("hellllllllloooooooooooo");
		return "/pages/admin/welcome.xhtml";
	}

	public String doLogin() {
		String navigateTo = "null";
		 authenticatedUser = userservice.Authentification(login, password);
		if (authenticatedUser != null && authenticatedUser.getRole() == Role.Admin) {
			navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";
			loggedIn = true;
			
		} else if (authenticatedUser != null && authenticatedUser.getRole() == Role.Parent)  {
			navigateTo = "/pages/user/allusers.xhtml?faces-redirect=true";
			loggedIn = true;
			UserController.userconnecte=((User) authenticatedUser );
			}
		else{
				FacesMessage facesMessage = new FacesMessage(
					"Login Failed: please check your username/password and try again Or u get bunned.");
			FacesContext.getCurrentInstance().addMessage("form:btn", facesMessage);
		}
		return navigateTo;
	}

	
	public void displayReclamation(Reclamation empl) {
		this.setIdreclamation(empl.getIdReclamation());;
		this.setDateReclamation(empl.getDateReclamation());
		this.setTitleReclamation(empl.getTitleReclamation());
		this.setTextReclamation(empl.getTextReclamation());
		this.setImageReclamation(empl.getImageReclamation());
		
		
	}
	    public void displayUser(User empl) {
		this.setReported(empl.getIdUser());
		
	
		
	}
	
	
	public static User getUserconnecte() {
		return userconnecte;
	}





	public static void setUserconnecte(User userconnecte) {
		UserController.userconnecte = userconnecte;
	}





	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login.xhtml?faces-redirect=true";
	}
	
	public String addReclamation() {
		User us=UserController.getUserconnecte();
		User userreported=UserController.getUserreported();
		reclamationservice.AddReclamation(new Reclamation(titleReclamation,photodereclamation,textReclamation,us,userreported));
		return "/pages/user/mesreclamations.xhtml?faces-redirect=true";
	}

	public String modifierReclamation() {
		User userreported=UserController.getUserreported();
		reclamationservice.UpdateReclamation(textReclamation,titleReclamation,reclam.getIdReclamation());
		return "/pages/user/mesreclamations.xhtml?faces-redirect=true";

	}
	
	public void removeReclamation(Long employeId) {
		reclamationservice.DeleteReclamation(employeId);
	}
	public void banauto() {
		reclamationservice.TakeThelist();
	}
}
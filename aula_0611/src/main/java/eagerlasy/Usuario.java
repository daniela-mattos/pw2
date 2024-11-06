package eagerlasy;
 //++++  classe de exemplo pra ver eager lasy

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.*;
import enums.*;

@Entity
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
 
    @ElementCollection
    @CollectionTable(name="usuario_tem_emails")
	  @Basic(fetch = FetchType.EAGER)
    private Set<String> emails;
 

    
    public Usuario(){}

    public Usuario(String identificador, String senha, Set<String> emails) {
        this(identificador, senha, emails, null);
    }
 
    public Usuario(String identificador, String senha, Set<String> emails, Perfil perfil) {
         this.emails = emails;
  
    }
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long id) {
        this.idUsuario = id;
    }

    

    public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	
	



	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

	
   
}


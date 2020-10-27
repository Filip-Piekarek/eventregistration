package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import RegistrationManager;
import javax.persistence.ManyToOne;
import Registration;
import java.util.Set;
import javax.persistence.OneToMany;

@Entity
public class Person{
   private String name;

public void setName(String value) {
    this.name = value;
}
@Id
public String getName() {
    return this.name;
}
   private RegistrationManager registrationManager;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   private Set<Registration> registration;
   
   @OneToMany(mappedBy="participant" )
   public Set<Registration> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Registration> registrations) {
      this.registration = registrations;
   }
   
   }

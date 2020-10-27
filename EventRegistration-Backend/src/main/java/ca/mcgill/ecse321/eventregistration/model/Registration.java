import javax.persistence.Entity;
import javax.persistence.Id;
import ca.mcgill.ecse321.eventregistration.model.Person;
import javax.persistence.ManyToOne;

@Entity
public class Registration{
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
   private Person participant;
   
   @ManyToOne(optional=false)
   public Person getParticipant() {
      return this.participant;
   }
   
   public void setParticipant(Person participant) {
      this.participant = participant;
   }
   
   private RegistrationManager registrationManager;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   private RegistrationManager registrationManager;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   }

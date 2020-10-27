import javax.persistence.Entity;
import ca.mcgill.ecse321.eventregistration.model.Person;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class RegistrationManager{
   private Set<Person> participants;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Person> getParticipants() {
      return this.participants;
   }
   
   public void setParticipants(Set<Person> participantss) {
      this.participants = participantss;
   }
   
   private Set<Event> events;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Event> getEvents() {
      return this.events;
   }
   
   public void setEvents(Set<Event> eventss) {
      this.events = eventss;
   }
   
   private Set<Registration> registration;
   
   @OneToMany(mappedBy="registrationManager" )
   public Set<Registration> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Registration> registrations) {
      this.registration = registrations;
   }
   
   private Set<Registration> registrations;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Registration> getRegistrations() {
      return this.registrations;
   }
   
   public void setRegistrations(Set<Registration> registrationss) {
      this.registrations = registrationss;
   }
   
   private Set<Event> registration;
   
   @OneToMany(mappedBy="registrationManager" )
   public Set<Event> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Event> registrations) {
      this.registration = registrations;
   }
   
   private int id;

public void setId(int value) {
    this.id = value;
}
@Id
public int getId() {
    return this.id;
}
}

package webintegration;
import org.junit.jupiter.api.Test;

public class Testcode {
	

	
      @Test
      public void CreateNeueUser() {
	  
	  Person person = new Person();
	  person.setNachname("Ejangue");
	  person.setVorname("Guillaume");
	  person.setAge(28);
	  
	 org.junit.jupiter.api.Assertions.assertEquals("Ejangue", person.getNachname());
	  
	  System.out.println("Der Nachname  ist : " + person.getNachname());
	  System.out.println("Der Vorname  ist : " + person.getVorname());
	  System.out.println("Der User   ist : " + person.getAge() + " Jahre Alt");
  }
}

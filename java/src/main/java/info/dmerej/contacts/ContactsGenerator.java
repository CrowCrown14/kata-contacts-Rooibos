package info.dmerej.contacts;

import java.util.Arrays;
import java.util.stream.Stream;

public class ContactsGenerator {
  public Stream<Contact> generateContacts(int count) {
	  
	Contact[] contacts = new Contact[count];
	
	for (int i = 0 ; i < count ; i++) {
		
		contacts[i] = new Contact("a" + i , "a" + i + "@gmail.com");
	}
	
//    Contact[] contacts = new Contact[]{
//      new Contact("Alice", "alice@aol.com"),
//      new Contact("Bob", "bob@gmail.com"),
//      new Contact("Eve", "eve@fastmail.com"),
//    };
    return Arrays.stream(contacts);
  }
}

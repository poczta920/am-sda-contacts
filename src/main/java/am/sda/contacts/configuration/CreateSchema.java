package am.sda.contacts.configuration;


import javax.persistence.Persistence;

public class CreateSchema {


    public void createNewSchema() {
        Persistence.generateSchema("am_sda_contacts", null);


    }
}

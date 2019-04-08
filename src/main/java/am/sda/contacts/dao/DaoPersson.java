package am.sda.contacts.dao;



import am.sda.contacts.entity.Person;

import javax.persistence.Persistence;
import java.util.List;

public class DaoPersson implements DaoPersonCrud {

    @Override
    public int addPerson(Person person) {
            return 0;
    }

    @Override
    public int removePerson(Person person) {
        return 0;
    }

    @Override
    public int updatePerson(Person person) {
        return 0;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }
}

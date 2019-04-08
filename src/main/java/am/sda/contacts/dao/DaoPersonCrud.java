package am.sda.contacts.dao;



import am.sda.contacts.entity.Person;

import java.util.List;

public interface DaoPersonCrud {
    public int addPerson(Person person);
    public int removePerson(Person person);
    public int updatePerson(Person person);

    public Person getPersonById(int id);
    public List<Person> getAllPerson();
}

package com.thoughworks.example.provider;

import com.thoughworks.example.model.Person;

public class LDAPProvider implements DataProvider {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public Person getPerson(Integer id) {
        if (id.equals(person.getId())){
            return person;
        }else {
            return null;
        }
    }
}

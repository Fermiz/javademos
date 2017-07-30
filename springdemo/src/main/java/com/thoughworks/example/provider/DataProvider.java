package com.thoughworks.example.provider;

import com.thoughworks.example.model.Person;

public interface DataProvider {

    Person getPerson(Integer id);

}

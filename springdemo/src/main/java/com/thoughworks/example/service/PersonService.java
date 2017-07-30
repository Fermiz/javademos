package com.thoughworks.example.service;

import com.thoughworks.example.provider.DataProvider;

public class PersonService {

    private DataProvider provider;

    public DataProvider getProvider() {
        return provider;
    }

    public void setProvider(DataProvider provider) {
        this.provider = provider;
    }

    public String getPersonName(Integer id) {
        return provider.getPerson(id).getName();
    }

}

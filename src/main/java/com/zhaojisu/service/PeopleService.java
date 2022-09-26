package com.zhaojisu.service;

import com.zhaojisu.domain.People;

public interface PeopleService {

    People judgeAdult(People people);

    String deletePeople(People people);
}

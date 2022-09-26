package com.zhaojisu.service;

import com.zhaojisu.domain.People;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public People judgeAdult(People people) {
        if(people.getAge()>=18){
            people.setMark("已成年");
        }
        return people;
    }

    @Override
    public String deletePeople(People people) {
        //dao删除消息 peopleDao.delete(name);
        return  people.getName();
    }
}

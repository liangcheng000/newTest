package com.wishare.demo.Service;

import com.wishare.demo.dao.PersonMapper;
import com.wishare.demo.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired(required = false)
    private PersonMapper personMapper;

    /**
     * 查询所有
     */
    public List<PersonEntity> queryAll(){
        return personMapper.queryAll();
    }

    /**
     * 查询单条
     */
    public PersonEntity queryById(Integer perId){
       return personMapper.queryById(perId);
    }

    /**
     * 新增
     */
    public int insertInto(PersonEntity persons){
        return personMapper.insertInto(persons);
    }

    /**
     * 修改
     */
    public int updates(PersonEntity persons){
        return personMapper.updates(persons);
    }

    /**
     * 删除
     */
    public int deleteById(Integer perId){
        return personMapper.deleteById(perId);
    }
}

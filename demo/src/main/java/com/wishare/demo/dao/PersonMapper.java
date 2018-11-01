package com.wishare.demo.dao;

import com.wishare.demo.entity.PersonEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PersonMapper {

    /**
     * 查询所有
     */
    @Select("select * from person")
      @Results({
              @Result(property = "perId",column = "per_id"),
              @Result(property = "perName",column = "per_name"),
              @Result(property = "perPwd",column = "per_pwd"),
              @Result(property = "perSex",column = "per_sex"),
              @Result(property = "perAge",column = "per_age")
      })
    List<PersonEntity> queryAll();

    /**
     * 查询单条
     */
     @Select("select * from person where per_id=#{perId}")
      @Results({
              @Result(property = "perId",column = "per_id"),
              @Result(property = "perName",column = "per_name"),
              @Result(property = "perPwd",column = "per_pwd"),
              @Result(property = "perSex",column = "per_sex"),
              @Result(property = "perAge",column = "per_age")
      })
    PersonEntity queryById(Integer perId);

    /**
     * 新增
     */
    @Insert("insert into person(per_name,per_pwd,per_sex,per_age) " +
            "values(#{perName},#{perPwd},#{perSex},#{perAge})")
    int insertInto(PersonEntity persons);

    /**
     * 修改
     */
    @Update("update person set per_name=#{perName},per_pwd=#{perPwd},per_sex=#{perSex},per_age=#{perAge}" +
            " where per_id=#{perId}")
    @Results({
            @Result(property = "perId",column = "per_id"),
            @Result(property = "perName",column = "per_name"),
            @Result(property = "perSex",column = "per_sex"),
            @Result(property = "perAge",column = "per_age")
    })
    int updates(PersonEntity persons);

    /**
     * 删除
     */
    @Delete("delete from person where per_id=#{perId}")
    int deleteById(Integer perId);

}



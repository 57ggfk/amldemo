package com.demo.aml.mapper;

import com.demo.aml.pojo.T00System;
import com.demo.aml.pojo.T00SystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T00SystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    long countByExample(T00SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int deleteByExample(T00SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int deleteByPrimaryKey(String systemkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int insert(T00System record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int insertSelective(T00System record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    List<T00System> selectByExample(T00SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    T00System selectByPrimaryKey(String systemkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") T00System record, @Param("example") T00SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByExample(@Param("record") T00System record, @Param("example") T00SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByPrimaryKeySelective(T00System record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_SYSTEM
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByPrimaryKey(T00System record);
}
package com.demo.aml.mapper;

import com.demo.aml.pojo.T00User;
import com.demo.aml.pojo.T00UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T00UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    long countByExample(T00UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int deleteByExample(T00UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int insert(T00User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int insertSelective(T00User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    List<T00User> selectByExample(T00UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") T00User record, @Param("example") T00UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_USER
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByExample(@Param("record") T00User record, @Param("example") T00UserExample example);
}
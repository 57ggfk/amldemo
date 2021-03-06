package com.demo.aml.mapper;

import com.demo.aml.pojo.T87Syspara;
import com.demo.aml.pojo.T87SysparaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T87SysparaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    long countByExample(T87SysparaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int deleteByExample(T87SysparaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int insert(T87Syspara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int insertSelective(T87Syspara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    List<T87Syspara> selectByExample(T87SysparaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") T87Syspara record, @Param("example") T87SysparaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:52:49 CST 2018
     */
    int updateByExample(@Param("record") T87Syspara record, @Param("example") T87SysparaExample example);
}
package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsOrder;
import com.qiguliuxing.dts.db.domain.DtsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    long countByExample(DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int deleteByExample(DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int insert(DtsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int insertSelective(DtsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsOrder selectOneByExample(DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsOrder selectOneByExampleSelective(@Param("example") DtsOrderExample example, @Param("selective") DtsOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsOrder> selectByExampleSelective(@Param("example") DtsOrderExample example, @Param("selective") DtsOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    List<DtsOrder> selectByExample(DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    DtsOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsOrder selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsOrder record, @Param("example") DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsOrder record, @Param("example") DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DtsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Week;

public interface WeekMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table week
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer weekId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table week
     *
     * @mbggenerated
     */
    int insert(Week record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table week
     *
     * @mbggenerated
     */
    int insertSelective(Week record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table week
     *
     * @mbggenerated
     */
    Week selectByPrimaryKey(Integer weekId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table week
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Week record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table week
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Week record);
}
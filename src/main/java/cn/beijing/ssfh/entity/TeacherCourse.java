package cn.beijing.ssfh.entity;

public class TeacherCourse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_course.teacher_course_id
     *
     * @mbggenerated
     */
    private Integer teacherCourseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_course.chapter_id
     *
     * @mbggenerated
     */
    private Integer chapterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_course.teacher_id
     *
     * @mbggenerated
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_course.teacher_course_id
     *
     * @return the value of teacher_course.teacher_course_id
     *
     * @mbggenerated
     */
    public Integer getTeacherCourseId() {
        return teacherCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_course.teacher_course_id
     *
     * @param teacherCourseId the value for teacher_course.teacher_course_id
     *
     * @mbggenerated
     */
    public void setTeacherCourseId(Integer teacherCourseId) {
        this.teacherCourseId = teacherCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_course.chapter_id
     *
     * @return the value of teacher_course.chapter_id
     *
     * @mbggenerated
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_course.chapter_id
     *
     * @param chapterId the value for teacher_course.chapter_id
     *
     * @mbggenerated
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_course.teacher_id
     *
     * @return the value of teacher_course.teacher_id
     *
     * @mbggenerated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_course.teacher_id
     *
     * @param teacherId the value for teacher_course.teacher_id
     *
     * @mbggenerated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
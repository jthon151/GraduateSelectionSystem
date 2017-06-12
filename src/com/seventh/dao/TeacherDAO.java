package com.seventh.dao;

import java.util.List;

import com.seventh.entity.Page;
import com.seventh.entity.Teacher;

public interface TeacherDAO {
	public Teacher findTeacherById(String id);
	public int teacherCounts(String hql);
	public List<Teacher> findAllTeacher(final Page page);
	public void save(Teacher teacher);
	public void update(Teacher teacher);
	public void delete(Teacher teacher);
}

package dao;

import java.util.List;

import data.Students;

public interface IStudentDAO
{
	
public void create(Students student);

public Students getStudent(int id);

public List<Students> getStudents();

public void delete(int id);

public void update(Students student);

public boolean saveStudentByPst(final Students student);
}

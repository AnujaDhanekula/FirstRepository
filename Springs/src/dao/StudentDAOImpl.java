package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import data.Students;

public class StudentDAOImpl implements IStudentDAO
{
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void create(Students student)
	{
		
		String sql="insert into students  values('"+student.getId()+"','"+student.getFirst_Name()+"','"+student.getLast_Name()+"','"+student.getAge()+"')";
				 int result=jdbcTemplate.update(sql);
		 System.out.println("Record Inserted SuccessuFully...."+result);
	}

	@Override
	public Students getStudent(int id)
	{
		
		return null;
	}
	
	public List<Students> getStudents() 
	{
		String sql="select * from students";
		
		List<Students> list=jdbcTemplate.query(sql, new RowMapper<Students>(){

			public Students mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				Students s=new Students();
				
					s.setId(rs.getInt("id"));
					s.setFirst_Name(rs.getString("First_Name"));
					s.setLast_Name(rs.getString("Last_Name"));
					s.setAge(rs.getInt("Age"));
				
				return s;
			
			}
		});
		return list;
	}

	/*@Override
	public List<Students> getStudents() 
	{
		return jdbcTemplate.query("select * from student", new ResultSetExtractor <List<Students>>() {

			@Override
			public List<Students> extractData(ResultSet rs) throws SQLException, 
			DataAccessException {
				List<Students> list=new ArrayList<Students>();
				while(rs.next())
				{
					Students s=new Students();
					s.setId(rs.getInt(1));
					s.setFirst_Name(rs.getString(2));
					s.setLast_Name(rs.getString(3));
					s.setAge(rs.getInt(4));
				}
				return list;
			}
		});
	}
*/
	@Override
	public void delete(int id) {
		
		String query="delete from students where id='"+id+"'";
	    int result=jdbcTemplate.update(query); 
	    System.out.println("Record Deleted SuccessuFully...."+result);
	}

	@Override
	public void update(Students student) 
	{
		String query="update students set First_Name='"+student.getFirst_Name()+"',Last_Name='"+student.getLast_Name()+"',Age='"+student.getAge()+"'where id='"+student.getId()+"' ";
		int result= jdbcTemplate.update(query);
		System.out.println("Record Updated SuccessuFully...."+result);
	}

	@Override
	public boolean saveStudentByPst(Students student) 
	{
		String query="insert into students values(?,?,?,?)";
		
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
		@Override	
		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException ,DataAccessException
		{
		ps.setInt(1,student.getId());
		ps.setString(2,student.getFirst_Name());
		ps.setString(3,student.getLast_Name());
		ps.setInt(4,student.getAge());
		return ps.execute();
		}
		});

		
	}

}

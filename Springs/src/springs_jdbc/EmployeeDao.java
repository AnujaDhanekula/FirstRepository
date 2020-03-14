package springs_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;  
  
public class EmployeeDao 
{  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(Employee e)
{  
    String query="insert into employee values('"+e.getName()+"','"+e.getId()+"','"+e.getDept()+"','"+e.getDesg()+"','"+e.getCompany()+"','"+e.getEmail()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateEmploye(Employee e)
{  
    String query="update employee set name='"+e.getName()+"',dept='"+e.getDept()+"',desg='"+e.getDesg()+"',company='"+e.getCompany()+"'email='"+e.getEmail()+"' where id='"+e.getId()+"' ";  
    //String query="update employee set name='Sowmya',dept='CSE',desg='BTech',company='Wipro',email='sow@gm.com' where id='5'";
    return jdbcTemplate.update(query);  
}  
public int deleteEmploye(Employee e)
{  
    String query="delete from employee where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}



  
}  
package jdbcapp.utility;

public interface QueryMapper {

	public static final String INSERT_DEPARTMENT="insert into department values(?,?);";
	public static final String GET_DEPARTMENT_BY_ID="select * from department where deptno=?;";
	public static final String DELETE_DEPARTMENT_BY_ID = "delete from department where deptno=?;";
	public static final String GET_ALL_DEPARTMENT = "select * from department;";
	public static final String UPDATE_DEPARTMENT="update department set deptname=? where deptno=?;";  
}

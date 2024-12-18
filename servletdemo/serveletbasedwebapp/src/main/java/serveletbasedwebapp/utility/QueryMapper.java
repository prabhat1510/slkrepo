package serveletbasedwebapp.utility;

public interface QueryMapper {

	public static final String INSERT_CUSTOMER="insert into customer values(?,?);";
	public static final String GET_CUSTOMER_BY_ID="select * from customer where custid=?;";
	
}

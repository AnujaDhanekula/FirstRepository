package utility;

import model.Package;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import dao.DBHandler;
import exceptions.InvalidPackageIdException;

public class TravelAgency 
{

	Connection connection;
	
	public	List<Package> generatePackageCost(String filePath) throws SQLException , IOException,InvalidPackageIdException 
		{
				
		List<Package> res=new ArrayList<Package>();
		
			try 
			{
				connection=DBHandler.establishConnection();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			ArrayList list1=new ArrayList();
			
			FileReader fr=new FileReader(filePath);
	
			BufferedReader br=new BufferedReader(fr);
		
			String strLine=null;
	 
			while((strLine=br.readLine())!=null)
			{
			list1.add(strLine);
			}
				
			Iterator itr=list1.iterator();
				
			while(itr.hasNext()) 
			{
				String str[]=new String[5];
				str=itr.next().toString().split(",");
				String packageId=str[0];
				String sourcePlace=str[1];
				String destinationPlace=str[2];
				double basicFare=Double.parseDouble(str[3]);
				int noOfDays=Integer.parseInt(str[4]);
				
				try
				{
				boolean flag=validate(packageId);
				
				int discount=0;	
				if(flag==true)
					{
						
						if(noOfDays<=5)
						{
							discount=0;
						}
						else if(noOfDays>5 && noOfDays<=8)
						{
							discount=3;
						}
						else if(noOfDays>8 && noOfDays<=10)
						{
							discount=5;
						}
						else if(noOfDays>10)
						{
							discount=7;
						}
					
					double gst=0.12;
					double pcst= noOfDays*basicFare;
					double cst=pcst-((discount/100)*pcst);
					double tcost=cst+(cst*gst);
					
					Package obj=new Package();
					obj.setPackageId(packageId);
					obj.setSourcePlace(sourcePlace);
					obj.setDestinationPlace(destinationPlace);
					obj.setBasicFare(basicFare);
					obj.setNoOfDays(noOfDays);
					obj.setPackageCost(tcost);
					
					res.add(obj);
					
					String sql="insert into package_details values(?,?,?,?,?)";
			
					PreparedStatement pst=connection.prepareStatement(sql);
			
					pst.setString(1,packageId);
					pst.setString(2,sourcePlace);
					pst.setString(3,destinationPlace);
					pst.setInt(4,(int)tcost);
					pst.setInt(5,noOfDays);
					pst.executeUpdate();
				
					
					}
				if(flag==false)
					throw new InvalidPackageIdException();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
				
			
				return res;
			}
			
	
	public boolean validate(String packageId)
	{
	/*Pattern pattern=Pattern.compile("[0-9]{3}/[A-Z]{3}");
	boolean flag=pattern.matcher(packageId).matches();
	return flag;
	*/
		boolean flag=false;
		flag=Pattern.matches("[0-9]{3}/[A-Z]{3}",packageId);
		if(flag==true)
			return flag;
		else
			return flag;
	}
	
	public List<Package> findPackagesWithMinimumNumberOfDays() throws ClassNotFoundException, SQLException, IOException
	{
		List<Package>list=new ArrayList<Package>();
		
		String query="select * from package_details group by package_id having min(no_of_days) ";
		
		Connection con=DBHandler.establishConnection();
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) 
		{
			Package p=new Package();
			
			p.setPackageId(rs.getString(1));
			p.setSourcePlace(rs.getString(2));
			p.setDestinationPlace(rs.getString(3));
			p.setNoOfDays(rs.getInt(4));
			p.setBasicFare(rs.getInt(5));
			
			list.add(p);
		}
		return list;
	}

}
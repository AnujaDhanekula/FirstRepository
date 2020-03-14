package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import exceptions.InvalidPackageIdException;
import model.Package;
import utility.TravelAgency;

public class VarshTourPackageDetails 
{

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException, InvalidPackageIdException 
	{

		TravelAgency tr=new TravelAgency();
		
		List<Package> list=tr.generatePackageCost("D://VarshTourPackageDetails.txt");
		
		Iterator<Package> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		List<Package> l = tr.findPackagesWithMinimumNumberOfDays();
		
		Iterator itr1=l.iterator();
		
		while(itr1.hasNext()) 
		{
			Package p = (Package)itr1.next();
			
			System.out.println(p.getPackageId()+" "+p.getSourcePlace()+" "+p.getDestinationPlace()+" "+p.getNoOfDays()+" "+p.getBasicFare());
		}
		
	}

}

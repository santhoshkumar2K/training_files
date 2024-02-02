import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Database
{
       static Connection con;
    private static String userName;
    private static String pw;
    private static String url;
    private static PreparedStatement checkPassword;
    private static PreparedStatement addCustomer;
    private static PreparedStatement addAddress;
    private static PreparedStatement addAccount;
    
    private static PreparedStatement updateCustomerAddress;
  private static PreparedStatement getCustomer;
      private static PreparedStatement getAccount;
   private static PreparedStatement getTransaction;
   /*  private static PreparedStatement updateStoke;
  private static PreparedStatement getQuantity;
  private static PreparedStatement getCustomer; 
  private static PreparedStatement getSeller;
  private static PreparedStatement updateCustomerAddress;
  private static PreparedStatement getPaymentTypes;
  private static PreparedStatement addOrder;
  private static PreparedStatement getCartProducts; 
  private static PreparedStatement addCart;
  private static PreparedStatement getOrders;
  private static PreparedStatement earnings;
  private static PreparedStatement getEarning;
  private static PreparedStatement orderCancel;*/
//  private static PreparedStatement getNoOfborrowingBooks;
//  private static PreparedStatement addCopies;
//  private static PreparedStatement updateCopies;
//  private static PreparedStatement getCopies;
//  private static PreparedStatement exist;
//  private static PreparedStatement existbook;
//  private static PreparedStatement fines;
//  private static PreparedStatement members;
	static {
		userName="postgres";
		pw="sarkar";
		url="jdbc:postgresql://localhost:5432/onlinebanking";
			   try
		   {
		  con=DriverManager.getConnection(url,userName,pw);
 
		   }catch(Exception e)
		   {
		         System.out.println("Not connection...");
		   } 		 

	}
	public static int addCustomer(Customer customer)
	{
		
		try{
		        int address_id=addAddress(customer.getAddress());
		        
			addCustomer=con.prepareStatement("insert into customers(first_name,last_name,dob,gender,contact,address_id) values(?,?,?,?,?,?) returning customer_id");
			addCustomer.setString(1, customer.getFirstName());
			addCustomer.setString(2, customer.getLastName());
			addCustomer.setDate(3, new java.sql.Date(customer.getDob().getTime()));
			addCustomer.setString(4,customer.getGender().toString());
			addCustomer.setLong(5, customer.getContact());
			addCustomer.setInt(6, address_id);
			addCustomer.execute();
			ResultSet result=addCustomer.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println("1 "+e);}
		  return -1;
	}
	
	public static int updateCustomerAddress(int customerID,int addressID)
	{
		
		try{
			updateCustomerAddress=con.prepareStatement("update customers set address_id=? where customer_id=?");
			updateCustomerAddress.setInt(1, addressID);
			updateCustomerAddress.setInt(2, customerID);
			return updateCustomerAddress.executeUpdate();
			
		}catch(Exception e){ System.out.println("1 "+e);}
	  return -1;
	}
	
	/*public static ArrayList<Order> getOrders(Customer customer)
	{
	     ArrayList<Order>orders=new ArrayList<>();OrAcNo
	     try{    
			getOrders=con.prepareStatement("select orders.order_id,c.name,product.product_id,product.product_name,product.description,product.price,product.gst, orders.order_date,payment_type.payment_type,orders.count,orders.total_price from orders join customer c on orders.customer_id=c.customer_id join product on orders.product_id=product.product_id join payment_type on payment_type.id=orders.payment_type_id where orders.customer_id=? and orders.canceled='false'");
			getOrders.setInt(1, customer.getCustomerID());
			ResultSet result=getOrders.executeQuery();
		      while(result.next())
		      {
		          orders.add(new Order(result.getInt(1),result.getString(2),new Product(result.getInt(3),result.getString(4),result.getString(5),result.getDouble(6),result.getInt(7)),result.getDate(8),result.getString(9),result.getInt(10),result.getDouble(11)));
		      }
		      return orders;
		}catch(Exception e){ System.out.println("1 "+e);}
		  return null;
	}*/
	public static boolean checkPassword(String query,String value)
	{
	    try{
		    
			checkPassword=con.prepareStatement(query ); // "select password from account  where password=?");
			checkPassword.setString(1, value);
			checkPassword.executeQuery();
			
			return false;
	}catch(Exception e){ System.out.println("1 "+e);}
		  return true;
	}
	public static Account getAccount(long ac,String password)
	{
	   
		try{
		    
			getAccount=con.prepareStatement("select account_id,account_type,account_no,password,account_date,authar_no from account  where account_no=? and password =?");
			getAccount.setLong(1, ac);
			getAccount.setString(2, password);
			getAccount.executeQuery();
			ResultSet result=getAccount.getResultSet();
			result.next();
           return new Account(result.getInt(1),AccountType.valueOf(result.getString(2)),result.getLong(3),result.getString(4),new SimpleDateFormat("yyyy-MM-dd").parse(result.getString(5)),result.getLong(6));
		}catch(Exception e){ System.out.println("1 "+e);}
		  return null;
	}
	public static Customer getCustomer(long ac,String password)
	{
		
		try{
		    
			getCustomer=con.prepareStatement("select c.customer_id,c.first_name,c.last_name,c.dob,c.gender,ad.address_id,ad.door_no,ad.street,ad.city,ad.district,ad.bincode,c.contact,a.account_id,a.account_type,a.account.account_no,a.password,a.account_date,a.authar_no from account a join customers c on  a.customer_id=c.customer_id join address ad on c.address_id=ad.address_id where a.account_no=?  and a.password=?;");
			getCustomer.setLong(1,ac);
			getCustomer.setString(2, password);
			getCustomer.executeQuery();
			ResultSet result=getCustomer.getResultSet();
			result.next();
           return new Customer(result.getInt(1),result.getString(2),result.getString(3),new SimpleDateFormat("yyyy-MM-dd").parse(result.getString(4)),Gender.valueOf(result.getString(5)),
                  new Address(result.getInt(6),result.getInt(7),result.getString(8),result.getString(9),result.getString(10),result.getInt(11)),result.getLong(12),
                  new Account(result.getInt(13),AccountType.valueOf(result.getString(14)),result.getLong(15),result.getString(16),new SimpleDateFormat("yyyy-MM-dd").parse(result.getString(17)),result.getLong(18)));
		}catch(Exception e){ System.out.println("1 "+e);}
		  return null;
	}
	/*public static Transaction getTransaction(Account account)
	{
	      try{
		    
			getTransaction=con.prepareStatement("select customer_id,first_name,last_name,dob,gender,address.door_number,address.street,address.city,address.district,address.pincode,contact,account.account_id,account.account_type,account.account_no,account.password,account.account_date,account.authar_no from customer join address on customer.address_id=address.address_id where username=? and password =?");
			getTransaction.setString(1, username);
			getTransaction.setString(2, password);
			getTransaction.executeQuery();
			ResultSet result=getTransaction.getResultSet();
			result.next();
           return new Transaction(result.getInt(1),result.getLong(2),result.getString(3),result.getString(4),result.getLong(5),result.getDouble(6),result.getDate(7));
		}catch(Exception e){ System.out.println("1 "+e);}
		  return null;
	}*/
	public static int addAddress(Address address)
	{
		
		try{
			addAddress=con.prepareStatement("insert into address(door_no,street,city,district,bincode) values(?,?,?,?,?) returning address_id");
			addAddress.setInt(1, address.getDoorNumber());
			addAddress.setString(2, address.getStreet());
			addAddress.setString(3, address.getCity());
			addAddress.setString(4, address.getDistrict());
			addAddress.setInt(5,address.getBincode());
			addAddress.execute();
			ResultSet result=addAddress.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println(" 33333 "+e);}
		  return -1;
	}
	public static int addAccount(Account account,int customerID)
	{
	    try{
			addAccount=con.prepareStatement("insert into account(account_no,password,account_type,account_date,customer_id,authar_no,balance) values(?,?,?,?,?,?,?) returning account_id");
			addAccount.setLong(1, account.getAc_number());
			addAccount.setString(2, account.getPassword());
			addAccount.setString(3, account.getType().toString());
			addAccount.setDate(4, new java.sql.Date(account.getDate().getTime()));
			addAccount.setInt(5, customerID);
			addAccount.setLong(6,account.getAuthar_no());
			addAccount.setDouble(7,500);
			addAccount.execute();
			ResultSet result=addAccount.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return -1;
	}
	/*public static boolean addCart(Customer customer,Product product)
	{
	   try{
		    
			addCart=con.prepareStatement("insert into cart(customer_id,product_id) values(?,?)");
			addCart.setInt(1,customer.getCustomerID());
			addCart.setInt(2, product.getProductID());
			addCart.executeUpdate();
			
                return true;
		}catch(Exception e){ System.out.println("1 "+e);}
		  return false;
	}
	public static ArrayList<Product> getCartProducts(Customer customer)
	{
	   try{
		    
			getCartProducts=con.prepareStatement("select product.product_id,product.product_name,product.description,product.price,product.gst from cart join product on product.product_id=cart.product_id where cart.customer_id=?");
			getCartProducts.setInt(1,customer.getCustomerID());
			ResultSet result=getCartProducts.executeQuery();
			return getProducts(result);
		}catch(Exception e){ System.out.println("1 "+e);}
		  return null;
	}
	public static Seller getSeller(String username,String password)
	{
		
		try{
		    
			getSeller=con.prepareStatement("select seller_id,name,username,password,address.door_number,address.street,address.city,address.district,address.pincode,contact,earned from seller join address on seller.address_id=address.address_id where username=? and password =?");
			getSeller.setString(1, username);
			getSeller.setString(2, password);
			getSeller.execute();
			ResultSet result=getSeller.getResultSet();
			result.next();
           return new Seller(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),
                  new Address(result.getInt(5),result.getString(6),result.getString(7),result.getString(8),result.getInt(9)),result.getLong(10),result.getDouble(11));
		}catch(Exception e){ System.out.println("1 "+e);}
		  return null;
	}
	public static int addSeller(Seller seller)
	{
		
		try{
		        int address_id=addAddress(seller.getAddress());
		        
			addSeller=con.prepareStatement("insert into seller(name,username,password,contact,address_id) values(?,?,?,?,?,?) returning seller_id");
			addSeller.setString(1, seller.getName());
			addSeller.setString(2, seller.getUserName());
			addSeller.setString(3, seller.getPassword());
			addSeller.setLong(4, seller.getContact());
			addSeller.setInt(5, address_id);
			addSeller.setDouble(6, 0.0);
			addSeller.execute();
			ResultSet result=addSeller.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println("2 "+e);}
		  return -1;
	}
	public static boolean earnings(int productID,double amount)
	{
	    try{
			earnings=con.prepareStatement("update seller set earned=? where seller_id=(select seller_id from product where product_id=?)");
			earnings.setDouble(1,amount);
			earnings.setInt(2,productID);
			earnings.executeUpdate();
			
           return true;
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return false;	
	}public static double getEarning(int productID)
	{
	    try{
			getEarning=con.prepareStatement("select earned from seller where seller_id=(select seller_id from product where product_id=?)");
			getEarning.setInt(1,productID);
			ResultSet result=getEarning.executeQuery();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return -1;	
	}
	public static int getQuantity(Product product)
	{
	try{
			getQuantity=con.prepareStatement("select quantity from stock where product_id=?");
			getQuantity.setInt(1, product.getProductID());
			getQuantity.executeQuery();
			ResultSet result=getQuantity.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return -1;
	}
	
	public static boolean updateStock(Product product,int quantity)
	{
		
		try{
			updateStoke=con.prepareStatement("update stock set quantity=? where product_id=?");
			updateStoke.setInt(1,quantity);
			updateStoke.setInt(2,  product.getProductID());
			updateStoke.executeUpdate();
			
           return true;
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return false;
	}
	public static boolean updateProduct(Product product)
	{
		
		try{
			updateStoke=con.prepareStatement("update product set price=? where product_id=?");
			updateStoke.setDouble(1,product.getPrice());
			updateStoke.setInt(2,  product.getProductID());
			updateStoke.executeUpdate();
			
           return true;
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return false;
	}
	public static int addStock(int product_id,int quantity)
	{
		
		try{
			addStock=con.prepareStatement("insert into stock(product_id,quantity) values(?,?) returning stock_id");
			addStock.setInt(1, product_id);
			addStock.setInt(2,quantity);
			addStock.execute();
			ResultSet result=addStock.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return -1;
	}
	public static int addProduct(Product product,int category,int seller)
	{
		
		try{
			addProduct=con.prepareStatement("insert into product(product_name,description,price,seller_id,category_id,gst) values(?,?,?,?,?,?) returning product_id");
			addProduct.setString(1, product.getProductName());
			addProduct.setString(2, product.getDescription());
			addProduct.setDouble(3, product.getPrice());
			addProduct.setDouble(4, seller);
			addProduct.setDouble(5, category);
			addProduct.setDouble(6, product.getGST());
			addProduct.execute();
			ResultSet result=addProduct.getResultSet();
			result.next();
           return result.getInt(1);
		}catch(Exception e){ System.out.println(" 3 "+e);}
		  return -1;
	}
	public static ArrayList getCategories()
	{
		ArrayList<String>list = new ArrayList<>();
		try{
			getCategory=con.prepareStatement("select * from category");
			ResultSet result=getCategory.executeQuery();
			while(result.next())
			{
				list.add(result.getInt(1)+". "+result.getString(2));
			}
           return list;
		}catch(Exception e){ System.out.println(" 4 "+e);}
		  return null;
	}
	public static ArrayList getProductsBasedOnSellerID(int sellerID)
	{
		try{
			getProducts=con.prepareStatement("select product_id,product_name,description,price,gst from product where seller_id=?");
			getProducts.setInt(1,sellerID);
			ResultSet result=getProducts.executeQuery();
			
                     return getProducts(result);
		}catch(Exception e){ System.out.println(" 5 "+e);}
		  return null;
	}
	public static ArrayList<Product> getProductsBasedOnCategoryID(int categoryID)
	{
		try{
			getProducts=con.prepareStatement("select product_id,product_name,description,price,gst from product where category_id=?");
			getProducts.setInt(1,categoryID);
			ResultSet result=getProducts.executeQuery();
			
                     return getProducts(result);
		}catch(Exception e){ System.out.println(" 5 "+e);}
		  return null;
	}
	public static ArrayList getProducts(ResultSet result)
	{
		ArrayList<Product>products = new ArrayList<>();
		try{
			while(result.next())
			{
				products.add(new Product(result.getInt(1),result.getString(2),result.getString(3),result.getDouble(4),result.getInt(5)));
			}
           return products;
		}catch(Exception e){ System.out.println(" 5 "+e);}
		  return null;
	}*/
}

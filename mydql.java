import java.util.*; 
import java.sql.*; 
 class program 
{ 
	public static void main(String[] args)throws Exception 
	{ 
		int choice,ch1,ch2,ch3; 
	        int roll; 
		String name; 
		String driver="com.mysql.jdbc.Driver"; 
		String url="jdbc:mysql://localhost/cse"; 
		String username="root"; 
		String password="dyp"; 
	        Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection(url,username,password); 
		Statement st=conn.createStatement(); 
		Scanner sc=new Scanner(System.in); 
		while(true) 
		{ 
			System.out.println("\n1.create table 2.Insert data 3.view data 4.Update 5.delete 6.union 7.orderby 8.Intersection 9.Rename 10.exit"); 
			System.out.println("Enter your choice"); 
			choice=sc.nextInt(); 
			switch(choice) 
			{ 
				case 1: 
					//creating table 
					//st.executUpdate("drop table student:"); 
					System.out.println("create tables two:1.studentdyp1 2.studendyp2 3.exit"); 
					ch1=sc.nextInt(); 
					switch(ch1) 
					{ 
						case 1: 
							st.executeUpdate("create table studentdyp1(Roll_no varchar(10),Name varchar(20));"); 
							st=conn.createStatement(); 
							break; 
						case 2: 
							st.executeUpdate("create table studentdyp2(Roll_no varchar(10),Name varchar(20));"); 
 							st=conn.createStatement(); 
							break; 
						case 3: 
		 
							System.exit(0); 
		 
						} 
					break; 
				case 2://Insert values into table 
					System.out.println("insert into table:\n1.studentdyp1\n2.studentdyp2\n 3.exit"); 
					ch2=sc.nextInt();				 
					switch(ch2) 
					{ 
					case 1: 
				        	System.out.println("Enter roll no"); 
						roll=sc.nextInt(); 
						sc.nextLine(); 
						System.out.println("Enter name:"); 
						name=sc.nextLine(); 
						st.executeUpdate("insert into studentdyp1(Roll_no,Name)values("+roll+",'"+name+"')"); 
						st=conn.createStatement(); 
						break; 
					case 2: 
					        System.out.println("Enter roll no"); 
						roll=sc.nextInt(); 
						sc.nextLine(); 
						System.out.println("Enter name:"); 
						name=sc.nextLine(); 
				                st.executeUpdate("insert into studentdyp2(Roll_no,Name)values("+roll+",'"+name+"')"); 
					        st=conn.createStatement(); 
					        break; 
					} 
					break; 
				case 3: 
					System.out.println("\n1.studentdyp1 \n2.studentdyp2 \n3.exit"); 
					ch3=sc.nextInt(); 
					switch(ch3) 
					{	 
						 
                                        //System.out.println("\n1.studentnew12 \n2.student89 \n3.exit"); 
						case 1: 
							System.out.println("\n\n======================================="); 
							System.out.println("Roll_no\t\tName"); 
							System.out.println("=========================================="); 
							ResultSet rs1=st.executeQuery("SELECT * FROM studentdyp1"); 
							while(rs1.next()) 
							{ 
								roll=rs1.getInt("Roll_no"); 
								name=rs1.getString("Name"); 
                                                		System.out.println(roll+"\t\t"+name); 
							}//end while 
							System.out.println("===================================="); 
						break; 
						case 2: 
							System.out.println("\n\n======================================="); 
							System.out.println("Roll_no\t\tName"); 
							System.out.println("=========================================="); 
							ResultSet rs2=st.executeQuery("SELECT * FROM studentdyp2"); 
							while(rs2.next()) 
							{ 
								roll=rs2.getInt("Roll_no"); 
								name=rs2.getString("Name"); 
                                                		System.out.println(roll+"\t\t"+name); 
							}//end while 
								System.out.println("===================================="); 
						break; 
						case 3:System.exit(0); 
					} 
					break; 
				 case 4: 
						System.out.println("UPDATE DATA"); 
						System.out.println("Enter roll no. to be update:="); 
					        roll=sc.nextInt(); 
					        System.out.println("name:="); 
					        name=sc.next(); 
					        st.executeUpdate("update  studentdyp2 set Name='"+name+"' where Roll_no='"+roll+"'"); 
				        	break; 
				 case 5: 
						System.out.println("Enter roll no to be delete"); 
						roll=sc.nextInt(); 
						st.executeUpdate("delete from studentdyp2 where Roll_no='"+roll+"'"); 
						break; 
				case 6: 
						//System.out.println("Enter the table name from table list"); 
						//st.executeUpdate("show tables from cse"); 
						//t_name=sc.next(); 
						//st.executeUpdate("create table studentnew(Roll_no varchar(10),Name varchar(20));"); 
						ResultSet rs3=st.executeQuery("select * from studentdyp1 left join studentdyp2 on studentdyp1.Name=studentdyp2.Name"); 
						st=conn.createStatement(); 
							while(rs3.next()) 
							{ 
								roll=rs3.getInt("Roll_no"); 
								name=rs3.getString("Name"); 
                                                		System.out.println(roll+"\t\t"+name); 
							}//end while 
								System.out.println("===================================="); 
						break; 
					 
				case 7: 
					//System.out.println("enter the roll no"); 
					//roll=sc.nextInt(); 
					ResultSet rs4=st.executeQuery("SELECT * FROM studentdyp2 order by Name"); 
					st=conn.createStatement(); 
					while(rs4.next()) 
							{ 
								//roll=rs4.getInt("Roll_no"); 
								name=rs4.getString("Name"); 
                                                		System.out.println("\t\t"+name); 
							} 
					 
					break; 
				case 8: 
					ResultSet rs5=st.executeQuery("SELECT studentdyp1.Name FROM studentdyp1 join studentdyp2 on studentdyp1.Name=studentdyp2.Name"); 
			 
					st=conn.createStatement(); 
					while(rs5.next()) 
							{ 
								//roll=rs5.getInt("Roll_no"); 
								name=rs5.getString("Name"); 
                                                		System.out.println("\t\t"+name); 
							} 

					break; 
				case 9: 
					ResultSet rs6=st.executeQuery("SELECT Name as s_name FROM studentdyp2"); 
			 
					st=conn.createStatement(); 
					while(rs6.next()) 
							{ 
								//Roll_no=rs6.getInt("Roll_no"); 
								name=rs6.getString("s_name"); 
                                                		System.out.println("\t\t"+name); 
							} 

					break; 
				case 10: 
					st.close(); 
					conn.close(); 
					System.exit(0); 
			}//end switch 
		}//end while 
	}//end main 
}//end class 
										 
					 

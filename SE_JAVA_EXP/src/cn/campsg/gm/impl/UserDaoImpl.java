package cn.campsg.gm.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import cn.campsg.gm.entity.User;
import cn.campsg.gm.service.UserDao;
import cn.campsg.gm.util.DBUtil;

public class UserDaoImpl implements UserDao {

	//重写接口
	public void add(User user){
		
		Connection con=DBUtil.getConnection();
		String sql="insert into student values(?,?,?,?,?,?);";
		
		try{
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1,user.getId());
			pst.setString(2, user.getLoginName());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getName());
			pst.setInt(6,user.getAge());
			
			pst.executeUpdate();
			pst.close();
			con.close();
		
		}catch(SQLException e){
			
			e.printStackTrace();	
		}

	}
	
	
	public void update(int id,User user){
		Connection  con=DBUtil.getConnection();
		 //定义SQL语句
		 String sql="update student set password=?,age=? where id=?;";
		 //获得预编译对象
		try{
			
			PreparedStatement pst = con.prepareStatement(sql);
			//对SQL语句中的占位符设值
			
			pst.setString(1, user.getPassword());
			pst.setInt(2,user.getAge());
			pst.setInt(3,user.getId());
			
			pst.executeUpdate();
			pst.close();
			con.close();
			
			
		}catch (SQLException e) {
				e.printStackTrace();	
		}
	}
	
	public void delete(int id){
		
		 Connection  con=DBUtil.getConnection();
		 //定义SQL语句
		 String sql="delete from student where id=?;";
		 //获得预编译对象
		 
		 try{
				PreparedStatement pst = con.prepareStatement(sql);
				//对SQL语句中的占位符设值
				pst.setInt(1,id); 
				pst.executeUpdate();
		 }catch (SQLException e) {
				e.printStackTrace();	
		}
			
	}
	
	
	
	public List<User> findAll(){

	 List<User>  users=new ArrayList<User>();
		
	 Connection  con=DBUtil.getConnection();
	 //定义SQL语句
	 String sql="select * from student;";
	 //获得预编译对象
	try{
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		 while(rs.next()){
			 
		 User user=new User();
		 user.setId(rs.getInt("id"));
		 user.setLoginName(rs.getString("loginName"));
		 user.setPassword(rs.getString("password"));
		 user.setGender(rs.getString("gender"));
		 user.setName(rs.getString("name"));
		 user.setAge(rs.getInt("age"));
		
		 
	
		 users.add(user); //add() 是List的成员方法
		 
		 } 
	 }catch (SQLException e) {
				e.printStackTrace();	
	}
	
	 return users;


   }
	
}	
	
	


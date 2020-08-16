package cn.campsg.gm;

import java.util.List;

import cn.campsg.gm.entity.User;
import cn.campsg.gm.impl.UserDaoImpl;
import cn.campsg.gm.service.UserDao;

public class MainDemo {

	public static void main(String[] args) {

		// 添加

		/*	User u = new User();
		u.setId(9);
		u.setLoginName("仙子仙子");
		u.setPassword("1234");
		u.setGender("女");
		u.setName("王颖颖");
		u.setAge(18);

		UserDao userdao = new UserDaoImpl(); // 多态性
		userdao.add(u);
		
		
		
		  User u1=new User();
		  u1.setPassword("234"); 
		  u1.setAge(19); 
		  u1.setId(5);
		  
		  UserDao userdao1=new UserDaoImpl(); 
		  userdao1.update(3, u1);*/
		  
		  
		/*  UserDao userdao2=new UserDaoImpl();
		 
		  userdao2.delete(1);*/
		  
		  //查询
		  UserDao userdao3=new UserDaoImpl(); 
		  List<User> users=userdao3.findAll();
		  
		  for(User u3 : users){
		  
		  System.out.println(u3.getId()+"\t"+u3.getLoginName()+"\t"+u3.getPassword()+u3.getGender()+"\t"+u3.getName()+"\t"+u3.getAge());
		 
		  }
		  

	}

}

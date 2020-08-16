package cn.campsg.gm.service;

import java.util.List;

import cn.campsg.gm.entity.User;

public interface UserDao {
	
	public void add(User user); //添加
	public void update(int id,User user); //修改
	public void delete(int id); //删除
	public List<User> findAll(); //查询

}

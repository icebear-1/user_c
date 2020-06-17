package com.meimei.dao;

import com.meimei.entity.User;
import com.meimei.utils.DbUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private JdbcTemplate template=new JdbcTemplate(DbUtil.getDataSource());
    public static void main(String[] args) {
      UserDao userDao=new UserDao();
      userDao.list().forEach(System.out::println);

    }
    public List<User> list(){
       String sql="SELECT "+
               "id, "+
               "dept_id, "+
               "account, "+
               "password, "+
               "age, "+
               "CASE sex "+
               "WHEN 1 THEN '男' "+
               "WHEN 0 THEN '女' "+
               "ELSE '其它' END sex, "+
               "ifnull(sal,0) sal,  "+
               "birth, "+
               "FROM"+
               "USER";
      return template.query(sql,new BeanPropertyRowMapper<>(User.class));
    }
    public void addUser(User user){
        String sql="insert into user(id,dept_id,account,password,age,sex,sal,birth) values(?,?,?,?,?,?,?,?)";
        template.update(sql,
                user.getId(),user.getDeptId(),user.getAccount(),
                user.getPassword(),user.getAge(),user.getSex(),
                user.getSal(),user.getBirth());
    }
    public User getUserById(Integer id){
        String sql="select * from user where id=?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
    }
    public  void updateUser(User user){
        String sql="update user set account=?,password=?,age=?,sex=?,sal=?,birth=? where id=?";
        template.update(sql,user.getAccount(),user.getPassword(),user.getAge(),user.getSex(),
                user.getSal(),user.getBirth(),user.getId());
    }
    public void deleteById(Integer id){
        String sql="delete from user where id=?";
        template.update(sql,id);
    }

}

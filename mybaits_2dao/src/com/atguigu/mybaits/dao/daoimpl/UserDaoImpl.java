package com.atguigu.mybaits.dao.daoimpl;

import com.atguigu.mybaits.bean.User;
import com.atguigu.mybaits.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public int insertUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int result = 0;
        try {
            result = sqlSession.insert("com.atguigu.mybaits.bean.User.insertUser",user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        return result;
    }

    @Override
    public int deleteUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int result = 0;
        try {
            result = sqlSession.delete("com.atguigu.mybaits.bean.User.deleteUserById",id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        return result;
    }

    @Override
    public int updateUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int result = 0;
        try {
            result = sqlSession.update("com.atguigu.mybaits.bean.User.updateUser",user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        return result;
    }

    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = null;
        try {
            user = sqlSession.selectOne("com.atguigu.mybaits.bean.User.findUserById",id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return user;
    }

    @Override
    public List<User> findUsers() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> result = null;
        try {
            result = sqlSession.selectList("com.atguigu.mybaits.bean.User.findUsers");
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        return result;
    }

    @Override
    public int insertUser1(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int result = 0;
        try {
            result = sqlSession.insert("com.atguigu.mybaits.bean.User.insertUser1",user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        return result;
    }

    @Override
    public int insertUser2(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int result = 0;
        try {
            result = sqlSession.insert("com.atguigu.mybaits.bean.User.insertUser2",user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        return result;
    }
}

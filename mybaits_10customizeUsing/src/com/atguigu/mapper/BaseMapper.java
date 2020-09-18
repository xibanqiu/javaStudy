package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.BaseEntity;
import com.atguigu.mapper.provider.BaseProvider;
import com.atguigu.mapper.provider.bean.Sets;
import com.atguigu.mapper.provider.bean.WhereOrderLimit;
import com.atguigu.mapper.provider.bean.Wheres;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;



public interface BaseMapper<E extends BaseEntity> {

	@InsertProvider(method = "insertEntity", type = BaseProvider.class)
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insertEntity(E entity);
	
	@UpdateProvider(method = "updateEntity", type = BaseProvider.class)
	int updateEntity(E entity);

	@UpdateProvider(method = "updateSqlById", type = BaseProvider.class)
	int updateById(@Param("sets") Sets sets, @Param("id") long id, @Param("clazz") Class<?> clazz);
	
	@UpdateProvider(method = "updateSql", type = BaseProvider.class)
	int updateSql(@Param("sets") Sets sets, @Param("wheres") Wheres wheres, @Param("clazz") Class<?> clazz);

	@SelectProvider(method = "countSql", type = BaseProvider.class)
	long countSql(@Param("wheres") Wheres wheres, @Param("clazz") Class<?> clazz);

	@SelectProvider(method = "selectSqlWOL", type = BaseProvider.class)
	List<E> selectSqlWOL(@Param("whereOrderLimit") WhereOrderLimit whereOrderLimit, @Param("clazz") Class<?> clazz);
	
	@SelectProvider(method = "selectSqlId", type = BaseProvider.class)
	E selectById(@Param("id") long id, @Param("clazz") Class<?> clazz);
	
	@SelectProvider(method = "selectSqlAll", type = BaseProvider.class)
	List<E> selectSqlAll(Class<?> clazz);

	@DeleteProvider(method = "deleteSqlById", type = BaseProvider.class)
	int deleteById(@Param("id") long id, @Param("clazz") Class<?> clazz);

}

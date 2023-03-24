package com.example.dagashiallergendatabase.mapper;

import com.example.dagashiallergendatabase.entity.Snack;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SnackMapper {
  @Select("SELECT * FROM snacks")
  List<Snack> findAll();

  @Select("SELECT * FROM snacks WHERE id = #{id}")
  List<Snack> findById(Integer id);
}

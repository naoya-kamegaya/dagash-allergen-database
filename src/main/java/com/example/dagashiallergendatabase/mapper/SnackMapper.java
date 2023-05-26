package com.example.dagashiallergendatabase.mapper;

import com.example.dagashiallergendatabase.entity.Snack;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface SnackMapper {
  @Select("SELECT * FROM snacks")
  List<Snack> findAll();

  
  @Select("SELECT * FROM snacks WHERE id = #{id}")
  Optional<Snack> findById(Integer id);
}

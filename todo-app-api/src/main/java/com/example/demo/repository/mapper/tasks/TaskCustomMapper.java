package com.example.demo.repository.mapper.tasks;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.TaskIndexDto;

@Mapper
public interface TaskCustomMapper extends TaskMapper {

	List<TaskIndexDto> findTasksByUserId(int userId);
}

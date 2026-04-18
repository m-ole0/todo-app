package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TaskIndexDto;
import com.example.demo.repository.mapper.tasks.TaskCustomMapper;

/**
 * タスクサービス
 */
@Service
public class TaskService {

	@Autowired
	TaskCustomMapper taskMapper;

	public List<TaskIndexDto> taskSearch(int userId) {

		List<TaskIndexDto> taskList = new ArrayList<>();
		taskList = taskMapper.findTasksByUserId(userId);

		return taskList;

	}

}

package com.example.demo.dto;

import java.util.Date;

import lombok.Data;

/**
 * タスク一覧Dto
 */

@Data
public class TaskIndexDto {

	/** タスクID */
	private int taskId;

	/** タイトル */
	private String title;

	/** 詳細 */
	private String description;

	/** 期限 */
	private Date dueDate;

	/** タスクジャンル名 */
	private String genreName;

	/** ステータス名 */
	private String statusName;

	/** 最終更新日 */
	private Date updatedAt;

}

package com.yasinaltunsoy.todoproject.Data.Response.TodoItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// LOMBOK
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTodoItemDTOResponse {

    private Integer id;

    private String projectName;

    private String CreatedUserName;

    private String createdTime;

    private String status;

    private String title;

    private String details;

    private String completionCondition;
}

package com.example.todoJava.toDO;
import java.util.List;

import org.springframework.jmx.export.metadata.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class TodoController {

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;


    @RequestMapping("todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.addAttribute("todos", todos);
        return "todos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo() {
        return "redirect:todos";
    }

}

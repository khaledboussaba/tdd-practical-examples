package com.business;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void retrieveTodosRelatedToSpring_UsingAStub() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filtredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filtredTodos.size());
    }

    @Test
    public void retrieveTodosRelatedToSpring_UsingAStub_firstValueIsLearnSpringMVC() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filtredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals("Learn Spring MVC", filtredTodos.get(0));
    }

}
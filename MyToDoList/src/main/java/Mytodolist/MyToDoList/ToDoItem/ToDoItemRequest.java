package Mytodolist.MyToDoList.ToDoItem;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
public class ToDoItemRequest {

    private String id;
    private String title;
    private boolean isDone;

}
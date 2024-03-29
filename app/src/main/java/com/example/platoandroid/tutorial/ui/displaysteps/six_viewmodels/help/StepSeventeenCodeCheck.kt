package com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepSeventeenCodeCheck() {
  Column {
    Text(text = "Your TodoList should now look something like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoList(title: String) {\n" +
        "  Column(\n" +
        "    modifier = Modifier.padding(12.dp)\n" +
        "  ) {\n" +
        "    var viewModel: TodoListViewModel = viewModel { TodoListViewModel() }\n" +
        "    Title(title = title)\n" +
        "    // We need to add some to-do items here below vvv\n" +
        "    viewModel.todoListItems.forEach { todoListItem ->\n" +
        "      TodoListRow(todoItem = todoListItem)\n" +
        "    }\n" +
        "    // ^^^ Add to-do list items above\n" +
        "    Row {\n" +
        "      TextField(value = \"\", onValueChange = {})\n" +
        "      Spacer(modifier = Modifier.width(12.dp))\n" +
        "      Button(onClick = {\n" +
        "        val newItem = TodoListItem(\n" +
        "          id = Random(101).toString(),\n" +
        "          taskName = \"still hardcoding this\",\n" +
        "          isComplete = false,\n" +
        "          completedAt = null,\n" +
        "        )\n" +
        "        viewModel.addTodoListItem(newItem)\n" +
        "      }) {\n" +
        "        Text(text = \"Add item\")\n" +
        "      }\n" +
        "    }\n" +
        "  }\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Take note that we initialized the isComplete value to false. This is because if we are adding a new item, we should assume it has not been completed until the user takes an action to indicate completion.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Also, you may notice that in the above example we constructed the TodoListItem and set it to a value and then passed that value into addTodoListItem.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "It would also have been valid to have constructed the TodoListItem directly within the () of addTodoListItem like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "Button(onClick = {\n" +
        "        viewModel.addTodoListItem(\n" +
        "          TodoListItem(\n" +
        "            id = Random(101).toString(),\n" +
        "            taskName = \"still hardcoding this\",\n" +
        "            isComplete = false,\n" +
        "            completedAt = null,\n" +
        "          )\n" +
        "        )\n" +
        "      }) {\n" +
        "        Text(text = \"Add item\")\n" +
        "      }",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}
package com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// icon color is not green
@Composable
fun StepTwelveHint() {
  Column {
    Text(text = "As always, the first thing to check is to make sure that your build was successful. Check the Build tab at the bottom of Android Studio to verify this.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If your build was successful, then double check your code, the TodoListRow should currently look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
      "fun TodoListRow(taskName: String) {\n" +
      "  var isComplete: Boolean = true\n" +
      "  Row(\n" +
      "    modifier = Modifier.height(64.dp),\n" +
      "    verticalAlignment = Alignment.CenterVertically,\n" +
      "  ) {\n" +
      "    if (isComplete) {\n" +
      "      IconButton(onClick = { /*TODO*/ }) {\n" +
      "        Icon(\n" +
      "          imageVector = Icons.Filled.CheckCircle,\n" +
      "          contentDescription = \"Checkmark\",\n" +
      "          tint = CheckMarkGreen,\n" +
      "        )\n" +
      "      }\n" +
      "    }\n" +
      "    Spacer(modifier = Modifier.width(12.dp))\n" +
      "    Text(text = taskName)\n" +
      "    IconButton(onClick = { /*TODO*/ }) {\n" +
      "      Icon(\n" +
      "        imageVector = Icons.Filled.Close,\n" +
      "        contentDescription = \"Checkmark\",\n" +
      "      )\n" +
      "    }\n" +
      "  }\n" +
      "  Divider()\n" +
      "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}
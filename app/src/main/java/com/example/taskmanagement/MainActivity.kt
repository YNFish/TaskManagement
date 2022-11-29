package com.example.taskmanagement

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagement.ui.theme.TaskManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagementTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TaskManagement(){
    TaskManagementDesign(imagePainter = painterResource(id = R.drawable.ic_task_completed),
        total_message = stringResource(id = R.string.total_message),
        evaluate = stringResource(id = R.string.evaluate),
        modifier = Modifier)
}

@Composable
fun TaskManagementDesign(imagePainter: Painter, total_message: String, evaluate: String, modifier: Modifier=Modifier){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Image(painter = imagePainter, contentDescription = null)
        Text(text = total_message, fontSize = 24.sp, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        Text(text = evaluate, fontSize = 16.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskManagementTheme {
        TaskManagement()
    }
}
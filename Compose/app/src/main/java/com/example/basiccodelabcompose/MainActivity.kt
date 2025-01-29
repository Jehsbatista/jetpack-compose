package com.example.basicscodelab

import BasicsCodelabTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccodelabcompose.lessons.AlignYourBodyElement
import com.example.basiccodelabcompose.lessons.FirstLesson

const val LESSON_ONE = "Lição 1"
const val LESSON_TWO = "Lição 2"
const val SAMPLE = "Sample"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
//               MyApp(modifier = Modifier.fillMaxSize())
                AlignYourBodyElement()
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(SAMPLE) }

    Surface(modifier, color = MaterialTheme.colorScheme.background) {

        when (state) {
            LESSON_ONE -> FirstLesson()
//            LESSON_TWO -> SecondLesson()
            else -> {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        onClick = { state = LESSON_ONE }
                    ) {
                        Text(text = LESSON_ONE, fontSize = 24.sp)
                    }
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        onClick = { state = LESSON_TWO }
                    ) {
                        Text(text = LESSON_TWO, fontSize = 24.sp)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun MyAppPreview() {
    BasicsCodelabTheme {
        MyApp(Modifier.fillMaxSize())
    }
}
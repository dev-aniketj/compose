package com.aniketjain.compose.learningproj2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.aniketjain.compose.learningproj2.ui.theme.LearningProj2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningProj2Theme {
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
fun BirthdayGreetingWithText(message: String, from: String) {
    Column {
        Text(
            text = "Wish you a very Happy birthday $message!",
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
}

@Preview(name = "My Preview", showSystemUi = true)
//@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    LearningProj2Theme() {
        BirthdayGreetingWithText(message = "Ayush", from = "Aniket Jain")
    }
}
package com.aniketjain.compose.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aniketjain.compose.businesscardapp.ui.theme.BusinessCardAppTheme
import com.aniketjain.compose.businesscardapp.ui.theme.bgColor
import com.aniketjain.compose.businesscardapp.ui.theme.textColor1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight()
                ) {
                }
            }
        }
    }
}

@Composable
fun MainContainer() {
    Column(
        modifier = Modifier
            .background(bgColor)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        TopContainer("Aniket Jain", "Android Developer by Google")
        BottomContainer()
    }
}

@Composable
fun TopContainer(name: String, title: String) {
    val img = painterResource(id = R.drawable.ic_android_black_24dp)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Box() {
            Column {
                Image(
                    painter = img,
                    contentDescription = null,
                    modifier = Modifier
                        .size(85.dp)
                )
                Text(text = "Android", fontSize = 24.sp, color = textColor1)
            }
        }
        Text(
            text = name,
            fontSize = 34.sp,
            color = textColor1,
            modifier = Modifier.padding(top = 12.dp)
        )
        Text(text = title, fontSize = 22.sp, color = textColor1)
    }
}

@Composable
fun BottomContainer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 60.dp, end = 60.dp, bottom = 20.dp),
        verticalArrangement = Arrangement.Bottom,
    ) {
        BottomItem(
            icon = painterResource(id = R.drawable.ic_baseline_phone_24),
            title = "+11 (123) 444 555 666"
        )
        BottomItem(
            icon = painterResource(id = R.drawable.ic_baseline_share_24),
            title = "@AniketJain"
        )
        BottomItem(
            icon = painterResource(id = R.drawable.ic_baseline_email_24),
            title = "aniketjain@gmail.com"
        )
    }
}

@Composable
fun BottomItem(icon: Painter, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = icon,
            contentDescription = title,
            modifier = Modifier
                .padding(4.dp)
                .size(25.dp)
        )
        Text(
            text = title,
            modifier = Modifier.padding(4.dp),
            color = textColor1,
            fontSize = 18.sp
        )
    }
}

@Preview(name = "My Preview", showSystemUi = true, showBackground = true)
//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        MainContainer()
    }
}
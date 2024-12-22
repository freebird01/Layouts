package com.example.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    MyLayout(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
//                    MyAlignments(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}

@Composable
fun MyAlignments(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Hello",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color.Red)
                .width(100.dp)
        )
        Text(
            text = "Android",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color.Red)
                .width(100.dp)
        )
        Text(
            text = "Kotlin",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = modifier
                .background(color = Color.Red)
                .width(100.dp)
        )

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}

@Composable
fun MyLayout(name: String, modifier: Modifier = Modifier) {
    Column {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .height(200.dp)
                .width(300.dp)
        ) {
            Row()
            {
                Box(
                    modifier = Modifier
                        .background(Color.Blue)
                        .size(50.dp)
                ) {}
                Column {
                    Text(
                        text = "Hello",
                        modifier = modifier
                    )
                    Text(
                        text = "$name!",
                        modifier = modifier
                    )
                }


            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutsTheme {
//        Greeting("Android")
//        MyLayout("Android")
        MyAlignments()
    }
}
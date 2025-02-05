package com.example.movi_mais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movi_mais.ui.theme.CorBege
import com.example.movi_mais.ui.theme.Movi_MaisTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Movi_MaisTheme {
                Inicio()
            }
        }
    }
}

@Composable
fun Inicio() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .paint(
                painterResource(
                    id = R.drawable.backgroud
                ),
                contentScale = ContentScale.Crop
            )
            .fillMaxSize()

    ) {

        Spacer(Modifier.padding(top = 64.dp))

        Text(
            "Somos Todos",
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            color = CorBege,
            style = androidx.compose.ui.text.TextStyle(
                shadow = Shadow(
                    color = CorBege,
                    offset = Offset(0f, 10f),
                    blurRadius = 20f
                )
            )


        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Movi_MaisTheme {
        Inicio()
    }
}
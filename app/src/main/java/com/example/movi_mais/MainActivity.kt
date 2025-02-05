package com.example.movi_mais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.movi_mais.ui.theme.Movi_MaisTheme

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
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
<<<<<<< HEAD
          .fillMaxSize()
  ) {
      
  }
=======
  ) {  }
>>>>>>> 2a7db65ab4ce6c2d2d4907b0d4928b9c4e26c395
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Movi_MaisTheme {

    }
}
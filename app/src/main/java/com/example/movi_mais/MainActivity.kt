package com.example.movi_mais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movi_mais.ui.theme.CorBege
import com.example.movi_mais.ui.theme.CorEscura
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

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "A",
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                color = CorBege,
                style = androidx.compose.ui.text.TextStyle( // Define o estilo do texto
                    shadow = Shadow(
                        color = CorBege, // define a cor da sombra
                        offset = Offset(0f, 10f),// Define o deslocamento da sombra
                        blurRadius = 20f // Define o tamanho do blur
                    )
                )
            )
            Text(
                text = "tleta",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                fontFamily = FontFamily.Monospace,
                style = androidx.compose.ui.text.TextStyle(
                    drawStyle = Stroke(width = 3f), // Define a largura da borda
                    color = CorBege, // Cor da borda
                    shadow = Shadow(
                        color = CorBege, // define a cor da sombra
                        offset = Offset(0f, 10f),// Define o deslocamento da sombra
                        blurRadius = 20f // Define o tamanho do blur
                    )
                )
            )
            Text(
                "s",
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                color = CorBege,
                style = androidx.compose.ui.text.TextStyle( // Define o estilo do texto
                    shadow = Shadow(
                        color = CorBege, // define a cor da sombra
                        offset = Offset(0f, 10f),// Define o deslocamento da sombra
                        blurRadius = 20f // Define o tamanho do blur
                    )
                )
            )

        }

Spacer(Modifier.padding(top = 500.dp))

        Button(
            onClick = { /*TODO*/ },
            Modifier.width(343.dp).height(53.dp)
                .shadow(
                    elevation = 3.dp,
                    shape = RoundedCornerShape(25.dp),
                    spotColor = CorBege,
                    ambientColor = CorBege
                ),
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(CorEscura),

        ) {
            Text(
                text = "Próximo",
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp,
                color = CorBege
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Movi_MaisTheme {
        Inicio()
    }
}
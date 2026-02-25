package com.ejemplo_proyecto.maquetacionbasica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ContentView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.ejemplo_proyecto.maquetacionbasica.ui.theme.MaquetacionBasicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaquetacionBasicaTheme {
            }
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DetalleProductoBasico() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEDEDED))
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(all = 16.dp)
        ) {

            // Fila superior con "favorito" (sin Box, solo con Row)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "♡",
                    fontSize = 20.sp,
                    color = Color(0xFFF1D84B),
                    modifier = Modifier
                        .background(Color(0xFFF7F7F7))
                        .padding(all = 6.dp)
                )
            }

            // Imagen del producto (250.dp alto)
            Image(
                painter = painterResource(id = R.drawable.computador),
                contentDescription = "Producto",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )

            // Nombre del producto (22.sp)
            Text(
                text = "Nombre del Producto",
                fontSize = 22.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )

            // Precio (28.sp)
            Text(
                text = "$99.99",
                fontSize = 28.sp,
                color = Color(0xFF6BE35B),
                fontWeight = FontWeight.Bold
            )

            // Descripción (Default)
            Text(
                text = "Descripción del producto con detalles importantes,\ncaracterísticas y beneficios.",
                color = Color.DarkGray,
                modifier = Modifier.padding(top = 8.dp)
            )

            // Botones (separación 8.dp)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "✏ Editar",
                    color = Color.White,
                    modifier = Modifier
                        .width(150.dp)
                        .background(Color(0xFF6C5BB5))
                        .padding(vertical = 10.dp),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "🗑 Eliminar",
                    color = Color.White,
                    modifier = Modifier
                        .width(150.dp)
                        .background(Color(0xFFF44336))
                        .padding(vertical = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


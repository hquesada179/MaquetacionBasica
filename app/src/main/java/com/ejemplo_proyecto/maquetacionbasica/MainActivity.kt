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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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


            Image(
                painter = painterResource(id = R.drawable.computador),
                contentDescription = "Producto",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )


            Text(
                text = "Nombre del Producto",
                fontSize = 22.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )


            Text(
                text = "$99.99",
                fontSize = 28.sp,
                color = Color(0xFF6BE35B),
                fontWeight = FontWeight.Bold
            )


            Text(
                text = "Descripción del producto con detalles importantes,\ncaracterísticas y beneficios.",
                color = Color.DarkGray,
                modifier = Modifier.padding(top = 8.dp)
            )


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
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TutorialComposeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Image(
            painter = painterResource(id = R.drawable.panel),
            contentDescription = "Jetpack Compose tutorial",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )


        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            color = Color.Black,
            modifier = Modifier.padding(all = 16.dp)
        )


        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "Compose simplifies and accelerates UI development on Android with less " +
                    "code, powerful tools, and intuitive Kotlin APIs.",
            color = Color.DarkGray,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )


        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say what elements you want and the Compose compiler " +
                    "does the rest. Compose is built around Composable functions. These functions let " +
                    "you define your app's UI programmatically because they let you describe how it " +
                    "should look and provide data dependencies, rather than focus on the process of " +
                    "the UI's construction, such as initializing an element and then attaching it to " +
                    "a parent. To create a Composable function, you add the @Composable annotation " +
                    "to the function name.",
            color = Color.DarkGray,
            modifier = Modifier.padding(all = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaPerfil() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(id = R.drawable.perfil_foto),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .width(110.dp)
                .height(110.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )


        Text(
            text = "Helbert Mauricio",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 14.dp),
            textAlign = TextAlign.Center
        )


        Text(
            text = "Desarrollador Android apasionado por la\ntecnología y el diseño.",
            fontSize = 12.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp),
            textAlign = TextAlign.Center
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "150", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "Posts", fontSize = 12.sp, color = Color.Gray)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "2.3K", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "Seguidores", fontSize = 12.sp, color = Color.Gray)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "980", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "Likes", fontSize = 12.sp, color = Color.Gray)
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Seguir",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(150.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF6E59B5))
                    .padding(vertical = 10.dp),
                textAlign = TextAlign.Center
            )

            Text(
                text = "Mensaje",
                color = Color(0xFF6E59B5),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(150.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFEDEDED))
                    .padding(vertical = 10.dp),
                textAlign = TextAlign.Center
            )
        }


        Text(
            text = "Intereses",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Gym",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "Programación",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "UI/UX",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Música",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "Viajes",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "Gaming",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
        }


        Text(
            text = "Proyectos Recientes",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFBDBDBD))
                .padding(top = 0.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.perfil_foto),
                contentDescription = "Proyecto",
                modifier = Modifier
                    .width(110.dp)
                    .height(110.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "App de Facturaciòn",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color.Black
                )

                Text(
                    text = "Aplicaciòn para llevar el control de facturacion e inventario con proveedores",
                    fontSize = 12.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 4.dp)
                )

                Text(
                    text = "Ver más",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .background(Color(0xFF6E59B5))
                        .padding(horizontal = 18.dp, vertical = 8.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

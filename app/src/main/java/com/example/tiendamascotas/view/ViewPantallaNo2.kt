package com.example.tiendamascotas.view

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiendamascotas.ActivityAccesorios
import com.example.tiendamascotas.ListActivity
import com.example.tiendamascotas.PantallaNo2
import com.example.tiendamascotas.R
import com.example.tiendamascotas.ui.theme.TiendaMascotasTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffolPrincipal2() {
    val mContexto = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                title = {
                    Text("Pet Shop")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.secondary,
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "CARRITO DE COMPRAS",
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                mContexto.startActivity(Intent(mContexto, ListActivity::class.java))
            }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text(text = "Accesorios", fontSize = 20.sp)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Ajusta la altura según tus necesidades
                    .background(MaterialTheme.colorScheme.primaryContainer) // Color de fondo del Box
                    .padding(16.dp), // Espaciado interno
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.accesorios2),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            mContexto.startActivity(
                                Intent(mContexto, ActivityAccesorios::class.java)
                            )
                        }
                        .clip(RoundedCornerShape(16.dp)) // Esquinas redondeadas
                )
            }
            Text(text = "comida", fontSize = 20.sp)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Ajusta la altura según tus necesidades
                    .background(MaterialTheme.colorScheme.primaryContainer) // Color de fondo del Box
                    .padding(16.dp), // Espaciado interno
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.comida),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp)) // Esquinas redondeadas
                        .clickable { println("CLICK") }
                )
            }
            Text(text = "Mascotas", fontSize = 20.sp)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Ajusta la altura según tus necesidades
                    .background(MaterialTheme.colorScheme.primaryContainer) // Color de fondo del Box
                    .padding(16.dp), // Espaciado interno
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mascotas),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp)) // Esquinas redondeadas
                        .clickable { println("CLICK") }
                )
            }
        }
    }
}



@Preview
@Composable
fun GreetingPreview2() {
    TiendaMascotasTheme {
        ScaffolPrincipal2()
    }
}
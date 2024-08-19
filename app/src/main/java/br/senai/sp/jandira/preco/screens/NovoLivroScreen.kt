package br.senai.sp.jandira.preco.screens

import android.widget.EditText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun NovoLivroScreen(modifier: Modifier = Modifier, navegador: NavHostController?) {

    val titulo = remember {
        mutableStateOf("")
    }

    val autor = remember {
        mutableStateOf("")
    }

    val dataPub = remember {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(Color(0xFF2196F3))
                    .fillMaxWidth()
                    .height(48.dp)
                    .padding(8.dp)
            ) {
                Text(
                    text = "Adicionar livro",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = {
                    navegador?.navigate("ListaLivros")
                }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }
        },
        content = {
            Column(modifier = Modifier
                .padding(it)
                .fillMaxSize()) {
                Column(modifier = Modifier.padding(32.dp)) {
                    OutlinedTextField(
                        value = titulo.value,
                        shape = RoundedCornerShape(12.dp),
                        onValueChange = { titulo.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Titulo do livro")
                        }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = autor.value,
                        shape = RoundedCornerShape(12.dp),
                        onValueChange = { autor.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Autor do livro")
                        }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = dataPub.value,
                        shape = RoundedCornerShape(12.dp),
                        onValueChange = { dataPub.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Data de publicação")
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
                    ) {
                        Text(
                            text = "Adicionar Livro",
                            fontSize = 16.sp
                        )
                    }
                }
            }
        },
        bottomBar = {

        },

    )
    
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun NovoLivroScreenPreview() {
    NovoLivroScreen(navegador = null)
}
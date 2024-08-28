package br.senai.sp.jandira.livraria.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_livro") //muda o nome na tabela no banco para que nao seja criado como "Livro"
data class Livro(
    @PrimaryKey(autoGenerate = true) val id: Long = 0, //indica a primarykey e adiciona uma sequencia automatica sequencial de passo 1
    val titulo: String = "",
    val autor: String = "",
    @ColumnInfo(name = "data_publicacao") val dataPublicacao: String = "", //altera o nome da coluna para que siga o padrao snake_case
    val valor: Double = 0.0,
    val usado: Boolean = false
)

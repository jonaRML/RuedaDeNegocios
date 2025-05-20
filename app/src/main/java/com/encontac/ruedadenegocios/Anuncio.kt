package com.encontac.ruedadenegocios
import java.util.Date

class Anuncio( val titulo: String, val descripcion: String, val numeros: Map<String, Pair<Int, Boolean>>, val fecha: Date, val categoria: String, val favorito: Boolean) {
}
package com.example.task4

import android.os.Bundle
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeltaCalculator()
        }
    }
}

@Composable
fun DeltaCalculator() {
    val aValue = remember { mutableStateOf("1") }
    val bValue = remember { mutableStateOf("-5") }
    val cValue = remember { mutableStateOf("6") }

    val a = aValue.value.toDoubleOrNull() ?: 0.0
    val b = bValue.value.toDoubleOrNull() ?: 0.0
    val c = cValue.value.toDoubleOrNull() ?: 0.0

    val delta = b.pow(2) - 4 * a * c
    val x1 = if (delta >= 0) (-b - sqrt(delta)) / (2 * a) else null
    val x2 = if (delta >= 0) (-b + sqrt(delta)) / (2 * a) else null

    val format = DecimalFormat("#")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Kalkulator delty",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = aValue.value,
            onValueChange = { newValue -> aValue.value = newValue },
            label = { Text("Liczba a") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TextField(
            value = bValue.value,
            onValueChange = { newValue -> bValue.value = newValue },
            label = { Text("Liczba b") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TextField(
            value = cValue.value,
            onValueChange = { newValue -> cValue.value = newValue },
            label = { Text("Liczba c") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Delta: ${format.format(delta)}")

        if (delta >= 0) {
            Text(text = "x1: ${format.format(x1)}")
            Text(text = "x2: ${format.format(x2)}")
        } else {
            Text(text = "Brak rzeczywistych pierwiastków")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeltaCalculatorPreview() {
    DeltaCalculator()
}

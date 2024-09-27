package com.example.task2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.task2.ui.theme.Task2Theme
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DishList()
        }
    }
}

@Composable
fun DishList() {
    val dishes = listOf(
        "Spaghetti Carbonara",
        "Tomato Soup",
        "Grilled Chicken",
        "Beef Steak",
        "Caesar Salad",
        "Sushi",
        "Pizza Margherita",
        "Lamb Kebab",
        "Pad Thai",
        "Cheeseburger"
    )

    LazyColumn(modifier = Modifier
        .systemBarsPadding()
    ) {
        items(dishes) { dish ->
            Text(
                text = dish,
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DishPreview() {
    Task2Theme() {
        DishList()
    }
}

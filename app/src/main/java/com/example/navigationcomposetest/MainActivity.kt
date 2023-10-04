package com.example.navigationcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationcomposetest.app.PostOfficeApp
import com.example.navigationcomposetest.screens.SignUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostOfficeApp()
        }
    }
}

//data class Message(val author : String, val body : String)
//
//@Composable
//fun MessageCard(msg : Message){
//    Text(text = msg.author)
//    Text(text = msg.body)
//}
//
//@Preview
//@Composable
//fun PreviewMessageCard(){
//    MessageCard(msg = Message("Android", "Jetpack Compose"))
//}


@Preview
@Composable
fun DefaultPreview(){
    PostOfficeApp()
}
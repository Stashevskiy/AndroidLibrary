package com.plcoding.composepagingyt.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.plcoding.composepagingyt.presentation.ui.theme.ComposePagingYTTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ComposePagingYTTheme {


            }

        }
    }


}





package com.jfgdeveloper.udemycomponentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jfgdeveloper.udemycomponentes.box.MyBox
import com.jfgdeveloper.udemycomponentes.colum.MyColums
import com.jfgdeveloper.udemycomponentes.comobinado.Combinado
import com.jfgdeveloper.udemycomponentes.progresbar.MyProgressBar
import com.jfgdeveloper.udemycomponentes.row.MyRows
import com.jfgdeveloper.udemycomponentes.swith.MySwitch
import com.jfgdeveloper.udemycomponentes.ui.theme.UdemyComponentesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UdemyComponentesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                ) {

                    //MyColums()
                    //MyRows()
                    //Combinado()
                    //Estados()
                    //MyProgressBar()
                    MySwitch()
                }
            }
        }
    }
}




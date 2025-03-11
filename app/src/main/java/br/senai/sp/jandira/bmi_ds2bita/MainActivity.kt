package br.senai.sp.jandira.bmi_ds2bita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.senai.sp.jandira.bmi_ds2bita.screens.HomeScreen
import br.senai.sp.jandira.bmi_ds2bita.screens.UserDataScreen
import br.senai.sp.jandira.bmi_ds2bita.ui.theme.BMIDS2BITATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            BMIDS2BITATheme {
                //HomeScreen()
                UserDataScreen()
            }
        }
    }
}


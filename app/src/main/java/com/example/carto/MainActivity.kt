package com.example.carto

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carto.ui.theme.CartãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(39, 64, 139)
                ) {
                    ImagemDeFundo()
                    Start()
                    Board()
                }
            }
        }
    }
}

@Composable
fun ImagemDeFundo(){

    val imagem = painterResource(id = R.drawable.cat)
    Image(
        painter = imagem,
        contentDescription =null,
        contentScale =  ContentScale.Crop
    )

}





@Composable
fun Start() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(10.dp)
    ) {
        val photo = painterResource(id = R.drawable.luluh)

        Image(
            painter = photo,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)

        )

        Text(
            text = stringResource(R.string.meu_nome),
            modifier = Modifier
                .padding(5.dp),

            fontWeight = FontWeight.Bold,
            color = Color(205 ,104 ,137),
            fontSize = 25.sp
        )

        Text(
            text = stringResource(R.string.meu_cargo),
            modifier = Modifier,
            fontSize = 30.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color(205 ,104 ,137)


        )

    }
}

@Composable
fun Board(){
    Column(
        verticalArrangement = Arrangement.Bottom,
    ) {


        Contact(
            painter = painterResource(id = R.drawable.a801791f94c5074e414f835fefa0b297),
            text = stringResource(R.string.email_12)

        )
        Contact(
            painter = painterResource(id = R.drawable.mymelod),
            text = stringResource(R.string.telefone)
        )

        Contact(
            painter = painterResource(id = R.drawable.mymelody),
            text = stringResource(R.string.insta)
        )
    }
}



@Composable
fun Contact(painter: Painter, text: String){

    Divider(
        color = Color(120, 64, 119, 47),
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
    )



    Row {
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)




        )

            Text(
                text = text,
                color = Color(120, 64, 119, 120),
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, bottom = 20.dp),
                fontSize = 20.sp

            )

    }
}



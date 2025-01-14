package com.example.mylearnings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylearnigs.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello()
        }
    }
}

@Composable
fun Hello() {
    Box(
        modifier = Modifier.
        fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xffB0D0E7))

        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Text(
                    text = "Hello, How are you ?",
                    fontSize = 25.sp,
                    color = Color(0xff2f4f75 ),
                    fontWeight = FontWeight.Bold

                )

                Spacer(modifier = Modifier.height(20.dp))

                Row(modifier = Modifier.
                fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.msport),
                        contentDescription = "bmw Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.weight(1f)
                            .size(175.dp)
                            .clip(
                                RoundedCornerShape(15.dp)

                            )

                    )

                    Image(
                        painter = painterResource(id = R.drawable.mustang),
                        contentDescription = "porsche",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .weight(1f)
                            .size(175.dp)
                            .clip(
                                RoundedCornerShape(15.dp)

                            )

                    )

                }

                Spacer(
                    modifier = Modifier.
                    height(20.dp)

                )

                Row(
                    modifier = Modifier.
                    fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)


                    ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(50.dp)
                            .weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff2f4f75),
                            contentColor = Color(0xffD6EDF5)
                        )
                    ) {
                        Text(
                            text = "Share",
                            fontSize = 18.sp,
                        )

                    }



                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(50.dp)
                            .weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff2f4f75),
                            contentColor = Color(0xffD6EDF5)
                        )
                    ) {
                        Text(
                            text = "Subsbribe",
                            fontSize = 18.sp
                        )

                    }
                }




            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloPreview() {
    Hello()
}

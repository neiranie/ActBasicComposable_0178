package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val LoginIvory = Color(0xFFF5EFE6)
private val LoginGold = Color(0xFFD4B483)
private val LoginTaupe = Color(0xFFB8AB9C)
private val LoginFont = FontFamily.Serif

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .clipToBounds()
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer(scaleX = 1.2f, scaleY = 1.2f)
                .blur(16.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = 0.55f),
                            Color.Black.copy(alpha = 0.78f)
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                fontSize = 48.sp,
                fontFamily = LoginFont,
                fontWeight = FontWeight.Normal,
                letterSpacing = 2.sp,
                color = LoginIvory
            )
            Text(
                text = "This is the login page",
                fontSize = 14.sp,
                fontFamily = LoginFont,
                letterSpacing = 1.sp,
                color = LoginTaupe
            )

            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .width(48.dp)
                    .height(1.dp)
                    .background(LoginGold)
            )
            Spacer(modifier = Modifier.height(28.dp))

            Image(
                painter = painterResource(id = R.drawable.foto_biola),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(110.dp)
                    .clip(CircleShape)
                    .border(2.dp, LoginGold, CircleShape)
            )

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "NAME",
                fontSize = 12.sp,
                fontFamily = LoginFont,
                fontWeight = FontWeight.Bold,
                letterSpacing = 4.sp,
                color = LoginGold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Anneira Nur Khairani",
                fontSize = 22.sp,
                fontFamily = LoginFont,
                fontWeight = FontWeight.Medium,
                color = LoginIvory
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "20240140178",
                fontSize = 18.sp,
                fontFamily = LoginFont,
                letterSpacing = 2.sp,
                color = LoginTaupe
            )

            Spacer(modifier = Modifier.height(28.dp))

            Image(
                painter = painterResource(id = R.drawable.foto_kamera),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(180.dp)
                    .clip(CircleShape)
                    .border(2.dp, LoginGold, CircleShape)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasLoginPreview() {
    TugasLogin()
}
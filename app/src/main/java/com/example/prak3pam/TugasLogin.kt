package com.example.prak3pam

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak3pam.ui.theme.Prak3PAMTheme

@Composable
fun TugasLoginLayout(modifier: Modifier = Modifier) {
    val backgroundGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF0D47A1), // Royal Navy / Deep Blue
            Color(0xFF1976D2), // Ocean Blue
            Color(0xFF42A5F5)  // Light Sky Blue
        )
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(brush = backgroundGradient),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .clip(RoundedCornerShape(36.dp))
                .background(Color.White.copy(alpha = 0.90f))
                .border(2.dp, Color.White.copy(alpha = 0.8f), RoundedCornerShape(36.dp))
                .padding(horizontal = 24.dp, vertical = 36.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Get Glowing!",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0D47A1)
                )

                Text(
                    text = "Science for your Skin, Bestie.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1565C0)
                )

                Spacer(modifier = Modifier.height(28.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo_skintifik),
                    contentDescription = "Logo Skintifik",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFF1976D2), Color(0xFF64B5F6))
                            )
                        )
                        .border(3.5.dp, Color.White, CircleShape)
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Glow-Up Persona",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF0288D1)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Maulina Khamidah",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0D47A1)
                )

                Text(
                    text = "20240140221",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF1565C0)
                )

                Spacer(modifier = Modifier.height(28.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo_skintifik),
                    contentDescription = "Skintifik Hero Product",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(170.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.sweepGradient(
                                colors = listOf(
                                    Color(0xFF0D47A1),
                                    Color(0xFF1976D2),
                                    Color(0xFF42A5F5),
                                    Color(0xFF0D47A1)
                                )
                            )
                        )
                        .border(4.dp, Color.White, CircleShape)
                )

                Spacer(modifier = Modifier.height(30.dp))
//
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .height(46.dp)
                        .clip(RoundedCornerShape(23.dp))
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xFF0D47A1),
                                    Color(0xFF1E88E5)
                                )
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Glow On",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasLoginPreview() {
    Prak3PAMTheme {
        TugasLoginLayout()
    }
}
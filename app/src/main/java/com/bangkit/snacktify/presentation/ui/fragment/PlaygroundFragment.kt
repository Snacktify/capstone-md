package com.bangkit.snacktify.presentation.ui.fragment

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.snacktify.presentation.ui.theme.Link
import com.bangkit.snacktify.presentation.ui.theme.Primary60
import com.bangkit.snacktify.presentation.ui.upload.UploadImageActivity
import com.bangkit.snacktify.R

@Composable
fun PlaygroundFragment() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Primary60)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxHeight(0.55f)
                .align(Alignment.BottomCenter)
                .background(color = Color.Transparent)
            ,
            shape = RoundedCornerShape(16.dp),
            elevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.padding(16.dp))
                Text(
                    text = "DETEKSI LANDMARK",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.padding(16.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 48.dp),
                    text = "Ambil gambar melalui kamera atau galeri, unggah dan dapatkan hasil mengenai objek yang tertera pada gambar",
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Link
                )
                Spacer(modifier = Modifier.padding(16.dp))
                Button(
                    onClick = {
                        context.startActivity(Intent(context, UploadImageActivity::class.java))
                    },
                    colors = ButtonDefaults.buttonColors(Primary60)
                ) {
                    Text(text = "MULAI", color = Color.White)

                }
                Spacer(modifier = Modifier.padding(64.dp))
            }

        }
        Image(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(bottom = 200.dp),
            painter = painterResource(id = R.drawable.logo_object_detection),
            contentDescription = "Detection Image"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlaygroundFragmentPreview() {
    PlaygroundFragment()
}
package com.example.mainproject.ui.theme.ComponentsPR05

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainproject.ui.theme.AccentColorDisabledButton
import com.example.mainproject.ui.theme.AccentColorDisabledButtonText
import com.example.mainproject.ui.theme.AccentColorPrimaryButton
import com.example.mainproject.ui.theme.ColorBottomBorder
import com.example.mainproject.ui.theme.ColorTextBottom
import com.example.mainproject.ui.theme.TextColor
import com.example.mainproject.ui.theme.TextFieldColors
import com.example.mainproject.ui.theme.TextFieldColorsBorder

@Composable
fun WindowEntry(
    modifier: Modifier = Modifier
    ) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                horizontal = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(103.dp))
        Text(
            text = "Добро пожаловать!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
        )
        Spacer(modifier = Modifier.height(23.dp))
        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 15.sp,
            lineHeight = 20.sp,
        )
        Spacer(modifier = Modifier.height(68.dp))
        Text(
            text = "Вход по E-mail",
            textAlign = TextAlign.Left,
            fontSize = 14.sp,
            color = TextColor,
            modifier = Modifier.fillMaxWidth(),
            lineHeight = 20.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = "example@mail.ru",
            onValueChange = { },
            textStyle = LocalTextStyle.current.copy(
                color = Color.Gray
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = TextFieldColors,
                unfocusedContainerColor = TextFieldColors,
                unfocusedBorderColor = TextFieldColorsBorder,
                focusedBorderColor = TextFieldColorsBorder
            ),
            placeholder = {
                Text(
                    text = "example@mail.ru",
                    color = Color.Gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = { },
            enabled = true,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonColors(
                AccentColorPrimaryButton,
                AccentColorDisabledButtonText,
                AccentColorDisabledButton,
                AccentColorDisabledButton
            ),
        ) {
            Text(
                text = "Далее",
                color = Color.White,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }
        Spacer(modifier = Modifier.height(238.dp))

        Text(
            text = "Или войдите с помощью",
            color = ColorTextBottom,
            fontSize = 17.sp,
            lineHeight = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, color = ColorBottomBorder),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        ) {
            Text(
                text = "Войти с Яндекс",
                color = ColorBottomBorder,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }

        Spacer(modifier = Modifier.height(56.dp))

    }
}


@Preview
@Composable
fun WindowEntryPreview() {
    WindowEntry()
}
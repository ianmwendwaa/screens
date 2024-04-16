package com.mwendwa.chelatemvvm.ui.theme.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mwendwa.chelatemvvm.navigation.ROUTE_ABOUT
import org.w3c.dom.Text

@Composable
fun Homescreen(navController: NavHostController) {
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ){
        Text(text = "Welcome Back",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 35.sp
        )
        Text(text = "Login to your Account",
            color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 25.sp)

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email ,
            onValueChange = {email.it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Usernmae" ) },
            label = {
                Text(text = "Username/Email")},
            modifier = Modifier
                .padding()
                .background(Color.White),

            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
                )

        OutlinedTextField(
            value = password ,
            onValueChange = {password.it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Usernmae" ) },
            label = {
                Text(text = "Enter your Password")},
            modifier = Modifier
                .padding()
                .background(Color.White),

            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        Row {
            Text(text = "Remember me",
                color= Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily.Default,
                )

            Text(text = "Forgot Password?",
                color= Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily.Default,
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button( colors = ButtonDefaults.buttonColors(Color.White),
            onClick = { navHostController.navigate{ ROUTE_ABOUT}
                         Color.Blue},
            modifier = Modifier.fillMaxWidth()
           ) {


        }



    }

}

@Preview
@Composable
private fun Homeprev() {
    Homescreen(navController = rememberNavController())

}
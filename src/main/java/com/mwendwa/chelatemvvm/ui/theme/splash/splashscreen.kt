package com.mwendwa.chelatemvvm.ui.theme.splash

import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.mwendwa.chelatemvvm.R
import com.mwendwa.chelatemvvm.navigation.ROUTE_HOME
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }

//    Animation Effect
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                }
            )

        )
        delay(3000L)
        navController.navigate(ROUTE_HOME)

    }
//    Image
//    Box(contentAlignment = Alignment.Center,
//        modifier = Modifier.fillMaxSize())
    
    Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo",
        modifier = Modifier.scale(scale.value))}


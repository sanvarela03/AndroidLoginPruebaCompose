package com.example.navigationcomposetest.screens

import android.util.Log
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigationcomposetest.R
import com.example.navigationcomposetest.components.ButtonComponent
import com.example.navigationcomposetest.components.CheckboxComponent
import com.example.navigationcomposetest.components.ClickableLoginTextComponent
import com.example.navigationcomposetest.components.DividerTextComponent
import com.example.navigationcomposetest.components.HeadingTextComponent
import com.example.navigationcomposetest.components.MyTextFieldComponent
import com.example.navigationcomposetest.components.NormalTextComponent
import com.example.navigationcomposetest.components.PasswordTextFieldComponent
import com.example.navigationcomposetest.navigation.PostOfficeAppRouter
import com.example.navigationcomposetest.navigation.Screen

@Composable
fun SignUpScreen() {

    val scrollState = rememberScrollState()

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
            .verticalScroll(scrollState),

        ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.message)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_lock)
            )
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions)) {
                Log.d("IT WTF: ", "-> $it")
                PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
            }

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            DividerTextComponent()

            ClickableLoginTextComponent(
                onTextSelected = {

                }
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSingUpScreen() {
    SignUpScreen()
}
package com.gsapps.testingcicd

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gsapps.testingcicd.ui.theme.AppTheme

@Composable
internal fun MainUi(content: @Composable () -> Unit) {
    AppTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            content.invoke()
        }
    }
}
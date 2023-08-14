package com.example.myapplog

import android.app.Application
import android.util.Log
import com.amplifyframework.AmplifyException
import com.amplifyframework.core.Amplify
import com.amplifyframework.core.plugin.Plugin
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin



class MyAmplifyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Add this line, to include the Auth plugin.
        Amplify.addPlugin(AWSCognitoAuthPlugin())
        Amplify.configure(applicationContext)
    }
}
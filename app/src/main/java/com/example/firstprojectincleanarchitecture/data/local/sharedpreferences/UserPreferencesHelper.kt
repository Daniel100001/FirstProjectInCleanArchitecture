package com.example.firstprojectincleanarchitecture.data.local.sharedpreferences

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreferencesHelper @Inject constructor(
    @ApplicationContext context: Context,
) {

    private val sharedPreferences =
        context.getSharedPreferences("user_preferences", Context.MODE_PRIVATE)

    var name: String?
        get() = sharedPreferences.getString("username", "")
        set(value) {
            sharedPreferences.edit().putString("username", value).apply()
        }

    var email: String?
        get() = sharedPreferences.getString("email", "")
        set(value) {
            sharedPreferences.edit().putString("email", value).apply()
        }

    var password: String?
        get() = sharedPreferences.getString("password", "")
        set(value) {
            sharedPreferences.edit().putString("password", value).apply()
        }
}
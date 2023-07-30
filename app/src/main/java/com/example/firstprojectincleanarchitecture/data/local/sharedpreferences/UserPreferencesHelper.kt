package com.example.firstprojectincleanarchitecture.data.local.sharedpreferences

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton

class UserPreferencesHelper @Inject constructor(
    @ApplicationContext context: Context
) {

}
package ru.allaber.preferenceStorage

import android.content.Context
import javax.inject.Inject
import ru.allaber.domain.preferenceStorage.PreferenceStorage

class PreferenceStorageImpl @Inject constructor(
    context: Context
) : PreferenceStorage {

    private val sharedPreference =
        context.applicationContext.getSharedPreferences(
            SHARED_PREFERENCE_NAME,
            Context.MODE_PRIVATE
        )

    companion object {
        private const val SHARED_PREFERENCE_NAME = "ru.allaber.data.preferenceStorage"
    }
}

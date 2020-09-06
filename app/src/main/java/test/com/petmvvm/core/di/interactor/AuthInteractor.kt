package test.com.petmvvm.core.di.interactor

import kotlinx.coroutines.Deferred
import test.com.petmvvm.core.api.response.GithubResponse


interface AuthInteractor {

    suspend fun authorize(mail: String, password: String): String
}


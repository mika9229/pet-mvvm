package test.com.petmvvm.core.api.comunicator


import kotlinx.coroutines.Deferred
import test.com.petmvvm.core.api.response.GithubResponse


interface AuthCommunicator {

    suspend fun sendReqest(mail: String, password: String): GithubResponse

}
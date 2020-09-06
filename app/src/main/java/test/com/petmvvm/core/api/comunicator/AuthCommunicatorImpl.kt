package test.com.petmvvm.core.api.comunicator


import android.util.Base64
import kotlinx.coroutines.Deferred
import test.com.petmvvm.core.api.request.LoginReqestBody
import test.com.petmvvm.core.api.response.GithubResponse
import test.com.petmvvm.core.api.services.GitHubServise


class AuthCommunicatorImpl(val apiTestService: GitHubServise) :
    AuthCommunicator {

    override suspend fun sendReqest(mail: String, password: String): GithubResponse {
        val body = LoginReqestBody.getMokData()
        val AutorizeHeader = generateLoginHeqderReqest(mail, password)
        return apiTestService.getTestLogin(body, AutorizeHeader)
    }

    private fun generateLoginHeqderReqest(mail: String, password: String):String{
        val loginData = "$mail:$password"

        val items = Base64.encodeToString(loginData.toByteArray(), Base64.NO_WRAP)
        return "Basic $items"
    }
}


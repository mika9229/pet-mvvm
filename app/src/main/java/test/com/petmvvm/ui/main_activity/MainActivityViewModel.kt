package test.com.petmvvm.ui.main_activity

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import test.com.demostart.core.api.request.NameRequest
import test.com.petmvvm.core.api.request.TestRequest
import test.com.petmvvm.core.di.interactor.AuthInteractor
import test.com.petmvvm.core.di.interactor.AuthInteractorImpl

class MainActivityViewModel constructor(val authInteractor: AuthInteractor) : ViewModel() {



    init {
    }

    fun loadData(view: View) {
        viewModelScope.launch {
            val resp = authInteractor.getUser(generateRequest())
            Log.e("dfsfsdf","233 " + resp.name)
        }

    }

    private fun generateRequest(): TestRequest {
        val request  = TestRequest()
        request.properties = TestRequest.Properties()

        val nameRequest = NameRequest()
        nameRequest.ipsum = "name"
        nameRequest.type = "string"

        request.properties?.items = nameRequest
        request.type = "object"

        return request
    }

}
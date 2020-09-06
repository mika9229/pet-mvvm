package test.com.petmvvm.ui.auth_activity

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import retrofit2.HttpException
import test.com.petmvvm.core.di.interactor.AuthInteractor

class AuthActivityViewModel constructor(val authInteractor: AuthInteractor) : ViewModel() {
    val visibleLoader: MutableLiveData<Boolean> = MutableLiveData()
    val mesageUser: MutableLiveData<String> = MutableLiveData()

    init {
        visibleLoader.postValue(false)
        mesageUser.postValue(null)
    }


    fun loadData(mail: CharSequence, pass: CharSequence) {

        visibleLoader.postValue(true)
        mesageUser.postValue(null)

        viewModelScope.launch(handler) {
            val resp = authInteractor.authorize(mail.toString(), pass.toString())
            mesageUser.postValue("Ваш id = $resp")

            visibleLoader.postValue(false)
        }

    }

   private val handler = CoroutineExceptionHandler { _, exception ->
       if(exception is HttpException){
           when(exception.code()){
               422 -> {mesageUser.postValue("Для вашего пользователя уже создан токен, но мы его пока не храним") }
               401 -> {mesageUser.postValue("Неверный логин или пароль") }
           }
       }

       visibleLoader.postValue(false)
   }

}
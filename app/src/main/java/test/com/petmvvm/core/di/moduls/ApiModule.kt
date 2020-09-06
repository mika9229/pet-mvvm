package test.com.petmvvm.core.di.moduls

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import test.com.petmvvm.core.api.comunicator.AuthCommunicator
import test.com.petmvvm.core.api.comunicator.AuthCommunicatorImpl
import test.com.petmvvm.core.api.services.GitHubServise


val apiModule = module {

    single {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { get<Retrofit>().create(GitHubServise::class.java) }

    single { AuthCommunicatorImpl(get()) as AuthCommunicator }

}

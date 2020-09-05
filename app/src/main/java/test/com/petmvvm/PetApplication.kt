package test.com.petmvvm

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import test.com.petmvvm.core.di.moduls.apiModule
import test.com.petmvvm.core.di.moduls.interactorModule
import test.com.petmvvm.core.di.moduls.viewModelModule

class PetApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            applicationContext
            modules(apiModule)
//            modules(persistenceModule)
            modules(interactorModule)
            modules(viewModelModule)
        }


    }
}
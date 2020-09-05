package test.com.petmvvm.core.di.moduls

import org.koin.dsl.module
import test.com.petmvvm.core.di.interactor.AuthInteractor
import test.com.petmvvm.core.di.interactor.AuthInteractorImpl

val interactorModule = module {

    single { AuthInteractorImpl(get()) as AuthInteractor }

}

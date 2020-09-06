package test.com.petmvvm.core.di.moduls

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import test.com.petmvvm.ui.auth_activity.AuthActivityViewModel


val viewModelModule = module {

    viewModel { AuthActivityViewModel(get()) }

}
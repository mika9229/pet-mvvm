package test.com.petmvvm.core.di.moduls

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import test.com.petmvvm.ui.main_activity.MainActivityViewModel


val viewModelModule = module {

    viewModel { MainActivityViewModel(get()) }

}
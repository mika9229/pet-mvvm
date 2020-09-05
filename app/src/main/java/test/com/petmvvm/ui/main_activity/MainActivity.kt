package test.com.petmvvm.ui.main_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import test.com.petmvvm.R
import org.koin.android.viewmodel.ext.android.getViewModel
import test.com.petmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    protected inline fun <reified T : ViewDataBinding> binding(
        @LayoutRes resId: Int
    ): Lazy<T> = lazy { DataBindingUtil.setContentView<T>(this, resId) }

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = getViewModel<MainActivityViewModel>()
        }
    }


}
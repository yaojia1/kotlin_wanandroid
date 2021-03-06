package com.hao.easy.base.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

/**
 * @author Yang Shihao
 * @date 2018/11/18
 */
abstract class BaseFragment : Fragment() {

    private lateinit var fragmentRootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentRootView = inflater.inflate(getLayoutId(), container, false)
        return fragmentRootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initInject()
        initView()
        initData()
    }


    fun <T : View> f(id: Int): T? {
        return fragmentRootView.findViewById(id)
    }

    @LayoutRes
    abstract fun getLayoutId(): Int

    open fun initInject() {

    }

    open fun initView() {

    }

    open fun initData() {

    }
}
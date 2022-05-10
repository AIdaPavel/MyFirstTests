package pavel.ivanov.myfirsttests.presenter.details

import pavel.ivanov.myfirsttests.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}

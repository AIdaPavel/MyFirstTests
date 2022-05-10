package pavel.ivanov.myfirsttests.presenter.search

import pavel.ivanov.myfirsttests.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
    //onAttach
    //onDetach
}
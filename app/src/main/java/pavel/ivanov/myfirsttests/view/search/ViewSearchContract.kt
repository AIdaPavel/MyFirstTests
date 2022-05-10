package pavel.ivanov.myfirsttests.view.search

import pavel.ivanov.myfirsttests.model.SearchResult
import pavel.ivanov.myfirsttests.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
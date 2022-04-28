package pavel.ivanov.myfirsttests.view

import pavel.ivanov.myfirsttests.model.SearchResult

internal interface ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}

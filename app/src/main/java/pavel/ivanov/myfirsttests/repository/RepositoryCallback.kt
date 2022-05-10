package pavel.ivanov.myfirsttests.repository

import pavel.ivanov.myfirsttests.model.SearchResponse
import retrofit2.Response

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}
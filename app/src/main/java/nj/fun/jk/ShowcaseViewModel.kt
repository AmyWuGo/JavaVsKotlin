package nj.`fun`.jk


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import nj.`fun`.jk.Repos.Repo00000
import nj.`fun`.jk.consts.VsDt
import nj.`fun`.jk.events.RepoEventListener0

class ShowcaseViewModel(appContext: Application) : AndroidViewModel(appContext),
        RepoEventListener0 {


    val resultJava = MutableLiveData<String>()
    val resultKotlin = MutableLiveData<String>()

    fun executBattle(battleId: Int) {
        when (battleId) {
            VsDt.VS_00000 -> Repo00000.battleVS00000(this)
        }
    }


    override fun onRepoResult(javaResult: String?, kotlinResult: String?) {
        if (javaResult == null) {
            resultJava.value = "no result"
        } else {
            resultJava.value = javaResult
        }

        if (kotlinResult == null) {
            resultKotlin.value = "no result"
        } else {
            resultKotlin.value = kotlinResult
        }

    }
}

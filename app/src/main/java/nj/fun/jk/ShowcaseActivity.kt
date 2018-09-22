package nj.`fun`.jk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nj.`fun`.jk.consts.Keys
import nj.`fun`.jk.consts.Value

class ShowcaseActivity : AppCompatActivity() {
    companion object {
        fun launch(from: AppCompatActivity?, battleId: Int) {
            from?.startActivity(
                    Intent(from, ShowcaseActivity::class.java).apply {
                        putExtra(Keys.KEY_BATTLE_ID, battleId)
                    }
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showcase)



        supportFragmentManager.beginTransaction()
                .replace(R.id.container, ShowcaseFragment.newInstance(intent.getIntExtra(Keys.KEY_BATTLE_ID, Value.VALUE_INVALIDE)))
                .commitNow()
    }
}

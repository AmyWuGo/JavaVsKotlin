package nj.`fun`.jk


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProviders
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_showcase.*
import nj.`fun`.jk.consts.Keys
import nj.`fun`.jk.consts.Value
import nj.`fun`.jk.util.nonNullObserve


class ShowcaseFragment : Fragment() {
    private val viewModel: ShowcaseViewModel by lazy {
        ViewModelProviders.of(this@ShowcaseFragment).get(ShowcaseViewModel::class.java)
    }
    private var battleId: Int = Value.VALUE_INVALIDE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            battleId = it.getInt(Keys.KEY_BATTLE_ID, Value.VALUE_INVALIDE)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_showcase, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initObserver()
        execute()
    }

    private fun initObserver() {
        viewModel.resultJava.nonNullObserve(this) { resultJava ->
            textView_java.text = resultJava
        }

        viewModel.resultKotlin.nonNullObserve(this) { resultKotlin ->
            textView_kotlin.text = resultKotlin
        }
    }

    private fun execute() {
        if (battleId == Value.VALUE_INVALIDE) {
            return
        }
        viewModel.executBattle(battleId)
    }


    companion object {
        @JvmStatic
        fun newInstance(battleId: Int) =
                ShowcaseFragment().apply {
                    arguments = Bundle().apply {
                        putInt(Keys.KEY_BATTLE_ID, battleId)
                    }
                }
    }
}

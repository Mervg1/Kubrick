package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_kubrick.*
import kotlinx.android.synthetic.main.fragment_actorsk.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [ActorskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActorskFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        actors_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ActorsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Actor>{
        val acts = ArrayList<Actor>()
        acts.add(Actor(R.drawable.shelley_duvall,"Shelley Duvall", "1980","Wendy Torrence"))
        acts.add(Actor(R.drawable.danny_loyd,"Dany Corri", "1980","Dany Torrence"))
        acts.add(Actor(R.drawable.jack_nicholson,"Jack Nicholson", "1980","Jack Torrence"))
        acts.add(Actor(R.drawable.scatman_crothers,"Scatman Crothers", "1980","Dick Halloran"))
        acts.add(Actor(R.drawable.malcom_mcdowell,"Malcom McDowell", "1971","Alex DeLarge"))
        acts.add(Actor(R.drawable.adrienne_corri,"Adrienne Corri", "1971","Señora Alexander"))
        acts.add(Actor(R.drawable.patrick_magee,"Patrick Magee", "1971","Frank Alexander"))
        acts.add(Actor(R.drawable.warren_clarke,"Warren Clarke", "1971","El lerdo"))
        acts.add(Actor(R.drawable.keir_dullea,"Keir Dullea", "1968","David Bowman"))
        acts.add(Actor(R.drawable.gary_lockwood,"Gary Lockwood", "1968","Frank Poole"))
        acts.add(Actor(R.drawable.douglas_rain,"Douglas Rain", "1968","HAL 9000"))
        acts.add(Actor(R.drawable.tom_cruise,"Tom Cruise", "1999","Bill Harford"))
        acts.add(Actor(R.drawable.nicole_kidman,"Nicole Kidman", "1999","Alice Harford"))
        return acts
    }

}
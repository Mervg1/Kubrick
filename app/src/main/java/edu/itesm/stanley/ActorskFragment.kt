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
        acts.add(Actor(R.drawable.adrienne_corri,"Adrienne Corri", "1953","Papel del actor"))
        acts.add(Actor(R.drawable.danny_loyd,"Dany Corri", "1953","Papel del actor"))
        /*movies.add(Movie(R.drawable.kiss, "Killer's Kiss", "1955", "Davey Gordon (Jamie Smith), a New York City boxer aging out of his profession, meets dancer Gloria Price (Irene Kane), and they begin a romance."))
        movies.add(Movie(R.drawable.killing, "The Killing", "1956", "Career criminal Johnny Clay (Sterling Hayden) recruits a sharpshooter (Timothy Carey), a crooked police officer (Ted de Corsia), a bartender (Joe Sawyer) and a betting teller named George (Elisha Cook Jr.), among others, for one last job before "))
        movies.add(Movie(R.drawable.paths, "Paths of Glory", "1957", "General Mireau decides to take on an impossible mission to capture a German post. However, when his men decide to back out from the mission he insults them."))
        movies.add(Movie(R.drawable.lolita, "Lolita", "1962", "With a screenplay penned by the author himself, Stanley Kubrick brings Vladimir Nabokov's controversial tale of forbidden love to the screen."))
        movies.add(Movie(R.drawable.strangelove, "Dr. Strangelove", "1964", "An American Brigadier puts the world on the verge of a nuclear catastrophe, when he deploys a B-52 bomber on the Russians, without informing his superiors."))
        movies.add(Movie(R.drawable.odyssey, "2001: A Space Odyssey", "1968", "The Discovery One and its revolutionary super computer seek a mysterious monolith that first appeared at the dawn of man."))
        movies.add(Movie(R.drawable.orange, "A Clockwork Orange", "1971", "Alex, a psychopathic delinquent, is imprisoned for murder and rape. In order to reduce his sentence, he volunteers for an experimental therapy conducted by the government, but it goes askew."))
        movies.add(Movie(R.drawable.barry, "Barry Lyndon", "1975", "Barry, an Irish rogue, gets into a relationship with a rich widow and cheats his way to the top of the 18th-century British society, by assuming the identity of her dead husband."))
        movies.add(Movie(R.drawable.shinnin, "The Shining", "1980", "Jack and his family move into an isolated hotel with a violent past. Living in isolation, Jack begins to lose his sanity, which affects his family members."))
        movies.add(Movie(R.drawable.metal, "Full Metal Jack", "1987", "During the Vietnam War, under the ruthless command of Hartman, a few recruits face mental breakdowns. After a bizarre event, the soldiers are left to deal with the war's hellish mayhem."))
        movies.add(Movie(R.drawable.eyes, "Eyes Wide Shut", "1999", "After Dr. Bill Hartford's (Tom Cruise) wife, Alice (Nicole Kidman), admits to having sexual fantasies about a man she met, Bill becomes obsessed with having a sexual encounter. He discovers an underground sexual group and attends one of their meetings -- and quickly discovers that he is in over his head."))

*/
        return acts
    }

}